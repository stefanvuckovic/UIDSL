/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.uIDSL;

import com.stefanvuckovic.domainmodel.domainModel.Expression;
import com.stefanvuckovic.domainmodel.domainModel.SelectionMember;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Selection Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression#getMember <em>Member</em>}</li>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression#isIsMethod <em>Is Method</em>}</li>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getMemberSelectionExpression()
 * @model
 * @generated
 */
public interface MemberSelectionExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Receiver</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receiver</em>' containment reference.
   * @see #setReceiver(Expression)
   * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getMemberSelectionExpression_Receiver()
   * @model containment="true"
   * @generated
   */
  Expression getReceiver();

  /**
   * Sets the value of the '{@link com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression#getReceiver <em>Receiver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receiver</em>' containment reference.
   * @see #getReceiver()
   * @generated
   */
  void setReceiver(Expression value);

  /**
   * Returns the value of the '<em><b>Member</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member</em>' reference.
   * @see #setMember(SelectionMember)
   * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getMemberSelectionExpression_Member()
   * @model
   * @generated
   */
  SelectionMember getMember();

  /**
   * Sets the value of the '{@link com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression#getMember <em>Member</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Member</em>' reference.
   * @see #getMember()
   * @generated
   */
  void setMember(SelectionMember value);

  /**
   * Returns the value of the '<em><b>Is Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Method</em>' attribute.
   * @see #setIsMethod(boolean)
   * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getMemberSelectionExpression_IsMethod()
   * @model
   * @generated
   */
  boolean isIsMethod();

  /**
   * Sets the value of the '{@link com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression#isIsMethod <em>Is Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Method</em>' attribute.
   * @see #isIsMethod()
   * @generated
   */
  void setIsMethod(boolean value);

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
   * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getMemberSelectionExpression_Params()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getParams();

} // MemberSelectionExpression