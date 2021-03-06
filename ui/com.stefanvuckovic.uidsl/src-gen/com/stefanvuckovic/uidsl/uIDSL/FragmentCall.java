/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.uIDSL;

import com.stefanvuckovic.domainmodel.domainModel.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragment Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.FragmentCall#getFrag <em>Frag</em>}</li>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.FragmentCall#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getFragmentCall()
 * @model
 * @generated
 */
public interface FragmentCall extends UIElement
{
  /**
   * Returns the value of the '<em><b>Frag</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Frag</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Frag</em>' reference.
   * @see #setFrag(Fragment)
   * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getFragmentCall_Frag()
   * @model
   * @generated
   */
  Fragment getFrag();

  /**
   * Sets the value of the '{@link com.stefanvuckovic.uidsl.uIDSL.FragmentCall#getFrag <em>Frag</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Frag</em>' reference.
   * @see #getFrag()
   * @generated
   */
  void setFrag(Fragment value);

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
   * @see com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage#getFragmentCall_Params()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getParams();

} // FragmentCall
