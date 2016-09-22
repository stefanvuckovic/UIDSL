/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.uIDSL;

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
 * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLFactory
 * @model kind="package"
 * @generated
 */
public interface UIDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "uIDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.stefanvuckovic.com/uidsl/UIDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "uIDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UIDSLPackage eINSTANCE = com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.UIModelImpl <em>UI Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIModelImpl
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getUIModel()
   * @generated
   */
  int UI_MODEL = 0;

  /**
   * The feature id for the '<em><b>Concepts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_MODEL__CONCEPTS = 0;

  /**
   * The number of structural features of the '<em>UI Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.UIConceptImpl <em>UI Concept</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIConceptImpl
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getUIConcept()
   * @generated
   */
  int UI_CONCEPT = 1;

  /**
   * The number of structural features of the '<em>UI Concept</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_CONCEPT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.ServerComponentImpl <em>Server Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.ServerComponentImpl
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getServerComponent()
   * @generated
   */
  int SERVER_COMPONENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_COMPONENT__NAME = UI_CONCEPT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_COMPONENT__ATTRIBUTES = UI_CONCEPT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_COMPONENT__MEMBERS = UI_CONCEPT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_COMPONENT__EXPRESSIONS = UI_CONCEPT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Server Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_COMPONENT_FEATURE_COUNT = UI_CONCEPT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.MemberImpl
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__TYPE = DomainModelPackage.SELECTION_MEMBER__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__NAME = DomainModelPackage.SELECTION_MEMBER__NAME;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = DomainModelPackage.SELECTION_MEMBER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.FieldImpl
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getField()
   * @generated
   */
  int FIELD = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = MEMBER__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = MEMBER__NAME;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.MethodImpl
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__TYPE = MEMBER__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMS = MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.VariableImpl
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 1;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.UIContainerImpl <em>UI Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIContainerImpl
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getUIContainer()
   * @generated
   */
  int UI_CONTAINER = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_CONTAINER__NAME = UI_CONCEPT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UI Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_CONTAINER_FEATURE_COUNT = UI_CONCEPT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.PageImpl <em>Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.PageImpl
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getPage()
   * @generated
   */
  int PAGE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__NAME = UI_CONTAINER__NAME;

  /**
   * The number of structural features of the '<em>Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FEATURE_COUNT = UI_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.TemplateImpl <em>Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.TemplateImpl
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getTemplate()
   * @generated
   */
  int TEMPLATE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__NAME = UI_CONTAINER__NAME;

  /**
   * The number of structural features of the '<em>Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FEATURE_COUNT = UI_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.FragmentImpl <em>Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.FragmentImpl
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getFragment()
   * @generated
   */
  int FRAGMENT = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT__NAME = UI_CONTAINER__NAME;

  /**
   * The number of structural features of the '<em>Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT_FEATURE_COUNT = UI_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.MemberSelectionExpressionImpl <em>Member Selection Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.MemberSelectionExpressionImpl
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getMemberSelectionExpression()
   * @generated
   */
  int MEMBER_SELECTION_EXPRESSION = 11;

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
   * The feature id for the '<em><b>Is Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_SELECTION_EXPRESSION__IS_METHOD = DomainModelPackage.EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_SELECTION_EXPRESSION__PARAMS = DomainModelPackage.EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Member Selection Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_SELECTION_EXPRESSION_FEATURE_COUNT = DomainModelPackage.EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.VariableReferenceImpl
   * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getVariableReference()
   * @generated
   */
  int VARIABLE_REFERENCE = 12;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__REF = DomainModelPackage.EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE_FEATURE_COUNT = DomainModelPackage.EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.uidsl.uIDSL.UIModel <em>UI Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Model</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.UIModel
   * @generated
   */
  EClass getUIModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.stefanvuckovic.uidsl.uIDSL.UIModel#getConcepts <em>Concepts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Concepts</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.UIModel#getConcepts()
   * @see #getUIModel()
   * @generated
   */
  EReference getUIModel_Concepts();

  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.uidsl.uIDSL.UIConcept <em>UI Concept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Concept</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.UIConcept
   * @generated
   */
  EClass getUIConcept();

  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.uidsl.uIDSL.ServerComponent <em>Server Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Server Component</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.ServerComponent
   * @generated
   */
  EClass getServerComponent();

  /**
   * Returns the meta object for the containment reference list '{@link com.stefanvuckovic.uidsl.uIDSL.ServerComponent#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.ServerComponent#getMembers()
   * @see #getServerComponent()
   * @generated
   */
  EReference getServerComponent_Members();

  /**
   * Returns the meta object for the containment reference list '{@link com.stefanvuckovic.uidsl.uIDSL.ServerComponent#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.ServerComponent#getExpressions()
   * @see #getServerComponent()
   * @generated
   */
  EReference getServerComponent_Expressions();

  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.uidsl.uIDSL.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.uidsl.uIDSL.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.uidsl.uIDSL.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the containment reference list '{@link com.stefanvuckovic.uidsl.uIDSL.Method#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.Method#getParams()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Params();

  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.uidsl.uIDSL.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the containment reference '{@link com.stefanvuckovic.uidsl.uIDSL.Variable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.Variable#getType()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Type();

  /**
   * Returns the meta object for the attribute '{@link com.stefanvuckovic.uidsl.uIDSL.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.uidsl.uIDSL.UIContainer <em>UI Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Container</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.UIContainer
   * @generated
   */
  EClass getUIContainer();

  /**
   * Returns the meta object for the attribute '{@link com.stefanvuckovic.uidsl.uIDSL.UIContainer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.UIContainer#getName()
   * @see #getUIContainer()
   * @generated
   */
  EAttribute getUIContainer_Name();

  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.uidsl.uIDSL.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.Page
   * @generated
   */
  EClass getPage();

  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.uidsl.uIDSL.Template <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.Template
   * @generated
   */
  EClass getTemplate();

  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.uidsl.uIDSL.Fragment <em>Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fragment</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.Fragment
   * @generated
   */
  EClass getFragment();

  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression <em>Member Selection Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member Selection Expression</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression
   * @generated
   */
  EClass getMemberSelectionExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression#getReceiver <em>Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Receiver</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression#getReceiver()
   * @see #getMemberSelectionExpression()
   * @generated
   */
  EReference getMemberSelectionExpression_Receiver();

  /**
   * Returns the meta object for the reference '{@link com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression#getMember <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Member</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression#getMember()
   * @see #getMemberSelectionExpression()
   * @generated
   */
  EReference getMemberSelectionExpression_Member();

  /**
   * Returns the meta object for the attribute '{@link com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression#isIsMethod <em>Is Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Method</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression#isIsMethod()
   * @see #getMemberSelectionExpression()
   * @generated
   */
  EAttribute getMemberSelectionExpression_IsMethod();

  /**
   * Returns the meta object for the containment reference list '{@link com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression#getParams()
   * @see #getMemberSelectionExpression()
   * @generated
   */
  EReference getMemberSelectionExpression_Params();

  /**
   * Returns the meta object for class '{@link com.stefanvuckovic.uidsl.uIDSL.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Reference</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.VariableReference
   * @generated
   */
  EClass getVariableReference();

  /**
   * Returns the meta object for the reference '{@link com.stefanvuckovic.uidsl.uIDSL.VariableReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see com.stefanvuckovic.uidsl.uIDSL.VariableReference#getRef()
   * @see #getVariableReference()
   * @generated
   */
  EReference getVariableReference_Ref();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  UIDSLFactory getUIDSLFactory();

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
     * The meta object literal for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.UIModelImpl <em>UI Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIModelImpl
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getUIModel()
     * @generated
     */
    EClass UI_MODEL = eINSTANCE.getUIModel();

    /**
     * The meta object literal for the '<em><b>Concepts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_MODEL__CONCEPTS = eINSTANCE.getUIModel_Concepts();

    /**
     * The meta object literal for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.UIConceptImpl <em>UI Concept</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIConceptImpl
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getUIConcept()
     * @generated
     */
    EClass UI_CONCEPT = eINSTANCE.getUIConcept();

    /**
     * The meta object literal for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.ServerComponentImpl <em>Server Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.ServerComponentImpl
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getServerComponent()
     * @generated
     */
    EClass SERVER_COMPONENT = eINSTANCE.getServerComponent();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVER_COMPONENT__MEMBERS = eINSTANCE.getServerComponent_Members();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVER_COMPONENT__EXPRESSIONS = eINSTANCE.getServerComponent_Expressions();

    /**
     * The meta object literal for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.MemberImpl
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.FieldImpl
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.MethodImpl
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PARAMS = eINSTANCE.getMethod_Params();

    /**
     * The meta object literal for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.VariableImpl
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.UIContainerImpl <em>UI Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIContainerImpl
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getUIContainer()
     * @generated
     */
    EClass UI_CONTAINER = eINSTANCE.getUIContainer();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UI_CONTAINER__NAME = eINSTANCE.getUIContainer_Name();

    /**
     * The meta object literal for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.PageImpl <em>Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.PageImpl
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getPage()
     * @generated
     */
    EClass PAGE = eINSTANCE.getPage();

    /**
     * The meta object literal for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.TemplateImpl <em>Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.TemplateImpl
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getTemplate()
     * @generated
     */
    EClass TEMPLATE = eINSTANCE.getTemplate();

    /**
     * The meta object literal for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.FragmentImpl <em>Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.FragmentImpl
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getFragment()
     * @generated
     */
    EClass FRAGMENT = eINSTANCE.getFragment();

    /**
     * The meta object literal for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.MemberSelectionExpressionImpl <em>Member Selection Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.MemberSelectionExpressionImpl
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getMemberSelectionExpression()
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
     * The meta object literal for the '<em><b>Is Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER_SELECTION_EXPRESSION__IS_METHOD = eINSTANCE.getMemberSelectionExpression_IsMethod();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_SELECTION_EXPRESSION__PARAMS = eINSTANCE.getMemberSelectionExpression_Params();

    /**
     * The meta object literal for the '{@link com.stefanvuckovic.uidsl.uIDSL.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.VariableReferenceImpl
     * @see com.stefanvuckovic.uidsl.uIDSL.impl.UIDSLPackageImpl#getVariableReference()
     * @generated
     */
    EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_REFERENCE__REF = eINSTANCE.getVariableReference_Ref();

  }

} //UIDSLPackage