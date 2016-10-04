/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.uIDSL;

import com.stefanvuckovic.domainmodel.domainModel.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.PageCall#getPage <em>Page</em>}</li>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.PageCall#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getPageCall()
 * @model
 * @generated
 */
public interface PageCall extends Expression
{
  /**
   * Returns the value of the '<em><b>Page</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Page</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Page</em>' reference.
   * @see #setPage(Page)
   * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getPageCall_Page()
   * @model
   * @generated
   */
  Page getPage();

  /**
   * Sets the value of the '{@link com.stefanvuckovic.uidsl.uIDSL.PageCall#getPage <em>Page</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Page</em>' reference.
   * @see #getPage()
   * @generated
   */
  void setPage(Page value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link com.stefanvuckovic.domainmodel.domainModel.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getPageCall_Params()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getParams();

} // PageCall
