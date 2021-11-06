//Display Product Details of 105

package com.abc.hiberapp3.main;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.abc.hiberapp3.Pro;

public class GetParticularProduct {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("/com/abc/hiberapp3/cfgs/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		CriteriaBuilder builder=session.getCriteriaBuilder();
		CriteriaQuery<Pro> criteriaQuery=builder.createQuery(Pro.class);
		Root<Pro> root=criteriaQuery.from(Pro.class);
		criteriaQuery.select(root).where(builder.equal(root.get("id"), 105));
		
		Query<Pro> query=session.createQuery(criteriaQuery);
		List<Pro> proList=query.getResultList();
		
		for(Pro p:proList) {
			System.out.println(p);
		}
		
		session.close();
		factory.close();
	}

}
