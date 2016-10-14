/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainToDto.domainToDTO;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.stefanvuckovic.domainToDto.domainToDTO.DomainToDTOPackage
 * @generated
 */
public interface DomainToDTOFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DomainToDTOFactory eINSTANCE = com.stefanvuckovic.domainToDto.domainToDTO.impl.DomainToDTOFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Mapping Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Model</em>'.
   * @generated
   */
  MappingModel createMappingModel();

  /**
   * Returns a new object of class '<em>Mapper</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapper</em>'.
   * @generated
   */
  Mapper createMapper();

  /**
   * Returns a new object of class '<em>Mapped Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapped Attribute</em>'.
   * @generated
   */
  MappedAttribute createMappedAttribute();

  /**
   * Returns a new object of class '<em>Entity Mapping Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Mapping Expression</em>'.
   * @generated
   */
  EntityMappingExpression createEntityMappingExpression();

  /**
   * Returns a new object of class '<em>Atom Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atom Expression</em>'.
   * @generated
   */
  AtomExpression createAtomExpression();

  /**
   * Returns a new object of class '<em>Member Selection Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member Selection Expression</em>'.
   * @generated
   */
  MemberSelectionExpression createMemberSelectionExpression();

  /**
   * Returns a new object of class '<em>Static Entity Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static Entity Ref</em>'.
   * @generated
   */
  StaticEntityRef createStaticEntityRef();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DomainToDTOPackage getDomainToDTOPackage();

} //DomainToDTOFactory
