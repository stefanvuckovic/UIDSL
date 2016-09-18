/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainmodel.domainModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.stefanvuckovic.domainmodel.domainModel.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link com.stefanvuckovic.domainmodel.domainModel.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link com.stefanvuckovic.domainmodel.domainModel.Attribute#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
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
   * @see com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage#getAttribute_Type()
   * @model containment="true"
   * @generated
   */
  AttributeType getType();

  /**
   * Sets the value of the '{@link com.stefanvuckovic.domainmodel.domainModel.Attribute#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AttributeType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.stefanvuckovic.domainmodel.domainModel.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link com.stefanvuckovic.domainmodel.domainModel.AttributeOption}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage#getAttribute_Options()
   * @model containment="true"
   * @generated
   */
  EList<AttributeOption> getOptions();

} // Attribute
