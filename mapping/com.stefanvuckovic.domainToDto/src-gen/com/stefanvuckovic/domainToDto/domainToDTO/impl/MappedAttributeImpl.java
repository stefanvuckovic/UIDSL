/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainToDto.domainToDTO.impl;

import com.stefanvuckovic.domainToDto.domainToDTO.DomainToDTOPackage;
import com.stefanvuckovic.domainToDto.domainToDTO.MappedAttribute;

import com.stefanvuckovic.domainmodel.domainModel.Attribute;
import com.stefanvuckovic.domainmodel.domainModel.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapped Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.stefanvuckovic.domainToDto.domainToDTO.impl.MappedAttributeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link com.stefanvuckovic.domainToDto.domainToDTO.impl.MappedAttributeImpl#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappedAttributeImpl extends MinimalEObjectImpl.Container implements MappedAttribute
{
  /**
   * The cached value of the '{@link #getAttr() <em>Attr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr()
   * @generated
   * @ordered
   */
  protected Attribute attr;

  /**
   * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapping()
   * @generated
   * @ordered
   */
  protected Expression mapping;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappedAttributeImpl()
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
    return DomainToDTOPackage.Literals.MAPPED_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getAttr()
  {
    if (attr != null && attr.eIsProxy())
    {
      InternalEObject oldAttr = (InternalEObject)attr;
      attr = (Attribute)eResolveProxy(oldAttr);
      if (attr != oldAttr)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainToDTOPackage.MAPPED_ATTRIBUTE__ATTR, oldAttr, attr));
      }
    }
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetAttr()
  {
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttr(Attribute newAttr)
  {
    Attribute oldAttr = attr;
    attr = newAttr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainToDTOPackage.MAPPED_ATTRIBUTE__ATTR, oldAttr, attr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getMapping()
  {
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapping(Expression newMapping, NotificationChain msgs)
  {
    Expression oldMapping = mapping;
    mapping = newMapping;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainToDTOPackage.MAPPED_ATTRIBUTE__MAPPING, oldMapping, newMapping);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapping(Expression newMapping)
  {
    if (newMapping != mapping)
    {
      NotificationChain msgs = null;
      if (mapping != null)
        msgs = ((InternalEObject)mapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainToDTOPackage.MAPPED_ATTRIBUTE__MAPPING, null, msgs);
      if (newMapping != null)
        msgs = ((InternalEObject)newMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainToDTOPackage.MAPPED_ATTRIBUTE__MAPPING, null, msgs);
      msgs = basicSetMapping(newMapping, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainToDTOPackage.MAPPED_ATTRIBUTE__MAPPING, newMapping, newMapping));
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
      case DomainToDTOPackage.MAPPED_ATTRIBUTE__MAPPING:
        return basicSetMapping(null, msgs);
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
      case DomainToDTOPackage.MAPPED_ATTRIBUTE__ATTR:
        if (resolve) return getAttr();
        return basicGetAttr();
      case DomainToDTOPackage.MAPPED_ATTRIBUTE__MAPPING:
        return getMapping();
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
      case DomainToDTOPackage.MAPPED_ATTRIBUTE__ATTR:
        setAttr((Attribute)newValue);
        return;
      case DomainToDTOPackage.MAPPED_ATTRIBUTE__MAPPING:
        setMapping((Expression)newValue);
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
      case DomainToDTOPackage.MAPPED_ATTRIBUTE__ATTR:
        setAttr((Attribute)null);
        return;
      case DomainToDTOPackage.MAPPED_ATTRIBUTE__MAPPING:
        setMapping((Expression)null);
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
      case DomainToDTOPackage.MAPPED_ATTRIBUTE__ATTR:
        return attr != null;
      case DomainToDTOPackage.MAPPED_ATTRIBUTE__MAPPING:
        return mapping != null;
    }
    return super.eIsSet(featureID);
  }

} //MappedAttributeImpl
