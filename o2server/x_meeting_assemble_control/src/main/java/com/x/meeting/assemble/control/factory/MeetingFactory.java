package com.x.meeting.assemble.control.factory;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.x.meeting.assemble.control.AbstractFactory;
import com.x.meeting.assemble.control.Business;
import com.x.meeting.core.entity.ConfirmStatus;
import com.x.meeting.core.entity.Meeting;
import com.x.meeting.core.entity.MeetingStatic;

public class MeetingFactory extends AbstractFactory {

	public MeetingFactory(Business business) throws Exception {
		super(business);
	}

	public List<String> listWithRoom(String roomId) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Meeting.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Meeting> root = cq.from(Meeting.class);
		Predicate p = cb.equal(root.get(MeetingStatic.room), roomId);
		cq.select(root.get(MeetingStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithAppliedWait(String person) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Meeting.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Meeting> root = cq.from(Meeting.class);
		Predicate p = cb.equal(root.get(MeetingStatic.applicant), person);
		p = cb.and(p, cb.notEqual(root.get(MeetingStatic.manualCompleted), true));
		p = cb.and(p, cb.greaterThan(root.get(MeetingStatic.startTime), new Date()));
		cq.select(root.get(MeetingStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithAppliedProcessing(String person) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Meeting.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Meeting> root = cq.from(Meeting.class);
		Date date = new Date();
		Predicate p = cb.equal(root.get(MeetingStatic.applicant), person);
		p = cb.and(p, cb.notEqual(root.get(MeetingStatic.manualCompleted), true));
		p = cb.and(p, cb.lessThanOrEqualTo(root.get(MeetingStatic.startTime), date));
		p = cb.and(p, cb.greaterThanOrEqualTo(root.get(MeetingStatic.completedTime), date));
		cq.select(root.get(MeetingStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithAppliedCompleted(String person) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Meeting.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Meeting> root = cq.from(Meeting.class);
		Predicate p = cb.equal(root.get(MeetingStatic.applicant), person);
		p = cb.and(p, cb.or(cb.lessThan(root.get(MeetingStatic.completedTime), new Date()),
				cb.equal(root.get(MeetingStatic.manualCompleted), true)));
		cq.select(root.get(MeetingStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithInvitedWait(String person) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Meeting.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Meeting> root = cq.from(Meeting.class);
		Predicate p = cb.isMember(person, root.get(MeetingStatic.invitePersonList));
		p = cb.and(p, cb.notEqual(root.get(MeetingStatic.manualCompleted), true));
		p = cb.and(p, cb.greaterThan(root.get(MeetingStatic.startTime), new Date()));
		cq.select(root.get(MeetingStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithInvitedProcessing(String person) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Meeting.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Meeting> root = cq.from(Meeting.class);
		Date date = new Date();
		Predicate p = cb.isMember(person, root.get(MeetingStatic.invitePersonList));
		p = cb.and(p, cb.notEqual(root.get(MeetingStatic.manualCompleted), true));
		p = cb.and(p, cb.lessThanOrEqualTo(root.get(MeetingStatic.startTime), date));
		p = cb.and(p, cb.greaterThanOrEqualTo(root.get(MeetingStatic.completedTime), date));
		cq.select(root.get(MeetingStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithInvitedCompleted(String person) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Meeting.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Meeting> root = cq.from(Meeting.class);
		Predicate p = cb.isMember(person, root.get(MeetingStatic.invitePersonList));
		p = cb.and(p, cb.or(cb.lessThan(root.get(MeetingStatic.completedTime), new Date()),
				cb.equal(root.get(MeetingStatic.manualCompleted), true)));
		cq.select(root.get(MeetingStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithInvitedRejected(String person) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Meeting.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Meeting> root = cq.from(Meeting.class);
		Predicate p = cb.isMember(person, root.get(MeetingStatic.invitePersonList));
		p = cb.and(p, cb.isMember(person, root.get(MeetingStatic.rejectPersonList)));
		p = cb.and(p, cb.lessThan(root.get(MeetingStatic.completedTime), new Date()));
		cq.select(root.get(MeetingStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithPersonWaitAccept(String person) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Meeting.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Meeting> root = cq.from(Meeting.class);
		Predicate p = cb.greaterThanOrEqualTo(root.get(MeetingStatic.completedTime), new Date());
		p = cb.and(p, cb.notEqual(root.get(MeetingStatic.manualCompleted), true));
		p = cb.and(p, cb.isMember(person, root.get(MeetingStatic.invitePersonList)));
		p = cb.and(p, cb.isNotMember(person, root.get(MeetingStatic.acceptPersonList)));
		p = cb.and(p, cb.isNotMember(person, root.get(MeetingStatic.rejectPersonList)));
		cq.select(root.get(MeetingStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWaitConfirm() throws Exception {
		EntityManager em = this.entityManagerContainer().get(Meeting.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Meeting> root = cq.from(Meeting.class);
		Predicate p = cb.greaterThanOrEqualTo(root.get(MeetingStatic.completedTime), new Date());
		p = cb.and(p, cb.equal(root.get(MeetingStatic.confirmStatus), ConfirmStatus.wait));
		cq.select(root.get(MeetingStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithPersonWaitConfirm(String person) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Meeting.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Meeting> root = cq.from(Meeting.class);
		Predicate p = cb.greaterThanOrEqualTo(root.get(MeetingStatic.completedTime), new Date());
		p = cb.and(p, cb.equal(root.get(MeetingStatic.confirmStatus), ConfirmStatus.wait));
		p = cb.and(p,
				cb.or(cb.equal(root.get(MeetingStatic.applicant), person), cb.equal(root.get(MeetingStatic.auditor), person),
						cb.isMember(person, root.get(MeetingStatic.invitePersonList))));
		cq.select(root.get(MeetingStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithDate(Date start, Date end) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Meeting.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Meeting> root = cq.from(Meeting.class);
		//Predicate p = cb.greaterThanOrEqualTo(root.get(Meeting_.startTime), start);
		//p = cb.and(p, cb.lessThanOrEqualTo(root.get(Meeting_.startTime), end));
		Predicate p = cb.greaterThanOrEqualTo(root.get(MeetingStatic.completedTime), start);
		p = cb.and(p, cb.lessThanOrEqualTo(root.get(MeetingStatic.completedTime), end));
		cq.select(root.get(MeetingStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}
	
	public List<String> listWithDateAndRoom(Date start, Date end,String roomId) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Meeting.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Meeting> root = cq.from(Meeting.class);
		//Predicate p = cb.greaterThanOrEqualTo(root.get(Meeting_.startTime), start);
		//p = cb.and(p, cb.lessThanOrEqualTo(root.get(Meeting_.startTime), end));
		Predicate p = cb.greaterThanOrEqualTo(root.get(MeetingStatic.completedTime), start);
		p = cb.and(p, cb.lessThanOrEqualTo(root.get(MeetingStatic.completedTime), end));
		p = cb.and(p, cb.equal(root.get(MeetingStatic.room), roomId));
		
		cq.select(root.get(MeetingStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listWithPersonWithDate(String person, Date start, Date end) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Meeting.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Meeting> root = cq.from(Meeting.class);
		//Predicate p = cb.greaterThanOrEqualTo(root.get(Meeting_.startTime), start);
		//p = cb.and(p, cb.lessThanOrEqualTo(root.get(Meeting_.startTime), end));
		Predicate p = cb.greaterThanOrEqualTo(root.get(MeetingStatic.completedTime), start);
		p = cb.and(p, cb.lessThanOrEqualTo(root.get(MeetingStatic.completedTime), end));
		p = cb.and(p,
				cb.or(cb.equal(root.get(MeetingStatic.applicant), person), cb.equal(root.get(MeetingStatic.auditor), person),
						cb.isMember(person, root.get(MeetingStatic.invitePersonList))));
		p = cb.and(p, cb.equal(root.get(MeetingStatic.manualCompleted), false));
		cq.select(root.get(MeetingStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	public List<String> listFutureWithRoom(String roomId, boolean allowOnly) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Meeting.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Meeting> root = cq.from(Meeting.class);
		//Predicate p = cb.greaterThanOrEqualTo(root.get(Meeting_.startTime), new Date());
		Predicate p = cb.greaterThanOrEqualTo(root.get(MeetingStatic.completedTime), new Date());
		p = cb.and(p, cb.equal(root.get(MeetingStatic.room), roomId));
		p = cb.and(p, cb.equal(root.get(MeetingStatic.manualCompleted), false));
		if (allowOnly) {
			p = cb.and(p, cb.equal(root.get(MeetingStatic.confirmStatus), ConfirmStatus.allow));
		}
		cq.select(root.get(MeetingStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

//	@MethodDescribe("列示所有首字母开始的Building.")
	public List<String> listPinyinInitial(String key) throws Exception {
		String str = key.replaceAll("_", "\\\\_");
		str = str.replaceAll("%", "\\\\%");
		str = str.toLowerCase();
		EntityManager em = this.entityManagerContainer().get(Meeting.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Meeting> root = cq.from(Meeting.class);
		Predicate p = cb.like(root.get(MeetingStatic.pinyinInitial), str + "%", '\\');
		cq.select(root.get(MeetingStatic.id)).where(p);
		return em.createQuery(cq).getResultList();
	}

	//@MethodDescribe("进行模糊查询.")
	public List<String> listLike(String key) throws Exception {
		String str = key.replaceAll("_", "\\\\_");
		str = str.replaceAll("%", "\\\\%");
		str = str.toLowerCase();
		EntityManager em = this.entityManagerContainer().get(Meeting.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Meeting> root = cq.from(Meeting.class);
		Predicate p = cb.like(root.get(MeetingStatic.subject), "%" + str + "%", '\\');
		p = cb.or(p, cb.like(root.get(MeetingStatic.pinyin), str + "%", '\\'));
		p = cb.or(p, cb.like(root.get(MeetingStatic.pinyinInitial), str + "%", '\\'));
		cq.select(root.get(MeetingStatic.id)).where(p);
		return em.createQuery(cq).setMaxResults(200).getResultList();
	}

	//@MethodDescribe("根据拼音进行模糊查询.")
	public List<String> listLikePinyin(String key) throws Exception {
		String str = key.replaceAll("_", "\\\\_");
		str = str.replaceAll("%", "\\\\%");
		str = str.toLowerCase();
		EntityManager em = this.entityManagerContainer().get(Meeting.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Meeting> root = cq.from(Meeting.class);
		Predicate p = cb.like(root.get(MeetingStatic.pinyin), str + "%");
		p = cb.or(p, cb.like(root.get(MeetingStatic.pinyinInitial), str + "%"));
		cq.select(root.get(MeetingStatic.id)).where(p);
		return em.createQuery(cq).setMaxResults(200).getResultList();
	}

}