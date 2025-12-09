/**
 */
package dk.ingi.EBML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Element Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dk.ingi.EBML.EBMLPackage#getElementType()
 * @model
 * @generated
 */
public enum ElementType implements Enumerator {
	/**
	 * The '<em><b>INTEGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(1, "INTEGER", "integer"),

	/**
	 * The '<em><b>UINTEGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	UINTEGER(2, "UINTEGER", "uinteger"),

	/**
	 * The '<em><b>FLOAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(3, "FLOAT", "float"),

	/**
	 * The '<em><b>STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(4, "STRING", "string"),

	/**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(5, "DATE", "date"),

	/**
	 * The '<em><b>UTF8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTF8_VALUE
	 * @generated
	 * @ordered
	 */
	UTF8(6, "UTF8", "utf-8"),

	/**
	 * The '<em><b>MASTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER(7, "MASTER", "master"),

	/**
	 * The '<em><b>BINARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY(8, "BINARY", "binary");

	/**
	 * The '<em><b>INTEGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @model literal="integer"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 1;

	/**
	 * The '<em><b>UINTEGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINTEGER
	 * @model literal="uinteger"
	 * @generated
	 * @ordered
	 */
	public static final int UINTEGER_VALUE = 2;

	/**
	 * The '<em><b>FLOAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model literal="float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 3;

	/**
	 * The '<em><b>STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model literal="string"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 4;

	/**
	 * The '<em><b>DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model literal="date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 5;

	/**
	 * The '<em><b>UTF8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTF8
	 * @model literal="utf-8"
	 * @generated
	 * @ordered
	 */
	public static final int UTF8_VALUE = 6;

	/**
	 * The '<em><b>MASTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER
	 * @model literal="master"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_VALUE = 7;

	/**
	 * The '<em><b>BINARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY
	 * @model literal="binary"
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_VALUE = 8;

	/**
	 * An array of all the '<em><b>Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ElementType[] VALUES_ARRAY = new ElementType[] { INTEGER, UINTEGER, FLOAT, STRING, DATE, UTF8,
			MASTER, BINARY, };

	/**
	 * A public read-only list of all the '<em><b>Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ElementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Element Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ElementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ElementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ElementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ElementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ElementType get(int value) {
		switch (value) {
		case INTEGER_VALUE:
			return INTEGER;
		case UINTEGER_VALUE:
			return UINTEGER;
		case FLOAT_VALUE:
			return FLOAT;
		case STRING_VALUE:
			return STRING;
		case DATE_VALUE:
			return DATE;
		case UTF8_VALUE:
			return UTF8;
		case MASTER_VALUE:
			return MASTER;
		case BINARY_VALUE:
			return BINARY;
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
	private ElementType(int value, String name, String literal) {
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

} //ElementType
