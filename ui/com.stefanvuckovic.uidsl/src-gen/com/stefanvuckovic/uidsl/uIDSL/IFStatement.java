/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.uIDSL;

import com.stefanvuckovic.domainmodel.domainModel.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IF Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.IFStatement#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getIFStatement()
 * @model
 * @generated
 */
public interface IFStatement extends LogicElement
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getIFStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link com.stefanvuckovic.uidsl.uIDSL.IFStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // IFStatement
