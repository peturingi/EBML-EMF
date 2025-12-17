/**
 */
package dk.ingi.EBML.impl;

import dk.ingi.EBML.DocumentType;
import dk.ingi.EBML.EBMLPackage;
import dk.ingi.EBML.EBMLSchema;
import dk.ingi.EBML.EBMLTables;
import dk.ingi.EBML.Element;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.ingi.EBML.impl.EBMLSchemaImpl#getDocType <em>Doc Type</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.EBMLSchemaImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.EBMLSchemaImpl#getEbml <em>Ebml</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.EBMLSchemaImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EBMLSchemaImpl extends MinimalEObjectImpl.Container implements EBMLSchema {
	/**
	 * The default value of the '{@link #getDocType() <em>Doc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocType()
	 * @generated
	 * @ordered
	 */
	protected static final DocumentType DOC_TYPE_EDEFAULT = DocumentType.MATROSKA;

	/**
	 * The cached value of the '{@link #getDocType() <em>Doc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocType()
	 * @generated
	 * @ordered
	 */
	protected DocumentType docType = DOC_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEbml() <em>Ebml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEbml()
	 * @generated
	 * @ordered
	 */
	protected static final int EBML_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getEbml() <em>Ebml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEbml()
	 * @generated
	 * @ordered
	 */
	protected int ebml = EBML_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EBMLSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EBMLPackage.Literals.EBML_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentType getDocType() {
		return docType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocType(DocumentType newDocType) {
		DocumentType oldDocType = docType;
		docType = newDocType == null ? DOC_TYPE_EDEFAULT : newDocType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.EBML_SCHEMA__DOC_TYPE, oldDocType,
					docType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.EBML_SCHEMA__VERSION, oldVersion,
					version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEbml() {
		return ebml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEbml(int newEbml) {
		int oldEbml = ebml;
		ebml = newEbml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.EBML_SCHEMA__EBML, oldEbml, ebml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList.Resolving<Element>(Element.class, this,
					EBMLPackage.EBML_SCHEMA__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean version_notNegative(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "EBMLSchema::version_notNegative";
		try {
			/**
			 *
			 * inv version_notNegative:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.version >= 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.EBML_SCHEMA___VERSION_NOT_NEGATIVE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ int version = this.getVersion();
				final /*@NonInvalid*/ IntegerValue BOXED_version = ValueUtil.integerValueOf(version);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE
						.evaluate(executor, BOXED_version, EBMLTables.INT_0).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, EBMLTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ebml_positive(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "EBMLSchema::ebml_positive";
		try {
			/**
			 *
			 * inv ebml_positive:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.ebml >= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.EBML_SCHEMA___EBML_POSITIVE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ int ebml = this.getEbml();
				final /*@NonInvalid*/ IntegerValue BOXED_ebml = ValueUtil.integerValueOf(ebml);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE
						.evaluate(executor, BOXED_ebml, EBMLTables.INT_1).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, EBMLTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EBMLPackage.EBML_SCHEMA__ELEMENT:
			return ((InternalEList<?>) getElement()).basicRemove(otherEnd, msgs);
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
		case EBMLPackage.EBML_SCHEMA__DOC_TYPE:
			return getDocType();
		case EBMLPackage.EBML_SCHEMA__VERSION:
			return getVersion();
		case EBMLPackage.EBML_SCHEMA__EBML:
			return getEbml();
		case EBMLPackage.EBML_SCHEMA__ELEMENT:
			return getElement();
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
		case EBMLPackage.EBML_SCHEMA__DOC_TYPE:
			setDocType((DocumentType) newValue);
			return;
		case EBMLPackage.EBML_SCHEMA__VERSION:
			setVersion((Integer) newValue);
			return;
		case EBMLPackage.EBML_SCHEMA__EBML:
			setEbml((Integer) newValue);
			return;
		case EBMLPackage.EBML_SCHEMA__ELEMENT:
			getElement().clear();
			getElement().addAll((Collection<? extends Element>) newValue);
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
		case EBMLPackage.EBML_SCHEMA__DOC_TYPE:
			setDocType(DOC_TYPE_EDEFAULT);
			return;
		case EBMLPackage.EBML_SCHEMA__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case EBMLPackage.EBML_SCHEMA__EBML:
			setEbml(EBML_EDEFAULT);
			return;
		case EBMLPackage.EBML_SCHEMA__ELEMENT:
			getElement().clear();
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
		case EBMLPackage.EBML_SCHEMA__DOC_TYPE:
			return docType != DOC_TYPE_EDEFAULT;
		case EBMLPackage.EBML_SCHEMA__VERSION:
			return version != VERSION_EDEFAULT;
		case EBMLPackage.EBML_SCHEMA__EBML:
			return ebml != EBML_EDEFAULT;
		case EBMLPackage.EBML_SCHEMA__ELEMENT:
			return element != null && !element.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case EBMLPackage.EBML_SCHEMA___VERSION_NOT_NEGATIVE__DIAGNOSTICCHAIN_MAP:
			return version_notNegative((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case EBMLPackage.EBML_SCHEMA___EBML_POSITIVE__DIAGNOSTICCHAIN_MAP:
			return ebml_positive((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (docType: ");
		result.append(docType);
		result.append(", version: ");
		result.append(version);
		result.append(", ebml: ");
		result.append(ebml);
		result.append(')');
		return result.toString();
	}

} //EBMLSchemaImpl
