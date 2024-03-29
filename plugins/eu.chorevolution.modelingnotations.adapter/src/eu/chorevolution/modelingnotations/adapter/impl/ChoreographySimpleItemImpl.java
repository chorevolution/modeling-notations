/**
 * Copyright 2015 The CHOReVOLUTION project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.chorevolution.modelingnotations.adapter.impl;

import eu.chorevolution.modelingnotations.adapter.AdapterPackage;
import eu.chorevolution.modelingnotations.adapter.ChoreographyEnumerationItem;
import eu.chorevolution.modelingnotations.adapter.ChoreographySimpleItem;
import eu.chorevolution.modelingnotations.adapter.SimpleTypes;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choreography Simple Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographySimpleItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographySimpleItemImpl#getHasChoreographyEnumerationItems <em>Has Choreography Enumeration Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoreographySimpleItemImpl extends ChoreographyDataItemImpl implements ChoreographySimpleItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SimpleTypes TYPE_EDEFAULT = SimpleTypes.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SimpleTypes type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasChoreographyEnumerationItems() <em>Has Choreography Enumeration Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasChoreographyEnumerationItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ChoreographyEnumerationItem> hasChoreographyEnumerationItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoreographySimpleItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterPackage.Literals.CHOREOGRAPHY_SIMPLE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleTypes getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(SimpleTypes newType) {
		SimpleTypes oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.CHOREOGRAPHY_SIMPLE_ITEM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChoreographyEnumerationItem> getHasChoreographyEnumerationItems() {
		if (hasChoreographyEnumerationItems == null) {
			hasChoreographyEnumerationItems = new EObjectContainmentEList<ChoreographyEnumerationItem>(ChoreographyEnumerationItem.class, this, AdapterPackage.CHOREOGRAPHY_SIMPLE_ITEM__HAS_CHOREOGRAPHY_ENUMERATION_ITEMS);
		}
		return hasChoreographyEnumerationItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterPackage.CHOREOGRAPHY_SIMPLE_ITEM__HAS_CHOREOGRAPHY_ENUMERATION_ITEMS:
				return ((InternalEList<?>)getHasChoreographyEnumerationItems()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdapterPackage.CHOREOGRAPHY_SIMPLE_ITEM__TYPE:
				return getType();
			case AdapterPackage.CHOREOGRAPHY_SIMPLE_ITEM__HAS_CHOREOGRAPHY_ENUMERATION_ITEMS:
				return getHasChoreographyEnumerationItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdapterPackage.CHOREOGRAPHY_SIMPLE_ITEM__TYPE:
				setType((SimpleTypes)newValue);
				return;
			case AdapterPackage.CHOREOGRAPHY_SIMPLE_ITEM__HAS_CHOREOGRAPHY_ENUMERATION_ITEMS:
				getHasChoreographyEnumerationItems().clear();
				getHasChoreographyEnumerationItems().addAll((Collection<? extends ChoreographyEnumerationItem>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdapterPackage.CHOREOGRAPHY_SIMPLE_ITEM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AdapterPackage.CHOREOGRAPHY_SIMPLE_ITEM__HAS_CHOREOGRAPHY_ENUMERATION_ITEMS:
				getHasChoreographyEnumerationItems().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdapterPackage.CHOREOGRAPHY_SIMPLE_ITEM__TYPE:
				return type != TYPE_EDEFAULT;
			case AdapterPackage.CHOREOGRAPHY_SIMPLE_ITEM__HAS_CHOREOGRAPHY_ENUMERATION_ITEMS:
				return hasChoreographyEnumerationItems != null && !hasChoreographyEnumerationItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ChoreographySimpleItemImpl
