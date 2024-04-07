package com.x.file.assemble.control.factory;

import com.x.file.assemble.control.AbstractFactory;
import com.x.file.assemble.control.Business;
import com.x.file.core.entity.personal.Recycle;
import com.x.file.core.entity.personal.RecycleStatic;
import com.x.file.core.entity.personal.Share;
import com.x.file.core.entity.personal.ShareStatic;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class RecycleFactory extends AbstractFactory {

	public RecycleFactory(Business business) throws Exception {
		super(business);
	}

	public List<Recycle> listWithPerson(String person) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Recycle.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Recycle> cq = cb.createQuery(Recycle.class);
		Root<Recycle> root = cq.from(Recycle.class);
		Predicate p = cb.equal(root.get(RecycleStatic.person), person);
		return em.createQuery(cq.where(p)).getResultList();
	}

	public Recycle getByFileId(String fileId, String person) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Recycle.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Recycle> cq = cb.createQuery(Recycle.class);
		Root<Share> root = cq.from(Share.class);
		Predicate p = cb.equal(root.get(ShareStatic.person), person);
		p = cb.and(p, cb.equal(root.get(ShareStatic.fileId), fileId));
		List<Recycle> recycleList = em.createQuery(cq.where(p)).setMaxResults(1).getResultList();
		if(recycleList!=null && !recycleList.isEmpty()){
			return recycleList.get(0);
		}
		return null;
	}


}