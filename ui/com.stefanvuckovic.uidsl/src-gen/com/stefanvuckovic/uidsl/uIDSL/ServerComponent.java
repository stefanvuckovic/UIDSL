/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.uIDSL;

import com.stefanvuckovic.domainmodel.domainModel.Concept;
import com.stefanvuckovic.domainmodel.domainModel.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.ServerComponent#getMembers <em>Members</em>}</li>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.ServerComponent#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getServerComponent()
 * @model
 * @generated
 */
public interface ServerComponent extends UIConcept, Concept
{
  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link com.stefanvuckovic.uidsl.uIDSL.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getServerComponent_Members()
   * @model containment="true"
   * @generated
   */
  EList<Member> getMembers();

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link com.stefanvuckovic.domainmodel.domainModel.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getServerComponent_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

} // ServerComponent
