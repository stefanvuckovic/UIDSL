package com.stefanvuckovic.dto;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.stefanvuckovic.domainmodel.DomainModelUtil;
import com.stefanvuckovic.domainmodel.domainModel.Attribute;
import com.stefanvuckovic.domainmodel.domainModel.AttributeOption;
import com.stefanvuckovic.domainmodel.domainModel.AttributeType;
import com.stefanvuckovic.domainmodel.domainModel.CollectionType;
import com.stefanvuckovic.domainmodel.domainModel.SingleType;
import com.stefanvuckovic.dto.dTO.DTOClass;
import com.stefanvuckovic.dto.dTO.EmailType;
import com.stefanvuckovic.dto.dTO.FileType;
import com.stefanvuckovic.dto.dTO.IDAttribute;
import com.stefanvuckovic.dto.dTO.ImageType;
import com.stefanvuckovic.dto.dTO.ObjectRepresentation;
import com.stefanvuckovic.dto.dTO.PasswordType;
import com.stefanvuckovic.dto.dTO.TextType;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DTOUtil {
  @Inject
  private DomainModelUtil dmUtil;
  
  public LinkedHashSet<DTOClass> getHierarchyForClass(final DTOClass c) {
    LinkedHashSet<DTOClass> _xblockexpression = null;
    {
      final LinkedHashSet<DTOClass> hierarchy = CollectionLiterals.<DTOClass>newLinkedHashSet();
      DTOClass curr = c.getSuperType();
      while (((!Objects.equal(curr, null)) && (!hierarchy.contains(curr)))) {
        {
          hierarchy.add(curr);
          DTOClass _superType = curr.getSuperType();
          curr = _superType;
        }
      }
      _xblockexpression = hierarchy;
    }
    return _xblockexpression;
  }
  
  public Iterable<Attribute> getAttributesFromClassHierarchy(final DTOClass c) {
    LinkedHashSet<DTOClass> _hierarchyForClass = this.getHierarchyForClass(c);
    final Function1<DTOClass, EList<Attribute>> _function = (DTOClass it) -> {
      return it.getAttributes();
    };
    Iterable<EList<Attribute>> _map = IterableExtensions.<DTOClass, EList<Attribute>>map(_hierarchyForClass, _function);
    return Iterables.<Attribute>concat(_map);
  }
  
  public String typeToString(final AttributeType type) {
    String _switchResult = null;
    boolean _matched = false;
    if (type instanceof TextType) {
      _matched=true;
      _switchResult = "text";
    }
    if (!_matched) {
      if (type instanceof EmailType) {
        _matched=true;
        _switchResult = "email";
      }
    }
    if (!_matched) {
      if (type instanceof PasswordType) {
        _matched=true;
        _switchResult = "password";
      }
    }
    if (!_matched) {
      if (type instanceof FileType) {
        _matched=true;
        _switchResult = "file";
      }
    }
    if (!_matched) {
      if (type instanceof ImageType) {
        _matched=true;
        _switchResult = "image";
      }
    }
    if (!_matched) {
      if (type instanceof CollectionType) {
        _matched=true;
        SingleType _ofType = ((CollectionType)type).getOfType();
        String _typeToString = this.typeToString(_ofType);
        String _plus = ("List<" + _typeToString);
        _switchResult = (_plus + ">");
      }
    }
    if (!_matched) {
      _switchResult = this.dmUtil.typeToString(type);
    }
    return _switchResult;
  }
  
  public boolean hasAttributeOption(final Attribute attr, final Class<? extends AttributeOption> optClass) {
    boolean _xblockexpression = false;
    {
      final EList<AttributeOption> options = attr.getOptions();
      _xblockexpression = ((!Objects.equal(options, null)) && (IterableExtensions.size(IterableExtensions.<AttributeOption>filter(options, ((Function1<AttributeOption, Boolean>) (AttributeOption o) -> {
        Class<? extends AttributeOption> _class = o.getClass();
        return Boolean.valueOf(_class.equals(optClass));
      }))) > 0));
    }
    return _xblockexpression;
  }
  
  public Attribute getIDAttribute(final DTOClass c) {
    EList<Attribute> _attributes = c.getAttributes();
    final Function1<Attribute, Boolean> _function = (Attribute a) -> {
      EList<AttributeOption> _options = a.getOptions();
      Iterable<IDAttribute> _filter = Iterables.<IDAttribute>filter(_options, IDAttribute.class);
      int _size = IterableExtensions.size(_filter);
      return Boolean.valueOf((_size == 1));
    };
    return IterableExtensions.<Attribute>findFirst(_attributes, _function);
  }
  
  public Attribute getObjectRepresentationAttribute(final DTOClass c) {
    EList<Attribute> _attributes = c.getAttributes();
    final Function1<Attribute, Boolean> _function = (Attribute a) -> {
      EList<AttributeOption> _options = a.getOptions();
      Iterable<ObjectRepresentation> _filter = Iterables.<ObjectRepresentation>filter(_options, ObjectRepresentation.class);
      int _size = IterableExtensions.size(_filter);
      return Boolean.valueOf((_size == 1));
    };
    return IterableExtensions.<Attribute>findFirst(_attributes, _function);
  }
}
