/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.uIDSL.impl;

import com.stefanvuckovic.uidsl.uIDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UIDSLFactoryImpl extends EFactoryImpl implements UIDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UIDSLFactory init()
  {
    try
    {
      UIDSLFactory theUIDSLFactory = (UIDSLFactory)EPackage.Registry.INSTANCE.getEFactory(UIDSLPackage.eNS_URI);
      if (theUIDSLFactory != null)
      {
        return theUIDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UIDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UIDSLPackage.UI_MODEL: return createUIModel();
      case UIDSLPackage.UI_CONCEPT: return createUIConcept();
      case UIDSLPackage.SERVER_COMPONENT: return createServerComponent();
      case UIDSLPackage.MEMBER: return createMember();
      case UIDSLPackage.FIELD: return createField();
      case UIDSLPackage.METHOD: return createMethod();
      case UIDSLPackage.VARIABLE: return createVariable();
      case UIDSLPackage.UI_CONTAINER: return createUIContainer();
      case UIDSLPackage.PAGE: return createPage();
      case UIDSLPackage.TEMPLATE: return createTemplate();
      case UIDSLPackage.FRAGMENT: return createFragment();
      case UIDSLPackage.MEMBER_SELECTION_EXPRESSION: return createMemberSelectionExpression();
      case UIDSLPackage.VARIABLE_REFERENCE: return createVariableReference();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIModel createUIModel()
  {
    UIModelImpl uiModel = new UIModelImpl();
    return uiModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIConcept createUIConcept()
  {
    UIConceptImpl uiConcept = new UIConceptImpl();
    return uiConcept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServerComponent createServerComponent()
  {
    ServerComponentImpl serverComponent = new ServerComponentImpl();
    return serverComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIContainer createUIContainer()
  {
    UIContainerImpl uiContainer = new UIContainerImpl();
    return uiContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page createPage()
  {
    PageImpl page = new PageImpl();
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Template createTemplate()
  {
    TemplateImpl template = new TemplateImpl();
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fragment createFragment()
  {
    FragmentImpl fragment = new FragmentImpl();
    return fragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberSelectionExpression createMemberSelectionExpression()
  {
    MemberSelectionExpressionImpl memberSelectionExpression = new MemberSelectionExpressionImpl();
    return memberSelectionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableReference createVariableReference()
  {
    VariableReferenceImpl variableReference = new VariableReferenceImpl();
    return variableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIDSLPackage getUIDSLPackage()
  {
    return (UIDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UIDSLPackage getPackage()
  {
    return UIDSLPackage.eINSTANCE;
  }

} //UIDSLFactoryImpl
