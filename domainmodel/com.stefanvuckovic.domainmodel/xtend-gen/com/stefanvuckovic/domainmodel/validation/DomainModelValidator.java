/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainmodel.validation;

import com.google.common.base.Objects;
import com.stefanvuckovic.domainmodel.DomainModelUtil;
import com.stefanvuckovic.domainmodel.domainModel.Attribute;
import com.stefanvuckovic.domainmodel.domainModel.AttributeOption;
import com.stefanvuckovic.domainmodel.domainModel.AttributeType;
import com.stefanvuckovic.domainmodel.domainModel.BasicType;
import com.stefanvuckovic.domainmodel.domainModel.Cardinality;
import com.stefanvuckovic.domainmodel.domainModel.CardinalityType;
import com.stefanvuckovic.domainmodel.domainModel.Concept;
import com.stefanvuckovic.domainmodel.domainModel.Constant;
import com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage;
import com.stefanvuckovic.domainmodel.domainModel.Entity;
import com.stefanvuckovic.domainmodel.domainModel.EntityOption;
import com.stefanvuckovic.domainmodel.domainModel.EnumLiteral;
import com.stefanvuckovic.domainmodel.domainModel.Model;
import com.stefanvuckovic.domainmodel.domainModel.Option;
import com.stefanvuckovic.domainmodel.domainModel.Required;
import com.stefanvuckovic.domainmodel.domainModel.SingleType;
import com.stefanvuckovic.domainmodel.scoping.CustomIndex;
import com.stefanvuckovic.domainmodel.types.TypeComputing;
import com.stefanvuckovic.domainmodel.types.TypeConformance;
import com.stefanvuckovic.domainmodel.validation.AbstractDomainModelValidator;
import java.util.LinkedHashSet;
import java.util.Map;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class DomainModelValidator extends AbstractDomainModelValidator {
  @Inject
  @Extension
  private DomainModelUtil _domainModelUtil;
  
  @Inject
  @Extension
  private TypeComputing _typeComputing;
  
  @Inject
  @Extension
  private TypeConformance _typeConformance;
  
  @Inject
  @Extension
  private CustomIndex _customIndex;
  
  public final static String SEVERAL_OPTIONS_OF_SAME_TYPE = "You cannot specify more than one option of the same type";
  
  @Check
  public void checkNoMoreThanOneOptionOfSameType(final EntityOption opt) {
    EObject _eContainer = opt.eContainer();
    final Entity ent = ((Entity) _eContainer);
    EList<EntityOption> _options = ent.getOptions();
    final Function1<EntityOption, Boolean> _function = (EntityOption it) -> {
      return Boolean.valueOf(this.isOptionOfSameType(it, opt));
    };
    Iterable<EntityOption> _filter = IterableExtensions.<EntityOption>filter(_options, _function);
    boolean _isEmpty = IterableExtensions.isEmpty(_filter);
    boolean _not = (!_isEmpty);
    if (_not) {
      this.error(DomainModelValidator.SEVERAL_OPTIONS_OF_SAME_TYPE, null);
    }
  }
  
  @Check
  public void checkNoMoreThanOneOptionOfSameType(final AttributeOption opt) {
    EObject _eContainer = opt.eContainer();
    final Attribute attr = ((Attribute) _eContainer);
    EList<AttributeOption> _options = attr.getOptions();
    final Function1<AttributeOption, Boolean> _function = (AttributeOption it) -> {
      return Boolean.valueOf(this.isOptionOfSameType(it, opt));
    };
    Iterable<AttributeOption> _filter = IterableExtensions.<AttributeOption>filter(_options, _function);
    boolean _isEmpty = IterableExtensions.isEmpty(_filter);
    boolean _not = (!_isEmpty);
    if (_not) {
      this.error(DomainModelValidator.SEVERAL_OPTIONS_OF_SAME_TYPE, null);
    }
  }
  
  public boolean isOptionOfSameType(final Option opt1, final Option opt2) {
    boolean _xblockexpression = false;
    {
      if ((opt1.getClass().equals(opt2.getClass()) && (opt1 != opt2))) {
        return true;
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  @Check
  public void checkEntityHierarchyCycles(final Entity e) {
    LinkedHashSet<Entity> _hierarchyForEntity = this._domainModelUtil.getHierarchyForEntity(e);
    boolean _contains = _hierarchyForEntity.contains(e);
    if (_contains) {
      String _name = e.getName();
      String _plus = ("There is a cycle in entity hierarchy of entity \'" + _name);
      String _plus_1 = (_plus + "\'");
      this.error(_plus_1, 
        DomainModelPackage.Literals.ENTITY__SUPER_TYPE);
    }
  }
  
  @Check
  public void checkAttributeOptionsBasedOnContainer(final AttributeOption opt) {
    EObject _eContainer = opt.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    if ((_eContainer_1 instanceof com.stefanvuckovic.domainmodel.domainModel.Enum)) {
      this.error("You can\'t specify options for enum attribute", null);
    }
  }
  
  @Check
  public void checkIfRequiredOptionsArePresent(final Attribute a) {
    AttributeType _type = a.getType();
    final Entity ent = this._domainModelUtil.getAttributeEntityRefTypeIfExists(_type);
    if (((!Objects.equal(ent, null)) && Objects.equal(this._domainModelUtil.cardinality(a), null))) {
      this.error("You must specify cardinality for this attribute", null);
    }
  }
  
  @Check
  public void checkAttributeOptionsBasedOnAttributeType(final Attribute a) {
    AttributeType _type = a.getType();
    boolean _equals = Objects.equal(_type, null);
    if (_equals) {
      return;
    }
    final EList<AttributeOption> options = a.getOptions();
    boolean _notEquals = (!Objects.equal(options, null));
    if (_notEquals) {
      AttributeType _type_1 = a.getType();
      Entity _attributeEntityRefTypeIfExists = this._domainModelUtil.getAttributeEntityRefTypeIfExists(_type_1);
      final boolean refType = (!Objects.equal(_attributeEntityRefTypeIfExists, null));
      AttributeType _type_2 = a.getType();
      final boolean singleType = (_type_2 instanceof SingleType);
      for (int i = 0; (i < ((Object[])Conversions.unwrapArray(options, Object.class)).length); i++) {
        {
          final AttributeOption o = options.get(i);
          if ((((o instanceof Required) && (!singleType)) || ((!(o instanceof Required)) && (!refType)))) {
            this.error("Specified option is not valid for this attribute", DomainModelPackage.Literals.ATTRIBUTE__OPTIONS, i);
          }
        }
      }
    }
  }
  
  @Check
  public void checkEnumTypes(final Constant const_) {
    final AttributeType type = this._typeComputing.getType(const_);
    final AttributeType expectedType = this._typeComputing.getExpectedType(const_);
    if ((Objects.equal(expectedType, null) || Objects.equal(type, null))) {
      return;
    }
    boolean _isConformant = this._typeConformance.isConformant(type, expectedType);
    boolean _not = (!_isConformant);
    if (_not) {
      String _typeToString = this._domainModelUtil.typeToString(expectedType);
      String _plus = ("Type not compatible. Expected \'" + _typeToString);
      String _plus_1 = (_plus + "\' but was \'");
      String _typeToString_1 = this._domainModelUtil.typeToString(type);
      String _plus_2 = (_plus_1 + _typeToString_1);
      String _plus_3 = (_plus_2 + "\'");
      this.error(_plus_3, 
        null);
    }
  }
  
  @Check
  public void checkEnumAttributeType(final Attribute attr) {
    final EObject cont = attr.eContainer();
    if ((cont instanceof com.stefanvuckovic.domainmodel.domainModel.Enum)) {
      AttributeType _type = attr.getType();
      boolean _not = (!(_type instanceof BasicType));
      if (_not) {
        AttributeType _type_1 = attr.getType();
        String _typeToString = this._domainModelUtil.typeToString(_type_1);
        String _plus = ("Attribute of type " + _typeToString);
        String _plus_1 = (_plus + " is not allowed for Enum");
        this.error(_plus_1, 
          null);
      }
    }
  }
  
  @Check
  public void checkNumberOfEnumConstructorParameters(final EnumLiteral literal) {
    EObject _eContainer = literal.eContainer();
    final com.stefanvuckovic.domainmodel.domainModel.Enum enum_ = ((com.stefanvuckovic.domainmodel.domainModel.Enum) _eContainer);
    EList<Constant> _params = literal.getParams();
    int _size = _params.size();
    EList<Attribute> _attributes = enum_.getAttributes();
    int _size_1 = _attributes.size();
    boolean _notEquals = (_size != _size_1);
    if (_notEquals) {
      EList<Attribute> _attributes_1 = enum_.getAttributes();
      int _size_2 = _attributes_1.size();
      String _plus = ("Invalid number of arguments: expected " + Integer.valueOf(_size_2));
      String _plus_1 = (_plus + " but was ");
      EList<Constant> _params_1 = literal.getParams();
      int _size_3 = _params_1.size();
      String _plus_2 = (_plus_1 + Integer.valueOf(_size_3));
      EAttribute _enumLiteral_Name = DomainModelPackage.eINSTANCE.getEnumLiteral_Name();
      this.error(_plus_2, _enumLiteral_Name);
    }
  }
  
  @Check
  public void checkIfCardinalityCorrespondsToRelatedEntityMapping(final Cardinality card) {
    EObject _eContainer = card.eContainer();
    final Attribute attr = ((Attribute) _eContainer);
    final Attribute relatedAttr = this._domainModelUtil.getCorrespondingAttributeFromRelatedEntityIfExists(attr);
    boolean _notEquals = (!Objects.equal(relatedAttr, null));
    if (_notEquals) {
      if (((Objects.equal(card.getCard(), CardinalityType.ONE) && this._domainModelUtil.collectionType(relatedAttr.getType())) || 
        (Objects.equal(card.getCard(), CardinalityType.MANY) && this._domainModelUtil.singleType(relatedAttr.getType())))) {
        this.error("Specified cardinality does not correspond to mapped attribute in related entity", null);
      }
    }
  }
  
  @Check(CheckType.NORMAL)
  public void checUniqueConceptNameInDifferentFiles(final Model model) {
    final Map<String, IEObjectDescription> otherFilesConcepts = this._customIndex.getVisibleConceptsDescriptionsFromOtherFiles(model);
    EList<Concept> _concepts = model.getConcepts();
    for (final Concept c : _concepts) {
      {
        final String conceptName = c.getName();
        boolean _containsKey = otherFilesConcepts.containsKey(conceptName);
        if (_containsKey) {
          String _name = c.getName();
          String _plus = ("Concept with name " + _name);
          String _plus_1 = (_plus + " is already defined");
          EAttribute _concept_Name = DomainModelPackage.eINSTANCE.getConcept_Name();
          this.error(_plus_1, c, _concept_Name);
        }
      }
    }
  }
}
