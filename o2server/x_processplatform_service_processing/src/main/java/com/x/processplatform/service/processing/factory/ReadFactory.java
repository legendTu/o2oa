package com.x.processplatform.service.processing.factory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.x.processplatform.core.entity.content.Read;
import com.x.processplatform.core.entity.content.ReadStatic;
import com.x.processplatform.service.processing.AbstractFactory;
import com.x.processplatform.service.processing.Business;

public class ReadFactory extends AbstractFactory {

	public ReadFactory(Business business) throws Exception {
		super(business);
	}

	public List<String> listWithWork(String id) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Read.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Read> root = cq.from(Read.class);
		Predicate p = cb.equal(root.get(ReadStatic.work), id);
		cq.select(root.get(ReadStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithJob(String job) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Read.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Read> root = cq.from(Read.class);
		Predicate p = cb.equal(root.get(ReadStatic.job), job);
		cq.select(root.get(ReadStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithPersonWithWork(String person, String work) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Read.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Read> root = cq.from(Read.class);
		Predicate p = cb.equal(root.get(ReadStatic.person), person);
		p = cb.and(p, cb.equal(root.get(ReadStatic.completed), false));
		p = cb.and(p, cb.equal(root.get(ReadStatic.work), work));
		cq.select(root.get(ReadStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithPersonWithWorkCompleted(String person, String workCompleted) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Read.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Read> root = cq.from(Read.class);
		Predicate p = cb.equal(root.get(ReadStatic.person), person);
		p = cb.and(p, cb.equal(root.get(ReadStatic.completed), true));
		p = cb.and(p, cb.equal(root.get(ReadStatic.workCompleted), workCompleted));
		cq.select(root.get(ReadStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithActivityToken(String activityToken) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Read.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Read> root = cq.from(Read.class);
		Predicate p = cb.equal(root.get(ReadStatic.activityToken), activityToken);
		cq.select(root.get(ReadStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}
}