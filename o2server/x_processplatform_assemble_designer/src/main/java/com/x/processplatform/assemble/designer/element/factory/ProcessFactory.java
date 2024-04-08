package com.x.processplatform.assemble.designer.element.factory;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;

import com.x.base.core.project.tools.ListTools;
import com.x.processplatform.assemble.designer.AbstractFactory;
import com.x.processplatform.assemble.designer.Business;
import com.x.processplatform.core.entity.element.Process;
import com.x.processplatform.core.entity.element.ProcessStatic;
import org.apache.commons.lang3.StringUtils;

public class ProcessFactory extends AbstractFactory {

	public ProcessFactory(Business business) throws Exception {
		super(business);
	}

	public List<String> listWithApplication(String application) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Process.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Process> root = cq.from(Process.class);
		Predicate p = cb.equal(root.get(ProcessStatic.application), application);
		p = cb.and(p, cb.or(cb.isTrue(root.get(ProcessStatic.editionEnable)), cb.isNull(root.get(ProcessStatic.editionEnable))));
		cq.select(root.get(ProcessStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithApplications(List<String> applications) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Process.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Process> root = cq.from(Process.class);
		Predicate p = cb.conjunction();
		if(ListTools.isNotEmpty(applications)) {
			p = cb.isMember(root.get(ProcessStatic.application), cb.literal(applications));
		}
		cq.select(root.get(ProcessStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<Process> listWithApplicationObject(String application) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Process.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Process> cq = cb.createQuery(Process.class);
		Root<Process> root = cq.from(Process.class);
		Predicate p = cb.equal(root.get(ProcessStatic.application), application);
		p = cb.and(p, cb.or(cb.isTrue(root.get(ProcessStatic.editionEnable)), cb.isNull(root.get(ProcessStatic.editionEnable))));
		cq.select(root).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listProcessEdition(String application, String edition) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Process.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Process> root = cq.from(Process.class);
		Predicate p = cb.equal(root.get(ProcessStatic.application), application);
		p = cb.and(p, cb.equal(root.get(ProcessStatic.edition), edition));
		cq.select(root.get(ProcessStatic.id)).where(p).orderBy(cb.desc(root.get(ProcessStatic.editionNumber)));
		return em.createQuery(cq).getResultList();
	}

	public List<Process> listProcessEditionObject(String application, String edition) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Process.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Process> cq = cb.createQuery(Process.class);
		Root<Process> root = cq.from(Process.class);
		Predicate p = cb.equal(root.get(ProcessStatic.application), application);
		p = cb.and(p, cb.equal(root.get(ProcessStatic.edition), edition));
		cq.select(root).where(p).orderBy(cb.desc(root.get(ProcessStatic.editionNumber)));
		return em.createQuery(cq).getResultList();
	}

	public List<String> listProcessDisableEdition(String application) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Process.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Process> root = cq.from(Process.class);
		Predicate p = cb.equal(root.get(ProcessStatic.application), application);
		p = cb.and(p, cb.isNotNull(root.get(ProcessStatic.edition)));
		p = cb.and(p, cb.notEqual(root.get(ProcessStatic.edition), ""));
		Subquery<Process> subquery = cq.subquery(Process.class);
		Root<Process> subRoot = subquery.from(Process.class);
		Predicate subP = cb.conjunction();
		subP = cb.and(subP, cb.equal(root.get(ProcessStatic.edition), subRoot.get(ProcessStatic.edition)));
		subP = cb.and(subP, cb.isTrue(subRoot.get(ProcessStatic.editionEnable)));
		subquery.select(subRoot).where(subP);
		p = cb.and(p, cb.not(cb.exists(subquery)));
		cq.select(root.get(ProcessStatic.edition)).where(p);
		return em.createQuery(cq).getResultList().stream().distinct().collect(Collectors.toList());
	}

	public Process getEnabledProcess(String application, String edition) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Process.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Process> cq = cb.createQuery(Process.class);
		Root<Process> root = cq.from(Process.class);
		Predicate p = cb.equal(root.get(ProcessStatic.application), application);
		p = cb.and(p, cb.equal(root.get(ProcessStatic.edition), edition));
		p = cb.and(p, cb.isTrue(root.get(ProcessStatic.editionEnable)));
		cq.select(root).where(p).orderBy(cb.desc(root.get(ProcessStatic.editionNumber)));
		List<Process> list = em.createQuery(cq).getResultList();
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

	public <T extends Process> List<T> sort(List<T> list) {
		list = list.stream().sorted(Comparator.comparing(Process::getName, Comparator.nullsLast(String::compareTo)))
				.collect(Collectors.toList());
		return list;
	}

	public Double getMaxEditionNumber(String application, String edition) throws Exception {
		if (StringUtils.isNotEmpty(edition)) {
			EntityManager em = this.entityManagerContainer().get(Process.class);
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Double> cq = cb.createQuery(Double.class);
			Root<Process> root = cq.from(Process.class);
			Predicate p = cb.equal(root.get(ProcessStatic.application), application);
			p = cb.and(p, cb.equal(root.get(ProcessStatic.edition), edition));
			cq.select(cb.max(root.get(ProcessStatic.editionNumber))).where(p);
			Double max = em.createQuery(cq).getSingleResult();
			if (max == null || max < 1.0) {
				max = 1.0;
			}
			return max;
		}
		return 1.0;
	}

}
