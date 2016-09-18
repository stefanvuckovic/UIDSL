/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainmodel.domainModel.impl;

import com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage;
import com.stefanvuckovic.domainmodel.domainModel.EntityDeleteOption;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Delete Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.stefanvuckovic.domainmodel.domainModel.impl.EntityDeleteOptionImpl#isDeleteByFlag <em>Delete By Flag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityDeleteOptionImpl extends EntityOptionImpl implements EntityDeleteOption
{
  /**
   * The default value of the '{@link #isDeleteByFlag() <em>Delete By Flag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeleteByFlag()
   * @generated
   * @ordered
   */
  protected static final boolean DELETE_BY_FLAG_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDeleteByFlag() <em>Delete By Flag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeleteByFlag()
   * @generated
   * @ordered
   */
  protected boolean deleteByFlag = DELETE_BY_FLAG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityDeleteOptionImpl()
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
    return DomainModelPackage.Literals.ENTITY_DELETE_OPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDeleteByFlag()
  {
    return deleteByFlag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeleteByFlag(boolean newDeleteByFlag)
  {
    boolean oldDeleteByFlag = deleteByFlag;
    deleteByFlag = newDeleteByFlag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainModelPackage.ENTITY_DELETE_OPTION__DELETE_BY_FLAG, oldDeleteByFlag, deleteByFlag));
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
      case DomainModelPackage.ENTITY_DELETE_OPTION__DELETE_BY_FLAG:
        return isDeleteByFlag();
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
      case DomainModelPackage.ENTITY_DELETE_OPTION__DELETE_BY_FLAG:
        setDeleteByFlag((Boolean)newValue);
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
      case DomainModelPackage.ENTITY_DELETE_OPTION__DELETE_BY_FLAG:
        setDeleteByFlag(DELETE_BY_FLAG_EDEFAULT);
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
      case DomainModelPackage.ENTITY_DELETE_OPTION__DELETE_BY_FLAG:
        return deleteByFlag != DELETE_BY_FLAG_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (deleteByFlag: ");
    result.append(deleteByFlag);
    result.append(')');
    return result.toString();
  }

} //EntityDeleteOptionImpl