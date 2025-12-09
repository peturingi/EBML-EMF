/**
 */
package dk.ingi.EBML;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.ingi.EBML.Extension#getType <em>Type</em>}</li>
 *   <li>{@link dk.ingi.EBML.Extension#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link dk.ingi.EBML.Extension#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see dk.ingi.EBML.EBMLPackage#getExtension()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='containerType'"
 * @generated
 */
public interface Extension extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see dk.ingi.EBML.EBMLPackage#getExtension_Type()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Extension!type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Extension#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see dk.ingi.EBML.EBMLPackage#getExtension_AnyAttribute()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' name=':1' wildcards='##any' processing='lax'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Extension!anyAttribute'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see dk.ingi.EBML.EBMLPackage#getExtension_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="name='' kind='elementWildcard' processing='lax' wildcards='##other'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Extension!any'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.oclContainer().oclIsTypeOf(Element)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.lang.String%&gt; constraintName = \"Extension::containerType\";\ntry {\n\t/**\n\t *\n\t * inv containerType:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity &lt;= 0\n\t *     then true\n\t *     else\n\t *       let result : Boolean[1] = self.oclContainer().oclIsTypeOf(Element)\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.utilities.PivotUtil%&gt;.getExecutor(this);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%dk.ingi.EBML.EBMLPackage%&gt;.Literals.EXTENSION___CONTAINER_TYPE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t/*@NonInvalid\052/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_EBML_c_c_Element_0 = idResolver.getClass(&lt;%dk.ingi.EBML.EBMLTables%&gt;.CLSSid_Element, null);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Object%&gt; oclContainer = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%&gt;.INSTANCE.evaluate(executor, this);\n\t\t\tfinal /*@Thrown\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%&gt;.INSTANCE.evaluate(executor, oclContainer, TYP_EBML_c_c_Element_0).booleanValue();\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%dk.ingi.EBML.EBMLTables%&gt;.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (&lt;%java.lang.Throwable%&gt; e) {\n\treturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}'"
	 * @generated
	 */
	boolean containerType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Extension
