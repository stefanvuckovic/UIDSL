package com.stefanvuckovic.domainmodel.scoping;

import com.google.common.collect.Iterables;
import com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CustomIndex {
  @Inject
  private ResourceDescriptionsProvider rdp;
  
  @Inject
  private IContainer.Manager cm;
  
  @Inject
  private IResourceServiceProvider resourceServiceProvider;
  
  public Map<String, IEObjectDescription> getVisibleConceptsDescriptionsFromOtherFiles(final EObject o) {
    Map<String, IEObjectDescription> _xblockexpression = null;
    {
      final Set<IEObjectDescription> conceptsSet = this.getSetOfVisibleConceptsDescriptionsFromOtherFiles(o);
      final Function1<IEObjectDescription, String> _function = (IEObjectDescription it) -> {
        return this.getConceptNameFromEObjectDescription(it);
      };
      _xblockexpression = IterableExtensions.<String, IEObjectDescription>toMap(conceptsSet, _function);
    }
    return _xblockexpression;
  }
  
  public List<IEObjectDescription> getListOfVisibleConceptsDescriptionsFromOtherFiles(final EObject o) {
    List<IEObjectDescription> _xblockexpression = null;
    {
      final Set<IEObjectDescription> conceptsSet = this.getSetOfVisibleConceptsDescriptionsFromOtherFiles(o);
      _xblockexpression = IterableExtensions.<IEObjectDescription>toList(conceptsSet);
    }
    return _xblockexpression;
  }
  
  public Set<IEObjectDescription> getSetOfVisibleConceptsDescriptionsFromOtherFiles(final EObject o) {
    Set<IEObjectDescription> _xblockexpression = null;
    {
      final Iterable<IEObjectDescription> allVisibleConcepts = this.getVisibleConceptsDescriptions(o);
      final Iterable<IEObjectDescription> allExportedClasses = this.getExportedConceptsEObjectDescriptions(o);
      final Set<IEObjectDescription> difference = IterableExtensions.<IEObjectDescription>toSet(allVisibleConcepts);
      Set<IEObjectDescription> _set = IterableExtensions.<IEObjectDescription>toSet(allExportedClasses);
      difference.removeAll(_set);
      _xblockexpression = difference;
    }
    return _xblockexpression;
  }
  
  public String getConceptNameFromEObjectDescription(final IEObjectDescription desc) {
    QualifiedName _name = desc.getName();
    return _name.toString();
  }
  
  public Iterable<IEObjectDescription> getVisibleConceptsDescriptions(final EObject o) {
    EClass _concept = DomainModelPackage.eINSTANCE.getConcept();
    return this.getVisibleEObjectDescriptions(o, _concept);
  }
  
  public Iterable<IEObjectDescription> getVisibleEObjectDescriptions(final EObject o, final EClass cl) {
    List<IContainer> _visibleContainers = this.getVisibleContainers(o);
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = (IContainer c) -> {
      Iterable<IResourceDescription> _resourceDescriptions = c.getResourceDescriptions();
      final Function1<IResourceDescription, Iterable<IEObjectDescription>> _function_1 = (IResourceDescription r) -> {
        Iterable<IEObjectDescription> _xifexpression = null;
        URI _uRI = r.getURI();
        boolean _canHandle = this.resourceServiceProvider.canHandle(_uRI);
        if (_canHandle) {
          _xifexpression = r.getExportedObjectsByType(cl);
        } else {
          _xifexpression = CollectionLiterals.<IEObjectDescription>newArrayList();
        }
        return _xifexpression;
      };
      Iterable<Iterable<IEObjectDescription>> _map = IterableExtensions.<IResourceDescription, Iterable<IEObjectDescription>>map(_resourceDescriptions, _function_1);
      return Iterables.<IEObjectDescription>concat(_map);
    };
    List<Iterable<IEObjectDescription>> _map = ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(_visibleContainers, _function);
    return Iterables.<IEObjectDescription>concat(_map);
  }
  
  public List<IContainer> getVisibleContainers(final EObject o) {
    List<IContainer> _xblockexpression = null;
    {
      Resource _eResource = o.eResource();
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(_eResource);
      Resource _eResource_1 = o.eResource();
      URI _uRI = _eResource_1.getURI();
      final IResourceDescription rd = index.getResourceDescription(_uRI);
      _xblockexpression = this.cm.getVisibleContainers(rd, index);
    }
    return _xblockexpression;
  }
  
  public IResourceDescription getResourceDescription(final EObject o) {
    IResourceDescription _xblockexpression = null;
    {
      Resource _eResource = o.eResource();
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(_eResource);
      Resource _eResource_1 = o.eResource();
      URI _uRI = _eResource_1.getURI();
      _xblockexpression = index.getResourceDescription(_uRI);
    }
    return _xblockexpression;
  }
  
  public Iterable<IEObjectDescription> getExportedEObjectDescriptions(final EObject o) {
    IResourceDescription _resourceDescription = this.getResourceDescription(o);
    return _resourceDescription.getExportedObjects();
  }
  
  public Iterable<IEObjectDescription> getExportedConceptsEObjectDescriptions(final EObject o) {
    IResourceDescription _resourceDescription = this.getResourceDescription(o);
    EClass _concept = DomainModelPackage.eINSTANCE.getConcept();
    return _resourceDescription.getExportedObjectsByType(_concept);
  }
}
