package com.stefanvuckovic.uidsl;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.stefanvuckovic.domainmodel.domainModel.AttributeType;
import com.stefanvuckovic.dto.DTOUtil;
import com.stefanvuckovic.uidsl.uIDSL.AlternativeType;
import com.stefanvuckovic.uidsl.uIDSL.CollectionGeneralType;
import com.stefanvuckovic.uidsl.uIDSL.EnumGeneralType;
import com.stefanvuckovic.uidsl.uIDSL.Field;
import com.stefanvuckovic.uidsl.uIDSL.Member;
import com.stefanvuckovic.uidsl.uIDSL.Method;
import com.stefanvuckovic.uidsl.uIDSL.ObjectGeneralType;
import com.stefanvuckovic.uidsl.uIDSL.PageType;
import com.stefanvuckovic.uidsl.uIDSL.PropertyRuntimeType;
import com.stefanvuckovic.uidsl.uIDSL.PropertySingleRuntimeType;
import com.stefanvuckovic.uidsl.uIDSL.PropertyValue;
import com.stefanvuckovic.uidsl.uIDSL.ServerComponent;
import com.stefanvuckovic.uidsl.uIDSL.TypeExpression;
import com.stefanvuckovic.uidsl.uIDSL.UIComponent;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class UIDSLUtil {
  @Inject
  private DTOUtil dtoUtil;
  
  public Iterable<Field> getFields(final ServerComponent sc) {
    EList<Member> _members = sc.getMembers();
    return Iterables.<Field>filter(_members, Field.class);
  }
  
  public Iterable<Method> getMethods(final ServerComponent sc) {
    EList<Member> _members = sc.getMembers();
    return Iterables.<Method>filter(_members, Method.class);
  }
  
  public String typeToString(final AttributeType type) {
    String _switchResult = null;
    boolean _matched = false;
    if (type instanceof PageType) {
      _matched=true;
      _switchResult = "page";
    }
    if (!_matched) {
      if (type instanceof ObjectGeneralType) {
        _matched=true;
        _switchResult = "object";
      }
    }
    if (!_matched) {
      if (type instanceof EnumGeneralType) {
        _matched=true;
        _switchResult = "enum";
      }
    }
    if (!_matched) {
      if (type instanceof CollectionGeneralType) {
        _matched=true;
        _switchResult = "collection";
      }
    }
    if (!_matched) {
      if (type instanceof AlternativeType) {
        _matched=true;
        EList<AttributeType> _types = ((AlternativeType)type).getTypes();
        final Function1<AttributeType, CharSequence> _function = (AttributeType it) -> {
          return this.typeToString(it);
        };
        _switchResult = IterableExtensions.<AttributeType>join(_types, ", ", _function);
      }
    }
    if (!_matched) {
      _switchResult = this.dtoUtil.typeToString(type);
    }
    return _switchResult;
  }
  
  public Iterable<PropertyValue> getRequiredProperties(final UIComponent comp) {
    EList<PropertyValue> _properties = comp.getProperties();
    final Function1<PropertyValue, Boolean> _function = (PropertyValue it) -> {
      return Boolean.valueOf(it.isRequired());
    };
    return IterableExtensions.<PropertyValue>filter(_properties, _function);
  }
  
  public LinkedHashSet<PropertyValue> getHierarchyOfTypeDependentProperties(final PropertyValue p) {
    LinkedHashSet<PropertyValue> _xblockexpression = null;
    {
      final LinkedHashSet<PropertyValue> hierarchy = CollectionLiterals.<PropertyValue>newLinkedHashSet();
      PropertyValue curr = this.getDependentProperty(p);
      while (((!Objects.equal(curr, null)) && (!hierarchy.contains(curr)))) {
        {
          hierarchy.add(curr);
          PropertyValue _dependentProperty = this.getDependentProperty(curr);
          curr = _dependentProperty;
        }
      }
      _xblockexpression = hierarchy;
    }
    return _xblockexpression;
  }
  
  public PropertyValue getDependentProperty(final PropertyValue p) {
    PropertyValue _xblockexpression = null;
    {
      final TypeExpression type = p.getType();
      PropertyValue _xifexpression = null;
      boolean _notEquals = (!Objects.equal(type, null));
      if (_notEquals) {
        PropertyValue _switchResult = null;
        boolean _matched = false;
        if (type instanceof PropertyRuntimeType) {
          _matched=true;
          _switchResult = ((PropertyRuntimeType)type).getProperty();
        }
        if (!_matched) {
          if (type instanceof PropertySingleRuntimeType) {
            _matched=true;
            PropertyRuntimeType _propertyType = ((PropertySingleRuntimeType)type).getPropertyType();
            _switchResult = _propertyType.getProperty();
          }
        }
        _xifexpression = _switchResult;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
