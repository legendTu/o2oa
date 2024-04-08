package com.x.processplatform.assemble.surface.factory.element;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.x.processplatform.assemble.surface.Business;
import com.x.processplatform.core.entity.element.Application;
import com.x.processplatform.core.entity.element.ApplicationDict;
import com.x.processplatform.core.entity.element.ApplicationDictStatic;

public class ApplicationDictFactory extends ElementFactory {

	public ApplicationDictFactory(Business abstractBusiness) throws Exception {
		super(abstractBusiness);
	}

	public List<String> listWithApplication(Application application) throws Exception {
		EntityManager em = this.entityManagerContainer().get(ApplicationDict.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<ApplicationDict> root = cq.from(ApplicationDict.class);
		Predicate p = cb.equal(root.get(ApplicationDictStatic.application), application.getId());
		cq.select(root.get(ApplicationDictStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public String getWithApplicationWithUniqueName(String application, String uniqueName) throws Exception {
		EntityManager em = this.entityManagerContainer().get(ApplicationDict.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<ApplicationDict> root = cq.from(ApplicationDict.class);
		Predicate p = cb.equal(root.get(ApplicationDictStatic.name), uniqueName);
		p = cb.or(p, cb.equal(root.get(ApplicationDictStatic.alias), uniqueName));
		p = cb.or(p, cb.equal(root.get(ApplicationDictStatic.id), uniqueName));
		p = cb.and(p, cb.equal(root.get(ApplicationDictStatic.application), application));
		cq.select(root.get(ApplicationDictStatic.id)).where(p);
		List<String> list = em.createQuery(cq).setMaxResults(1).getResultList();
		return list.isEmpty() ? null : list.get(0);
	}
}