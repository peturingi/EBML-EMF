/**
 */
package dk.ingi.EBML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Documentation Purpose</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Distinguishes the meaning of the documentation.
 * <!-- end-model-doc -->
 * @see dk.ingi.EBML.EBMLPackage#getDocumentationPurpose()
 * @model
 * @generated
 */
public enum DocumentationPurpose implements Enumerator {
	/**
	 * The '<em><b>DEFINITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A "definition" is recommended for every defined EBML Element. This documentation explains the semantic meaning of the documented EBML Element.
	 * <!-- end-model-doc -->
	 * @see #DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	DEFINITION(1, "DEFINITION", "definition"),

	/**
	 * The '<em><b>RATIONALE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An explanation about the reason or catalyst for the definition of the documented Element.
	 * <!-- end-model-doc -->
	 * @see #RATIONALE_VALUE
	 * @generated
	 * @ordered
	 */
	RATIONALE(2, "RATIONALE", "rationale"),

	/**
	 * The '<em><b>USAGE NOTES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Recommented practises or guidelines for both reading, writing, or interpreting the documented Element.
	 * <!-- end-model-doc -->
	 * @see #USAGE_NOTES_VALUE
	 * @generated
	 * @ordered
	 */
	USAGE_NOTES(3, "USAGE_NOTES", "usage notes"),

	/**
	 * The '<em><b>REFERENCES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Informational references to support the contextualization and understanding of the value of the documented Element.
	 * <!-- end-model-doc -->
	 * @see #REFERENCES_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCES(4, "REFERENCES", "references");

	/**
	 * The '<em><b>DEFINITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A "definition" is recommended for every defined EBML Element. This documentation explains the semantic meaning of the documented EBML Element.
	 * <!-- end-model-doc -->
	 * @see #DEFINITION
	 * @model literal="definition"
	 * @generated
	 * @ordered
	 */
	public static final int DEFINITION_VALUE = 1;

	/**
	 * The '<em><b>RATIONALE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An explanation about the reason or catalyst for the definition of the documented Element.
	 * <!-- end-model-doc -->
	 * @see #RATIONALE
	 * @model literal="rationale"
	 * @generated
	 * @ordered
	 */
	public static final int RATIONALE_VALUE = 2;

	/**
	 * The '<em><b>USAGE NOTES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Recommented practises or guidelines for both reading, writing, or interpreting the documented Element.
	 * <!-- end-model-doc -->
	 * @see #USAGE_NOTES
	 * @model literal="usage notes"
	 * @generated
	 * @ordered
	 */
	public static final int USAGE_NOTES_VALUE = 3;

	/**
	 * The '<em><b>REFERENCES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Informational references to support the contextualization and understanding of the value of the documented Element.
	 * <!-- end-model-doc -->
	 * @see #REFERENCES
	 * @model literal="references"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCES_VALUE = 4;

	/**
	 * An array of all the '<em><b>Documentation Purpose</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DocumentationPurpose[] VALUES_ARRAY = new DocumentationPurpose[] { DEFINITION, RATIONALE,
			USAGE_NOTES, REFERENCES, };

	/**
	 * A public read-only list of all the '<em><b>Documentation Purpose</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DocumentationPurpose> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Documentation Purpose</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DocumentationPurpose get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocumentationPurpose result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Documentation Purpose</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DocumentationPurpose getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocumentationPurpose result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Documentation Purpose</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DocumentationPurpose get(int value) {
		switch (value) {
		case DEFINITION_VALUE:
			return DEFINITION;
		case RATIONALE_VALUE:
			return RATIONALE;
		case USAGE_NOTES_VALUE:
			return USAGE_NOTES;
		case REFERENCES_VALUE:
			return REFERENCES;
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
	private DocumentationPurpose(int value, String name, String literal) {
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

} //DocumentationPurpose
