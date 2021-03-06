/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.uIDSL;

import com.stefanvuckovic.domainmodel.domainModel.AttributeType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Component Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.DefaultComponentConfig#getType <em>Type</em>}</li>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.DefaultComponentConfig#getInputComp <em>Input Comp</em>}</li>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.DefaultComponentConfig#getOutputComp <em>Output Comp</em>}</li>
 * </ul>
 *
 * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getDefaultComponentConfig()
 * @model
 * @generated
 */
public interface DefaultComponentConfig extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(AttributeType)
   * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getDefaultComponentConfig_Type()
   * @model containment="true"
   * @generated
   */
  AttributeType getType();

  /**
   * Sets the value of the '{@link com.stefanvuckovic.uidsl.uIDSL.DefaultComponentConfig#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AttributeType value);

  /**
   * Returns the value of the '<em><b>Input Comp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Comp</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Comp</em>' reference.
   * @see #setInputComp(UIComponent)
   * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getDefaultComponentConfig_InputComp()
   * @model
   * @generated
   */
  UIComponent getInputComp();

  /**
   * Sets the value of the '{@link com.stefanvuckovic.uidsl.uIDSL.DefaultComponentConfig#getInputComp <em>Input Comp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Comp</em>' reference.
   * @see #getInputComp()
   * @generated
   */
  void setInputComp(UIComponent value);

  /**
   * Returns the value of the '<em><b>Output Comp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Comp</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Comp</em>' reference.
   * @see #setOutputComp(UIComponent)
   * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getDefaultComponentConfig_OutputComp()
   * @model
   * @generated
   */
  UIComponent getOutputComp();

  /**
   * Sets the value of the '{@link com.stefanvuckovic.uidsl.uIDSL.DefaultComponentConfig#getOutputComp <em>Output Comp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Comp</em>' reference.
   * @see #getOutputComp()
   * @generated
   */
  void setOutputComp(UIComponent value);

} // DefaultComponentConfig
