package com.x.processplatform.service.processing.factory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.x.processplatform.core.entity.content.Task;
import com.x.processplatform.core.entity.content.TaskStatic;
import com.x.processplatform.service.processing.AbstractFactory;
import com.x.processplatform.service.processing.Business;

public class TaskFactory extends AbstractFactory {

	public TaskFactory(Business business) throws Exception {
		super(business);
	}

	public List<String> listWithWork(String id) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Task.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Task> root = cq.from(Task.class);
		Predicate p = cb.equal(root.get(TaskStatic.work), id);
		cq.select(root.get(TaskStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<Task> listWithWorkObject(String id) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Task.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Task> cq = cb.createQuery(Task.class);
		Root<Task> root = cq.from(Task.class);
		Predicate p = cb.equal(root.get(TaskStatic.work), id);
		cq.select(root).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithJob(String job) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Task.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Task> root = cq.from(Task.class);
		Predicate p = cb.equal(root.get(TaskStatic.job), job);
		cq.select(root.get(TaskStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public Long countWithActivityToken(String activityToken) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Task.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Long> cq = cb.createQuery(Long.class);
		Root<Task> root = cq.from(Task.class);
		Predicate p = cb.equal(root.get(TaskStatic.activityToken), activityToken);
		cq.select(cb.count(root)).where(p);
		return em.createQuery(cq).getSingleResult();
	}

	public List<String> listWithActivityToken(String activityToken) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Task.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Task> root = cq.from(Task.class);
		Predicate p = cb.equal(root.get(TaskStatic.activityToken), activityToken);
		cq.select(root.get(TaskStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

}