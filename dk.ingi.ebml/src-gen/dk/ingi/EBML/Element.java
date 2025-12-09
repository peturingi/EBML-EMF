/**
 */
package dk.ingi.EBML;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.ingi.EBML.Element#getName <em>Name</em>}</li>
 *   <li>{@link dk.ingi.EBML.Element#getPath <em>Path</em>}</li>
 *   <li>{@link dk.ingi.EBML.Element#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link dk.ingi.EBML.Element#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link dk.ingi.EBML.Element#getMinver <em>Minver</em>}</li>
 *   <li>{@link dk.ingi.EBML.Element#getMaxver <em>Maxver</em>}</li>
 *   <li>{@link dk.ingi.EBML.Element#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link dk.ingi.EBML.Element#getImplementationNote <em>Implementation Note</em>}</li>
 *   <li>{@link dk.ingi.EBML.Element#getExtension <em>Extension</em>}</li>
 *   <li>{@link dk.ingi.EBML.Element#getId <em>Id</em>}</li>
 *   <li>{@link dk.ingi.EBML.Element#getLength <em>Length</em>}</li>
 *   <li>{@link dk.ingi.EBML.Element#getRecurring <em>Recurring</em>}</li>
 *   <li>{@link dk.ingi.EBML.Element#getDefault <em>Default</em>}</li>
 *   <li>{@link dk.ingi.EBML.Element#getRange <em>Range</em>}</li>
 *   <li>{@link dk.ingi.EBML.Element#getUnknownSizeAllowed <em>Unknown Size Allowed</em>}</li>
 *   <li>{@link dk.ingi.EBML.Element#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link dk.ingi.EBML.Element#getType <em>Type</em>}</li>
 *   <li>{@link dk.ingi.EBML.Element#getRecursive <em>Recursive</em>}</li>
 *   <li>{@link dk.ingi.EBML.Element#getEffectiveMaxOccurs <em>Effective Max Occurs</em>}</li>
 * </ul>
 *
 * @see dk.ingi.EBML.EBMLPackage#getElement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='unknownSizeAllowed_isValid'"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dk.ingi.EBML.EBMLPackage#getElement_Name()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see dk.ingi.EBML.EBMLPackage#getElement_Path()
	 * @model id="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Element#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Min Occurs</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Occurs</em>' attribute.
	 * @see #setMinOccurs(int)
	 * @see dk.ingi.EBML.EBMLPackage#getElement_MinOccurs()
	 * @model default="0" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!minOccurs'"
	 * @generated
	 */
	int getMinOccurs();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Element#getMinOccurs <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Occurs</em>' attribute.
	 * @see #getMinOccurs()
	 * @generated
	 */
	void setMinOccurs(int value);

	/**
	 * Returns the value of the '<em><b>Max Occurs</b></em>' attribute.
	 * The default value is <code>"unbounded"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Occurs</em>' attribute.
	 * @see #setMaxOccurs(String)
	 * @see dk.ingi.EBML.EBMLPackage#getElement_MaxOccurs()
	 * @model default="unbounded"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!maxOccurs'"
	 * @generated
	 */
	String getMaxOccurs();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Element#getMaxOccurs <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Occurs</em>' attribute.
	 * @see #getMaxOccurs()
	 * @generated
	 */
	void setMaxOccurs(String value);

	/**
	 * Returns the value of the '<em><b>Minver</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minver</em>' attribute.
	 * @see #setMinver(Integer)
	 * @see dk.ingi.EBML.EBMLPackage#getElement_Minver()
	 * @model default="1"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!minver'"
	 * @generated
	 */
	Integer getMinver();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Element#getMinver <em>Minver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minver</em>' attribute.
	 * @see #getMinver()
	 * @generated
	 */
	void setMinver(Integer value);

	/**
	 * Returns the value of the '<em><b>Maxver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxver</em>' attribute.
	 * @see #isSetMaxver()
	 * @see #unsetMaxver()
	 * @see #setMaxver(Integer)
	 * @see dk.ingi.EBML.EBMLPackage#getElement_Maxver()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!maxver'"
	 * @generated
	 */
	Integer getMaxver();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Element#getMaxver <em>Maxver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxver</em>' attribute.
	 * @see #isSetMaxver()
	 * @see #unsetMaxver()
	 * @see #getMaxver()
	 * @generated
	 */
	void setMaxver(Integer value);

	/**
	 * Unsets the value of the '{@link dk.ingi.EBML.Element#getMaxver <em>Maxver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxver()
	 * @see #getMaxver()
	 * @see #setMaxver(Integer)
	 * @generated
	 */
	void unsetMaxver();

	/**
	 * Returns whether the value of the '{@link dk.ingi.EBML.Element#getMaxver <em>Maxver</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maxver</em>' attribute is set.
	 * @see #unsetMaxver()
	 * @see #getMaxver()
	 * @see #setMaxver(Integer)
	 * @generated
	 */
	boolean isSetMaxver();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link dk.ingi.EBML.Documentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see dk.ingi.EBML.EBMLPackage#getElement_Documentation()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!documentation'"
	 * @generated
	 */
	EList<Documentation> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Implementation Note</b></em>' containment reference list.
	 * The list contents are of type {@link dk.ingi.EBML.ImplementationNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Note</em>' containment reference list.
	 * @see dk.ingi.EBML.EBMLPackage#getElement_ImplementationNote()
	 * @model containment="true" upper="7"
	 *        extendedMetaData="name='implementation_note'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!implementationNote'"
	 * @generated
	 */
	EList<ImplementationNote> getImplementationNote();

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference list.
	 * The list contents are of type {@link dk.ingi.EBML.Extension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference list.
	 * @see dk.ingi.EBML.EBMLPackage#getElement_Extension()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!extension'"
	 * @generated
	 */
	EList<Extension> getExtension();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see dk.ingi.EBML.EBMLPackage#getElement_Id()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Element#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(String)
	 * @see dk.ingi.EBML.EBMLPackage#getElement_Length()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!length'"
	 * @generated
	 */
	String getLength();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Element#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(String value);

	/**
	 * Returns the value of the '<em><b>Recurring</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurring</em>' attribute.
	 * @see #setRecurring(Boolean)
	 * @see dk.ingi.EBML.EBMLPackage#getElement_Recurring()
	 * @model default="false" dataType="dk.ingi.EBML.ZeroOneBooleanObject" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!recurring'"
	 * @generated
	 */
	Boolean getRecurring();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Element#getRecurring <em>Recurring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurring</em>' attribute.
	 * @see #getRecurring()
	 * @generated
	 */
	void setRecurring(Boolean value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see dk.ingi.EBML.EBMLPackage#getElement_Default()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!default'"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Element#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(String)
	 * @see dk.ingi.EBML.EBMLPackage#getElement_Range()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!range'"
	 * @generated
	 */
	String getRange();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Element#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(String value);

	/**
	 * Returns the value of the '<em><b>Unknown Size Allowed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Size Allowed</em>' attribute.
	 * @see #setUnknownSizeAllowed(Boolean)
	 * @see dk.ingi.EBML.EBMLPackage#getElement_UnknownSizeAllowed()
	 * @model default="false" dataType="dk.ingi.EBML.ZeroOneBooleanObject" required="true"
	 *        extendedMetaData="name='unknownsizeallowed' kind='attribute'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!unknownSizeAllowed'"
	 * @generated
	 */
	Boolean getUnknownSizeAllowed();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Element#getUnknownSizeAllowed <em>Unknown Size Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Size Allowed</em>' attribute.
	 * @see #getUnknownSizeAllowed()
	 * @generated
	 */
	void setUnknownSizeAllowed(Boolean value);

	/**
	 * Returns the value of the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction</em>' containment reference.
	 * @see #setRestriction(Restriction)
	 * @see dk.ingi.EBML.EBMLPackage#getElement_Restriction()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!restriction'"
	 * @generated
	 */
	Restriction getRestriction();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Element#getRestriction <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction</em>' containment reference.
	 * @see #getRestriction()
	 * @generated
	 */
	void setRestriction(Restriction value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dk.ingi.EBML.ElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see dk.ingi.EBML.ElementType
	 * @see #setType(ElementType)
	 * @see dk.ingi.EBML.EBMLPackage#getElement_Type()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!type'"
	 * @generated
	 */
	ElementType getType();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Element#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see dk.ingi.EBML.ElementType
	 * @see #getType()
	 * @generated
	 */
	void setType(ElementType value);

	/**
	 * Returns the value of the '<em><b>Recursive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursive</em>' attribute.
	 * @see #setRecursive(Boolean)
	 * @see dk.ingi.EBML.EBMLPackage#getElement_Recursive()
	 * @model default="false" dataType="dk.ingi.EBML.ZeroOneBooleanObject" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!recursive'"
	 * @generated
	 */
	Boolean getRecursive();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Element#getRecursive <em>Recursive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recursive</em>' attribute.
	 * @see #getRecursive()
	 * @generated
	 */
	void setRecursive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Effective Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Max Occurs</em>' attribute.
	 * @see dk.ingi.EBML.EBMLPackage#getElement_EffectiveMaxOccurs()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='/**\n *\n * if self.maxOccurs = \'unbounded\'\n * then 2147483647\n * else self.maxOccurs.toInteger()\n * endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; maxOccurs = this.getMaxOccurs();\nfinal /*@NonInvalid\052/ boolean eq = &lt;%dk.ingi.EBML.EBMLTables%&gt;.STR_unbounded.equals(maxOccurs);\n/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; IF_eq;\nif (eq) {\n\tIF_eq = &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_2147483647;\n}\nelse {\n\tif (maxOccurs == null) {\n\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null \\\'\\\'String\\\'\\\' rather than \\\'\\\'OclVoid\\\'\\\' value required\");\n\t}\n\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; toInteger = &lt;%org.eclipse.ocl.pivot.library.string.StringToIntegerOperation%&gt;.INSTANCE.evaluate(maxOccurs);\n\tIF_eq = toInteger;\n}\nif (IF_eq == null) {\n\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null body for \\\'EBML::Element::effectiveMaxOccurs\\\'\");\n}\nfinal /*@Thrown\052/ int ECORE_IF_eq = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.intValueOf(IF_eq);\nreturn ECORE_IF_eq;'"
	 * @generated
	 */
	int getEffectiveMaxOccurs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.minOccurs &gt; 1 implies self.default.oclIsUndefined()'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Element::minOccurs_defaultlessWhenGreaterThanOne\";\ntry {\n\t/**\n\t *\n\t * inv minOccurs_defaultlessWhenGreaterThanOne:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let result : Boolean[?] = self.minOccurs &gt; 1 implies\n\t *         self.default.oclIsUndefined()\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.ELEMENT___MIN_OCCURS_DEFAULTLESS_WHEN_GREATER_THAN_ONE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int minOccurs = this.getMinOccurs();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_minOccurs = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(minOccurs);\n\t\tfinal /*@NonInvalid\052/ boolean gt = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation%&gt;.INSTANCE.evaluate(executor, BOXED_minOccurs, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_1).booleanValue();\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; result;\n\t\tif (!gt) {\n\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; default1 = this.getDefault();\n\t\t\tfinal /*@NonInvalid\052/ boolean oclIsUndefined = default1 == null;\n\t\t\tif (oclIsUndefined) {\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t}\n\t\t}\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean minOccurs_defaultlessWhenGreaterThanOne(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let i : Integer = self.path.lastIndexOf(\'\\\\\')\nin if self.path.oclIsUndefined() or self.path.size() &lt; i or i = -1\nthen true\nelse self.path.at(i+1) = \'+\' implies (not self.recursive.oclIsUndefined() and self.recursive = true)\nendif'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Element::path_ifHasIsRecursivePartThenRecursiveIsTrue\";\ntry {\n\t/**\n\t *\n\t * inv path_ifHasIsRecursivePartThenRecursiveIsTrue:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = let\n\t *           i : Integer[1] = self.path.lastIndexOf(\'\\\\\')\n\t *         in\n\t *           if self.path.oclIsUndefined() or self.path.size() &lt; i or i = -1\n\t *           then true\n\t *           else\n\t *             self.path.at(i + 1) = \'+\' implies\n\t *             not self.recursive.oclIsUndefined() and self.recursive = true\n\t *           endif\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.ELEMENT___PATH_IF_HAS_IS_RECURSIVE_PART_THEN_RECURSIVE_IS_TRUE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_IF_or_0;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; path = this.getPath();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; i = &lt;%org.eclipse.ocl.pivot.library.string.StringLastIndexOfOperation%&gt;.INSTANCE.evaluate(path, &lt;%dk.ingi.EBML.EBMLTables%&gt;.STR__92);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; or;\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(path);\n\t\t\tfinal /*@NonInvalid\052/ boolean lt = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation%&gt;.INSTANCE.evaluate(executor, size, i).booleanValue();\n\t\t\tor = lt;\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or_0;\n\t\t\tif (or == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\t\tor_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; diff = (&lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt;)&lt;%org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation%&gt;.INSTANCE.evaluate(&lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_1);\n\t\t\t\tfinal /*@NonInvalid\052/ boolean eq = i.equals(diff);\n\t\t\t\tif (eq) {\n\t\t\t\t\tor_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (or == null) {\n\t\t\t\t\t\tor_0 = null;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tor_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tif (or_0 == null) {\n\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null if condition\");\n\t\t\t}\n\t\t\t/*@Thrown\052/ &lt;%java.lang.Boolean%&gt; IF_or_0;\n\t\t\tif (or_0) {\n\t\t\t\tIF_or_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_eq_0;\n\t\t\t\ttry {\n\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; sum = (&lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt;)&lt;%org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation%&gt;.INSTANCE.evaluate(i, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_1);\n\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; at = &lt;%org.eclipse.ocl.pivot.library.string.StringAtOperation%&gt;.INSTANCE.evaluate(path, sum);\n\t\t\t\t\tfinal /*@Thrown\052/ boolean eq_0 = at.equals(&lt;%dk.ingi.EBML.EBMLTables%&gt;.STR_sum);\n\t\t\t\t\tCAUGHT_eq_0 = eq_0;\n\t\t\t\t}\n\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\tCAUGHT_eq_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t}\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; implies;\n\t\t\t\tif (CAUGHT_eq_0 == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\t\timplies = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_and;\n\t\t\t\t\ttry {\n\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; not = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and;\n\t\t\t\t\t\tif (not == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\t\t\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse {\n\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; recursive = this.getRecursive();\n\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ boolean eq_1 = recursive;\n\t\t\t\t\t\t\tif (!eq_1) {\n\t\t\t\t\t\t\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\tif (not == null) {\n\t\t\t\t\t\t\t\t\tand = null;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t}\n\t\t\t\t\t\tCAUGHT_and = and;\n\t\t\t\t\t}\n\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\tCAUGHT_and = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t}\n\t\t\t\t\tif (CAUGHT_and == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\t\t\t\timplies = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tif (CAUGHT_eq_0 instanceof &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;) {\n\t\t\t\t\t\t\tthrow (&lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;)CAUGHT_eq_0;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tif (CAUGHT_and instanceof &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;) {\n\t\t\t\t\t\t\tthrow (&lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;)CAUGHT_and;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tif (CAUGHT_and == null) {\n\t\t\t\t\t\t\timplies = null;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse {\n\t\t\t\t\t\t\timplies = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t\tIF_or_0 = implies;\n\t\t\t}\n\t\t\tCAUGHT_IF_or_0 = IF_or_0;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_IF_or_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_IF_or_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean path_ifHasIsRecursivePartThenRecursiveIsTrue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.minOccurs &lt;= self.effectiveMaxOccurs'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Element::maxOccurs_greaterEqualMinOccurs\";\ntry {\n\t/**\n\t *\n\t * inv maxOccurs_greaterEqualMinOccurs:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let result : Boolean[1] = self.minOccurs &lt;= self.effectiveMaxOccurs\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.ELEMENT___MAX_OCCURS_GREATER_EQUAL_MIN_OCCURS__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int minOccurs = this.getMinOccurs();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_minOccurs = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(minOccurs);\n\t\tfinal /*@NonInvalid\052/ int effectiveMaxOccurs = this.getEffectiveMaxOccurs();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_effectiveMaxOccurs = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(effectiveMaxOccurs);\n\t\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, BOXED_minOccurs, BOXED_effectiveMaxOccurs).booleanValue();\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean maxOccurs_greaterEqualMinOccurs(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.minver.oclIsUndefined()\nimplies\nself.minver &gt;= 0'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Element::minver_nonNegative\";\ntry {\n\t/**\n\t *\n\t * inv minver_nonNegative:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = not self.minver.oclIsUndefined() implies self.minver &gt;= 0\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.ELEMENT___MINVER_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Integer%&gt; minver = this.getMinver();\n\t\t\tfinal /*@NonInvalid\052/ boolean oclIsUndefined = minver == null;\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; not;\n\t\t\tif (!oclIsUndefined) {\n\t\t\t\tnot = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tif (oclIsUndefined) {\n\t\t\t\t\tnot = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tnot = null;\n\t\t\t\t}\n\t\t\t}\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; result;\n\t\t\tif (not == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_ge;\n\t\t\t\ttry {\n\t\t\t\t\tif (minver == null) {\n\t\t\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null \\\'\\\'OclComparable\\\'\\\' rather than \\\'\\\'OclVoid\\\'\\\' value required\");\n\t\t\t\t\t}\n\t\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_minver_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(minver);\n\t\t\t\t\tfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, BOXED_minver_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\t\t\t\tCAUGHT_ge = ge;\n\t\t\t\t}\n\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\tCAUGHT_ge = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t}\n\t\t\t\tif (CAUGHT_ge == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (CAUGHT_ge instanceof &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;) {\n\t\t\t\t\t\tthrow (&lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;)CAUGHT_ge;\n\t\t\t\t\t}\n\t\t\t\t\tif (not == null) {\n\t\t\t\t\t\tresult = null;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean minver_nonNegative(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.minOccurs &gt;= 0'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Element::minOccurs_nonNegative\";\ntry {\n\t/**\n\t *\n\t * inv minOccurs_nonNegative:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let result : Boolean[1] = self.minOccurs &gt;= 0\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.ELEMENT___MIN_OCCURS_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int minOccurs = this.getMinOccurs();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_minOccurs = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(minOccurs);\n\t\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, BOXED_minOccurs, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean minOccurs_nonNegative(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='(not self.unknownSizeAllowed.oclIsUndefined() and self.unknownSizeAllowed = true)\nimplies\n(self.recursive.oclIsUndefined() or self.recursive = false)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Element::unknownSizeAllowed_notTrueIfRecursiveIsTrue\";\ntry {\n\t/**\n\t *\n\t * inv unknownSizeAllowed_notTrueIfRecursiveIsTrue:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = not self.unknownSizeAllowed.oclIsUndefined() and self.unknownSizeAllowed = true implies\n\t *         self.recursive.oclIsUndefined() or self.recursive = false\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.ELEMENT___UNKNOWN_SIZE_ALLOWED_NOT_TRUE_IF_RECURSIVE_IS_TRUE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\t\ttry {\n\t\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_and;\n\t\t\ttry {\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; not = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and;\n\t\t\t\tif (not == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; unknownSizeAllowed = this.getUnknownSizeAllowed();\n\t\t\t\t\tfinal /*@NonInvalid\052/ boolean eq = unknownSizeAllowed;\n\t\t\t\t\tif (!eq) {\n\t\t\t\t\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tif (not == null) {\n\t\t\t\t\t\t\tand = null;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse {\n\t\t\t\t\t\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t\tCAUGHT_and = and;\n\t\t\t}\n\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\tCAUGHT_and = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t}\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; result;\n\t\t\tif (CAUGHT_and == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; or;\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; recursive = this.getRecursive();\n\t\t\t\tfinal /*@NonInvalid\052/ boolean eq_0 = !recursive;\n\t\t\t\tor = eq_0;\n\t\t\t\tif (or == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (CAUGHT_and instanceof &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;) {\n\t\t\t\t\t\tthrow (&lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;)CAUGHT_and;\n\t\t\t\t\t}\n\t\t\t\t\tif ((CAUGHT_and == null) || (or == null)) {\n\t\t\t\t\t\tresult = null;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean unknownSizeAllowed_notTrueIfRecursiveIsTrue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='(not self.recursive.oclIsUndefined() and self.recursive = true)\nimplies\n(self.unknownSizeAllowed.oclIsUndefined() or self.unknownSizeAllowed = false)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Element::recursive_notTrueIfUnknownSizeAllowedIsTrue\";\ntry {\n\t/**\n\t *\n\t * inv recursive_notTrueIfUnknownSizeAllowedIsTrue:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = not self.recursive.oclIsUndefined() and self.recursive = true implies\n\t *         self.unknownSizeAllowed.oclIsUndefined() or self.unknownSizeAllowed = false\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.ELEMENT___RECURSIVE_NOT_TRUE_IF_UNKNOWN_SIZE_ALLOWED_IS_TRUE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\t\ttry {\n\t\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_and;\n\t\t\ttry {\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; not = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and;\n\t\t\t\tif (not == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; recursive = this.getRecursive();\n\t\t\t\t\tfinal /*@NonInvalid\052/ boolean eq = recursive;\n\t\t\t\t\tif (!eq) {\n\t\t\t\t\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tif (not == null) {\n\t\t\t\t\t\t\tand = null;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse {\n\t\t\t\t\t\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t\tCAUGHT_and = and;\n\t\t\t}\n\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\tCAUGHT_and = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t}\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; result;\n\t\t\tif (CAUGHT_and == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; or;\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; unknownSizeAllowed = this.getUnknownSizeAllowed();\n\t\t\t\tfinal /*@NonInvalid\052/ boolean eq_0 = !unknownSizeAllowed;\n\t\t\t\tor = eq_0;\n\t\t\t\tif (or == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (CAUGHT_and instanceof &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;) {\n\t\t\t\t\t\tthrow (&lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;)CAUGHT_and;\n\t\t\t\t\t}\n\t\t\t\t\tif ((CAUGHT_and == null) || (or == null)) {\n\t\t\t\t\t\tresult = null;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean recursive_notTrueIfUnknownSizeAllowedIsTrue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.maxver.oclIsUndefined() implies self.maxver &gt;= 0'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Element::maxver_nonNegative\";\ntry {\n\t/**\n\t *\n\t * inv maxver_nonNegative:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = not self.maxver.oclIsUndefined() implies self.maxver &gt;= 0\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.ELEMENT___MAXVER_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Integer%&gt; maxver = this.getMaxver();\n\t\t\tfinal /*@NonInvalid\052/ boolean oclIsUndefined = maxver == null;\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; not;\n\t\t\tif (!oclIsUndefined) {\n\t\t\t\tnot = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tif (oclIsUndefined) {\n\t\t\t\t\tnot = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tnot = null;\n\t\t\t\t}\n\t\t\t}\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; result;\n\t\t\tif (not == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_ge;\n\t\t\t\ttry {\n\t\t\t\t\tif (maxver == null) {\n\t\t\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null \\\'\\\'OclComparable\\\'\\\' rather than \\\'\\\'OclVoid\\\'\\\' value required\");\n\t\t\t\t\t}\n\t\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_maxver_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(maxver);\n\t\t\t\t\tfinal /*@Thrown\052/ boolean ge = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, BOXED_maxver_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\t\t\t\tCAUGHT_ge = ge;\n\t\t\t\t}\n\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\tCAUGHT_ge = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t}\n\t\t\t\tif (CAUGHT_ge == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (CAUGHT_ge instanceof &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;) {\n\t\t\t\t\t\tthrow (&lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;)CAUGHT_ge;\n\t\t\t\t\t}\n\t\t\t\t\tif (not == null) {\n\t\t\t\t\t\tresult = null;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean maxver_nonNegative(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.oclContainer().oclIsTypeOf(EBMLSchema)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Element::element_containedbyEBMLSchema\";\ntry {\n\t/**\n\t *\n\t * inv element_containedbyEBMLSchema:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[1] = self.oclContainer()\n\t *         .oclIsTypeOf(EBMLSchema)\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.ELEMENT___ELEMENT_CONTAINEDBY_EBML_SCHEMA__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_EBML_c_c_EBMLSchema = idResolver.getClass(&lt;%dk.ingi.EBML.EBMLTables%&gt;.CLSSid_EBMLSchema, null);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Object%&gt; oclContainer = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%&gt;.INSTANCE.evaluate(executor, this);\n\t\t\tfinal /*@Thrown\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%&gt;.INSTANCE.evaluate(executor, oclContainer, TYP_EBML_c_c_EBMLSchema).booleanValue();\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean element_containedbyEBMLSchema(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.name.oclIsUndefined() implies self.name.matches(\'^[A-Za-z0-9][A-Za-z0-9.-]*$\')'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Element::name_valid\";\ntry {\n\t/**\n\t *\n\t * inv name_valid:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = not self.name.oclIsUndefined() implies\n\t *         self.name.matches(\'^[A-Za-z0-9][A-Za-z0-9.-]*$\')\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.ELEMENT___NAME_VALID__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; not = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; result;\n\t\t\tif (not == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; name = this.getName();\n\t\t\t\tfinal /*@NonInvalid\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, name, &lt;%dk.ingi.EBML.EBMLTables%&gt;.STR__94_91_A_m_Za_m_z0_m_9_93_91_A_m_Za_m_z0_m_9_m_93_a_$).booleanValue();\n\t\t\t\tif (matches) {\n\t\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (not == null) {\n\t\t\t\t\t\tresult = null;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean name_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.maxOccurs.matches(\'^(unbounded|0|[1-9][0-9]*)$\')'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Element::maxOccurs_valid\";\ntry {\n\t/**\n\t *\n\t * inv maxOccurs_valid:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[1] = self.maxOccurs.matches(\'^(unbounded|0|[1-9][0-9]*)$\')\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.ELEMENT___MAX_OCCURS_VALID__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; maxOccurs = this.getMaxOccurs();\n\t\t\tif (maxOccurs == null) {\n\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null \\\'\\\'String\\\'\\\' rather than \\\'\\\'OclVoid\\\'\\\' value required\");\n\t\t\t}\n\t\t\tfinal /*@Thrown\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, maxOccurs, &lt;%dk.ingi.EBML.EBMLTables%&gt;.STR__94_o_unbounded_124_0_124_91_1_m_9_93_91_0_m_9_93_a_e_$).booleanValue();\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean maxOccurs_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.id.oclIsUndefined() implies self.id.matches(\'^0x([0-9A-F][0-9A-F])+$\')'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Element::id_valid\";\ntry {\n\t/**\n\t *\n\t * inv id_valid:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = not self.id.oclIsUndefined() implies\n\t *         self.id.matches(\'^0x([0-9A-F][0-9A-F])+$\')\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.ELEMENT___ID_VALID__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; not = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; result;\n\t\t\tif (not == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; id = this.getId();\n\t\t\t\tfinal /*@NonInvalid\052/ boolean matches = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, id, &lt;%dk.ingi.EBML.EBMLTables%&gt;.STR__94_0x_o_91_0_m_9A_m_F_93_91_0_m_9A_m_F_93_e_p_$).booleanValue();\n\t\t\t\tif (matches) {\n\t\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (not == null) {\n\t\t\t\t\t\tresult = null;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean id_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.recursive = true implies self.type = ElementType::MASTER'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Element::type_onlyMasterCanBeRecursive\";\ntry {\n\t/**\n\t *\n\t * inv type_onlyMasterCanBeRecursive:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let result : Boolean[?] = self.recursive = true implies self.type = ElementType::MASTER\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.ELEMENT___TYPE_ONLY_MASTER_CAN_BE_RECURSIVE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; recursive = this.getRecursive();\n\t\tfinal /*@NonInvalid\052/ boolean eq = recursive;\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; result;\n\t\tif (!eq) {\n\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%dk.ingi.EBML.ElementType%&gt; type = this.getType();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.EnumerationLiteralId%&gt; BOXED_type = &lt;%dk.ingi.EBML.EBMLTables%&gt;.ENUMid_ElementType.getEnumerationLiteralId(&lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState(type.getName()));\n\t\t\tfinal /*@NonInvalid\052/ boolean eq_0 = BOXED_type == &lt;%dk.ingi.EBML.EBMLTables%&gt;.ELITid_MASTER;\n\t\t\tif (eq_0) {\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t}\n\t\t}\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean type_onlyMasterCanBeRecursive(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.range.oclIsUndefined()\nimplies\nSet{ElementType::INTEGER, ElementType::UINTEGER, ElementType::FLOAT, ElementType::DATE}-&gt;includes(self.type)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Element::range_isAllowed\";\ntry {\n\t/**\n\t *\n\t * inv range_isAllowed:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = not self.range.oclIsUndefined() implies\n\t *         Set{ElementType::INTEGER, ElementType::UINTEGER, ElementType::FLOAT, ElementType::DATE\n\t *         }\n\t *         -&gt;includes(self.type)\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.ELEMENT___RANGE_IS_ALLOWED__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; range = this.getRange();\n\t\t\tfinal /*@NonInvalid\052/ boolean oclIsUndefined = range == null;\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; not;\n\t\t\tif (!oclIsUndefined) {\n\t\t\t\tnot = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tif (oclIsUndefined) {\n\t\t\t\t\tnot = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tnot = null;\n\t\t\t\t}\n\t\t\t}\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; result;\n\t\t\tif (not == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%dk.ingi.EBML.ElementType%&gt; type = this.getType();\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.EnumerationLiteralId%&gt; BOXED_type = &lt;%dk.ingi.EBML.EBMLTables%&gt;.ENUMid_ElementType.getEnumerationLiteralId(&lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState(type.getName()));\n\t\t\t\tfinal /*@NonInvalid\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(&lt;%dk.ingi.EBML.EBMLTables%&gt;.Set, BOXED_type).booleanValue();\n\t\t\t\tif (includes) {\n\t\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (not == null) {\n\t\t\t\t\t\tresult = null;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean range_isAllowed(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='(not self.recursive.oclIsUndefined() and self.recursive = true)\nimplies\nnot self.path.oclIsUndefined()\nand let i : Integer = self.path.lastIndexOf(\'\\\\\') in (i &gt; 0 and self.path.size() &gt; i+1 and self.path.at(i+1) = \'+\')'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Element::recursive_ifTrueThenPathHasIsRecursivePart\";\ntry {\n\t/**\n\t *\n\t * inv recursive_ifTrueThenPathHasIsRecursivePart:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = not self.recursive.oclIsUndefined() and self.recursive = true implies\n\t *         not self.path.oclIsUndefined() and\n\t *         let i : Integer[1] = self.path.lastIndexOf(\'\\\\\')\n\t *         in i &gt; 0 and\n\t *           self.path.size() &gt; i + 1 and\n\t *           self.path.at(i + 1) = \'+\'\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.ELEMENT___RECURSIVE_IF_TRUE_THEN_PATH_HAS_IS_RECURSIVE_PART__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\t\ttry {\n\t\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_and;\n\t\t\ttry {\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; not = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and;\n\t\t\t\tif (not == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; recursive = this.getRecursive();\n\t\t\t\t\tfinal /*@NonInvalid\052/ boolean eq = recursive;\n\t\t\t\t\tif (!eq) {\n\t\t\t\t\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tif (not == null) {\n\t\t\t\t\t\t\tand = null;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse {\n\t\t\t\t\t\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t\tCAUGHT_and = and;\n\t\t\t}\n\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\tCAUGHT_and = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t}\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; result;\n\t\t\tif (CAUGHT_and == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_and_2;\n\t\t\t\ttry {\n\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; not_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and_2;\n\t\t\t\t\tif (not_0 == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\t\t\tand_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_and_1;\n\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; path = this.getPath();\n\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; i = &lt;%org.eclipse.ocl.pivot.library.string.StringLastIndexOfOperation%&gt;.INSTANCE.evaluate(path, &lt;%dk.ingi.EBML.EBMLTables%&gt;.STR__92);\n\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; sum = (&lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt;)&lt;%org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation%&gt;.INSTANCE.evaluate(i, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_1);\n\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ boolean gt = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation%&gt;.INSTANCE.evaluate(executor, i, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; and_0;\n\t\t\t\t\t\t\tif (!gt) {\n\t\t\t\t\t\t\t\tand_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(path);\n\t\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ boolean gt_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation%&gt;.INSTANCE.evaluate(executor, size, sum).booleanValue();\n\t\t\t\t\t\t\t\tif (!gt_0) {\n\t\t\t\t\t\t\t\t\tand_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\t\tand_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and_1;\n\t\t\t\t\t\t\tif (and_0 == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\t\t\t\t\tand_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_eq_0;\n\t\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; at = &lt;%org.eclipse.ocl.pivot.library.string.StringAtOperation%&gt;.INSTANCE.evaluate(path, sum);\n\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ boolean eq_0 = at.equals(&lt;%dk.ingi.EBML.EBMLTables%&gt;.STR_sum);\n\t\t\t\t\t\t\t\t\tCAUGHT_eq_0 = eq_0;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\t\tCAUGHT_eq_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\tif (CAUGHT_eq_0 == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\t\t\t\t\t\tand_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\t\tif (CAUGHT_eq_0 instanceof &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;) {\n\t\t\t\t\t\t\t\t\t\tthrow (&lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;)CAUGHT_eq_0;\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\tif (and_0 == null) {\n\t\t\t\t\t\t\t\t\t\tand_1 = null;\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\t\t\tand_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tCAUGHT_and_1 = and_1;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\tCAUGHT_and_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t}\n\t\t\t\t\t\tif (CAUGHT_and_1 == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\t\t\t\tand_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse {\n\t\t\t\t\t\t\tif (CAUGHT_and_1 instanceof &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;) {\n\t\t\t\t\t\t\t\tthrow (&lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;)CAUGHT_and_1;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tif ((not_0 == null) || (CAUGHT_and_1 == null)) {\n\t\t\t\t\t\t\t\tand_2 = null;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\tand_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t\tCAUGHT_and_2 = and_2;\n\t\t\t\t}\n\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\tCAUGHT_and_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t}\n\t\t\t\tif (CAUGHT_and_2 == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (CAUGHT_and instanceof &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;) {\n\t\t\t\t\t\tthrow (&lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;)CAUGHT_and;\n\t\t\t\t\t}\n\t\t\t\t\tif (CAUGHT_and_2 instanceof &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;) {\n\t\t\t\t\t\tthrow (&lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;)CAUGHT_and_2;\n\t\t\t\t\t}\n\t\t\t\t\tif ((CAUGHT_and == null) || (CAUGHT_and_2 == null)) {\n\t\t\t\t\t\tresult = null;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean recursive_ifTrueThenPathHasIsRecursivePart(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\nlet effectiveMaxver : Integer = if self.maxver.oclIsUndefined()\n                                                   then self.oclContainer().oclAsType(EBMLSchema).version\n                                                   else self.maxver\n                                                   endif\nin\n    let effectiveMinver : Integer = if self.minver.oclIsUndefined()\n                                                      then 1\n                                                      else self.minver\n                                                      endif\n    in\n        effectiveMinver &lt;= effectiveMaxver '"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Element::maxver_greaterOrEqualToMinver\";\ntry {\n\t/**\n\t *\n\t * inv maxver_greaterOrEqualToMinver:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[1] = let\n\t *           effectiveMaxver : Integer[?] = if self.maxver.oclIsUndefined()\n\t *           then self.oclContainer().oclAsType(EBMLSchema).version\n\t *           else self.maxver\n\t *           endif\n\t *         in\n\t *           let\n\t *             effectiveMinver : Integer[?] = if self.minver.oclIsUndefined()\n\t *             then 1\n\t *             else self.minver\n\t *             endif\n\t *           in effectiveMinver &lt;= effectiveMaxver\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.ELEMENT___MAXVER_GREATER_OR_EQUAL_TO_MINVER__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_le_0;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Integer%&gt; maxver_0 = this.getMaxver();\n\t\t\tfinal /*@NonInvalid\052/ boolean oclIsUndefined = maxver_0 == null;\n\t\t\t/*@Thrown\052/ &lt;%java.lang.Integer%&gt; effectiveMaxver;\n\t\t\tif (oclIsUndefined) {\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_EBML_c_c_EBMLSchema_0 = idResolver.getClass(&lt;%dk.ingi.EBML.EBMLTables%&gt;.CLSSid_EBMLSchema, null);\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Object%&gt; oclContainer = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%&gt;.INSTANCE.evaluate(executor, this);\n\t\t\t\tfinal /*@Thrown\052/ &lt;%dk.ingi.EBML.EBMLSchema%&gt; oclAsType = (&lt;%dk.ingi.EBML.EBMLSchema%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, oclContainer, TYP_EBML_c_c_EBMLSchema_0);\n\t\t\t\tfinal /*@Thrown\052/ int version = oclAsType.getVersion();\n\t\t\t\teffectiveMaxver = (&lt;%java.lang.Integer%&gt;)version;\n\t\t\t}\n\t\t\telse {\n\t\t\t\teffectiveMaxver = maxver_0;\n\t\t\t}\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Integer%&gt; minver_0 = this.getMinver();\n\t\t\tfinal /*@NonInvalid\052/ boolean oclIsUndefined_0 = minver_0 == null;\n\t\t\t/*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; effectiveMinver;\n\t\t\tif (oclIsUndefined_0) {\n\t\t\t\teffectiveMinver = &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_1;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_minver_0 = minver_0 == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(minver_0);\n\t\t\t\teffectiveMinver = BOXED_minver_0;\n\t\t\t}\n\t\t\tif (effectiveMinver == null) {\n\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null \\\'\\\'OclComparable\\\'\\\' rather than \\\'\\\'OclVoid\\\'\\\' value required\");\n\t\t\t}\n\t\t\tif (effectiveMaxver == null) {\n\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null \\\'\\\'OclSelf\\\'\\\' rather than \\\'\\\'OclVoid\\\'\\\' value required\");\n\t\t\t}\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_effectiveMaxver = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(effectiveMaxver);\n\t\t\tif (BOXED_effectiveMaxver instanceof &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;) {\n\t\t\t\tthrow (&lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;)BOXED_effectiveMaxver;\n\t\t\t}\n\t\t\tfinal /*@Thrown\052/ boolean le_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, effectiveMinver, BOXED_effectiveMaxver).booleanValue();\n\t\t\tCAUGHT_le_0 = le_0;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_le_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_le_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean maxver_greaterOrEqualToMinver(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.unknownSizeAllowed.oclIsUndefined() or self.unknownSizeAllowed = false then true else let i : Integer = self.path.lastIndexOf(\'\\\\\')\nin if i = -1 or i = 1\n     then true\n     else\n     let parentPath : String = self.path.substring(1, i-1)\n     in  Element.allInstances()-&gt;exists(e: Element | e.path = parentPath and e.unknownSizeAllowed = true) endif endif\n     \n     '"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Element::unknownSizeAllowed_isValid\";\ntry {\n\t/**\n\t *\n\t * inv unknownSizeAllowed_isValid:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = if\n\t *           self.unknownSizeAllowed.oclIsUndefined() or self.unknownSizeAllowed = false\n\t *         then true\n\t *         else\n\t *           let i : Integer[1] = self.path.lastIndexOf(\'\\\\\')\n\t *           in\n\t *             if i = -1 or i = 1\n\t *             then true\n\t *             else\n\t *               let parentPath : String[1] = self.path.substring(1, i - 1)\n\t *               in\n\t *                 Element.allInstances()\n\t *                 -&gt;exists(e | e.path = parentPath and e.unknownSizeAllowed = true)\n\t *             endif\n\t *         endif\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.ELEMENT___UNKNOWN_SIZE_ALLOWED_IS_VALID__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; or;\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; unknownSizeAllowed = this.getUnknownSizeAllowed();\n\t\t\tfinal /*@NonInvalid\052/ boolean eq = !unknownSizeAllowed;\n\t\t\tor = eq;\n\t\t\tif (or == null) {\n\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null if condition\");\n\t\t\t}\n\t\t\t/*@Thrown\052/ &lt;%java.lang.Boolean%&gt; result;\n\t\t\tif (or) {\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; path = this.getPath();\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; i = &lt;%org.eclipse.ocl.pivot.library.string.StringLastIndexOfOperation%&gt;.INSTANCE.evaluate(path, &lt;%dk.ingi.EBML.EBMLTables%&gt;.STR__92);\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; diff = (&lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt;)&lt;%org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation%&gt;.INSTANCE.evaluate(&lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_1);\n\t\t\t\tfinal /*@NonInvalid\052/ boolean eq_0 = i.equals(diff);\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; or_0;\n\t\t\t\tif (eq_0) {\n\t\t\t\t\tor_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tfinal /*@NonInvalid\052/ boolean eq_1 = i.equals(&lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_1);\n\t\t\t\t\tif (eq_1) {\n\t\t\t\t\t\tor_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tor_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t\tif (or_0 == null) {\n\t\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null if condition\");\n\t\t\t\t}\n\t\t\t\t/*@Thrown\052/ &lt;%java.lang.Boolean%&gt; IF_or_0;\n\t\t\t\tif (or_0) {\n\t\t\t\t\tIF_or_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_parentPath;\n\t\t\t\t\ttry {\n\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; diff_0 = (&lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt;)&lt;%org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation%&gt;.INSTANCE.evaluate(i, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_1);\n\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; parentPath = &lt;%org.eclipse.ocl.pivot.library.string.StringSubstringOperation%&gt;.INSTANCE.evaluate(path, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_1, diff_0);\n\t\t\t\t\t\tCAUGHT_parentPath = parentPath;\n\t\t\t\t\t}\n\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\tCAUGHT_parentPath = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t}\n\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_EBML_c_c_Element = idResolver.getClass(&lt;%dk.ingi.EBML.EBMLTables%&gt;.CLSSid_Element, null);\n\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; allInstances = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLTables%&gt;.SET_CLSSid_Element, TYP_EBML_c_c_Element);\n\t\t\t\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t&lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR_e_0 = allInstances.iterator();\n\t\t\t\t\t/*@Thrown\052/ &lt;%java.lang.Boolean%&gt; exists;\n\t\t\t\t\twhile (true) {\n\t\t\t\t\t\tif (!ITERATOR_e_0.hasNext()) {\n\t\t\t\t\t\t\tif (accumulator == null) {\n\t\t\t\t\t\t\t\texists = null;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\telse if (accumulator == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\t\t\t\t\texists = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\tthrow (&lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;)accumulator;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tbreak;\n\t\t\t\t\t\t}\n\t\t\t\t\t\t/*@NonInvalid\052/ &lt;%dk.ingi.EBML.Element%&gt; e_0 = (&lt;%dk.ingi.EBML.Element%&gt;)ITERATOR_e_0.next();\n\t\t\t\t\t\t/**\n\t\t\t\t\t\t * e.path = parentPath and e.unknownSizeAllowed = true\n\t\t\t\t\t\t \052/\n\t\t\t\t\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_and;\n\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_eq_2;\n\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; path_1 = e_0.getPath();\n\t\t\t\t\t\t\t\tif (CAUGHT_parentPath instanceof &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;) {\n\t\t\t\t\t\t\t\t\tthrow (&lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;)CAUGHT_parentPath;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ boolean eq_2 = path_1.equals(CAUGHT_parentPath);\n\t\t\t\t\t\t\t\tCAUGHT_eq_2 = eq_2;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\t\tCAUGHT_eq_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and;\n\t\t\t\t\t\t\tif (CAUGHT_eq_2 == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\t\t\t\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; unknownSizeAllowed_0 = e_0.getUnknownSizeAllowed();\n\t\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ boolean eq_3 = unknownSizeAllowed_0;\n\t\t\t\t\t\t\t\tif (!eq_3) {\n\t\t\t\t\t\t\t\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\t\tif (CAUGHT_eq_2 instanceof &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;) {\n\t\t\t\t\t\t\t\t\t\tthrow (&lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;)CAUGHT_eq_2;\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\tand = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tCAUGHT_and = and;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\tCAUGHT_and = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t}\n\t\t\t\t\t\t//\n\t\t\t\t\t\tif (CAUGHT_and == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\t\t\t\t\t// Normal successful body evaluation result\n\t\t\t\t\t\t\texists = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t\t\tbreak;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse if (CAUGHT_and == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\t\t\t\t// Normal unsuccessful body evaluation result\n\t\t\t\t\t\t\t;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse if (CAUGHT_and == null) {\t\t\t\t\t\t\t\t// Abnormal null body evaluation result\n\t\t\t\t\t\t\tif (accumulator == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\t\t\t\t\taccumulator = null;\t\t\t\t\t\t\t\t\t\t// Cache a null failure\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse if (CAUGHT_and instanceof &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;) {\t\t// Abnormal exception evaluation result\n\t\t\t\t\t\t\taccumulator = CAUGHT_and;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n\t\t\t\t\t\t\taccumulator = new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(&lt;%org.eclipse.ocl.pivot.messages.PivotMessages%&gt;.NonBooleanBody, \"exists\");\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t\tIF_or_0 = exists;\n\t\t\t\t}\n\t\t\t\tresult = IF_or_0;\n\t\t\t}\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean unknownSizeAllowed_isValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.type = ElementType::MASTER implies self.default.oclIsUndefined()'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Element::type_masterMustNotDeclareDefaultValue\";\ntry {\n\t/**\n\t *\n\t * inv type_masterMustNotDeclareDefaultValue:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let result : Boolean[?] = self.type = ElementType::MASTER implies\n\t *         self.default.oclIsUndefined()\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.ELEMENT___TYPE_MASTER_MUST_NOT_DECLARE_DEFAULT_VALUE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%dk.ingi.EBML.ElementType%&gt; type = this.getType();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.EnumerationLiteralId%&gt; BOXED_type = &lt;%dk.ingi.EBML.EBMLTables%&gt;.ENUMid_ElementType.getEnumerationLiteralId(&lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState(type.getName()));\n\t\tfinal /*@NonInvalid\052/ boolean eq = BOXED_type == &lt;%dk.ingi.EBML.EBMLTables%&gt;.ELITid_MASTER;\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; result;\n\t\tif (!eq) {\n\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; default1 = this.getDefault();\n\t\t\tfinal /*@NonInvalid\052/ boolean oclIsUndefined = default1 == null;\n\t\t\tif (oclIsUndefined) {\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t}\n\t\t}\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean type_masterMustNotDeclareDefaultValue(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Element
