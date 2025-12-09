/**
 */
package dk.ingi.EBML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>RFC5646 Language Tag</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dk.ingi.EBML.EBMLPackage#getRFC5646LanguageTag()
 * @model
 * @generated
 */
public enum RFC5646LanguageTag implements Enumerator {
	/**
	 * The '<em><b>EN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EN_VALUE
	 * @generated
	 * @ordered
	 */
	EN(0, "EN", "en"),

	/**
	 * The '<em><b>DK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DK_VALUE
	 * @generated
	 * @ordered
	 */
	DK(1, "DK", "dk");

	/**
	 * The '<em><b>EN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EN
	 * @model literal="en"
	 * @generated
	 * @ordered
	 */
	public static final int EN_VALUE = 0;

	/**
	 * The '<em><b>DK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DK
	 * @model literal="dk"
	 * @generated
	 * @ordered
	 */
	public static final int DK_VALUE = 1;

	/**
	 * An array of all the '<em><b>RFC5646 Language Tag</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RFC5646LanguageTag[] VALUES_ARRAY = new RFC5646LanguageTag[] { EN, DK, };

	/**
	 * A public read-only list of all the '<em><b>RFC5646 Language Tag</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RFC5646LanguageTag> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>RFC5646 Language Tag</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RFC5646LanguageTag get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RFC5646LanguageTag result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>RFC5646 Language Tag</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RFC5646LanguageTag getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RFC5646LanguageTag result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>RFC5646 Language Tag</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RFC5646LanguageTag get(int value) {
		switch (value) {
		case EN_VALUE:
			return EN;
		case DK_VALUE:
			return DK;
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
	private RFC5646LanguageTag(int value, String name, String literal) {
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

} //RFC5646LanguageTag
