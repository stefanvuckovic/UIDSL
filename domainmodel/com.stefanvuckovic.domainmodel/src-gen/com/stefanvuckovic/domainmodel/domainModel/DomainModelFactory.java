/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainmodel.domainModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage
 * @generated
 */
public interface DomainModelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DomainModelFactory eINSTANCE = com.stefanvuckovic.domainmodel.domainModel.impl.DomainModelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Concept</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concept</em>'.
   * @generated
   */
  Concept createConcept();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum</em>'.
   * @generated
   */
  Enum createEnum();

  /**
   * Returns a new object of class '<em>Enum Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Literal</em>'.
   * @generated
   */
  EnumLiteral createEnumLiteral();

  /**
   * Returns a new object of class '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant</em>'.
   * @generated
   */
  Constant createConstant();

  /**
   * Returns a new object of class '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option</em>'.
   * @generated
   */
  Option createOption();

  /**
   * Returns a new object of class '<em>Entity Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Option</em>'.
   * @generated
   */
  EntityOption createEntityOption();

  /**
   * Returns a new object of class '<em>Inheritance Mapping Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inheritance Mapping Type</em>'.
   * @generated
   */
  InheritanceMappingType createInheritanceMappingType();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Attribute Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Type</em>'.
   * @generated
   */
  AttributeType createAttributeType();

  /**
   * Returns a new object of class '<em>Single Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Type</em>'.
   * @generated
   */
  SingleType createSingleType();

  /**
   * Returns a new object of class '<em>Basic Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Type</em>'.
   * @generated
   */
  BasicType createBasicType();

  /**
   * Returns a new object of class '<em>Ref Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Type</em>'.
   * @generated
   */
  RefType createRefType();

  /**
   * Returns a new object of class '<em>Collection Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection Type</em>'.
   * @generated
   */
  CollectionType createCollectionType();

  /**
   * Returns a new object of class '<em>Attribute Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Option</em>'.
   * @generated
   */
  AttributeOption createAttributeOption();

  /**
   * Returns a new object of class '<em>Static Field Selection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static Field Selection</em>'.
   * @generated
   */
  StaticFieldSelection createStaticFieldSelection();

  /**
   * Returns a new object of class '<em>Int Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Constant</em>'.
   * @generated
   */
  IntConstant createIntConstant();

  /**
   * Returns a new object of class '<em>Long Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Long Constant</em>'.
   * @generated
   */
  LongConstant createLongConstant();

  /**
   * Returns a new object of class '<em>String Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Constant</em>'.
   * @generated
   */
  StringConstant createStringConstant();

  /**
   * Returns a new object of class '<em>Bool Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Constant</em>'.
   * @generated
   */
  BoolConstant createBoolConstant();

  /**
   * Returns a new object of class '<em>Date Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date Constant</em>'.
   * @generated
   */
  DateConstant createDateConstant();

  /**
   * Returns a new object of class '<em>Null</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null</em>'.
   * @generated
   */
  Null createNull();

  /**
   * Returns a new object of class '<em>Entity Delete Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Delete Option</em>'.
   * @generated
   */
  EntityDeleteOption createEntityDeleteOption();

  /**
   * Returns a new object of class '<em>Inheritance Mapping Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inheritance Mapping Option</em>'.
   * @generated
   */
  InheritanceMappingOption createInheritanceMappingOption();

  /**
   * Returns a new object of class '<em>String Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Type</em>'.
   * @generated
   */
  StringType createStringType();

  /**
   * Returns a new object of class '<em>Int Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Type</em>'.
   * @generated
   */
  IntType createIntType();

  /**
   * Returns a new object of class '<em>Long Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Long Type</em>'.
   * @generated
   */
  LongType createLongType();

  /**
   * Returns a new object of class '<em>Bool Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Type</em>'.
   * @generated
   */
  BoolType createBoolType();

  /**
   * Returns a new object of class '<em>Date Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date Type</em>'.
   * @generated
   */
  DateType createDateType();

  /**
   * Returns a new object of class '<em>Required</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Required</em>'.
   * @generated
   */
  Required createRequired();

  /**
   * Returns a new object of class '<em>Part Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Part Of</em>'.
   * @generated
   */
  PartOf createPartOf();

  /**
   * Returns a new object of class '<em>Relationship Owner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship Owner</em>'.
   * @generated
   */
  RelationshipOwner createRelationshipOwner();

  /**
   * Returns a new object of class '<em>Cardinality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cardinality</em>'.
   * @generated
   */
  Cardinality createCardinality();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DomainModelPackage getDomainModelPackage();

} //DomainModelFactory