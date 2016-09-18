/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainmodel.domainModel.impl;

import com.stefanvuckovic.domainmodel.domainModel.CollectionType;
import com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage;
import com.stefanvuckovic.domainmodel.domainModel.SingleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.stefanvuckovic.domainmodel.domainModel.impl.CollectionTypeImpl#getOfType <em>Of Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionTypeImpl extends AttributeTypeImpl implements CollectionType
{
  /**
   * The cached value of the '{@link #getOfType() <em>Of Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOfType()
   * @generated
   * @ordered
   */
  protected SingleType ofType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CollectionTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DomainModelPackage.Literals.COLLECTION_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleType getOfType()
  {
    return ofType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOfType(SingleType newOfType, NotificationChain msgs)
  {
    SingleType oldOfType = ofType;
    ofType = newOfType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainModelPackage.COLLECTION_TYPE__OF_TYPE, oldOfType, newOfType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOfType(SingleType newOfType)
  {
    if (newOfType != ofType)
    {
      NotificationChain msgs = null;
      if (ofType != null)
        msgs = ((InternalEObject)ofType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainModelPackage.COLLECTION_TYPE__OF_TYPE, null, msgs);
      if (newOfType != null)
        msgs = ((InternalEObject)newOfType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainModelPackage.COLLECTION_TYPE__OF_TYPE, null, msgs);
      msgs = basicSetOfType(newOfType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainModelPackage.COLLECTION_TYPE__OF_TYPE, newOfType, newOfType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainModelPackage.COLLECTION_TYPE__OF_TYPE:
        return basicSetOfType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DomainModelPackage.COLLECTION_TYPE__OF_TYPE:
        return getOfType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainModelPackage.COLLECTION_TYPE__OF_TYPE:
        setOfType((SingleType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DomainModelPackage.COLLECTION_TYPE__OF_TYPE:
        setOfType((SingleType)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DomainModelPackage.COLLECTION_TYPE__OF_TYPE:
        return ofType != null;
    }
    return super.eIsSet(featureID);
  }

} //CollectionTypeImpl