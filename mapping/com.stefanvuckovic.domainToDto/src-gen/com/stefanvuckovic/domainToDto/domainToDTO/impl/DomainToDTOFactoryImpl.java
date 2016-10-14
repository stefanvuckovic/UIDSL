/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainToDto.domainToDTO.impl;

import com.stefanvuckovic.domainToDto.domainToDTO.*;

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
public class DomainToDTOFactoryImpl extends EFactoryImpl implements DomainToDTOFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DomainToDTOFactory init()
  {
    try
    {
      DomainToDTOFactory theDomainToDTOFactory = (DomainToDTOFactory)EPackage.Registry.INSTANCE.getEFactory(DomainToDTOPackage.eNS_URI);
      if (theDomainToDTOFactory != null)
      {
        return theDomainToDTOFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DomainToDTOFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainToDTOFactoryImpl()
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
      case DomainToDTOPackage.MAPPING_MODEL: return createMappingModel();
      case DomainToDTOPackage.MAPPER: return createMapper();
      case DomainToDTOPackage.MAPPED_ATTRIBUTE: return createMappedAttribute();
      case DomainToDTOPackage.ENTITY_MAPPING_EXPRESSION: return createEntityMappingExpression();
      case DomainToDTOPackage.ATOM_EXPRESSION: return createAtomExpression();
      case DomainToDTOPackage.MEMBER_SELECTION_EXPRESSION: return createMemberSelectionExpression();
      case DomainToDTOPackage.STATIC_ENTITY_REF: return createStaticEntityRef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingModel createMappingModel()
  {
    MappingModelImpl mappingModel = new MappingModelImpl();
    return mappingModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapper createMapper()
  {
    MapperImpl mapper = new MapperImpl();
    return mapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappedAttribute createMappedAttribute()
  {
    MappedAttributeImpl mappedAttribute = new MappedAttributeImpl();
    return mappedAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityMappingExpression createEntityMappingExpression()
  {
    EntityMappingExpressionImpl entityMappingExpression = new EntityMappingExpressionImpl();
    return entityMappingExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomExpression createAtomExpression()
  {
    AtomExpressionImpl atomExpression = new AtomExpressionImpl();
    return atomExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberSelectionExpression createMemberSelectionExpression()
  {
    MemberSelectionExpressionImpl memberSelectionExpression = new MemberSelectionExpressionImpl();
    return memberSelectionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticEntityRef createStaticEntityRef()
  {
    StaticEntityRefImpl staticEntityRef = new StaticEntityRefImpl();
    return staticEntityRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainToDTOPackage getDomainToDTOPackage()
  {
    return (DomainToDTOPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DomainToDTOPackage getPackage()
  {
    return DomainToDTOPackage.eINSTANCE;
  }

} //DomainToDTOFactoryImpl
