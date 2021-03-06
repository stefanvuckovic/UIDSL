/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.dto.dTO;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.stefanvuckovic.dto.dTO.DTOPackage
 * @generated
 */
public interface DTOFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DTOFactory eINSTANCE = com.stefanvuckovic.dto.dTO.impl.DTOFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  DTOModel createDTOModel();

  /**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
  DTOClass createDTOClass();

  /**
   * Returns a new object of class '<em>Object Representation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Representation</em>'.
   * @generated
   */
  ObjectRepresentation createObjectRepresentation();

  /**
   * Returns a new object of class '<em>ID Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ID Attribute</em>'.
   * @generated
   */
  IDAttribute createIDAttribute();

  /**
   * Returns a new object of class '<em>Text Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Type</em>'.
   * @generated
   */
  TextType createTextType();

  /**
   * Returns a new object of class '<em>Email Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Email Type</em>'.
   * @generated
   */
  EmailType createEmailType();

  /**
   * Returns a new object of class '<em>Password Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Password Type</em>'.
   * @generated
   */
  PasswordType createPasswordType();

  /**
   * Returns a new object of class '<em>File Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File Type</em>'.
   * @generated
   */
  FileType createFileType();

  /**
   * Returns a new object of class '<em>Image Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Image Type</em>'.
   * @generated
   */
  ImageType createImageType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DTOPackage getDTOPackage();

} //DTOFactory
