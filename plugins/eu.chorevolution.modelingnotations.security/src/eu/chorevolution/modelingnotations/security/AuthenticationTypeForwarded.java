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
package eu.chorevolution.modelingnotations.security;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Authentication Type Forwarded</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getAuthenticationTypeForwarded()
 * @model
 * @generated
 */
public enum AuthenticationTypeForwarded implements Enumerator {
	/**
	 * The '<em><b>User Account</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_ACCOUNT_VALUE
	 * @generated
	 * @ordered
	 */
	USER_ACCOUNT(0, "UserAccount", "UserAccount"),

	/**
	 * The '<em><b>Generic Account</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_ACCOUNT_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC_ACCOUNT(1, "GenericAccount", "GenericAccount"),

	/**
	 * The '<em><b>Custom Account</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_ACCOUNT_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM_ACCOUNT(2, "CustomAccount", "CustomAccount");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The '<em><b>User Account</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_ACCOUNT
	 * @model name="UserAccount"
	 * @generated
	 * @ordered
	 */
	public static final int USER_ACCOUNT_VALUE = 0;

	/**
	 * The '<em><b>Generic Account</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_ACCOUNT
	 * @model name="GenericAccount"
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ACCOUNT_VALUE = 1;

	/**
	 * The '<em><b>Custom Account</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_ACCOUNT
	 * @model name="CustomAccount"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_ACCOUNT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Authentication Type Forwarded</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AuthenticationTypeForwarded[] VALUES_ARRAY =
		new AuthenticationTypeForwarded[] {
			USER_ACCOUNT,
			GENERIC_ACCOUNT,
			CUSTOM_ACCOUNT,
		};

	/**
	 * A public read-only list of all the '<em><b>Authentication Type Forwarded</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AuthenticationTypeForwarded> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Authentication Type Forwarded</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuthenticationTypeForwarded get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AuthenticationTypeForwarded result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Authentication Type Forwarded</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuthenticationTypeForwarded getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AuthenticationTypeForwarded result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Authentication Type Forwarded</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuthenticationTypeForwarded get(int value) {
		switch (value) {
			case USER_ACCOUNT_VALUE: return USER_ACCOUNT;
			case GENERIC_ACCOUNT_VALUE: return GENERIC_ACCOUNT;
			case CUSTOM_ACCOUNT_VALUE: return CUSTOM_ACCOUNT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AuthenticationTypeForwarded(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AuthenticationTypeForwarded
