package com.stefanvuckovic.dto;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.stefanvuckovic.domainmodel.domainModel.Attribute;
import com.stefanvuckovic.dto.dTO.DTOClass;
import java.util.LinkedHashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DTOUtil {
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
}
