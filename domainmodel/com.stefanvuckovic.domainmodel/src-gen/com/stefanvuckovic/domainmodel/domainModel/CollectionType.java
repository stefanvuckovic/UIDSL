/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainmodel.domainModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.stefanvuckovic.domainmodel.domainModel.CollectionType#getOfType <em>Of Type</em>}</li>
 * </ul>
 *
 * @see com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage#getCollectionType()
 * @model
 * @generated
 */
public interface CollectionType extends AttributeType
{
  /**
   * Returns the value of the '<em><b>Of Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Of Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Of Type</em>' containment reference.
   * @see #setOfType(SingleType)
   * @see com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage#getCollectionType_OfType()
   * @model containment="true"
   * @generated
   */
  SingleType getOfType();

  /**
   * Sets the value of the '{@link com.stefanvuckovic.domainmodel.domainModel.CollectionType#getOfType <em>Of Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Of Type</em>' containment reference.
   * @see #getOfType()
   * @generated
   */
  void setOfType(SingleType value);

} // CollectionType
