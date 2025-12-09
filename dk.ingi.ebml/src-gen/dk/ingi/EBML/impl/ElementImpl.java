/**
 */
package dk.ingi.EBML.impl;

import dk.ingi.EBML.Documentation;
import dk.ingi.EBML.EBMLPackage;
import dk.ingi.EBML.EBMLSchema;
import dk.ingi.EBML.EBMLTables;
import dk.ingi.EBML.Element;
import dk.ingi.EBML.ElementType;
import dk.ingi.EBML.Extension;
import dk.ingi.EBML.ImplementationNote;
import dk.ingi.EBML.Restriction;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
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
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringAtOperation;
import org.eclipse.ocl.pivot.library.string.StringLastIndexOfOperation;
import org.eclipse.ocl.pivot.library.string.StringMatchesOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;
import org.eclipse.ocl.pivot.library.string.StringSubstringOperation;
import org.eclipse.ocl.pivot.library.string.StringToIntegerOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getPath <em>Path</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getMinver <em>Minver</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getMaxver <em>Maxver</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getImplementationNote <em>Implementation Note</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getLength <em>Length</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getRecurring <em>Recurring</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getRange <em>Range</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getUnknownSizeAllowed <em>Unknown Size Allowed</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getRecursive <em>Recursive</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.ElementImpl#getEffectiveMaxOccurs <em>Effective Max Occurs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinOccurs() <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_OCCURS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinOccurs() <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOccurs()
	 * @generated
	 * @ordered
	 */
	protected int minOccurs = MIN_OCCURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxOccurs() <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_OCCURS_EDEFAULT = "unbounded";

	/**
	 * The cached value of the '{@link #getMaxOccurs() <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOccurs()
	 * @generated
	 * @ordered
	 */
	protected String maxOccurs = MAX_OCCURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinver() <em>Minver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinver()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MINVER_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getMinver() <em>Minver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinver()
	 * @generated
	 * @ordered
	 */
	protected Integer minver = MINVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxver() <em>Maxver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxver()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxver() <em>Maxver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxver()
	 * @generated
	 * @ordered
	 */
	protected Integer maxver = MAXVER_EDEFAULT;

	/**
	 * This is true if the Maxver attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxverESet;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Documentation> documentation;

	/**
	 * The cached value of the '{@link #getImplementationNote() <em>Implementation Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationNote()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationNote> implementationNote;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> extension;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final String LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected String length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecurring() <em>Recurring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurring()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RECURRING_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getRecurring() <em>Recurring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurring()
	 * @generated
	 * @ordered
	 */
	protected Boolean recurring = RECURRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final String RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected String range = RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnknownSizeAllowed() <em>Unknown Size Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownSizeAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UNKNOWN_SIZE_ALLOWED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getUnknownSizeAllowed() <em>Unknown Size Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownSizeAllowed()
	 * @generated
	 * @ordered
	 */
	protected Boolean unknownSizeAllowed = UNKNOWN_SIZE_ALLOWED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRestriction() <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestriction()
	 * @generated
	 * @ordered
	 */
	protected Restriction restriction;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ElementType TYPE_EDEFAULT = ElementType.INTEGER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ElementType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecursive() <em>Recursive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecursive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RECURSIVE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getRecursive() <em>Recursive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecursive()
	 * @generated
	 * @ordered
	 */
	protected Boolean recursive = RECURSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectiveMaxOccurs() <em>Effective Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveMaxOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final int EFFECTIVE_MAX_OCCURS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EBMLPackage.Literals.ELEMENT;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.ELEMENT__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinOccurs() {
		return minOccurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinOccurs(int newMinOccurs) {
		int oldMinOccurs = minOccurs;
		minOccurs = newMinOccurs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.ELEMENT__MIN_OCCURS, oldMinOccurs,
					minOccurs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaxOccurs() {
		return maxOccurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxOccurs(String newMaxOccurs) {
		String oldMaxOccurs = maxOccurs;
		maxOccurs = newMaxOccurs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.ELEMENT__MAX_OCCURS, oldMaxOccurs,
					maxOccurs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinver() {
		return minver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinver(Integer newMinver) {
		Integer oldMinver = minver;
		minver = newMinver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.ELEMENT__MINVER, oldMinver, minver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxver() {
		return maxver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxver(Integer newMaxver) {
		Integer oldMaxver = maxver;
		maxver = newMaxver;
		boolean oldMaxverESet = maxverESet;
		maxverESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.ELEMENT__MAXVER, oldMaxver, maxver,
					!oldMaxverESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaxver() {
		Integer oldMaxver = maxver;
		boolean oldMaxverESet = maxverESet;
		maxver = MAXVER_EDEFAULT;
		maxverESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EBMLPackage.ELEMENT__MAXVER, oldMaxver,
					MAXVER_EDEFAULT, oldMaxverESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaxver() {
		return maxverESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Documentation> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<Documentation>(Documentation.class, this,
					EBMLPackage.ELEMENT__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImplementationNote> getImplementationNote() {
		if (implementationNote == null) {
			implementationNote = new EObjectContainmentEList<ImplementationNote>(ImplementationNote.class, this,
					EBMLPackage.ELEMENT__IMPLEMENTATION_NOTE);
		}
		return implementationNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Extension> getExtension() {
		if (extension == null) {
			extension = new EObjectContainmentEList<Extension>(Extension.class, this, EBMLPackage.ELEMENT__EXTENSION);
		}
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(String newLength) {
		String oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.ELEMENT__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRecurring() {
		return recurring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurring(Boolean newRecurring) {
		Boolean oldRecurring = recurring;
		recurring = newRecurring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.ELEMENT__RECURRING, oldRecurring,
					recurring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.ELEMENT__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange(String newRange) {
		String oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.ELEMENT__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUnknownSizeAllowed() {
		return unknownSizeAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnknownSizeAllowed(Boolean newUnknownSizeAllowed) {
		Boolean oldUnknownSizeAllowed = unknownSizeAllowed;
		unknownSizeAllowed = newUnknownSizeAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.ELEMENT__UNKNOWN_SIZE_ALLOWED,
					oldUnknownSizeAllowed, unknownSizeAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Restriction getRestriction() {
		return restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestriction(Restriction newRestriction, NotificationChain msgs) {
		Restriction oldRestriction = restriction;
		restriction = newRestriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EBMLPackage.ELEMENT__RESTRICTION, oldRestriction, newRestriction);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestriction(Restriction newRestriction) {
		if (newRestriction != restriction) {
			NotificationChain msgs = null;
			if (restriction != null)
				msgs = ((InternalEObject) restriction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EBMLPackage.ELEMENT__RESTRICTION, null, msgs);
			if (newRestriction != null)
				msgs = ((InternalEObject) newRestriction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EBMLPackage.ELEMENT__RESTRICTION, null, msgs);
			msgs = basicSetRestriction(newRestriction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.ELEMENT__RESTRICTION, newRestriction,
					newRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ElementType newType) {
		ElementType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRecursive() {
		return recursive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecursive(Boolean newRecursive) {
		Boolean oldRecursive = recursive;
		recursive = newRecursive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.ELEMENT__RECURSIVE, oldRecursive,
					recursive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEffectiveMaxOccurs() {
		/**
		 *
		 * if self.maxOccurs = 'unbounded'
		 * then 2147483647
		 * else self.maxOccurs.toInteger()
		 * endif
		 */
		final /*@NonInvalid*/ String maxOccurs = this.getMaxOccurs();
		final /*@NonInvalid*/ boolean eq = EBMLTables.STR_unbounded.equals(maxOccurs);
		/*@Thrown*/ IntegerValue IF_eq;
		if (eq) {
			IF_eq = EBMLTables.INT_2147483647;
		} else {
			if (maxOccurs == null) {
				throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
			}
			final /*@Thrown*/ IntegerValue toInteger = StringToIntegerOperation.INSTANCE.evaluate(maxOccurs);
			IF_eq = toInteger;
		}
		if (IF_eq == null) {
			throw new InvalidValueException("Null body for \'EBML::Element::effectiveMaxOccurs\'");
		}
		final /*@Thrown*/ int ECORE_IF_eq = ValueUtil.intValueOf(IF_eq);
		return ECORE_IF_eq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean minOccurs_defaultlessWhenGreaterThanOne(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Element::minOccurs_defaultlessWhenGreaterThanOne";
		try {
			/**
			 *
			 * inv minOccurs_defaultlessWhenGreaterThanOne:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.minOccurs > 1 implies
			 *         self.default.oclIsUndefined()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.ELEMENT___MIN_OCCURS_DEFAULTLESS_WHEN_GREATER_THAN_ONE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ int minOccurs = this.getMinOccurs();
				final /*@NonInvalid*/ IntegerValue BOXED_minOccurs = ValueUtil.integerValueOf(minOccurs);
				final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
						.evaluate(executor, BOXED_minOccurs, EBMLTables.INT_1).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!gt) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ String default1 = this.getDefault();
					final /*@NonInvalid*/ boolean oclIsUndefined = default1 == null;
					if (oclIsUndefined) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
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
	public boolean path_ifHasIsRecursivePartThenRecursiveIsTrue(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Element::path_ifHasIsRecursivePartThenRecursiveIsTrue";
		try {
			/**
			 *
			 * inv path_ifHasIsRecursivePartThenRecursiveIsTrue:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = let
			 *           i : Integer[1] = self.path.lastIndexOf('\\')
			 *         in
			 *           if self.path.oclIsUndefined() or self.path.size() < i or i = -1
			 *           then true
			 *           else
			 *             self.path.at(i + 1) = '+' implies
			 *             not self.recursive.oclIsUndefined() and self.recursive = true
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.ELEMENT___PATH_IF_HAS_IS_RECURSIVE_PART_THEN_RECURSIVE_IS_TRUE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_or_0;
				try {
					final /*@NonInvalid*/ String path = this.getPath();
					final /*@NonInvalid*/ IntegerValue i = StringLastIndexOfOperation.INSTANCE.evaluate(path,
							EBMLTables.STR__92);
					final /*@NonInvalid*/ Boolean or;
					final /*@NonInvalid*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(path);
					final /*@NonInvalid*/ boolean lt = OclComparableLessThanOperation.INSTANCE
							.evaluate(executor, size, i).booleanValue();
					or = lt;
					final /*@Thrown*/ Boolean or_0;
					if (or == ValueUtil.TRUE_VALUE) {
						or_0 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ IntegerValue diff = (IntegerValue) NumericNegateOperation.INSTANCE
								.evaluate(EBMLTables.INT_1);
						final /*@NonInvalid*/ boolean eq = i.equals(diff);
						if (eq) {
							or_0 = ValueUtil.TRUE_VALUE;
						} else {
							if (or == null) {
								or_0 = null;
							} else {
								or_0 = ValueUtil.FALSE_VALUE;
							}
						}
					}
					if (or_0 == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean IF_or_0;
					if (or_0) {
						IF_or_0 = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_eq_0;
						try {
							final /*@NonInvalid*/ IntegerValue sum = (IntegerValue) NumericPlusOperation.INSTANCE
									.evaluate(i, EBMLTables.INT_1);
							final /*@Thrown*/ String at = StringAtOperation.INSTANCE.evaluate(path, sum);
							final /*@Thrown*/ boolean eq_0 = at.equals(EBMLTables.STR_sum);
							CAUGHT_eq_0 = eq_0;
						} catch (Exception e) {
							CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean implies;
						if (CAUGHT_eq_0 == ValueUtil.FALSE_VALUE) {
							implies = ValueUtil.TRUE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_and;
							try {
								final /*@NonInvalid*/ Boolean not = ValueUtil.TRUE_VALUE;
								final /*@Thrown*/ Boolean and;
								if (not == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									final /*@NonInvalid*/ Boolean recursive = this.getRecursive();
									final /*@NonInvalid*/ boolean eq_1 = recursive;
									if (!eq_1) {
										and = ValueUtil.FALSE_VALUE;
									} else {
										if (not == null) {
											and = null;
										} else {
											and = ValueUtil.TRUE_VALUE;
										}
									}
								}
								CAUGHT_and = and;
							} catch (Exception e) {
								CAUGHT_and = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
								implies = ValueUtil.TRUE_VALUE;
							} else {
								if (CAUGHT_eq_0 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_eq_0;
								}
								if (CAUGHT_and instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_and;
								}
								if (CAUGHT_and == null) {
									implies = null;
								} else {
									implies = ValueUtil.FALSE_VALUE;
								}
							}
						}
						IF_or_0 = implies;
					}
					CAUGHT_IF_or_0 = IF_or_0;
				} catch (Exception e) {
					CAUGHT_IF_or_0 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_IF_or_0, EBMLTables.INT_0)
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
	public boolean maxOccurs_greaterEqualMinOccurs(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Element::maxOccurs_greaterEqualMinOccurs";
		try {
			/**
			 *
			 * inv maxOccurs_greaterEqualMinOccurs:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.minOccurs <= self.effectiveMaxOccurs
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.ELEMENT___MAX_OCCURS_GREATER_EQUAL_MIN_OCCURS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ int minOccurs = this.getMinOccurs();
				final /*@NonInvalid*/ IntegerValue BOXED_minOccurs = ValueUtil.integerValueOf(minOccurs);
				final /*@NonInvalid*/ int effectiveMaxOccurs = this.getEffectiveMaxOccurs();
				final /*@NonInvalid*/ IntegerValue BOXED_effectiveMaxOccurs = ValueUtil
						.integerValueOf(effectiveMaxOccurs);
				final /*@NonInvalid*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE
						.evaluate(executor, BOXED_minOccurs, BOXED_effectiveMaxOccurs).booleanValue();
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
	public boolean minver_nonNegative(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Element::minver_nonNegative";
		try {
			/**
			 *
			 * inv minver_nonNegative:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.minver.oclIsUndefined() implies self.minver >= 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.ELEMENT___MINVER_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Integer minver = this.getMinver();
					final /*@NonInvalid*/ boolean oclIsUndefined = minver == null;
					final /*@NonInvalid*/ Boolean not;
					if (!oclIsUndefined) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (oclIsUndefined) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					final /*@Thrown*/ Boolean result;
					if (not == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_ge;
						try {
							if (minver == null) {
								throw new InvalidValueException(
										"Null \'\'OclComparable\'\' rather than \'\'OclVoid\'\' value required");
							}
							final /*@Thrown*/ IntegerValue BOXED_minver_0 = ValueUtil.integerValueOf(minver);
							final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
									.evaluate(executor, BOXED_minver_0, EBMLTables.INT_0).booleanValue();
							CAUGHT_ge = ge;
						} catch (Exception e) {
							CAUGHT_ge = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_ge == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_ge instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_ge;
							}
							if (not == null) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, EBMLTables.INT_0)
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
	public boolean minOccurs_nonNegative(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Element::minOccurs_nonNegative";
		try {
			/**
			 *
			 * inv minOccurs_nonNegative:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.minOccurs >= 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.ELEMENT___MIN_OCCURS_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ int minOccurs = this.getMinOccurs();
				final /*@NonInvalid*/ IntegerValue BOXED_minOccurs = ValueUtil.integerValueOf(minOccurs);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE
						.evaluate(executor, BOXED_minOccurs, EBMLTables.INT_0).booleanValue();
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
	public boolean unknownSizeAllowed_notTrueIfRecursiveIsTrue(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Element::unknownSizeAllowed_notTrueIfRecursiveIsTrue";
		try {
			/**
			 *
			 * inv unknownSizeAllowed_notTrueIfRecursiveIsTrue:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.unknownSizeAllowed.oclIsUndefined() and self.unknownSizeAllowed = true implies
			 *         self.recursive.oclIsUndefined() or self.recursive = false
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.ELEMENT___UNKNOWN_SIZE_ALLOWED_NOT_TRUE_IF_RECURSIVE_IS_TRUE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and;
					try {
						final /*@NonInvalid*/ Boolean not = ValueUtil.TRUE_VALUE;
						final /*@Thrown*/ Boolean and;
						if (not == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ Boolean unknownSizeAllowed = this.getUnknownSizeAllowed();
							final /*@NonInvalid*/ boolean eq = unknownSizeAllowed;
							if (!eq) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								if (not == null) {
									and = null;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and = and;
					} catch (Exception e) {
						CAUGHT_and = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ Boolean or;
						final /*@NonInvalid*/ Boolean recursive = this.getRecursive();
						final /*@NonInvalid*/ boolean eq_0 = !recursive;
						or = eq_0;
						if (or == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and;
							}
							if ((CAUGHT_and == null) || (or == null)) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, EBMLTables.INT_0)
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
	public boolean recursive_notTrueIfUnknownSizeAllowedIsTrue(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Element::recursive_notTrueIfUnknownSizeAllowedIsTrue";
		try {
			/**
			 *
			 * inv recursive_notTrueIfUnknownSizeAllowedIsTrue:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.recursive.oclIsUndefined() and self.recursive = true implies
			 *         self.unknownSizeAllowed.oclIsUndefined() or self.unknownSizeAllowed = false
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.ELEMENT___RECURSIVE_NOT_TRUE_IF_UNKNOWN_SIZE_ALLOWED_IS_TRUE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and;
					try {
						final /*@NonInvalid*/ Boolean not = ValueUtil.TRUE_VALUE;
						final /*@Thrown*/ Boolean and;
						if (not == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ Boolean recursive = this.getRecursive();
							final /*@NonInvalid*/ boolean eq = recursive;
							if (!eq) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								if (not == null) {
									and = null;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and = and;
					} catch (Exception e) {
						CAUGHT_and = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ Boolean or;
						final /*@NonInvalid*/ Boolean unknownSizeAllowed = this.getUnknownSizeAllowed();
						final /*@NonInvalid*/ boolean eq_0 = !unknownSizeAllowed;
						or = eq_0;
						if (or == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and;
							}
							if ((CAUGHT_and == null) || (or == null)) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, EBMLTables.INT_0)
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
	public boolean maxver_nonNegative(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Element::maxver_nonNegative";
		try {
			/**
			 *
			 * inv maxver_nonNegative:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.maxver.oclIsUndefined() implies self.maxver >= 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.ELEMENT___MAXVER_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Integer maxver = this.getMaxver();
					final /*@NonInvalid*/ boolean oclIsUndefined = maxver == null;
					final /*@NonInvalid*/ Boolean not;
					if (!oclIsUndefined) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (oclIsUndefined) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					final /*@Thrown*/ Boolean result;
					if (not == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_ge;
						try {
							if (maxver == null) {
								throw new InvalidValueException(
										"Null \'\'OclComparable\'\' rather than \'\'OclVoid\'\' value required");
							}
							final /*@Thrown*/ IntegerValue BOXED_maxver_0 = ValueUtil.integerValueOf(maxver);
							final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
									.evaluate(executor, BOXED_maxver_0, EBMLTables.INT_0).booleanValue();
							CAUGHT_ge = ge;
						} catch (Exception e) {
							CAUGHT_ge = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_ge == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_ge instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_ge;
							}
							if (not == null) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, EBMLTables.INT_0)
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
	public boolean element_containedbyEBMLSchema(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Element::element_containedbyEBMLSchema";
		try {
			/**
			 *
			 * inv element_containedbyEBMLSchema:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.oclContainer()
			 *         .oclIsTypeOf(EBMLSchema)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.ELEMENT___ELEMENT_CONTAINEDBY_EBML_SCHEMA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_EBML_c_c_EBMLSchema = idResolver
							.getClass(EBMLTables.CLSSid_EBMLSchema, null);
					final /*@NonInvalid*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE
							.evaluate(executor, this);
					final /*@Thrown*/ boolean result = OclAnyOclIsTypeOfOperation.INSTANCE
							.evaluate(executor, oclContainer, TYP_EBML_c_c_EBMLSchema).booleanValue();
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, EBMLTables.INT_0)
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
	public boolean name_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Element::name_valid";
		try {
			/**
			 *
			 * inv name_valid:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.name.oclIsUndefined() implies
			 *         self.name.matches('^[A-Za-z0-9][A-Za-z0-9.-]*$')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.ELEMENT___NAME_VALID__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Boolean not = ValueUtil.TRUE_VALUE;
					final /*@Thrown*/ Boolean result;
					if (not == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ String name = this.getName();
						final /*@NonInvalid*/ boolean matches = StringMatchesOperation.INSTANCE
								.evaluate(executor, TypeId.BOOLEAN, name,
										EBMLTables.STR__94_91_A_m_Za_m_z0_m_9_93_91_A_m_Za_m_z0_m_9_m_93_a_$)
								.booleanValue();
						if (matches) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (not == null) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, EBMLTables.INT_0)
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
	public boolean maxOccurs_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Element::maxOccurs_valid";
		try {
			/**
			 *
			 * inv maxOccurs_valid:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.maxOccurs.matches('^(unbounded|0|[1-9][0-9]*)$')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.ELEMENT___MAX_OCCURS_VALID__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ String maxOccurs = this.getMaxOccurs();
					if (maxOccurs == null) {
						throw new InvalidValueException(
								"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
					}
					final /*@Thrown*/ boolean result = StringMatchesOperation.INSTANCE
							.evaluate(executor, TypeId.BOOLEAN, maxOccurs,
									EBMLTables.STR__94_o_unbounded_124_0_124_91_1_m_9_93_91_0_m_9_93_a_e_$)
							.booleanValue();
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, EBMLTables.INT_0)
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
	public boolean id_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Element::id_valid";
		try {
			/**
			 *
			 * inv id_valid:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.id.oclIsUndefined() implies
			 *         self.id.matches('^0x([0-9A-F][0-9A-F])+$')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.ELEMENT___ID_VALID__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Boolean not = ValueUtil.TRUE_VALUE;
					final /*@Thrown*/ Boolean result;
					if (not == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ String id = this.getId();
						final /*@NonInvalid*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor,
								TypeId.BOOLEAN, id, EBMLTables.STR__94_0x_o_91_0_m_9A_m_F_93_91_0_m_9A_m_F_93_e_p_$)
								.booleanValue();
						if (matches) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (not == null) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, EBMLTables.INT_0)
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
	public boolean type_onlyMasterCanBeRecursive(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Element::type_onlyMasterCanBeRecursive";
		try {
			/**
			 *
			 * inv type_onlyMasterCanBeRecursive:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.recursive = true implies self.type = ElementType::MASTER
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.ELEMENT___TYPE_ONLY_MASTER_CAN_BE_RECURSIVE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ Boolean recursive = this.getRecursive();
				final /*@NonInvalid*/ boolean eq = recursive;
				final /*@NonInvalid*/ Boolean result;
				if (!eq) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ ElementType type = this.getType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = EBMLTables.ENUMid_ElementType
							.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
					final /*@NonInvalid*/ boolean eq_0 = BOXED_type == EBMLTables.ELITid_MASTER;
					if (eq_0) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
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
	public boolean range_isAllowed(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Element::range_isAllowed";
		try {
			/**
			 *
			 * inv range_isAllowed:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.range.oclIsUndefined() implies
			 *         Set{ElementType::INTEGER, ElementType::UINTEGER, ElementType::FLOAT, ElementType::DATE
			 *         }
			 *         ->includes(self.type)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.ELEMENT___RANGE_IS_ALLOWED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ String range = this.getRange();
					final /*@NonInvalid*/ boolean oclIsUndefined = range == null;
					final /*@NonInvalid*/ Boolean not;
					if (!oclIsUndefined) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (oclIsUndefined) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					final /*@Thrown*/ Boolean result;
					if (not == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ ElementType type = this.getType();
						final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = EBMLTables.ENUMid_ElementType
								.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
						final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE
								.evaluate(EBMLTables.Set, BOXED_type).booleanValue();
						if (includes) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (not == null) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, EBMLTables.INT_0)
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
	public boolean recursive_ifTrueThenPathHasIsRecursivePart(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Element::recursive_ifTrueThenPathHasIsRecursivePart";
		try {
			/**
			 *
			 * inv recursive_ifTrueThenPathHasIsRecursivePart:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.recursive.oclIsUndefined() and self.recursive = true implies
			 *         not self.path.oclIsUndefined() and
			 *         let i : Integer[1] = self.path.lastIndexOf('\\')
			 *         in i > 0 and
			 *           self.path.size() > i + 1 and
			 *           self.path.at(i + 1) = '+'
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.ELEMENT___RECURSIVE_IF_TRUE_THEN_PATH_HAS_IS_RECURSIVE_PART__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and;
					try {
						final /*@NonInvalid*/ Boolean not = ValueUtil.TRUE_VALUE;
						final /*@Thrown*/ Boolean and;
						if (not == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ Boolean recursive = this.getRecursive();
							final /*@NonInvalid*/ boolean eq = recursive;
							if (!eq) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								if (not == null) {
									and = null;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and = and;
					} catch (Exception e) {
						CAUGHT_and = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_and_2;
						try {
							final /*@NonInvalid*/ Boolean not_0 = ValueUtil.TRUE_VALUE;
							final /*@Thrown*/ Boolean and_2;
							if (not_0 == ValueUtil.FALSE_VALUE) {
								and_2 = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_and_1;
								try {
									final /*@NonInvalid*/ String path = this.getPath();
									final /*@NonInvalid*/ IntegerValue i = StringLastIndexOfOperation.INSTANCE
											.evaluate(path, EBMLTables.STR__92);
									final /*@NonInvalid*/ IntegerValue sum = (IntegerValue) NumericPlusOperation.INSTANCE
											.evaluate(i, EBMLTables.INT_1);
									final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
											.evaluate(executor, i, EBMLTables.INT_0).booleanValue();
									final /*@NonInvalid*/ Boolean and_0;
									if (!gt) {
										and_0 = ValueUtil.FALSE_VALUE;
									} else {
										final /*@NonInvalid*/ IntegerValue size = StringSizeOperation.INSTANCE
												.evaluate(path);
										final /*@NonInvalid*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE
												.evaluate(executor, size, sum).booleanValue();
										if (!gt_0) {
											and_0 = ValueUtil.FALSE_VALUE;
										} else {
											and_0 = ValueUtil.TRUE_VALUE;
										}
									}
									final /*@Thrown*/ Boolean and_1;
									if (and_0 == ValueUtil.FALSE_VALUE) {
										and_1 = ValueUtil.FALSE_VALUE;
									} else {
										/*@Caught*/ Object CAUGHT_eq_0;
										try {
											final /*@Thrown*/ String at = StringAtOperation.INSTANCE.evaluate(path,
													sum);
											final /*@Thrown*/ boolean eq_0 = at.equals(EBMLTables.STR_sum);
											CAUGHT_eq_0 = eq_0;
										} catch (Exception e) {
											CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
										}
										if (CAUGHT_eq_0 == ValueUtil.FALSE_VALUE) {
											and_1 = ValueUtil.FALSE_VALUE;
										} else {
											if (CAUGHT_eq_0 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_eq_0;
											}
											if (and_0 == null) {
												and_1 = null;
											} else {
												and_1 = ValueUtil.TRUE_VALUE;
											}
										}
									}
									CAUGHT_and_1 = and_1;
								} catch (Exception e) {
									CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_and_1 == ValueUtil.FALSE_VALUE) {
									and_2 = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_and_1 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_and_1;
									}
									if ((not_0 == null) || (CAUGHT_and_1 == null)) {
										and_2 = null;
									} else {
										and_2 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and_2 = and_2;
						} catch (Exception e) {
							CAUGHT_and_2 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_and_2 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and;
							}
							if (CAUGHT_and_2 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and_2;
							}
							if ((CAUGHT_and == null) || (CAUGHT_and_2 == null)) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, EBMLTables.INT_0)
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
	public boolean maxver_greaterOrEqualToMinver(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Element::maxver_greaterOrEqualToMinver";
		try {
			/**
			 *
			 * inv maxver_greaterOrEqualToMinver:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = let
			 *           effectiveMaxver : Integer[?] = if self.maxver.oclIsUndefined()
			 *           then self.oclContainer().oclAsType(EBMLSchema).version
			 *           else self.maxver
			 *           endif
			 *         in
			 *           let
			 *             effectiveMinver : Integer[?] = if self.minver.oclIsUndefined()
			 *             then 1
			 *             else self.minver
			 *             endif
			 *           in effectiveMinver <= effectiveMaxver
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.ELEMENT___MAXVER_GREATER_OR_EQUAL_TO_MINVER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_le_0;
				try {
					final /*@NonInvalid*/ Integer maxver_0 = this.getMaxver();
					final /*@NonInvalid*/ boolean oclIsUndefined = maxver_0 == null;
					/*@Thrown*/ Integer effectiveMaxver;
					if (oclIsUndefined) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_EBML_c_c_EBMLSchema_0 = idResolver
								.getClass(EBMLTables.CLSSid_EBMLSchema, null);
						final /*@NonInvalid*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE
								.evaluate(executor, this);
						final /*@Thrown*/ EBMLSchema oclAsType = (EBMLSchema) OclAnyOclAsTypeOperation.INSTANCE
								.evaluate(executor, oclContainer, TYP_EBML_c_c_EBMLSchema_0);
						final /*@Thrown*/ int version = oclAsType.getVersion();
						effectiveMaxver = (Integer) version;
					} else {
						effectiveMaxver = maxver_0;
					}
					final /*@NonInvalid*/ Integer minver_0 = this.getMinver();
					final /*@NonInvalid*/ boolean oclIsUndefined_0 = minver_0 == null;
					/*@NonInvalid*/ IntegerValue effectiveMinver;
					if (oclIsUndefined_0) {
						effectiveMinver = EBMLTables.INT_1;
					} else {
						final /*@NonInvalid*/ IntegerValue BOXED_minver_0 = minver_0 == null ? null
								: ValueUtil.integerValueOf(minver_0);
						effectiveMinver = BOXED_minver_0;
					}
					if (effectiveMinver == null) {
						throw new InvalidValueException(
								"Null \'\'OclComparable\'\' rather than \'\'OclVoid\'\' value required");
					}
					if (effectiveMaxver == null) {
						throw new InvalidValueException(
								"Null \'\'OclSelf\'\' rather than \'\'OclVoid\'\' value required");
					}
					final /*@Thrown*/ IntegerValue BOXED_effectiveMaxver = ValueUtil.integerValueOf(effectiveMaxver);
					if (BOXED_effectiveMaxver instanceof InvalidValueException) {
						throw (InvalidValueException) BOXED_effectiveMaxver;
					}
					final /*@Thrown*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
							.evaluate(executor, effectiveMinver, BOXED_effectiveMaxver).booleanValue();
					CAUGHT_le_0 = le_0;
				} catch (Exception e) {
					CAUGHT_le_0 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_le_0, EBMLTables.INT_0)
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
	public boolean unknownSizeAllowed_isValid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Element::unknownSizeAllowed_isValid";
		try {
			/**
			 *
			 * inv unknownSizeAllowed_isValid:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = if
			 *           self.unknownSizeAllowed.oclIsUndefined() or self.unknownSizeAllowed = false
			 *         then true
			 *         else
			 *           let i : Integer[1] = self.path.lastIndexOf('\\')
			 *           in
			 *             if i = -1 or i = 1
			 *             then true
			 *             else
			 *               let parentPath : String[1] = self.path.substring(1, i - 1)
			 *               in
			 *                 Element.allInstances()
			 *                 ->exists(e | e.path = parentPath and e.unknownSizeAllowed = true)
			 *             endif
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.ELEMENT___UNKNOWN_SIZE_ALLOWED_IS_VALID__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Boolean or;
					final /*@NonInvalid*/ Boolean unknownSizeAllowed = this.getUnknownSizeAllowed();
					final /*@NonInvalid*/ boolean eq = !unknownSizeAllowed;
					or = eq;
					if (or == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean result;
					if (or) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ String path = this.getPath();
						final /*@NonInvalid*/ IntegerValue i = StringLastIndexOfOperation.INSTANCE.evaluate(path,
								EBMLTables.STR__92);
						final /*@NonInvalid*/ IntegerValue diff = (IntegerValue) NumericNegateOperation.INSTANCE
								.evaluate(EBMLTables.INT_1);
						final /*@NonInvalid*/ boolean eq_0 = i.equals(diff);
						final /*@NonInvalid*/ Boolean or_0;
						if (eq_0) {
							or_0 = ValueUtil.TRUE_VALUE;
						} else {
							final /*@NonInvalid*/ boolean eq_1 = i.equals(EBMLTables.INT_1);
							if (eq_1) {
								or_0 = ValueUtil.TRUE_VALUE;
							} else {
								or_0 = ValueUtil.FALSE_VALUE;
							}
						}
						if (or_0 == null) {
							throw new InvalidValueException("Null if condition");
						}
						/*@Thrown*/ Boolean IF_or_0;
						if (or_0) {
							IF_or_0 = ValueUtil.TRUE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_parentPath;
							try {
								final /*@NonInvalid*/ IntegerValue diff_0 = (IntegerValue) NumericMinusOperation.INSTANCE
										.evaluate(i, EBMLTables.INT_1);
								final /*@Thrown*/ String parentPath = StringSubstringOperation.INSTANCE.evaluate(path,
										EBMLTables.INT_1, diff_0);
								CAUGHT_parentPath = parentPath;
							} catch (Exception e) {
								CAUGHT_parentPath = ValueUtil.createInvalidValue(e);
							}
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_EBML_c_c_Element = idResolver
									.getClass(EBMLTables.CLSSid_Element, null);
							final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
									.evaluate(executor, EBMLTables.SET_CLSSid_Element, TYP_EBML_c_c_Element);
							/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
							Iterator<Object> ITERATOR_e_0 = allInstances.iterator();
							/*@Thrown*/ Boolean exists;
							while (true) {
								if (!ITERATOR_e_0.hasNext()) {
									if (accumulator == null) {
										exists = null;
									} else if (accumulator == ValueUtil.FALSE_VALUE) {
										exists = ValueUtil.FALSE_VALUE;
									} else {
										throw (InvalidValueException) accumulator;
									}
									break;
								}
								/*@NonInvalid*/ Element e_0 = (Element) ITERATOR_e_0.next();
								/**
								 * e.path = parentPath and e.unknownSizeAllowed = true
								 */
								/*@Caught*/ Object CAUGHT_and;
								try {
									/*@Caught*/ Object CAUGHT_eq_2;
									try {
										final /*@NonInvalid*/ String path_1 = e_0.getPath();
										if (CAUGHT_parentPath instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_parentPath;
										}
										final /*@Thrown*/ boolean eq_2 = path_1.equals(CAUGHT_parentPath);
										CAUGHT_eq_2 = eq_2;
									} catch (Exception e) {
										CAUGHT_eq_2 = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean and;
									if (CAUGHT_eq_2 == ValueUtil.FALSE_VALUE) {
										and = ValueUtil.FALSE_VALUE;
									} else {
										final /*@NonInvalid*/ Boolean unknownSizeAllowed_0 = e_0
												.getUnknownSizeAllowed();
										final /*@NonInvalid*/ boolean eq_3 = unknownSizeAllowed_0;
										if (!eq_3) {
											and = ValueUtil.FALSE_VALUE;
										} else {
											if (CAUGHT_eq_2 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_eq_2;
											}
											and = ValueUtil.TRUE_VALUE;
										}
									}
									CAUGHT_and = and;
								} catch (Exception e) {
									CAUGHT_and = ValueUtil.createInvalidValue(e);
								}
								//
								if (CAUGHT_and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
									exists = ValueUtil.TRUE_VALUE;
									break; // Stop immediately
								} else if (CAUGHT_and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
									; // Carry on
								} else if (CAUGHT_and == null) { // Abnormal null body evaluation result
									if (accumulator == ValueUtil.FALSE_VALUE) {
										accumulator = null; // Cache a null failure
									}
								} else if (CAUGHT_and instanceof InvalidValueException) { // Abnormal exception evaluation result
									accumulator = CAUGHT_and; // Cache an exception failure
								} else { // Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							IF_or_0 = exists;
						}
						result = IF_or_0;
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, EBMLTables.INT_0)
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
	public boolean type_masterMustNotDeclareDefaultValue(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Element::type_masterMustNotDeclareDefaultValue";
		try {
			/**
			 *
			 * inv type_masterMustNotDeclareDefaultValue:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.type = ElementType::MASTER implies
			 *         self.default.oclIsUndefined()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					EBMLPackage.Literals.ELEMENT___TYPE_MASTER_MUST_NOT_DECLARE_DEFAULT_VALUE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, EBMLTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ ElementType type = this.getType();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = EBMLTables.ENUMid_ElementType
						.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
				final /*@NonInvalid*/ boolean eq = BOXED_type == EBMLTables.ELITid_MASTER;
				final /*@NonInvalid*/ Boolean result;
				if (!eq) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ String default1 = this.getDefault();
					final /*@NonInvalid*/ boolean oclIsUndefined = default1 == null;
					if (oclIsUndefined) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
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
		case EBMLPackage.ELEMENT__DOCUMENTATION:
			return ((InternalEList<?>) getDocumentation()).basicRemove(otherEnd, msgs);
		case EBMLPackage.ELEMENT__IMPLEMENTATION_NOTE:
			return ((InternalEList<?>) getImplementationNote()).basicRemove(otherEnd, msgs);
		case EBMLPackage.ELEMENT__EXTENSION:
			return ((InternalEList<?>) getExtension()).basicRemove(otherEnd, msgs);
		case EBMLPackage.ELEMENT__RESTRICTION:
			return basicSetRestriction(null, msgs);
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
		case EBMLPackage.ELEMENT__NAME:
			return getName();
		case EBMLPackage.ELEMENT__PATH:
			return getPath();
		case EBMLPackage.ELEMENT__MIN_OCCURS:
			return getMinOccurs();
		case EBMLPackage.ELEMENT__MAX_OCCURS:
			return getMaxOccurs();
		case EBMLPackage.ELEMENT__MINVER:
			return getMinver();
		case EBMLPackage.ELEMENT__MAXVER:
			return getMaxver();
		case EBMLPackage.ELEMENT__DOCUMENTATION:
			return getDocumentation();
		case EBMLPackage.ELEMENT__IMPLEMENTATION_NOTE:
			return getImplementationNote();
		case EBMLPackage.ELEMENT__EXTENSION:
			return getExtension();
		case EBMLPackage.ELEMENT__ID:
			return getId();
		case EBMLPackage.ELEMENT__LENGTH:
			return getLength();
		case EBMLPackage.ELEMENT__RECURRING:
			return getRecurring();
		case EBMLPackage.ELEMENT__DEFAULT:
			return getDefault();
		case EBMLPackage.ELEMENT__RANGE:
			return getRange();
		case EBMLPackage.ELEMENT__UNKNOWN_SIZE_ALLOWED:
			return getUnknownSizeAllowed();
		case EBMLPackage.ELEMENT__RESTRICTION:
			return getRestriction();
		case EBMLPackage.ELEMENT__TYPE:
			return getType();
		case EBMLPackage.ELEMENT__RECURSIVE:
			return getRecursive();
		case EBMLPackage.ELEMENT__EFFECTIVE_MAX_OCCURS:
			return getEffectiveMaxOccurs();
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
		case EBMLPackage.ELEMENT__NAME:
			setName((String) newValue);
			return;
		case EBMLPackage.ELEMENT__PATH:
			setPath((String) newValue);
			return;
		case EBMLPackage.ELEMENT__MIN_OCCURS:
			setMinOccurs((Integer) newValue);
			return;
		case EBMLPackage.ELEMENT__MAX_OCCURS:
			setMaxOccurs((String) newValue);
			return;
		case EBMLPackage.ELEMENT__MINVER:
			setMinver((Integer) newValue);
			return;
		case EBMLPackage.ELEMENT__MAXVER:
			setMaxver((Integer) newValue);
			return;
		case EBMLPackage.ELEMENT__DOCUMENTATION:
			getDocumentation().clear();
			getDocumentation().addAll((Collection<? extends Documentation>) newValue);
			return;
		case EBMLPackage.ELEMENT__IMPLEMENTATION_NOTE:
			getImplementationNote().clear();
			getImplementationNote().addAll((Collection<? extends ImplementationNote>) newValue);
			return;
		case EBMLPackage.ELEMENT__EXTENSION:
			getExtension().clear();
			getExtension().addAll((Collection<? extends Extension>) newValue);
			return;
		case EBMLPackage.ELEMENT__ID:
			setId((String) newValue);
			return;
		case EBMLPackage.ELEMENT__LENGTH:
			setLength((String) newValue);
			return;
		case EBMLPackage.ELEMENT__RECURRING:
			setRecurring((Boolean) newValue);
			return;
		case EBMLPackage.ELEMENT__DEFAULT:
			setDefault((String) newValue);
			return;
		case EBMLPackage.ELEMENT__RANGE:
			setRange((String) newValue);
			return;
		case EBMLPackage.ELEMENT__UNKNOWN_SIZE_ALLOWED:
			setUnknownSizeAllowed((Boolean) newValue);
			return;
		case EBMLPackage.ELEMENT__RESTRICTION:
			setRestriction((Restriction) newValue);
			return;
		case EBMLPackage.ELEMENT__TYPE:
			setType((ElementType) newValue);
			return;
		case EBMLPackage.ELEMENT__RECURSIVE:
			setRecursive((Boolean) newValue);
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
		case EBMLPackage.ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EBMLPackage.ELEMENT__PATH:
			setPath(PATH_EDEFAULT);
			return;
		case EBMLPackage.ELEMENT__MIN_OCCURS:
			setMinOccurs(MIN_OCCURS_EDEFAULT);
			return;
		case EBMLPackage.ELEMENT__MAX_OCCURS:
			setMaxOccurs(MAX_OCCURS_EDEFAULT);
			return;
		case EBMLPackage.ELEMENT__MINVER:
			setMinver(MINVER_EDEFAULT);
			return;
		case EBMLPackage.ELEMENT__MAXVER:
			unsetMaxver();
			return;
		case EBMLPackage.ELEMENT__DOCUMENTATION:
			getDocumentation().clear();
			return;
		case EBMLPackage.ELEMENT__IMPLEMENTATION_NOTE:
			getImplementationNote().clear();
			return;
		case EBMLPackage.ELEMENT__EXTENSION:
			getExtension().clear();
			return;
		case EBMLPackage.ELEMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case EBMLPackage.ELEMENT__LENGTH:
			setLength(LENGTH_EDEFAULT);
			return;
		case EBMLPackage.ELEMENT__RECURRING:
			setRecurring(RECURRING_EDEFAULT);
			return;
		case EBMLPackage.ELEMENT__DEFAULT:
			setDefault(DEFAULT_EDEFAULT);
			return;
		case EBMLPackage.ELEMENT__RANGE:
			setRange(RANGE_EDEFAULT);
			return;
		case EBMLPackage.ELEMENT__UNKNOWN_SIZE_ALLOWED:
			setUnknownSizeAllowed(UNKNOWN_SIZE_ALLOWED_EDEFAULT);
			return;
		case EBMLPackage.ELEMENT__RESTRICTION:
			setRestriction((Restriction) null);
			return;
		case EBMLPackage.ELEMENT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case EBMLPackage.ELEMENT__RECURSIVE:
			setRecursive(RECURSIVE_EDEFAULT);
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
		case EBMLPackage.ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EBMLPackage.ELEMENT__PATH:
			return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		case EBMLPackage.ELEMENT__MIN_OCCURS:
			return minOccurs != MIN_OCCURS_EDEFAULT;
		case EBMLPackage.ELEMENT__MAX_OCCURS:
			return MAX_OCCURS_EDEFAULT == null ? maxOccurs != null : !MAX_OCCURS_EDEFAULT.equals(maxOccurs);
		case EBMLPackage.ELEMENT__MINVER:
			return MINVER_EDEFAULT == null ? minver != null : !MINVER_EDEFAULT.equals(minver);
		case EBMLPackage.ELEMENT__MAXVER:
			return isSetMaxver();
		case EBMLPackage.ELEMENT__DOCUMENTATION:
			return documentation != null && !documentation.isEmpty();
		case EBMLPackage.ELEMENT__IMPLEMENTATION_NOTE:
			return implementationNote != null && !implementationNote.isEmpty();
		case EBMLPackage.ELEMENT__EXTENSION:
			return extension != null && !extension.isEmpty();
		case EBMLPackage.ELEMENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case EBMLPackage.ELEMENT__LENGTH:
			return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
		case EBMLPackage.ELEMENT__RECURRING:
			return RECURRING_EDEFAULT == null ? recurring != null : !RECURRING_EDEFAULT.equals(recurring);
		case EBMLPackage.ELEMENT__DEFAULT:
			return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
		case EBMLPackage.ELEMENT__RANGE:
			return RANGE_EDEFAULT == null ? range != null : !RANGE_EDEFAULT.equals(range);
		case EBMLPackage.ELEMENT__UNKNOWN_SIZE_ALLOWED:
			return UNKNOWN_SIZE_ALLOWED_EDEFAULT == null ? unknownSizeAllowed != null
					: !UNKNOWN_SIZE_ALLOWED_EDEFAULT.equals(unknownSizeAllowed);
		case EBMLPackage.ELEMENT__RESTRICTION:
			return restriction != null;
		case EBMLPackage.ELEMENT__TYPE:
			return type != TYPE_EDEFAULT;
		case EBMLPackage.ELEMENT__RECURSIVE:
			return RECURSIVE_EDEFAULT == null ? recursive != null : !RECURSIVE_EDEFAULT.equals(recursive);
		case EBMLPackage.ELEMENT__EFFECTIVE_MAX_OCCURS:
			return getEffectiveMaxOccurs() != EFFECTIVE_MAX_OCCURS_EDEFAULT;
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
		case EBMLPackage.ELEMENT___MAXVER_GREATER_OR_EQUAL_TO_MINVER__DIAGNOSTICCHAIN_MAP:
			return maxver_greaterOrEqualToMinver((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case EBMLPackage.ELEMENT___MAX_OCCURS_VALID__DIAGNOSTICCHAIN_MAP:
			return maxOccurs_valid((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case EBMLPackage.ELEMENT___RANGE_IS_ALLOWED__DIAGNOSTICCHAIN_MAP:
			return range_isAllowed((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case EBMLPackage.ELEMENT___RECURSIVE_IF_TRUE_THEN_PATH_HAS_IS_RECURSIVE_PART__DIAGNOSTICCHAIN_MAP:
			return recursive_ifTrueThenPathHasIsRecursivePart((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case EBMLPackage.ELEMENT___MAX_OCCURS_GREATER_EQUAL_MIN_OCCURS__DIAGNOSTICCHAIN_MAP:
			return maxOccurs_greaterEqualMinOccurs((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case EBMLPackage.ELEMENT___PATH_IF_HAS_IS_RECURSIVE_PART_THEN_RECURSIVE_IS_TRUE__DIAGNOSTICCHAIN_MAP:
			return path_ifHasIsRecursivePartThenRecursiveIsTrue((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case EBMLPackage.ELEMENT___UNKNOWN_SIZE_ALLOWED_NOT_TRUE_IF_RECURSIVE_IS_TRUE__DIAGNOSTICCHAIN_MAP:
			return unknownSizeAllowed_notTrueIfRecursiveIsTrue((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case EBMLPackage.ELEMENT___TYPE_ONLY_MASTER_CAN_BE_RECURSIVE__DIAGNOSTICCHAIN_MAP:
			return type_onlyMasterCanBeRecursive((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case EBMLPackage.ELEMENT___MIN_OCCURS_DEFAULTLESS_WHEN_GREATER_THAN_ONE__DIAGNOSTICCHAIN_MAP:
			return minOccurs_defaultlessWhenGreaterThanOne((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case EBMLPackage.ELEMENT___MIN_OCCURS_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP:
			return minOccurs_nonNegative((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case EBMLPackage.ELEMENT___MAXVER_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP:
			return maxver_nonNegative((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case EBMLPackage.ELEMENT___ELEMENT_CONTAINEDBY_EBML_SCHEMA__DIAGNOSTICCHAIN_MAP:
			return element_containedbyEBMLSchema((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case EBMLPackage.ELEMENT___NAME_VALID__DIAGNOSTICCHAIN_MAP:
			return name_valid((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case EBMLPackage.ELEMENT___ID_VALID__DIAGNOSTICCHAIN_MAP:
			return id_valid((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case EBMLPackage.ELEMENT___RECURSIVE_NOT_TRUE_IF_UNKNOWN_SIZE_ALLOWED_IS_TRUE__DIAGNOSTICCHAIN_MAP:
			return recursive_notTrueIfUnknownSizeAllowedIsTrue((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case EBMLPackage.ELEMENT___TYPE_MASTER_MUST_NOT_DECLARE_DEFAULT_VALUE__DIAGNOSTICCHAIN_MAP:
			return type_masterMustNotDeclareDefaultValue((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case EBMLPackage.ELEMENT___MINVER_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP:
			return minver_nonNegative((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case EBMLPackage.ELEMENT___UNKNOWN_SIZE_ALLOWED_IS_VALID__DIAGNOSTICCHAIN_MAP:
			return unknownSizeAllowed_isValid((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
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
		result.append(" (name: ");
		result.append(name);
		result.append(", path: ");
		result.append(path);
		result.append(", minOccurs: ");
		result.append(minOccurs);
		result.append(", maxOccurs: ");
		result.append(maxOccurs);
		result.append(", minver: ");
		result.append(minver);
		result.append(", maxver: ");
		if (maxverESet)
			result.append(maxver);
		else
			result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", length: ");
		result.append(length);
		result.append(", recurring: ");
		result.append(recurring);
		result.append(", default: ");
		result.append(default_);
		result.append(", range: ");
		result.append(range);
		result.append(", unknownSizeAllowed: ");
		result.append(unknownSizeAllowed);
		result.append(", type: ");
		result.append(type);
		result.append(", recursive: ");
		result.append(recursive);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
