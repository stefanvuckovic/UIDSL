/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainmodel.domainModel.impl;

import com.stefanvuckovic.domainmodel.domainModel.Attribute;
import com.stefanvuckovic.domainmodel.domainModel.AttributeOption;
import com.stefanvuckovic.domainmodel.domainModel.AttributeType;
import com.stefanvuckovic.domainmodel.domainModel.BasicType;
import com.stefanvuckovic.domainmodel.domainModel.BoolConstant;
import com.stefanvuckovic.domainmodel.domainModel.BoolType;
import com.stefanvuckovic.domainmodel.domainModel.Cardinality;
import com.stefanvuckovic.domainmodel.domainModel.CardinalityType;
import com.stefanvuckovic.domainmodel.domainModel.CollectionType;
import com.stefanvuckovic.domainmodel.domainModel.Concept;
import com.stefanvuckovic.domainmodel.domainModel.Constant;
import com.stefanvuckovic.domainmodel.domainModel.DateConstant;
import com.stefanvuckovic.domainmodel.domainModel.DateType;
import com.stefanvuckovic.domainmodel.domainModel.DomainModelFactory;
import com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage;
import com.stefanvuckovic.domainmodel.domainModel.Entity;
import com.stefanvuckovic.domainmodel.domainModel.EntityDeleteOption;
import com.stefanvuckovic.domainmodel.domainModel.EntityOption;
import com.stefanvuckovic.domainmodel.domainModel.EnumLiteral;
import com.stefanvuckovic.domainmodel.domainModel.InheritanceMappingOption;
import com.stefanvuckovic.domainmodel.domainModel.InheritanceMappingType;
import com.stefanvuckovic.domainmodel.domainModel.IntConstant;
import com.stefanvuckovic.domainmodel.domainModel.IntType;
import com.stefanvuckovic.domainmodel.domainModel.LongConstant;
import com.stefanvuckovic.domainmodel.domainModel.LongType;
import com.stefanvuckovic.domainmodel.domainModel.Model;
import com.stefanvuckovic.domainmodel.domainModel.Null;
import com.stefanvuckovic.domainmodel.domainModel.Option;
import com.stefanvuckovic.domainmodel.domainModel.PartOf;
import com.stefanvuckovic.domainmodel.domainModel.RefType;
import com.stefanvuckovic.domainmodel.domainModel.RelationshipOwner;
import com.stefanvuckovic.domainmodel.domainModel.Required;
import com.stefanvuckovic.domainmodel.domainModel.SingleType;
import com.stefanvuckovic.domainmodel.domainModel.StaticFieldSelection;
import com.stefanvuckovic.domainmodel.domainModel.StringConstant;
import com.stefanvuckovic.domainmodel.domainModel.StringType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainModelPackageImpl extends EPackageImpl implements DomainModelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conceptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inheritanceMappingTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass staticFieldSelectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass longConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityDeleteOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inheritanceMappingOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass longTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requiredEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipOwnerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cardinalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum cardinalityTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DomainModelPackageImpl()
  {
    super(eNS_URI, DomainModelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DomainModelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DomainModelPackage init()
  {
    if (isInited) return (DomainModelPackage)EPackage.Registry.INSTANCE.getEPackage(DomainModelPackage.eNS_URI);

    // Obtain or create and register package
    DomainModelPackageImpl theDomainModelPackage = (DomainModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomainModelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDomainModelPackage.createPackageContents();

    // Initialize created meta-data
    theDomainModelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDomainModelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DomainModelPackage.eNS_URI, theDomainModelPackage);
    return theDomainModelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Concepts()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConcept()
  {
    return conceptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConcept_Name()
  {
    return (EAttribute)conceptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcept_Attributes()
  {
    return (EReference)conceptEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_SuperType()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Options()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnum()
  {
    return enumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnum_Literals()
  {
    return (EReference)enumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumLiteral()
  {
    return enumLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumLiteral_Name()
  {
    return (EAttribute)enumLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumLiteral_Params()
  {
    return (EReference)enumLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOption()
  {
    return optionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityOption()
  {
    return entityOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInheritanceMappingType()
  {
    return inheritanceMappingTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInheritanceMappingType_Type()
  {
    return (EAttribute)inheritanceMappingTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Type()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Options()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeType()
  {
    return attributeTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleType()
  {
    return singleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicType()
  {
    return basicTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefType()
  {
    return refTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefType_Reference()
  {
    return (EReference)refTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollectionType()
  {
    return collectionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollectionType_OfType()
  {
    return (EReference)collectionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeOption()
  {
    return attributeOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStaticFieldSelection()
  {
    return staticFieldSelectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStaticFieldSelection_Receiver()
  {
    return (EReference)staticFieldSelectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStaticFieldSelection_Member()
  {
    return (EReference)staticFieldSelectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntConstant()
  {
    return intConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntConstant_Value()
  {
    return (EAttribute)intConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLongConstant()
  {
    return longConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLongConstant_Value()
  {
    return (EAttribute)longConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringConstant()
  {
    return stringConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringConstant_Value()
  {
    return (EAttribute)stringConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolConstant()
  {
    return boolConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoolConstant_Value()
  {
    return (EAttribute)boolConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDateConstant()
  {
    return dateConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDateConstant_Day()
  {
    return (EAttribute)dateConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDateConstant_Month()
  {
    return (EAttribute)dateConstantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDateConstant_Year()
  {
    return (EAttribute)dateConstantEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNull()
  {
    return nullEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityDeleteOption()
  {
    return entityDeleteOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntityDeleteOption_DeleteByFlag()
  {
    return (EAttribute)entityDeleteOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInheritanceMappingOption()
  {
    return inheritanceMappingOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInheritanceMappingOption_InheritanceMapping()
  {
    return (EReference)inheritanceMappingOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringType()
  {
    return stringTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntType()
  {
    return intTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLongType()
  {
    return longTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolType()
  {
    return boolTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDateType()
  {
    return dateTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequired()
  {
    return requiredEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequired_Required()
  {
    return (EAttribute)requiredEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPartOf()
  {
    return partOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPartOf_PartOf()
  {
    return (EAttribute)partOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationshipOwner()
  {
    return relationshipOwnerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationshipOwner_RelationshipOwner()
  {
    return (EReference)relationshipOwnerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCardinality()
  {
    return cardinalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCardinality_Card()
  {
    return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCardinalityType()
  {
    return cardinalityTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModelFactory getDomainModelFactory()
  {
    return (DomainModelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__CONCEPTS);

    conceptEClass = createEClass(CONCEPT);
    createEAttribute(conceptEClass, CONCEPT__NAME);
    createEReference(conceptEClass, CONCEPT__ATTRIBUTES);

    entityEClass = createEClass(ENTITY);
    createEReference(entityEClass, ENTITY__SUPER_TYPE);
    createEReference(entityEClass, ENTITY__OPTIONS);

    enumEClass = createEClass(ENUM);
    createEReference(enumEClass, ENUM__LITERALS);

    enumLiteralEClass = createEClass(ENUM_LITERAL);
    createEAttribute(enumLiteralEClass, ENUM_LITERAL__NAME);
    createEReference(enumLiteralEClass, ENUM_LITERAL__PARAMS);

    constantEClass = createEClass(CONSTANT);

    optionEClass = createEClass(OPTION);

    entityOptionEClass = createEClass(ENTITY_OPTION);

    inheritanceMappingTypeEClass = createEClass(INHERITANCE_MAPPING_TYPE);
    createEAttribute(inheritanceMappingTypeEClass, INHERITANCE_MAPPING_TYPE__TYPE);

    attributeEClass = createEClass(ATTRIBUTE);
    createEReference(attributeEClass, ATTRIBUTE__TYPE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
    createEReference(attributeEClass, ATTRIBUTE__OPTIONS);

    attributeTypeEClass = createEClass(ATTRIBUTE_TYPE);

    singleTypeEClass = createEClass(SINGLE_TYPE);

    basicTypeEClass = createEClass(BASIC_TYPE);

    refTypeEClass = createEClass(REF_TYPE);
    createEReference(refTypeEClass, REF_TYPE__REFERENCE);

    collectionTypeEClass = createEClass(COLLECTION_TYPE);
    createEReference(collectionTypeEClass, COLLECTION_TYPE__OF_TYPE);

    attributeOptionEClass = createEClass(ATTRIBUTE_OPTION);

    staticFieldSelectionEClass = createEClass(STATIC_FIELD_SELECTION);
    createEReference(staticFieldSelectionEClass, STATIC_FIELD_SELECTION__RECEIVER);
    createEReference(staticFieldSelectionEClass, STATIC_FIELD_SELECTION__MEMBER);

    intConstantEClass = createEClass(INT_CONSTANT);
    createEAttribute(intConstantEClass, INT_CONSTANT__VALUE);

    longConstantEClass = createEClass(LONG_CONSTANT);
    createEAttribute(longConstantEClass, LONG_CONSTANT__VALUE);

    stringConstantEClass = createEClass(STRING_CONSTANT);
    createEAttribute(stringConstantEClass, STRING_CONSTANT__VALUE);

    boolConstantEClass = createEClass(BOOL_CONSTANT);
    createEAttribute(boolConstantEClass, BOOL_CONSTANT__VALUE);

    dateConstantEClass = createEClass(DATE_CONSTANT);
    createEAttribute(dateConstantEClass, DATE_CONSTANT__DAY);
    createEAttribute(dateConstantEClass, DATE_CONSTANT__MONTH);
    createEAttribute(dateConstantEClass, DATE_CONSTANT__YEAR);

    nullEClass = createEClass(NULL);

    entityDeleteOptionEClass = createEClass(ENTITY_DELETE_OPTION);
    createEAttribute(entityDeleteOptionEClass, ENTITY_DELETE_OPTION__DELETE_BY_FLAG);

    inheritanceMappingOptionEClass = createEClass(INHERITANCE_MAPPING_OPTION);
    createEReference(inheritanceMappingOptionEClass, INHERITANCE_MAPPING_OPTION__INHERITANCE_MAPPING);

    stringTypeEClass = createEClass(STRING_TYPE);

    intTypeEClass = createEClass(INT_TYPE);

    longTypeEClass = createEClass(LONG_TYPE);

    boolTypeEClass = createEClass(BOOL_TYPE);

    dateTypeEClass = createEClass(DATE_TYPE);

    requiredEClass = createEClass(REQUIRED);
    createEAttribute(requiredEClass, REQUIRED__REQUIRED);

    partOfEClass = createEClass(PART_OF);
    createEAttribute(partOfEClass, PART_OF__PART_OF);

    relationshipOwnerEClass = createEClass(RELATIONSHIP_OWNER);
    createEReference(relationshipOwnerEClass, RELATIONSHIP_OWNER__RELATIONSHIP_OWNER);

    cardinalityEClass = createEClass(CARDINALITY);
    createEAttribute(cardinalityEClass, CARDINALITY__CARD);

    // Create enums
    cardinalityTypeEEnum = createEEnum(CARDINALITY_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    entityEClass.getESuperTypes().add(this.getConcept());
    enumEClass.getESuperTypes().add(this.getConcept());
    entityOptionEClass.getESuperTypes().add(this.getOption());
    singleTypeEClass.getESuperTypes().add(this.getAttributeType());
    basicTypeEClass.getESuperTypes().add(this.getSingleType());
    refTypeEClass.getESuperTypes().add(this.getSingleType());
    collectionTypeEClass.getESuperTypes().add(this.getAttributeType());
    attributeOptionEClass.getESuperTypes().add(this.getOption());
    intConstantEClass.getESuperTypes().add(this.getConstant());
    longConstantEClass.getESuperTypes().add(this.getConstant());
    stringConstantEClass.getESuperTypes().add(this.getConstant());
    boolConstantEClass.getESuperTypes().add(this.getConstant());
    dateConstantEClass.getESuperTypes().add(this.getConstant());
    nullEClass.getESuperTypes().add(this.getConstant());
    entityDeleteOptionEClass.getESuperTypes().add(this.getEntityOption());
    inheritanceMappingOptionEClass.getESuperTypes().add(this.getEntityOption());
    stringTypeEClass.getESuperTypes().add(this.getBasicType());
    intTypeEClass.getESuperTypes().add(this.getBasicType());
    longTypeEClass.getESuperTypes().add(this.getBasicType());
    boolTypeEClass.getESuperTypes().add(this.getBasicType());
    dateTypeEClass.getESuperTypes().add(this.getBasicType());
    requiredEClass.getESuperTypes().add(this.getAttributeOption());
    partOfEClass.getESuperTypes().add(this.getAttributeOption());
    relationshipOwnerEClass.getESuperTypes().add(this.getAttributeOption());
    cardinalityEClass.getESuperTypes().add(this.getAttributeOption());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Concepts(), this.getConcept(), null, "concepts", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conceptEClass, Concept.class, "Concept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConcept_Name(), ecorePackage.getEString(), "name", null, 0, 1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConcept_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntity_SuperType(), this.getEntity(), null, "superType", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_Options(), this.getEntityOption(), null, "options", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumEClass, com.stefanvuckovic.domainmodel.domainModel.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnum_Literals(), this.getEnumLiteral(), null, "literals", null, 0, -1, com.stefanvuckovic.domainmodel.domainModel.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumLiteralEClass, EnumLiteral.class, "EnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumLiteral_Params(), this.getConstant(), null, "params", null, 0, -1, EnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(entityOptionEClass, EntityOption.class, "EntityOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inheritanceMappingTypeEClass, InheritanceMappingType.class, "InheritanceMappingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInheritanceMappingType_Type(), ecorePackage.getEString(), "type", null, 0, 1, InheritanceMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttribute_Type(), this.getAttributeType(), null, "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_Options(), this.getAttributeOption(), null, "options", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeTypeEClass, AttributeType.class, "AttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(singleTypeEClass, SingleType.class, "SingleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(basicTypeEClass, BasicType.class, "BasicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(refTypeEClass, RefType.class, "RefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefType_Reference(), this.getConcept(), null, "reference", null, 0, 1, RefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(collectionTypeEClass, CollectionType.class, "CollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCollectionType_OfType(), this.getSingleType(), null, "ofType", null, 0, 1, CollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeOptionEClass, AttributeOption.class, "AttributeOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(staticFieldSelectionEClass, StaticFieldSelection.class, "StaticFieldSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStaticFieldSelection_Receiver(), this.getEntity(), null, "receiver", null, 0, 1, StaticFieldSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStaticFieldSelection_Member(), this.getAttribute(), null, "member", null, 0, 1, StaticFieldSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intConstantEClass, IntConstant.class, "IntConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(longConstantEClass, LongConstant.class, "LongConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLongConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, LongConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringConstantEClass, StringConstant.class, "StringConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolConstantEClass, BoolConstant.class, "BoolConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBoolConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, BoolConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dateConstantEClass, DateConstant.class, "DateConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDateConstant_Day(), ecorePackage.getEInt(), "day", null, 0, 1, DateConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDateConstant_Month(), ecorePackage.getEInt(), "month", null, 0, 1, DateConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDateConstant_Year(), ecorePackage.getEInt(), "year", null, 0, 1, DateConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nullEClass, Null.class, "Null", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(entityDeleteOptionEClass, EntityDeleteOption.class, "EntityDeleteOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntityDeleteOption_DeleteByFlag(), ecorePackage.getEBoolean(), "deleteByFlag", null, 0, 1, EntityDeleteOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inheritanceMappingOptionEClass, InheritanceMappingOption.class, "InheritanceMappingOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInheritanceMappingOption_InheritanceMapping(), this.getInheritanceMappingType(), null, "inheritanceMapping", null, 0, 1, InheritanceMappingOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(intTypeEClass, IntType.class, "IntType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(longTypeEClass, LongType.class, "LongType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(boolTypeEClass, BoolType.class, "BoolType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dateTypeEClass, DateType.class, "DateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(requiredEClass, Required.class, "Required", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequired_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, Required.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(partOfEClass, PartOf.class, "PartOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPartOf_PartOf(), ecorePackage.getEBoolean(), "partOf", null, 0, 1, PartOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationshipOwnerEClass, RelationshipOwner.class, "RelationshipOwner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationshipOwner_RelationshipOwner(), this.getStaticFieldSelection(), null, "relationshipOwner", null, 0, 1, RelationshipOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cardinalityEClass, Cardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCardinality_Card(), this.getCardinalityType(), "card", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(cardinalityTypeEEnum, CardinalityType.class, "CardinalityType");
    addEEnumLiteral(cardinalityTypeEEnum, CardinalityType.ONE);
    addEEnumLiteral(cardinalityTypeEEnum, CardinalityType.MANY);

    // Create resource
    createResource(eNS_URI);
  }

} //DomainModelPackageImpl
