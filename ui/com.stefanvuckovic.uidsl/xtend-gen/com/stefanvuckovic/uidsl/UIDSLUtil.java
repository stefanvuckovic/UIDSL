package com.stefanvuckovic.uidsl;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.stefanvuckovic.domainmodel.domainModel.AttributeType;
import com.stefanvuckovic.domainmodel.domainModel.Expression;
import com.stefanvuckovic.dto.DTOUtil;
import com.stefanvuckovic.uidsl.scoping.CustomIndex;
import com.stefanvuckovic.uidsl.types.TypeConformance;
import com.stefanvuckovic.uidsl.uIDSL.AlternativeType;
import com.stefanvuckovic.uidsl.uIDSL.ChildUIComponent;
import com.stefanvuckovic.uidsl.uIDSL.CollectionGeneralType;
import com.stefanvuckovic.uidsl.uIDSL.Component;
import com.stefanvuckovic.uidsl.uIDSL.CustomDefaultComponentDefinition;
import com.stefanvuckovic.uidsl.uIDSL.CustomDefaultComponentsDefinition;
import com.stefanvuckovic.uidsl.uIDSL.EnumGeneralType;
import com.stefanvuckovic.uidsl.uIDSL.Field;
import com.stefanvuckovic.uidsl.uIDSL.IterationExpression;
import com.stefanvuckovic.uidsl.uIDSL.Member;
import com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression;
import com.stefanvuckovic.uidsl.uIDSL.Method;
import com.stefanvuckovic.uidsl.uIDSL.ObjectGeneralType;
import com.stefanvuckovic.uidsl.uIDSL.PageType;
import com.stefanvuckovic.uidsl.uIDSL.PropertyRuntimeType;
import com.stefanvuckovic.uidsl.uIDSL.PropertySingleRuntimeType;
import com.stefanvuckovic.uidsl.uIDSL.PropertyValue;
import com.stefanvuckovic.uidsl.uIDSL.PropertyValueInstance;
import com.stefanvuckovic.uidsl.uIDSL.ServerComponent;
import com.stefanvuckovic.uidsl.uIDSL.TypeExpression;
import com.stefanvuckovic.uidsl.uIDSL.UIComponent;
import com.stefanvuckovic.uidsl.uIDSL.UIComponentInstance;
import com.stefanvuckovic.uidsl.uIDSL.VariableReference;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class UIDSLUtil {
  @Inject
  private DTOUtil dtoUtil;
  
  @Inject
  @Extension
  private CustomIndex _customIndex;
  
  @Inject
  @Extension
  private TypeConformance _typeConformance;
  
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
  
  public PropertyValueInstance getProperty(final UIComponentInstance inst, final String propName) {
    EList<PropertyValueInstance> _properties = inst.getProperties();
    final Function1<PropertyValueInstance, Boolean> _function = (PropertyValueInstance p) -> {
      PropertyValue _property = p.getProperty();
      String _name = _property.getName();
      return Boolean.valueOf(Objects.equal(_name, propName));
    };
    Iterable<PropertyValueInstance> _filter = IterableExtensions.<PropertyValueInstance>filter(_properties, _function);
    return IterableExtensions.<PropertyValueInstance>head(_filter);
  }
  
  public UIComponentInstance getChildComponent(final UIComponentInstance inst, final String compName) {
    EList<Component> _childElements = inst.getChildElements();
    final Function1<Component, Boolean> _function = (Component c) -> {
      UIComponent _component = ((UIComponentInstance) c).getComponent();
      String _name = _component.getName();
      return Boolean.valueOf(Objects.equal(_name, compName));
    };
    Iterable<Component> _filter = IterableExtensions.<Component>filter(_childElements, _function);
    Component _head = null;
    if (_filter!=null) {
      _head=IterableExtensions.<Component>head(_filter);
    }
    return ((UIComponentInstance) _head);
  }
  
  public boolean isTopLevelComponent(final UIComponentInstance inst) {
    UIComponent _component = inst.getComponent();
    EObject _eContainer = _component.eContainer();
    return (!(_eContainer instanceof UIComponent));
  }
  
  public boolean isChildOfComponent(final UIComponentInstance inst, final String name) {
    boolean _xblockexpression = false;
    {
      UIComponent _component = inst.getComponent();
      final EObject cont = _component.eContainer();
      _xblockexpression = (((cont instanceof ChildUIComponent) && (cont.eContainer() instanceof UIComponent)) && 
        Objects.equal(((UIComponent) cont.eContainer()).getName(), name));
    }
    return _xblockexpression;
  }
  
  public EList<CustomDefaultComponentDefinition> getCustomDefaultComponents(final EObject ctx) {
    EList<CustomDefaultComponentDefinition> _xblockexpression = null;
    {
      final Iterable<IEObjectDescription> customDefaults = this._customIndex.getVisibleCustomComponentDefaults(ctx);
      EList<CustomDefaultComponentDefinition> _xifexpression = null;
      int _size = IterableExtensions.size(customDefaults);
      boolean _equals = (_size == 1);
      if (_equals) {
        EList<CustomDefaultComponentDefinition> _xblockexpression_1 = null;
        {
          final IEObjectDescription custom = IterableExtensions.<IEObjectDescription>head(customDefaults);
          EObject customDef = custom.getEObjectOrProxy();
          boolean _eIsProxy = customDef.eIsProxy();
          if (_eIsProxy) {
            Resource _eResource = ctx.eResource();
            ResourceSet _resourceSet = _eResource.getResourceSet();
            URI _eObjectURI = custom.getEObjectURI();
            EObject _eObject = _resourceSet.getEObject(_eObjectURI, true);
            customDef = _eObject;
          }
          _xblockexpression_1 = ((CustomDefaultComponentsDefinition) customDef).getDefaults();
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public CustomDefaultComponentDefinition getCustomDefaultComponentForType(final EObject ctx, final AttributeType type, final boolean input) {
    CustomDefaultComponentDefinition _xblockexpression = null;
    {
      String _xifexpression = null;
      if (input) {
        _xifexpression = "input";
      } else {
        _xifexpression = "output";
      }
      final String compType = _xifexpression;
      EList<CustomDefaultComponentDefinition> _customDefaultComponents = this.getCustomDefaultComponents(ctx);
      CustomDefaultComponentDefinition _findFirst = null;
      if (_customDefaultComponents!=null) {
        final Function1<CustomDefaultComponentDefinition, Boolean> _function = (CustomDefaultComponentDefinition c) -> {
          return Boolean.valueOf((this._typeConformance.areTypesSame(type, c.getType().getType()) && Objects.equal(c.getCompType(), compType)));
        };
        _findFirst=IterableExtensions.<CustomDefaultComponentDefinition>findFirst(_customDefaultComponents, _function);
      }
      _xblockexpression = _findFirst;
    }
    return _xblockexpression;
  }
  
  public VariableReference getReferencedVariableFromExpression(final Expression e) {
    VariableReference _switchResult = null;
    boolean _matched = false;
    if (e instanceof VariableReference) {
      _matched=true;
      _switchResult = ((VariableReference)e);
    }
    if (!_matched) {
      if (e instanceof MemberSelectionExpression) {
        _matched=true;
        _switchResult = this.getFirstReceiver(((MemberSelectionExpression)e));
      }
    }
    if (!_matched) {
      if (e instanceof IterationExpression) {
        _matched=true;
        Expression _expression = ((IterationExpression)e).getExpression();
        _switchResult = this.getReferencedVariableFromExpression(_expression);
      }
    }
    if (!_matched) {
      _switchResult = null;
    }
    return _switchResult;
  }
  
  public VariableReference getFirstReceiver(final MemberSelectionExpression e) {
    final Expression rec = e.getReceiver();
    if ((rec instanceof VariableReference)) {
      return ((VariableReference)rec);
    } else {
      return this.getFirstReceiver(((MemberSelectionExpression) rec));
    }
  }
}
