/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainmodel.domainModel.util;

import com.stefanvuckovic.domainmodel.domainModel.Attribute;
import com.stefanvuckovic.domainmodel.domainModel.AttributeOption;
import com.stefanvuckovic.domainmodel.domainModel.AttributeType;
import com.stefanvuckovic.domainmodel.domainModel.BasicType;
import com.stefanvuckovic.domainmodel.domainModel.BoolConstant;
import com.stefanvuckovic.domainmodel.domainModel.BoolType;
import com.stefanvuckovic.domainmodel.domainModel.Cardinality;
import com.stefanvuckovic.domainmodel.domainModel.CollectionType;
import com.stefanvuckovic.domainmodel.domainModel.Concept;
import com.stefanvuckovic.domainmodel.domainModel.DateConstant;
import com.stefanvuckovic.domainmodel.domainModel.DateType;
import com.stefanvuckovic.domainmodel.domainModel.DecimalConstant;
import com.stefanvuckovic.domainmodel.domainModel.DecimalType;
import com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage;
import com.stefanvuckovic.domainmodel.domainModel.Entity;
import com.stefanvuckovic.domainmodel.domainModel.EntityDeleteOption;
import com.stefanvuckovic.domainmodel.domainModel.EntityOption;
import com.stefanvuckovic.domainmodel.domainModel.EnumLiteral;
import com.stefanvuckovic.domainmodel.domainModel.Expression;
import com.stefanvuckovic.domainmodel.domainModel.InheritanceMappingOption;
import com.stefanvuckovic.domainmodel.domainModel.InheritanceMappingType;
import com.stefanvuckovic.domainmodel.domainModel.IntConstant;
import com.stefanvuckovic.domainmodel.domainModel.IntType;
import com.stefanvuckovic.domainmodel.domainModel.LongConstant;
import com.stefanvuckovic.domainmodel.domainModel.LongType;
import com.stefanvuckovic.domainmodel.domainModel.Model;
import com.stefanvuckovic.domainmodel.domainModel.Null;
import com.stefanvuckovic.domainmodel.domainModel.Option;
import com.stefanvuckovic.domainmodel.domainModel.PartOf;
import com.stefanvuckovic.domainmodel.domainModel.RefType;
import com.stefanvuckovic.domainmodel.domainModel.RelationshipOwner;
import com.stefanvuckovic.domainmodel.domainModel.Required;
import com.stefanvuckovic.domainmodel.domainModel.SelectionMember;
import com.stefanvuckovic.domainmodel.domainModel.SingleType;
import com.stefanvuckovic.domainmodel.domainModel.StaticFieldSelection;
import com.stefanvuckovic.domainmodel.domainModel.StringConstant;
import com.stefanvuckovic.domainmodel.domainModel.StringType;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage
 * @generated
 */
public class DomainModelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DomainModelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DomainModelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainModelSwitch<Adapter> modelSwitch =
    new DomainModelSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseConcept(Concept object)
      {
        return createConceptAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseEnum(com.stefanvuckovic.domainmodel.domainModel.Enum object)
      {
        return createEnumAdapter();
      }
      @Override
      public Adapter caseEnumLiteral(EnumLiteral object)
      {
        return createEnumLiteralAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseOption(Option object)
      {
        return createOptionAdapter();
      }
      @Override
      public Adapter caseEntityOption(EntityOption object)
      {
        return createEntityOptionAdapter();
      }
      @Override
      public Adapter caseInheritanceMappingType(InheritanceMappingType object)
      {
        return createInheritanceMappingTypeAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseAttributeType(AttributeType object)
      {
        return createAttributeTypeAdapter();
      }
      @Override
      public Adapter caseSingleType(SingleType object)
      {
        return createSingleTypeAdapter();
      }
      @Override
      public Adapter caseBasicType(BasicType object)
      {
        return createBasicTypeAdapter();
      }
      @Override
      public Adapter caseRefType(RefType object)
      {
        return createRefTypeAdapter();
      }
      @Override
      public Adapter caseCollectionType(CollectionType object)
      {
        return createCollectionTypeAdapter();
      }
      @Override
      public Adapter caseAttributeOption(AttributeOption object)
      {
        return createAttributeOptionAdapter();
      }
      @Override
      public Adapter caseStaticFieldSelection(StaticFieldSelection object)
      {
        return createStaticFieldSelectionAdapter();
      }
      @Override
      public Adapter caseSelectionMember(SelectionMember object)
      {
        return createSelectionMemberAdapter();
      }
      @Override
      public Adapter caseIntConstant(IntConstant object)
      {
        return createIntConstantAdapter();
      }
      @Override
      public Adapter caseLongConstant(LongConstant object)
      {
        return createLongConstantAdapter();
      }
      @Override
      public Adapter caseStringConstant(StringConstant object)
      {
        return createStringConstantAdapter();
      }
      @Override
      public Adapter caseBoolConstant(BoolConstant object)
      {
        return createBoolConstantAdapter();
      }
      @Override
      public Adapter caseDateConstant(DateConstant object)
      {
        return createDateConstantAdapter();
      }
      @Override
      public Adapter caseDecimalConstant(DecimalConstant object)
      {
        return createDecimalConstantAdapter();
      }
      @Override
      public Adapter caseNull(Null object)
      {
        return createNullAdapter();
      }
      @Override
      public Adapter caseEntityDeleteOption(EntityDeleteOption object)
      {
        return createEntityDeleteOptionAdapter();
      }
      @Override
      public Adapter caseInheritanceMappingOption(InheritanceMappingOption object)
      {
        return createInheritanceMappingOptionAdapter();
      }
      @Override
      public Adapter caseStringType(StringType object)
      {
        return createStringTypeAdapter();
      }
      @Override
      public Adapter caseIntType(IntType object)
      {
        return createIntTypeAdapter();
      }
      @Override
      public Adapter caseLongType(LongType object)
      {
        return createLongTypeAdapter();
      }
      @Override
      public Adapter caseBoolType(BoolType object)
      {
        return createBoolTypeAdapter();
      }
      @Override
      public Adapter caseDateType(DateType object)
      {
        return createDateTypeAdapter();
      }
      @Override
      public Adapter caseDecimalType(DecimalType object)
      {
        return createDecimalTypeAdapter();
      }
      @Override
      public Adapter caseRequired(Required object)
      {
        return createRequiredAdapter();
      }
      @Override
      public Adapter casePartOf(PartOf object)
      {
        return createPartOfAdapter();
      }
      @Override
      public Adapter caseRelationshipOwner(RelationshipOwner object)
      {
        return createRelationshipOwnerAdapter();
      }
      @Override
      public Adapter caseCardinality(Cardinality object)
      {
        return createCardinalityAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.Concept <em>Concept</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.Concept
   * @generated
   */
  public Adapter createConceptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.Enum
   * @generated
   */
  public Adapter createEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.EnumLiteral <em>Enum Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.EnumLiteral
   * @generated
   */
  public Adapter createEnumLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.Option
   * @generated
   */
  public Adapter createOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.EntityOption <em>Entity Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.EntityOption
   * @generated
   */
  public Adapter createEntityOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.InheritanceMappingType <em>Inheritance Mapping Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.InheritanceMappingType
   * @generated
   */
  public Adapter createInheritanceMappingTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.AttributeType <em>Attribute Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.AttributeType
   * @generated
   */
  public Adapter createAttributeTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.SingleType <em>Single Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.SingleType
   * @generated
   */
  public Adapter createSingleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.BasicType
   * @generated
   */
  public Adapter createBasicTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.RefType <em>Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.RefType
   * @generated
   */
  public Adapter createRefTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.CollectionType <em>Collection Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.CollectionType
   * @generated
   */
  public Adapter createCollectionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.AttributeOption <em>Attribute Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.AttributeOption
   * @generated
   */
  public Adapter createAttributeOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.StaticFieldSelection <em>Static Field Selection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.StaticFieldSelection
   * @generated
   */
  public Adapter createStaticFieldSelectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.SelectionMember <em>Selection Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.SelectionMember
   * @generated
   */
  public Adapter createSelectionMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.IntConstant <em>Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.IntConstant
   * @generated
   */
  public Adapter createIntConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.LongConstant <em>Long Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.LongConstant
   * @generated
   */
  public Adapter createLongConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.StringConstant <em>String Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.StringConstant
   * @generated
   */
  public Adapter createStringConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.BoolConstant <em>Bool Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.BoolConstant
   * @generated
   */
  public Adapter createBoolConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.DateConstant <em>Date Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.DateConstant
   * @generated
   */
  public Adapter createDateConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.DecimalConstant <em>Decimal Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.DecimalConstant
   * @generated
   */
  public Adapter createDecimalConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.Null <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.Null
   * @generated
   */
  public Adapter createNullAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.EntityDeleteOption <em>Entity Delete Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.EntityDeleteOption
   * @generated
   */
  public Adapter createEntityDeleteOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.InheritanceMappingOption <em>Inheritance Mapping Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.InheritanceMappingOption
   * @generated
   */
  public Adapter createInheritanceMappingOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.StringType
   * @generated
   */
  public Adapter createStringTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.IntType
   * @generated
   */
  public Adapter createIntTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.LongType <em>Long Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.LongType
   * @generated
   */
  public Adapter createLongTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.BoolType <em>Bool Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.BoolType
   * @generated
   */
  public Adapter createBoolTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.DateType <em>Date Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.DateType
   * @generated
   */
  public Adapter createDateTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.DecimalType <em>Decimal Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.DecimalType
   * @generated
   */
  public Adapter createDecimalTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.Required <em>Required</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.Required
   * @generated
   */
  public Adapter createRequiredAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.PartOf <em>Part Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.PartOf
   * @generated
   */
  public Adapter createPartOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.RelationshipOwner <em>Relationship Owner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.RelationshipOwner
   * @generated
   */
  public Adapter createRelationshipOwnerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.stefanvuckovic.domainmodel.domainModel.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.stefanvuckovic.domainmodel.domainModel.Cardinality
   * @generated
   */
  public Adapter createCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DomainModelAdapterFactory
