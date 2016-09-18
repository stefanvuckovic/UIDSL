/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.dto.validation;

import com.stefanvuckovic.domainmodel.domainModel.Concept;
import com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage;
import com.stefanvuckovic.dto.dTO.DTOModel;
import com.stefanvuckovic.dto.scoping.CustomIndex;
import com.stefanvuckovic.dto.validation.AbstractDTOValidator;
import java.util.Map;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class DTOValidator extends AbstractDTOValidator {
  @Inject
  @Extension
  private CustomIndex _customIndex;
  
  @Check(CheckType.NORMAL)
  public void checUniqueConceptNameInDifferentFiles(final DTOModel model) {
    final Map<String, IEObjectDescription> otherFilesConcepts = this._customIndex.getVisibleConceptsDescriptionsFromOtherFiles(model);
    EList<Concept> _concepts = model.getConcepts();
    for (final Concept c : _concepts) {
      {
        final String conceptName = c.getName();
        boolean _containsKey = otherFilesConcepts.containsKey(conceptName);
        if (_containsKey) {
          String _name = c.getName();
          String _plus = ("Concept with name " + _name);
          String _plus_1 = (_plus + " is already defined");
          EAttribute _concept_Name = DomainModelPackage.eINSTANCE.getConcept_Name();
          this.error(_plus_1, c, _concept_Name);
        }
      }
    }
  }
}