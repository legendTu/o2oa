package com.x.attendance.assemble.control.factory;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.x.attendance.assemble.control.AbstractFactory;
import com.x.attendance.assemble.control.Business;
import com.x.attendance.entity.AttendanceStatisticalCycle;
import com.x.attendance.entity.AttendanceStatisticalCycleStatic;
import com.x.base.core.project.exception.ExceptionWhen;
/**
 * 系统配置信息表基础功能服务类
 */
public class AttendanceStatisticalCycleFactory extends AbstractFactory {
	
	public AttendanceStatisticalCycleFactory(Business business) throws Exception {
		super(business);
	}

	//@MethodDescribe("获取指定Id的AttendanceStatisticalCycle信息对象")
	public AttendanceStatisticalCycle get( String id ) throws Exception {
		return this.entityManagerContainer().find(id, AttendanceStatisticalCycle.class, ExceptionWhen.none);
	}
	
	//@MethodDescribe("列示全部的AttendanceStatisticalCycle信息列表")
	@SuppressWarnings("unused")
	public List<AttendanceStatisticalCycle> listAll() throws Exception {
		EntityManager em = this.entityManagerContainer().get(AttendanceStatisticalCycle.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<AttendanceStatisticalCycle> cq = cb.createQuery( AttendanceStatisticalCycle.class );
		Root<AttendanceStatisticalCycle> root = cq.from( AttendanceStatisticalCycle.class);
		return em.createQuery(cq).getResultList();
	}
	
	//@MethodDescribe("列示指定Id的AttendanceStatisticalCycle信息列表")
	public List<AttendanceStatisticalCycle> list(List<String> ids) throws Exception {
		if( ids == null || ids.size() == 0 ){
			return new ArrayList<AttendanceStatisticalCycle>();
		}
		EntityManager em = this.entityManagerContainer().get(AttendanceStatisticalCycle.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<AttendanceStatisticalCycle> cq = cb.createQuery(AttendanceStatisticalCycle.class);
		Root<AttendanceStatisticalCycle> root = cq.from(AttendanceStatisticalCycle.class);
		Predicate p = root.get(AttendanceStatisticalCycleStatic.id).in(ids);
		return em.createQuery(cq.where(p)).getResultList();
	}
	
	//@MethodDescribe("根据参数列示AttendanceStatisticalCycle信息列表")
	public List<String> listByParameter( String topUnitName, String organizatinName, String cycleYear, String cycleMonth ) throws Exception{
		EntityManager em = this.entityManagerContainer().get(AttendanceStatisticalCycle.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<AttendanceStatisticalCycle> root = cq.from(AttendanceStatisticalCycle.class);
		Predicate p = cb.equal( root.get( AttendanceStatisticalCycleStatic.cycleYear), cycleYear);
		if( topUnitName != null ){ 
			 p = cb.and( p, cb.equal( root.get( AttendanceStatisticalCycleStatic.topUnitName), topUnitName));
		}
		if( organizatinName != null ){ 
			 p = cb.and( p, cb.equal( root.get( AttendanceStatisticalCycleStatic.unitName), organizatinName));
		}
		if( cycleMonth != null ){ 
			 p = cb.and( p, cb.equal( root.get( AttendanceStatisticalCycleStatic.cycleMonth), cycleMonth));
		}
		cq.select(root.get(AttendanceStatisticalCycleStatic.id));
		return em.createQuery(cq.where(p)).getResultList();
	}
}