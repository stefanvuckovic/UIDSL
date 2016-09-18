/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainmodel.domainModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.stefanvuckovic.domainmodel.domainModel.Cardinality#getCard <em>Card</em>}</li>
 * </ul>
 *
 * @see com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage#getCardinality()
 * @model
 * @generated
 */
public interface Cardinality extends AttributeOption
{
  /**
   * Returns the value of the '<em><b>Card</b></em>' attribute.
   * The literals are from the enumeration {@link com.stefanvuckovic.domainmodel.domainModel.CardinalityType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Card</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Card</em>' attribute.
   * @see com.stefanvuckovic.domainmodel.domainModel.CardinalityType
   * @see #setCard(CardinalityType)
   * @see com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage#getCardinality_Card()
   * @model
   * @generated
   */
  CardinalityType getCard();

  /**
   * Sets the value of the '{@link com.stefanvuckovic.domainmodel.domainModel.Cardinality#getCard <em>Card</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Card</em>' attribute.
   * @see com.stefanvuckovic.domainmodel.domainModel.CardinalityType
   * @see #getCard()
   * @generated
   */
  void setCard(CardinalityType value);

} // Cardinality
