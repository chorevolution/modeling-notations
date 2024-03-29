/**
 * Copyright 2015 The CHOReVOLUTION project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.chorevolution.modelingnotations.adapter.provider;

import eu.chorevolution.modelingnotations.adapter.util.AdapterAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AdapterItemProviderAdapterFactory extends AdapterAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.chorevolution.modelingnotations.adapter.AdapterModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdapterModelItemProvider adapterModelItemProvider;

	/**
	 * This creates an adapter for a {@link eu.chorevolution.modelingnotations.adapter.AdapterModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdapterModelAdapter() {
		if (adapterModelItemProvider == null) {
			adapterModelItemProvider = new AdapterModelItemProvider(this);
		}

		return adapterModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.chorevolution.modelingnotations.adapter.MessageRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageRelationItemProvider messageRelationItemProvider;

	/**
	 * This creates an adapter for a {@link eu.chorevolution.modelingnotations.adapter.MessageRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageRelationAdapter() {
		if (messageRelationItemProvider == null) {
			messageRelationItemProvider = new MessageRelationItemProvider(this);
		}

		return messageRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.chorevolution.modelingnotations.adapter.DataItemRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataItemRelationItemProvider dataItemRelationItemProvider;

	/**
	 * This creates an adapter for a {@link eu.chorevolution.modelingnotations.adapter.DataItemRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataItemRelationAdapter() {
		if (dataItemRelationItemProvider == null) {
			dataItemRelationItemProvider = new DataItemRelationItemProvider(this);
		}

		return dataItemRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.chorevolution.modelingnotations.adapter.ChoreographyMessage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoreographyMessageItemProvider choreographyMessageItemProvider;

	/**
	 * This creates an adapter for a {@link eu.chorevolution.modelingnotations.adapter.ChoreographyMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChoreographyMessageAdapter() {
		if (choreographyMessageItemProvider == null) {
			choreographyMessageItemProvider = new ChoreographyMessageItemProvider(this);
		}

		return choreographyMessageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.chorevolution.modelingnotations.adapter.Message} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageItemProvider messageItemProvider;

	/**
	 * This creates an adapter for a {@link eu.chorevolution.modelingnotations.adapter.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageAdapter() {
		if (messageItemProvider == null) {
			messageItemProvider = new MessageItemProvider(this);
		}

		return messageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.chorevolution.modelingnotations.adapter.ChoreographyComplexItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoreographyComplexItemItemProvider choreographyComplexItemItemProvider;

	/**
	 * This creates an adapter for a {@link eu.chorevolution.modelingnotations.adapter.ChoreographyComplexItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChoreographyComplexItemAdapter() {
		if (choreographyComplexItemItemProvider == null) {
			choreographyComplexItemItemProvider = new ChoreographyComplexItemItemProvider(this);
		}

		return choreographyComplexItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.chorevolution.modelingnotations.adapter.ChoreographySimpleItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoreographySimpleItemItemProvider choreographySimpleItemItemProvider;

	/**
	 * This creates an adapter for a {@link eu.chorevolution.modelingnotations.adapter.ChoreographySimpleItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChoreographySimpleItemAdapter() {
		if (choreographySimpleItemItemProvider == null) {
			choreographySimpleItemItemProvider = new ChoreographySimpleItemItemProvider(this);
		}

		return choreographySimpleItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.chorevolution.modelingnotations.adapter.ComplexItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexItemItemProvider complexItemItemProvider;

	/**
	 * This creates an adapter for a {@link eu.chorevolution.modelingnotations.adapter.ComplexItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComplexItemAdapter() {
		if (complexItemItemProvider == null) {
			complexItemItemProvider = new ComplexItemItemProvider(this);
		}

		return complexItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.chorevolution.modelingnotations.adapter.SimpleItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleItemItemProvider simpleItemItemProvider;

	/**
	 * This creates an adapter for a {@link eu.chorevolution.modelingnotations.adapter.SimpleItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleItemAdapter() {
		if (simpleItemItemProvider == null) {
			simpleItemItemProvider = new SimpleItemItemProvider(this);
		}

		return simpleItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.chorevolution.modelingnotations.adapter.StringEnumerationItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringEnumerationItemItemProvider stringEnumerationItemItemProvider;

	/**
	 * This creates an adapter for a {@link eu.chorevolution.modelingnotations.adapter.StringEnumerationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringEnumerationItemAdapter() {
		if (stringEnumerationItemItemProvider == null) {
			stringEnumerationItemItemProvider = new StringEnumerationItemItemProvider(this);
		}

		return stringEnumerationItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.chorevolution.modelingnotations.adapter.IntegerEnumerationItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerEnumerationItemItemProvider integerEnumerationItemItemProvider;

	/**
	 * This creates an adapter for a {@link eu.chorevolution.modelingnotations.adapter.IntegerEnumerationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerEnumerationItemAdapter() {
		if (integerEnumerationItemItemProvider == null) {
			integerEnumerationItemItemProvider = new IntegerEnumerationItemItemProvider(this);
		}

		return integerEnumerationItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.chorevolution.modelingnotations.adapter.EnumerationItemRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationItemRelationItemProvider enumerationItemRelationItemProvider;

	/**
	 * This creates an adapter for a {@link eu.chorevolution.modelingnotations.adapter.EnumerationItemRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationItemRelationAdapter() {
		if (enumerationItemRelationItemProvider == null) {
			enumerationItemRelationItemProvider = new EnumerationItemRelationItemProvider(this);
		}

		return enumerationItemRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.chorevolution.modelingnotations.adapter.ChoreographyTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoreographyTaskItemProvider choreographyTaskItemProvider;

	/**
	 * This creates an adapter for a {@link eu.chorevolution.modelingnotations.adapter.ChoreographyTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChoreographyTaskAdapter() {
		if (choreographyTaskItemProvider == null) {
			choreographyTaskItemProvider = new ChoreographyTaskItemProvider(this);
		}

		return choreographyTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.chorevolution.modelingnotations.adapter.Operation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationItemProvider operationItemProvider;

	/**
	 * This creates an adapter for a {@link eu.chorevolution.modelingnotations.adapter.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationAdapter() {
		if (operationItemProvider == null) {
			operationItemProvider = new OperationItemProvider(this);
		}

		return operationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.chorevolution.modelingnotations.adapter.OperationRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationRelationItemProvider operationRelationItemProvider;

	/**
	 * This creates an adapter for a {@link eu.chorevolution.modelingnotations.adapter.OperationRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationRelationAdapter() {
		if (operationRelationItemProvider == null) {
			operationRelationItemProvider = new OperationRelationItemProvider(this);
		}

		return operationRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.chorevolution.modelingnotations.adapter.DoubleEnumerationItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleEnumerationItemItemProvider doubleEnumerationItemItemProvider;

	/**
	 * This creates an adapter for a {@link eu.chorevolution.modelingnotations.adapter.DoubleEnumerationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDoubleEnumerationItemAdapter() {
		if (doubleEnumerationItemItemProvider == null) {
			doubleEnumerationItemItemProvider = new DoubleEnumerationItemItemProvider(this);
		}

		return doubleEnumerationItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.chorevolution.modelingnotations.adapter.DateEnumerationItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateEnumerationItemItemProvider dateEnumerationItemItemProvider;

	/**
	 * This creates an adapter for a {@link eu.chorevolution.modelingnotations.adapter.DateEnumerationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDateEnumerationItemAdapter() {
		if (dateEnumerationItemItemProvider == null) {
			dateEnumerationItemItemProvider = new DateEnumerationItemItemProvider(this);
		}

		return dateEnumerationItemItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (adapterModelItemProvider != null) adapterModelItemProvider.dispose();
		if (messageRelationItemProvider != null) messageRelationItemProvider.dispose();
		if (dataItemRelationItemProvider != null) dataItemRelationItemProvider.dispose();
		if (choreographyMessageItemProvider != null) choreographyMessageItemProvider.dispose();
		if (messageItemProvider != null) messageItemProvider.dispose();
		if (choreographyComplexItemItemProvider != null) choreographyComplexItemItemProvider.dispose();
		if (choreographySimpleItemItemProvider != null) choreographySimpleItemItemProvider.dispose();
		if (complexItemItemProvider != null) complexItemItemProvider.dispose();
		if (simpleItemItemProvider != null) simpleItemItemProvider.dispose();
		if (stringEnumerationItemItemProvider != null) stringEnumerationItemItemProvider.dispose();
		if (integerEnumerationItemItemProvider != null) integerEnumerationItemItemProvider.dispose();
		if (enumerationItemRelationItemProvider != null) enumerationItemRelationItemProvider.dispose();
		if (choreographyTaskItemProvider != null) choreographyTaskItemProvider.dispose();
		if (operationItemProvider != null) operationItemProvider.dispose();
		if (operationRelationItemProvider != null) operationRelationItemProvider.dispose();
		if (doubleEnumerationItemItemProvider != null) doubleEnumerationItemItemProvider.dispose();
		if (dateEnumerationItemItemProvider != null) dateEnumerationItemItemProvider.dispose();
	}

}
