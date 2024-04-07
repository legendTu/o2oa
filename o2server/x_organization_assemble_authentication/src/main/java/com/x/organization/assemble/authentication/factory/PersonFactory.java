package com.x.organization.assemble.authentication.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;

import com.x.organization.assemble.authentication.AbstractFactory;
import com.x.organization.assemble.authentication.Business;
import com.x.organization.core.entity.PersistenceProperties;
import com.x.organization.core.entity.Person;
import com.x.organization.core.entity.PersonStatic;
import com.x.base.core.project.cache.Cache.CacheCategory;
import com.x.base.core.project.cache.Cache.CacheKey;
import com.x.base.core.project.cache.CacheManager;

public class PersonFactory extends AbstractFactory {

	private CacheCategory cache;

	public PersonFactory(Business business) throws Exception {
		super(business);
		this.cache = new CacheCategory(Person.class);
	}

	public Person pick(String flag) throws Exception {
		if (StringUtils.isEmpty(flag)) {
			return null;
		}
		Person o = null;
		CacheKey cacheKey = new CacheKey(flag);
		Optional<?> optional = CacheManager.get(cache, cacheKey);
		if (optional.isPresent()) {
			o = (Person) optional.get();
		} else {
			o = this.pickObject(flag);
			CacheManager.put(cache, cacheKey, o);
		}
		return o;
	}

	private Person pickObject(String flag) throws Exception {
		Person o = this.entityManagerContainer().flag(flag, Person.class);
		if (o != null) {
			this.entityManagerContainer().get(Person.class).detach(o);
		} else {
			String name = flag;
			Matcher matcher = PersistenceProperties.Person.distinguishedName_pattern.matcher(flag);
			if (matcher.find()) {
				name = matcher.group(1);
				String unique = matcher.group(2);
				o = this.entityManagerContainer().flag(unique, Person.class);
				if (null != o) {
					this.entityManagerContainer().get(Person.class).detach(o);
				}
			}
			if (null == o) {
				EntityManager em = this.entityManagerContainer().get(Person.class);
				CriteriaBuilder cb = em.getCriteriaBuilder();
				CriteriaQuery<Person> cq = cb.createQuery(Person.class);
				Root<Person> root = cq.from(Person.class);
				Predicate p = cb.equal(root.get(PersonStatic.name), name);
				List<Person> os = em.createQuery(cq.select(root).where(p)).getResultList();
				if (os.size() == 1) {
					o = os.get(0);
					em.detach(o);
				}
			}
		}
		return o;
	}

	public List<Person> pick(List<String> flags) throws Exception {
		List<Person> list = new ArrayList<>();
		for (String str : flags) {
			CacheKey cacheKey = new CacheKey(str);
			Optional<?> optional = CacheManager.get(cache, cacheKey);
			if (optional.isPresent()) {
				list.add((Person) optional.get());
			} else {
				Person o = this.pickObject(str);
				CacheManager.put(cache, cacheKey, o);
				if (null != o) {
					list.add(o);
				}
			}
		}
		return list;
	}

	public String getWithCredential(String credential) throws Exception {
		EntityManager em = this.entityManagerContainer().get(Person.class);
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<String> cq = cb.createQuery(String.class);
		Root<Person> root = cq.from(Person.class);
		Predicate p = cb.equal(root.get(PersonStatic.name), credential);
		p = cb.or(p, cb.equal(root.get(PersonStatic.distinguishedName), credential));
		p = cb.or(p, cb.equal(root.get(PersonStatic.unique), credential));
		p = cb.or(p, cb.equal(root.get(PersonStatic.id), credential));
		p = cb.or(p, cb.equal(root.get(PersonStatic.mail), credential));
		p = cb.or(p, cb.equal(root.get(PersonStatic.qq), credential));
		p = cb.or(p, cb.equal(root.get(PersonStatic.weixin), credential));
		p = cb.or(p, cb.equal(root.get(PersonStatic.mobile), credential));
		p = cb.or(p, cb.equal(root.get(PersonStatic.employee), credential));
		p = cb.or(p, cb.equal(root.get(PersonStatic.mpwxopenId), credential));
		p = cb.or(p, cb.equal(root.get(PersonStatic.open1Id), credential));
		p = cb.or(p, cb.equal(root.get(PersonStatic.open2Id), credential));
		p = cb.or(p, cb.equal(root.get(PersonStatic.open3Id), credential));
		p = cb.or(p, cb.equal(root.get(PersonStatic.open4Id), credential));
		p = cb.or(p, cb.equal(root.get(PersonStatic.open5Id), credential));
		cq.select(root.get(PersonStatic.id)).where(p);
		List<String> list = em.createQuery(cq).getResultList().stream().distinct().collect(Collectors.toList());
		if (list.size() == 1) {
			return list.get(0);
		}else if(list.size() > 1){
			String temp = "";
			for (int i = 0; i < list.size(); i++) {
				if(temp.equalsIgnoreCase("")) {
					temp = list.get(i);
				}else{
					temp = temp + "," + list.get(i);
				}
			}
		    return temp;
		}else {
			return null;
		}
	}
}