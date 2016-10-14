/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainToDto.domainToDTO;

import com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.stefanvuckovic.domainToDto.domainToDTO.DomainToDTOFactory
 * @model kind="package"
 * @generated
 */
public interface DomainToDTOPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "domainToDTO";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.stefanvuckovic.com/domainToDto/DomainToDTO";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "domainToDTO";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DomainToDTOPackage eINSTANCE = com.stefanvuckovic.domainToDto.domainToDTO.impl.DomainToDTOPackageImpl.init();

  /**
   * The meta object id for the '{@link com.stefanvuckovic.domainToDto.domainToDTO.impl.MappingModelImpl <em>Mapping Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.MappingModelImpl
   * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.DomainToDTOPackageImpl#getMappingModel()
   * @generated
   */
  int MAPPING_MODEL = 0;

  /**
   * The feature id for the '<em><b>Mappers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODEL__MAPPERS = 0;

  /**
   * The number of structural features of the '<em>Mapping Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.stefanvuckovic.domainToDto.domainToDTO.impl.MapperImpl <em>Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.MapperImpl
   * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.DomainToDTOPackageImpl#getMapper()
   * @generated
   */
  int MAPPER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__NAME = 0;

  /**
   * The feature id for the '<em><b>Dto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__DTO = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__ATTRIBUTES = 2;

  /**
   * The number of structural features of the '<em>Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.stefanvuckovic.domainToDto.domainToDTO.impl.MappedAttributeImpl <em>Mapped Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.MappedAttributeImpl
   * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.DomainToDTOPackageImpl#getMappedAttribute()
   * @generated
   */
  int MAPPED_ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_ATTRIBUTE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_ATTRIBUTE__MAPPING = 1;

  /**
   * The number of structural features of the '<em>Mapped Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.stefanvuckovic.domainToDto.domainToDTO.impl.EntityMappingExpressionImpl <em>Entity Mapping Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.EntityMappingExpressionImpl
   * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.DomainToDTOPackageImpl#getEntityMappingExpression()
   * @generated
   */
  int ENTITY_MAPPING_EXPRESSION = 3;

  /**
   * The feature id for the '<em><b>Mapped Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPING_EXPRESSION__MAPPED_ENTITY = DomainModelPackage.EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mapper</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPING_EXPRESSION__MAPPER = DomainModelPackage.EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity Mapping Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPING_EXPRESSION_FEATURE_COUNT = DomainModelPackage.EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.stefanvuckovic.domainToDto.domainToDTO.impl.AtomExpressionImpl <em>Atom Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.AtomExpressionImpl
   * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.DomainToDTOPackageImpl#getAtomExpression()
   * @generated
   */
  int ATOM_EXPRESSION = 4;

  /**
   * The number of structural features of the '<em>Atom Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_EXPRESSION_FEATURE_COUNT = DomainModelPackage.EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.stefanvuckovic.domainToDto.domainToDTO.impl.MemberSelectionExpressionImpl <em>Member Selection Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.MemberSelectionExpressionImpl
   * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.DomainToDTOPackageImpl#getMemberSelectionExpression()
   * @generated
   */
  int MEMBER_SELECTION_EXPRESSION = 5;

  /**
   * The feature id for the '<em><b>Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_SELECTION_EXPRESSION__RECEIVER = DomainModelPackage.EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Member</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_SELECTION_EXPRESSION__MEMBER = DomainModelPackage.EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Member Selection Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_SELECTION_EXPRESSION_FEATURE_COUNT = DomainModelPackage.EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.stefanvuckovic.domainToDto.domainToDTO.impl.StaticEntityRefImpl <em>Static Entity Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.StaticEntityRefImpl
   * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.DomainToDTOPackageImpl#getStaticEntityRef()
   * @generated
   */
  int STATIC_ENTITY_REF = 6;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_ENTITY_REF__REFERENCE = ATOM_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Static Entity Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_ENTITY_REF_FEATURE_COUNT = ATOM_EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.domainToDto.domainToDTO.MappingModel <em>Mapping Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Model</em>'.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.MappingModel
   * @generated
   */
  EClass getMappingModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.stefanvuckovic.domainToDto.domainToDTO.MappingModel#getMappers <em>Mappers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappers</em>'.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.MappingModel#getMappers()
   * @see #getMappingModel()
   * @generated
   */
  EReference getMappingModel_Mappers();

  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.domainToDto.domainToDTO.Mapper <em>Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapper</em>'.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.Mapper
   * @generated
   */
  EClass getMapper();

  /**
   * Returns the meta object for the attribute '{@link com.stefanvuckovic.domainToDto.domainToDTO.Mapper#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.Mapper#getName()
   * @see #getMapper()
   * @generated
   */
  EAttribute getMapper_Name();

  /**
   * Returns the meta object for the reference '{@link com.stefanvuckovic.domainToDto.domainToDTO.Mapper#getDto <em>Dto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dto</em>'.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.Mapper#getDto()
   * @see #getMapper()
   * @generated
   */
  EReference getMapper_Dto();

  /**
   * Returns the meta object for the containment reference list '{@link com.stefanvuckovic.domainToDto.domainToDTO.Mapper#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.Mapper#getAttributes()
   * @see #getMapper()
   * @generated
   */
  EReference getMapper_Attributes();

  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.domainToDto.domainToDTO.MappedAttribute <em>Mapped Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapped Attribute</em>'.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.MappedAttribute
   * @generated
   */
  EClass getMappedAttribute();

  /**
   * Returns the meta object for the reference '{@link com.stefanvuckovic.domainToDto.domainToDTO.MappedAttribute#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attr</em>'.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.MappedAttribute#getAttr()
   * @see #getMappedAttribute()
   * @generated
   */
  EReference getMappedAttribute_Attr();

  /**
   * Returns the meta object for the containment reference '{@link com.stefanvuckovic.domainToDto.domainToDTO.MappedAttribute#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping</em>'.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.MappedAttribute#getMapping()
   * @see #getMappedAttribute()
   * @generated
   */
  EReference getMappedAttribute_Mapping();

  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.domainToDto.domainToDTO.EntityMappingExpression <em>Entity Mapping Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Mapping Expression</em>'.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.EntityMappingExpression
   * @generated
   */
  EClass getEntityMappingExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.stefanvuckovic.domainToDto.domainToDTO.EntityMappingExpression#getMappedEntity <em>Mapped Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapped Entity</em>'.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.EntityMappingExpression#getMappedEntity()
   * @see #getEntityMappingExpression()
   * @generated
   */
  EReference getEntityMappingExpression_MappedEntity();

  /**
   * Returns the meta object for the reference '{@link com.stefanvuckovic.domainToDto.domainToDTO.EntityMappingExpression#getMapper <em>Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Mapper</em>'.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.EntityMappingExpression#getMapper()
   * @see #getEntityMappingExpression()
   * @generated
   */
  EReference getEntityMappingExpression_Mapper();

  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.domainToDto.domainToDTO.AtomExpression <em>Atom Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atom Expression</em>'.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.AtomExpression
   * @generated
   */
  EClass getAtomExpression();

  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.domainToDto.domainToDTO.MemberSelectionExpression <em>Member Selection Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member Selection Expression</em>'.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.MemberSelectionExpression
   * @generated
   */
  EClass getMemberSelectionExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.stefanvuckovic.domainToDto.domainToDTO.MemberSelectionExpression#getReceiver <em>Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Receiver</em>'.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.MemberSelectionExpression#getReceiver()
   * @see #getMemberSelectionExpression()
   * @generated
   */
  EReference getMemberSelectionExpression_Receiver();

  /**
   * Returns the meta object for the reference '{@link com.stefanvuckovic.domainToDto.domainToDTO.MemberSelectionExpression#getMember <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Member</em>'.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.MemberSelectionExpression#getMember()
   * @see #getMemberSelectionExpression()
   * @generated
   */
  EReference getMemberSelectionExpression_Member();

  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.domainToDto.domainToDTO.StaticEntityRef <em>Static Entity Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Entity Ref</em>'.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.StaticEntityRef
   * @generated
   */
  EClass getStaticEntityRef();

  /**
   * Returns the meta object for the reference '{@link com.stefanvuckovic.domainToDto.domainToDTO.StaticEntityRef#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.StaticEntityRef#getReference()
   * @see #getStaticEntityRef()
   * @generated
   */
  EReference getStaticEntityRef_Reference();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DomainToDTOFactory getDomainToDTOFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.stefanvuckovic.domainToDto.domainToDTO.impl.MappingModelImpl <em>Mapping Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.MappingModelImpl
     * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.DomainToDTOPackageImpl#getMappingModel()
     * @generated
     */
    EClass MAPPING_MODEL = eINSTANCE.getMappingModel();

    /**
     * The meta object literal for the '<em><b>Mappers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_MODEL__MAPPERS = eINSTANCE.getMappingModel_Mappers();

    /**
     * The meta object literal for the '{@link com.stefanvuckovic.domainToDto.domainToDTO.impl.MapperImpl <em>Mapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.MapperImpl
     * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.DomainToDTOPackageImpl#getMapper()
     * @generated
     */
    EClass MAPPER = eINSTANCE.getMapper();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPER__NAME = eINSTANCE.getMapper_Name();

    /**
     * The meta object literal for the '<em><b>Dto</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPER__DTO = eINSTANCE.getMapper_Dto();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPER__ATTRIBUTES = eINSTANCE.getMapper_Attributes();

    /**
     * The meta object literal for the '{@link com.stefanvuckovic.domainToDto.domainToDTO.impl.MappedAttributeImpl <em>Mapped Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.MappedAttributeImpl
     * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.DomainToDTOPackageImpl#getMappedAttribute()
     * @generated
     */
    EClass MAPPED_ATTRIBUTE = eINSTANCE.getMappedAttribute();

    /**
     * The meta object literal for the '<em><b>Attr</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPED_ATTRIBUTE__ATTR = eINSTANCE.getMappedAttribute_Attr();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPED_ATTRIBUTE__MAPPING = eINSTANCE.getMappedAttribute_Mapping();

    /**
     * The meta object literal for the '{@link com.stefanvuckovic.domainToDto.domainToDTO.impl.EntityMappingExpressionImpl <em>Entity Mapping Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.EntityMappingExpressionImpl
     * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.DomainToDTOPackageImpl#getEntityMappingExpression()
     * @generated
     */
    EClass ENTITY_MAPPING_EXPRESSION = eINSTANCE.getEntityMappingExpression();

    /**
     * The meta object literal for the '<em><b>Mapped Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_MAPPING_EXPRESSION__MAPPED_ENTITY = eINSTANCE.getEntityMappingExpression_MappedEntity();

    /**
     * The meta object literal for the '<em><b>Mapper</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_MAPPING_EXPRESSION__MAPPER = eINSTANCE.getEntityMappingExpression_Mapper();

    /**
     * The meta object literal for the '{@link com.stefanvuckovic.domainToDto.domainToDTO.impl.AtomExpressionImpl <em>Atom Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.AtomExpressionImpl
     * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.DomainToDTOPackageImpl#getAtomExpression()
     * @generated
     */
    EClass ATOM_EXPRESSION = eINSTANCE.getAtomExpression();

    /**
     * The meta object literal for the '{@link com.stefanvuckovic.domainToDto.domainToDTO.impl.MemberSelectionExpressionImpl <em>Member Selection Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.MemberSelectionExpressionImpl
     * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.DomainToDTOPackageImpl#getMemberSelectionExpression()
     * @generated
     */
    EClass MEMBER_SELECTION_EXPRESSION = eINSTANCE.getMemberSelectionExpression();

    /**
     * The meta object literal for the '<em><b>Receiver</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_SELECTION_EXPRESSION__RECEIVER = eINSTANCE.getMemberSelectionExpression_Receiver();

    /**
     * The meta object literal for the '<em><b>Member</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_SELECTION_EXPRESSION__MEMBER = eINSTANCE.getMemberSelectionExpression_Member();

    /**
     * The meta object literal for the '{@link com.stefanvuckovic.domainToDto.domainToDTO.impl.StaticEntityRefImpl <em>Static Entity Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.StaticEntityRefImpl
     * @see com.stefanvuckovic.domainToDto.domainToDTO.impl.DomainToDTOPackageImpl#getStaticEntityRef()
     * @generated
     */
    EClass STATIC_ENTITY_REF = eINSTANCE.getStaticEntityRef();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_ENTITY_REF__REFERENCE = eINSTANCE.getStaticEntityRef_Reference();

  }

} //DomainToDTOPackage
