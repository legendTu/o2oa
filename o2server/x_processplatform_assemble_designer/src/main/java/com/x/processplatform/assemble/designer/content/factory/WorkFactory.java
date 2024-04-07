package com.x.processplatform.assemble.designer.content.factory;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.x.processplatform.assemble.designer.AbstractFactory;
import com.x.processplatform.assemble.designer.Business;
import com.x.processplatform.core.entity.content.Work;
import com.x.processplatform.core.entity.content.WorkStatic;

public class WorkFactory extends AbstractFactory {

	public WorkFactory(Business business) throws Exception {
		super(business);
	}

	public List<String> listWithApplication(String id) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Work.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Work> root = cq.from(Work.class);
		Predicate p = cb.equal(root.get(WorkStatic.application), id);
		cq.select(root.get(WorkStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithProcess(String id) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Work.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Work> root = cq.from(Work.class);
		Predicate p = cb.equal(root.get(WorkStatic.process), id);
		cq.select(root.get(WorkStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listJobWithApplication(String applicationId) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Work.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Work> root = cq.from(Work.class);
		Predicate p = cb.equal(root.get(WorkStatic.application), applicationId);
		return em.createQuery(cq.select(root.get(WorkStatic.job)).where(p)).getResultList().stream().distinct()
				.collect(Collectors.toList());
	}

	public List<String> listJobWithProcess(String processId) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Work.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Work> root = cq.from(Work.class);
		Predicate p = cb.equal(root.get(WorkStatic.process), processId);
		return em.createQuery(cq.select(root.get(WorkStatic.job)).where(p)).getResultList().stream().distinct()
				.collect(Collectors.toList());
	}
}
