/**
 */
package dk.ingi.EBML.provider;

import dk.ingi.EBML.EBMLFactory;
import dk.ingi.EBML.EBMLPackage;
import dk.ingi.EBML.Element;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dk.ingi.EBML.Element} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addPathPropertyDescriptor(object);
			addMinOccursPropertyDescriptor(object);
			addMaxOccursPropertyDescriptor(object);
			addMinverPropertyDescriptor(object);
			addMaxverPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addLengthPropertyDescriptor(object);
			addRecurringPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
			addRangePropertyDescriptor(object);
			addUnknownSizeAllowedPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addRecursivePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Element_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Element_name_feature", "_UI_Element_type"),
						EBMLPackage.Literals.ELEMENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Element_path_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Element_path_feature", "_UI_Element_type"),
						EBMLPackage.Literals.ELEMENT__PATH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Min Occurs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinOccursPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Element_minOccurs_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Element_minOccurs_feature",
								"_UI_Element_type"),
						EBMLPackage.Literals.ELEMENT__MIN_OCCURS, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Occurs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxOccursPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Element_maxOccurs_feature"),
						getString("_UI_Element_maxOccurs_description"), EBMLPackage.Literals.ELEMENT__MAX_OCCURS, true,
						false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Minver feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinverPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Element_minver_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Element_minver_feature",
								"_UI_Element_type"),
						EBMLPackage.Literals.ELEMENT__MINVER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Maxver feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxverPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Element_maxver_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Element_maxver_feature",
								"_UI_Element_type"),
						EBMLPackage.Literals.ELEMENT__MAXVER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Element_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Element_id_feature", "_UI_Element_type"),
						EBMLPackage.Literals.ELEMENT__ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Element_length_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Element_length_feature",
								"_UI_Element_type"),
						EBMLPackage.Literals.ELEMENT__LENGTH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Recurring feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecurringPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Element_recurring_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Element_recurring_feature",
								"_UI_Element_type"),
						EBMLPackage.Literals.ELEMENT__RECURRING, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Element_default_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Element_default_feature",
								"_UI_Element_type"),
						EBMLPackage.Literals.ELEMENT__DEFAULT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Range feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Element_range_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Element_range_feature",
								"_UI_Element_type"),
						EBMLPackage.Literals.ELEMENT__RANGE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Unknown Size Allowed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnknownSizeAllowedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Element_unknownSizeAllowed_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Element_unknownSizeAllowed_feature",
								"_UI_Element_type"),
						EBMLPackage.Literals.ELEMENT__UNKNOWN_SIZE_ALLOWED, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Element_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Element_type_feature", "_UI_Element_type"),
						EBMLPackage.Literals.ELEMENT__TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Recursive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecursivePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Element_recursive_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Element_recursive_feature",
								"_UI_Element_type"),
						EBMLPackage.Literals.ELEMENT__RECURSIVE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EBMLPackage.Literals.ELEMENT__DOCUMENTATION);
			childrenFeatures.add(EBMLPackage.Literals.ELEMENT__IMPLEMENTATION_NOTE);
			childrenFeatures.add(EBMLPackage.Literals.ELEMENT__EXTENSION);
			childrenFeatures.add(EBMLPackage.Literals.ELEMENT__RESTRICTION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Element.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Element"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Element) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Element_type")
				: getString("_UI_Element_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Element.class)) {
		case EBMLPackage.ELEMENT__NAME:
		case EBMLPackage.ELEMENT__PATH:
		case EBMLPackage.ELEMENT__MIN_OCCURS:
		case EBMLPackage.ELEMENT__MAX_OCCURS:
		case EBMLPackage.ELEMENT__MINVER:
		case EBMLPackage.ELEMENT__MAXVER:
		case EBMLPackage.ELEMENT__ID:
		case EBMLPackage.ELEMENT__LENGTH:
		case EBMLPackage.ELEMENT__RECURRING:
		case EBMLPackage.ELEMENT__DEFAULT:
		case EBMLPackage.ELEMENT__RANGE:
		case EBMLPackage.ELEMENT__UNKNOWN_SIZE_ALLOWED:
		case EBMLPackage.ELEMENT__TYPE:
		case EBMLPackage.ELEMENT__RECURSIVE:
		case EBMLPackage.ELEMENT__EFFECTIVE_MAX_OCCURS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case EBMLPackage.ELEMENT__DOCUMENTATION:
		case EBMLPackage.ELEMENT__IMPLEMENTATION_NOTE:
		case EBMLPackage.ELEMENT__EXTENSION:
		case EBMLPackage.ELEMENT__RESTRICTION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(EBMLPackage.Literals.ELEMENT__DOCUMENTATION,
				EBMLFactory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add(createChildParameter(EBMLPackage.Literals.ELEMENT__IMPLEMENTATION_NOTE,
				EBMLFactory.eINSTANCE.createImplementationNote()));

		newChildDescriptors.add(
				createChildParameter(EBMLPackage.Literals.ELEMENT__EXTENSION, EBMLFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add(createChildParameter(EBMLPackage.Literals.ELEMENT__RESTRICTION,
				EBMLFactory.eINSTANCE.createRestriction()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EBMLEditPlugin.INSTANCE;
	}

}
