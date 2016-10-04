/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.uIDSL.impl;

import com.stefanvuckovic.uidsl.uIDSL.PropertyValue;
import com.stefanvuckovic.uidsl.uIDSL.TypeExpression;
import com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.impl.PropertyValueImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.impl.PropertyValueImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.impl.PropertyValueImpl#isValueProperty <em>Value Property</em>}</li>
 *   <li>{@link com.stefanvuckovic.uidsl.uIDSL.impl.PropertyValueImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyValueImpl extends MinimalEObjectImpl.Container implements PropertyValue
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected static final boolean REQUIRED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected boolean required = REQUIRED_EDEFAULT;

  /**
   * The default value of the '{@link #isValueProperty() <em>Value Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isValueProperty()
   * @generated
   * @ordered
   */
  protected static final boolean VALUE_PROPERTY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isValueProperty() <em>Value Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isValueProperty()
   * @generated
   * @ordered
   */
  protected boolean valueProperty = VALUE_PROPERTY_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeExpression type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyValueImpl()
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
    return UIDSLPackage.Literals.PROPERTY_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIDSLPackage.PROPERTY_VALUE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRequired()
  {
    return required;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequired(boolean newRequired)
  {
    boolean oldRequired = required;
    required = newRequired;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIDSLPackage.PROPERTY_VALUE__REQUIRED, oldRequired, required));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isValueProperty()
  {
    return valueProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueProperty(boolean newValueProperty)
  {
    boolean oldValueProperty = valueProperty;
    valueProperty = newValueProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIDSLPackage.PROPERTY_VALUE__VALUE_PROPERTY, oldValueProperty, valueProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeExpression getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(TypeExpression newType, NotificationChain msgs)
  {
    TypeExpression oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UIDSLPackage.PROPERTY_VALUE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeExpression newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UIDSLPackage.PROPERTY_VALUE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UIDSLPackage.PROPERTY_VALUE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIDSLPackage.PROPERTY_VALUE__TYPE, newType, newType));
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
      case UIDSLPackage.PROPERTY_VALUE__TYPE:
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
      case UIDSLPackage.PROPERTY_VALUE__NAME:
        return getName();
      case UIDSLPackage.PROPERTY_VALUE__REQUIRED:
        return isRequired();
      case UIDSLPackage.PROPERTY_VALUE__VALUE_PROPERTY:
        return isValueProperty();
      case UIDSLPackage.PROPERTY_VALUE__TYPE:
        return getType();
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
      case UIDSLPackage.PROPERTY_VALUE__NAME:
        setName((String)newValue);
        return;
      case UIDSLPackage.PROPERTY_VALUE__REQUIRED:
        setRequired((Boolean)newValue);
        return;
      case UIDSLPackage.PROPERTY_VALUE__VALUE_PROPERTY:
        setValueProperty((Boolean)newValue);
        return;
      case UIDSLPackage.PROPERTY_VALUE__TYPE:
        setType((TypeExpression)newValue);
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
      case UIDSLPackage.PROPERTY_VALUE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UIDSLPackage.PROPERTY_VALUE__REQUIRED:
        setRequired(REQUIRED_EDEFAULT);
        return;
      case UIDSLPackage.PROPERTY_VALUE__VALUE_PROPERTY:
        setValueProperty(VALUE_PROPERTY_EDEFAULT);
        return;
      case UIDSLPackage.PROPERTY_VALUE__TYPE:
        setType((TypeExpression)null);
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
      case UIDSLPackage.PROPERTY_VALUE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UIDSLPackage.PROPERTY_VALUE__REQUIRED:
        return required != REQUIRED_EDEFAULT;
      case UIDSLPackage.PROPERTY_VALUE__VALUE_PROPERTY:
        return valueProperty != VALUE_PROPERTY_EDEFAULT;
      case UIDSLPackage.PROPERTY_VALUE__TYPE:
        return type != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", required: ");
    result.append(required);
    result.append(", valueProperty: ");
    result.append(valueProperty);
    result.append(')');
    return result.toString();
  }

} //PropertyValueImpl