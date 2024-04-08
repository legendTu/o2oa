package com.x.processplatform.assemble.designer.element.factory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.x.processplatform.assemble.designer.AbstractFactory;
import com.x.processplatform.assemble.designer.Business;
import com.x.processplatform.core.entity.element.FormField;
import com.x.processplatform.core.entity.element.FormFieldStatic;

public class FormFieldFactory extends AbstractFactory {

	public FormFieldFactory(Business business) throws Exception {
		super(business);
	}

	public List<String> listWithApplication(String application) throws Exception {
		EntityManager em = this.entityManagerContainer().get(FormField.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<FormField> root = cq.from(FormField.class);
		Predicate p = cb.equal(root.get(FormFieldStatic.application), application);
		cq.select(root.get(FormFieldStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithForm(String form) throws Exception {
		EntityManager em = this.entityManagerContainer().get(FormField.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<FormField> root = cq.from(FormField.class);
		Predicate p = cb.equal(root.get(FormFieldStatic.form), form);
		cq.select(root.get(FormFieldStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<FormField> listWithFormObject(String formId) throws Exception {
		EntityManager em = this.entityManagerContainer().get(FormField.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<FormField> cq = cb.createQuery(FormField.class);
		Root<FormField> root = cq.from(FormField.class);
		Predicate p = cb.equal(root.get(FormFieldStatic.form), formId);
		cq.select(root).where(p);
		return em.createQuery(cq).getResultList();
	}

}