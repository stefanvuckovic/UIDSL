/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.uIDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.Page#getParams <em>Params</em>}</li>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.Page#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends UIContainer
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link com.stefanvuckovic.uidsl.uIDSL.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getPage_Params()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getParams();

  /**
   * Returns the value of the '<em><b>Template</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template</em>' reference.
   * @see #setTemplate(Template)
   * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getPage_Template()
   * @model
   * @generated
   */
  Template getTemplate();

  /**
   * Sets the value of the '{@link com.stefanvuckovic.uidsl.uIDSL.Page#getTemplate <em>Template</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template</em>' reference.
   * @see #getTemplate()
   * @generated
   */
  void setTemplate(Template value);

} // Page
