/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.dto.dTO.impl;

import com.stefanvuckovic.dto.dTO.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DTOFactoryImpl extends EFactoryImpl implements DTOFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DTOFactory init()
  {
    try
    {
      DTOFactory theDTOFactory = (DTOFactory)EPackage.Registry.INSTANCE.getEFactory(DTOPackage.eNS_URI);
      if (theDTOFactory != null)
      {
        return theDTOFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DTOFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTOFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DTOPackage.DTO_MODEL: return createDTOModel();
      case DTOPackage.DTO_CLASS: return createDTOClass();
      case DTOPackage.OBJECT_REPRESENTATION: return createObjectRepresentation();
      case DTOPackage.ID_ATTRIBUTE: return createIDAttribute();
      case DTOPackage.TEXT_TYPE: return createTextType();
      case DTOPackage.EMAIL_TYPE: return createEmailType();
      case DTOPackage.PASSWORD_TYPE: return createPasswordType();
      case DTOPackage.FILE_TYPE: return createFileType();
      case DTOPackage.IMAGE_TYPE: return createImageType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTOModel createDTOModel()
  {
    DTOModelImpl dtoModel = new DTOModelImpl();
    return dtoModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTOClass createDTOClass()
  {
    DTOClassImpl dtoClass = new DTOClassImpl();
    return dtoClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectRepresentation createObjectRepresentation()
  {
    ObjectRepresentationImpl objectRepresentation = new ObjectRepresentationImpl();
    return objectRepresentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDAttribute createIDAttribute()
  {
    IDAttributeImpl idAttribute = new IDAttributeImpl();
    return idAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextType createTextType()
  {
    TextTypeImpl textType = new TextTypeImpl();
    return textType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmailType createEmailType()
  {
    EmailTypeImpl emailType = new EmailTypeImpl();
    return emailType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PasswordType createPasswordType()
  {
    PasswordTypeImpl passwordType = new PasswordTypeImpl();
    return passwordType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileType createFileType()
  {
    FileTypeImpl fileType = new FileTypeImpl();
    return fileType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageType createImageType()
  {
    ImageTypeImpl imageType = new ImageTypeImpl();
    return imageType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTOPackage getDTOPackage()
  {
    return (DTOPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DTOPackage getPackage()
  {
    return DTOPackage.eINSTANCE;
  }

} //DTOFactoryImpl
