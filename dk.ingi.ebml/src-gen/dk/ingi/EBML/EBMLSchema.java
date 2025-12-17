/**
 */
package dk.ingi.EBML;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.ingi.EBML.EBMLSchema#getDocType <em>Doc Type</em>}</li>
 *   <li>{@link dk.ingi.EBML.EBMLSchema#getVersion <em>Version</em>}</li>
 *   <li>{@link dk.ingi.EBML.EBMLSchema#getEbml <em>Ebml</em>}</li>
 *   <li>{@link dk.ingi.EBML.EBMLSchema#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see dk.ingi.EBML.EBMLPackage#getEBMLSchema()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ebml_positive'"
 * @generated
 */
public interface EBMLSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Doc Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dk.ingi.EBML.DocumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc Type</em>' attribute.
	 * @see dk.ingi.EBML.DocumentType
	 * @see #setDocType(DocumentType)
	 * @see dk.ingi.EBML.EBMLPackage#getEBMLSchema_DocType()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!EBMLSchema!docType'"
	 * @generated
	 */
	DocumentType getDocType();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.EBMLSchema#getDocType <em>Doc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Type</em>' attribute.
	 * @see dk.ingi.EBML.DocumentType
	 * @see #getDocType()
	 * @generated
	 */
	void setDocType(DocumentType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see dk.ingi.EBML.EBMLPackage#getEBMLSchema_Version()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!EBMLSchema!version'"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.EBMLSchema#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

	/**
	 * Returns the value of the '<em><b>Ebml</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ebml</em>' attribute.
	 * @see #setEbml(int)
	 * @see dk.ingi.EBML.EBMLPackage#getEBMLSchema_Ebml()
	 * @model default="1" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!EBMLSchema!ebml'"
	 * @generated
	 */
	int getEbml();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.EBMLSchema#getEbml <em>Ebml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ebml</em>' attribute.
	 * @see #getEbml()
	 * @generated
	 */
	void setEbml(int value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link dk.ingi.EBML.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see dk.ingi.EBML.EBMLPackage#getEBMLSchema_Element()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!EBMLSchema!element'"
	 * @generated
	 */
	EList<Element> getElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.version &gt;= 0'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"EBMLSchema::version_notNegative\";\ntry {\n\t/**\n\t *\n\t * inv version_notNegative:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let result : Boolean[1] = self.version &gt;= 0\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.EBML_SCHEMA___VERSION_NOT_NEGATIVE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int version = this.getVersion();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_version = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(version);\n\t\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, BOXED_version, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean version_notNegative(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.ebml &gt;= 1'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"EBMLSchema::ebml_positive\";\ntry {\n\t/**\n\t *\n\t * inv ebml_positive:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let result : Boolean[1] = self.ebml &gt;= 1\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.EBML_SCHEMA___EBML_POSITIVE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ int ebml = this.getEbml();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_ebml = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(ebml);\n\t\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%&gt;.INSTANCE.evaluate(executor, BOXED_ebml, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_1).booleanValue();\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean ebml_positive(DiagnosticChain diagnostics, Map<Object, Object> context);

} // EBMLSchema
