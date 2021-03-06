/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.uIDSL.impl;

import com.stefanvuckovic.domainmodel.domainModel.AttributeType;

import com.stefanvuckovic.uidsl.uIDSL.DefaultComponentConfig;
import com.stefanvuckovic.uidsl.uIDSL.UIComponent;
import com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Component Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.impl.DefaultComponentConfigImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.impl.DefaultComponentConfigImpl#getInputComp <em>Input Comp</em>}</li>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.impl.DefaultComponentConfigImpl#getOutputComp <em>Output Comp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultComponentConfigImpl extends MinimalEObjectImpl.Container implements DefaultComponentConfig
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected AttributeType type;

  /**
   * The cached value of the '{@link #getInputComp() <em>Input Comp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputComp()
   * @generated
   * @ordered
   */
  protected UIComponent inputComp;

  /**
   * The cached value of the '{@link #getOutputComp() <em>Output Comp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputComp()
   * @generated
   * @ordered
   */
  protected UIComponent outputComp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefaultComponentConfigImpl()
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
    return UIDSLPackage.Literals.DEFAULT_COMPONENT_CONFIG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(AttributeType newType, NotificationChain msgs)
  {
    AttributeType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UIDSLPackage.DEFAULT_COMPONENT_CONFIG__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(AttributeType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UIDSLPackage.DEFAULT_COMPONENT_CONFIG__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UIDSLPackage.DEFAULT_COMPONENT_CONFIG__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIDSLPackage.DEFAULT_COMPONENT_CONFIG__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIComponent getInputComp()
  {
    if (inputComp != null && inputComp.eIsProxy())
    {
      InternalEObject oldInputComp = (InternalEObject)inputComp;
      inputComp = (UIComponent)eResolveProxy(oldInputComp);
      if (inputComp != oldInputComp)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UIDSLPackage.DEFAULT_COMPONENT_CONFIG__INPUT_COMP, oldInputComp, inputComp));
      }
    }
    return inputComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIComponent basicGetInputComp()
  {
    return inputComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputComp(UIComponent newInputComp)
  {
    UIComponent oldInputComp = inputComp;
    inputComp = newInputComp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIDSLPackage.DEFAULT_COMPONENT_CONFIG__INPUT_COMP, oldInputComp, inputComp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIComponent getOutputComp()
  {
    if (outputComp != null && outputComp.eIsProxy())
    {
      InternalEObject oldOutputComp = (InternalEObject)outputComp;
      outputComp = (UIComponent)eResolveProxy(oldOutputComp);
      if (outputComp != oldOutputComp)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UIDSLPackage.DEFAULT_COMPONENT_CONFIG__OUTPUT_COMP, oldOutputComp, outputComp));
      }
    }
    return outputComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIComponent basicGetOutputComp()
  {
    return outputComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputComp(UIComponent newOutputComp)
  {
    UIComponent oldOutputComp = outputComp;
    outputComp = newOutputComp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIDSLPackage.DEFAULT_COMPONENT_CONFIG__OUTPUT_COMP, oldOutputComp, outputComp));
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
      case UIDSLPackage.DEFAULT_COMPONENT_CONFIG__TYPE:
        return basicSetType(null, msgs);
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
      case UIDSLPackage.DEFAULT_COMPONENT_CONFIG__TYPE:
        return getType();
      case UIDSLPackage.DEFAULT_COMPONENT_CONFIG__INPUT_COMP:
        if (resolve) return getInputComp();
        return basicGetInputComp();
      case UIDSLPackage.DEFAULT_COMPONENT_CONFIG__OUTPUT_COMP:
        if (resolve) return getOutputComp();
        return basicGetOutputComp();
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
      case UIDSLPackage.DEFAULT_COMPONENT_CONFIG__TYPE:
        setType((AttributeType)newValue);
        return;
      case UIDSLPackage.DEFAULT_COMPONENT_CONFIG__INPUT_COMP:
        setInputComp((UIComponent)newValue);
        return;
      case UIDSLPackage.DEFAULT_COMPONENT_CONFIG__OUTPUT_COMP:
        setOutputComp((UIComponent)newValue);
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
      case UIDSLPackage.DEFAULT_COMPONENT_CONFIG__TYPE:
        setType((AttributeType)null);
        return;
      case UIDSLPackage.DEFAULT_COMPONENT_CONFIG__INPUT_COMP:
        setInputComp((UIComponent)null);
        return;
      case UIDSLPackage.DEFAULT_COMPONENT_CONFIG__OUTPUT_COMP:
        setOutputComp((UIComponent)null);
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
      case UIDSLPackage.DEFAULT_COMPONENT_CONFIG__TYPE:
        return type != null;
      case UIDSLPackage.DEFAULT_COMPONENT_CONFIG__INPUT_COMP:
        return inputComp != null;
      case UIDSLPackage.DEFAULT_COMPONENT_CONFIG__OUTPUT_COMP:
        return outputComp != null;
    }
    return super.eIsSet(featureID);
  }

} //DefaultComponentConfigImpl
