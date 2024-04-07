package com.x.processplatform.service.processing.factory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.x.processplatform.core.entity.content.Review;
import com.x.processplatform.core.entity.content.ReviewStatic;
import com.x.processplatform.service.processing.AbstractFactory;
import com.x.processplatform.service.processing.Business;

public class ReviewFactory extends AbstractFactory {

	public ReviewFactory(Business business) throws Exception {
		super(business);
	}

	public List<String> listWithWork(String id) throws Exception { 
		EntityManager em = this.entityManagerContainer().get(Review.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Review> root = cq.from(Review.class);
		Predicate p = cb.equal(root.get(ReviewStatic.work), id);
		cq.select(root.get(ReviewStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithJob(String job) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Review.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Review> root = cq.from(Review.class);
		Predicate p = cb.equal(root.get(ReviewStatic.job), job);
		cq.select(root.get(ReviewStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public String getWithPersonWithJob(String person, String job) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Review.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Review> root = cq.from(Review.class);
		Predicate p = cb.equal(root.get(ReviewStatic.person), person);
		p = cb.and(p, cb.equal(root.get(ReviewStatic.job), job));
		cq.select(root.get(ReviewStatic.id)).where(p);
		List<String> list = em.createQuery(cq).setMaxResults(1).getResultList();
		return list.isEmpty() ? null : list.get(0);
	}

}