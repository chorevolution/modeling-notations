/**
 * Copyright Text    
 *  Copyright 2015 The CHOReVOLUTION project
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  
 * http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package eu.chorevolution.modelingnotations.adapter;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choreography Complex Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.ChoreographyComplexItem#getHasChoreographyDataItems <em>Has Choreography Data Items</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.ChoreographyComplexItem#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getChoreographyComplexItem()
 * @model
 * @generated
 */
public interface ChoreographyComplexItem extends ChoreographyDataItem {
	/**
	 * Returns the value of the '<em><b>Has Choreography Data Items</b></em>' containment reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Choreography Data Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Choreography Data Items</em>' containment reference list.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getChoreographyComplexItem_HasChoreographyDataItems()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ChoreographyDataItem> getHasChoreographyDataItems();

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getChoreographyComplexItem_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyComplexItem#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

} // ChoreographyComplexItem