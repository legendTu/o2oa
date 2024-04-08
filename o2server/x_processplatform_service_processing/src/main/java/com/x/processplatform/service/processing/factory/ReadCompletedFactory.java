package com.x.processplatform.service.processing.factory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.x.processplatform.core.entity.content.ReadCompleted;
import com.x.processplatform.core.entity.content.ReadCompletedStatic;
import com.x.processplatform.service.processing.AbstractFactory;
import com.x.processplatform.service.processing.Business;

public class ReadCompletedFactory extends AbstractFactory {

	public ReadCompletedFactory(Business business) throws Exception {
		super(business);
	}

	public List<String> listWithWork(String id) throws Exception {
		EntityManager em = this.entityManagerContainer().get(ReadCompleted.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<ReadCompleted> root = cq.from(ReadCompleted.class);
		Predicate p = cb.equal(root.get(ReadCompletedStatic.work), id);
		cq.select(root.get(ReadCompletedStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithJob(String job) throws Exception {
		EntityManager em = this.entityManagerContainer().get(ReadCompleted.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<ReadCompleted> root = cq.from(ReadCompleted.class);
		Predicate p = cb.equal(root.get(ReadCompletedStatic.job), job);
		cq.select(root.get(ReadCompletedStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}
	
	public List<String> listWithActivityToken(String activityToken) throws Exception {
		EntityManager em = this.entityManagerContainer().get(ReadCompleted.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<ReadCompleted> root = cq.from(ReadCompleted.class);
		Predicate p = cb.equal(root.get(ReadCompletedStatic.activityToken), activityToken);
		cq.select(root.get(ReadCompletedStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

}