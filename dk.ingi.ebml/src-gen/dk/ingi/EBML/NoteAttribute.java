/**
 */
package dk.ingi.EBML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Note Attribute</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dk.ingi.EBML.EBMLPackage#getNoteAttribute()
 * @model
 * @generated
 */
public enum NoteAttribute implements Enumerator {
	/**
	 * The '<em><b>MIN OCCURS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_OCCURS_VALUE
	 * @generated
	 * @ordered
	 */
	MIN_OCCURS(1, "MIN_OCCURS", "minOccurs"),

	/**
	 * The '<em><b>MAX OCCURS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_OCCURS_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_OCCURS(2, "MAX_OCCURS", "maxOccurs"),

	/**
	 * The '<em><b>RANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	RANGE(3, "RANGE", "range"),

	/**
	 * The '<em><b>LENGTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	LENGTH(4, "LENGTH", "length"),

	/**
	 * The '<em><b>DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(5, "DEFAULT", "default"),

	/**
	 * The '<em><b>MINVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINVER_VALUE
	 * @generated
	 * @ordered
	 */
	MINVER(6, "MINVER", "minver"),

	/**
	 * The '<em><b>MAXVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXVER_VALUE
	 * @generated
	 * @ordered
	 */
	MAXVER(7, "MAXVER", "maxver");

	/**
	 * The '<em><b>MIN OCCURS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_OCCURS
	 * @model literal="minOccurs"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_OCCURS_VALUE = 1;

	/**
	 * The '<em><b>MAX OCCURS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_OCCURS
	 * @model literal="maxOccurs"
	 * @generated
	 * @ordered
	 */
	public static final int MAX_OCCURS_VALUE = 2;

	/**
	 * The '<em><b>RANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANGE
	 * @model literal="range"
	 * @generated
	 * @ordered
	 */
	public static final int RANGE_VALUE = 3;

	/**
	 * The '<em><b>LENGTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LENGTH
	 * @model literal="length"
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_VALUE = 4;

	/**
	 * The '<em><b>DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model literal="default"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 5;

	/**
	 * The '<em><b>MINVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINVER
	 * @model literal="minver"
	 * @generated
	 * @ordered
	 */
	public static final int MINVER_VALUE = 6;

	/**
	 * The '<em><b>MAXVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXVER
	 * @model literal="maxver"
	 * @generated
	 * @ordered
	 */
	public static final int MAXVER_VALUE = 7;

	/**
	 * An array of all the '<em><b>Note Attribute</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NoteAttribute[] VALUES_ARRAY = new NoteAttribute[] { MIN_OCCURS, MAX_OCCURS, RANGE, LENGTH,
			DEFAULT, MINVER, MAXVER, };

	/**
	 * A public read-only list of all the '<em><b>Note Attribute</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NoteAttribute> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Note Attribute</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NoteAttribute get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoteAttribute result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Note Attribute</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NoteAttribute getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoteAttribute result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Note Attribute</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NoteAttribute get(int value) {
		switch (value) {
		case MIN_OCCURS_VALUE:
			return MIN_OCCURS;
		case MAX_OCCURS_VALUE:
			return MAX_OCCURS;
		case RANGE_VALUE:
			return RANGE;
		case LENGTH_VALUE:
			return LENGTH;
		case DEFAULT_VALUE:
			return DEFAULT;
		case MINVER_VALUE:
			return MINVER;
		case MAXVER_VALUE:
			return MAXVER;
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
	private NoteAttribute(int value, String name, String literal) {
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

} //NoteAttribute
