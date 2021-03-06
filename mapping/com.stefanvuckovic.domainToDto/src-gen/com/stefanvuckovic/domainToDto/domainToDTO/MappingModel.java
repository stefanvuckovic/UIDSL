/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainToDto.domainToDTO;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.stefanvuckovic.domainToDto.domainToDTO.MappingModel#getMappers <em>Mappers</em>}</li>
 * </ul>
 *
 * @see com.stefanvuckovic.domainToDto.domainToDTO.DomainToDTOPackage#getMappingModel()
 * @model
 * @generated
 */
public interface MappingModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Mappers</b></em>' containment reference list.
   * The list contents are of type {@link com.stefanvuckovic.domainToDto.domainToDTO.Mapper}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappers</em>' containment reference list.
   * @see com.stefanvuckovic.domainToDto.domainToDTO.DomainToDTOPackage#getMappingModel_Mappers()
   * @model containment="true"
   * @generated
   */
  EList<Mapper> getMappers();

} // MappingModel
