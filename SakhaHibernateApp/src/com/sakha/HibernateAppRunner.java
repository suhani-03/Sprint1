package com.sakha;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class HibernateAppRunner {
	
	public static void main(String args[]) {
		
		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Trainee.class).buildSessionFactory();
		
		
//		Laptop lap1 = new Laptop(2, "dell");
//		Laptop lap2 = new Laptop(3, "HP");
//		 
//	    Trainee tr = new Trainee(107, "Aash", 26);
//	    Trainee tre = new Trainee(108, "Mahi", 30);
	    	   
//      tr.setLaptop(Arrays.asList("lenovo","acer"));
		
//		List<Laptop> laptop = Arrays.asList(new Laptop(1, "dell"), new Laptop(2, "hp"));
//		tr.getLaptop().add(lap1);
//		tre.getLaptop().add(lap2);
		
		Session ssn = sf.openSession();
//		query.setParameter("age", maxAge);
		
//		List tList = query.getResultList();
		
//		Criteria cr = ssn.createCriteria(Trainee.class);
//		Criterion ct = Restrictions.gt("tAge", 21);
//		cr.add(ct);
//		ProjectionList pList = Projections.projectionList();
//		pList.add(Projections.property("tName"));
//		pList.add(Projections.property("tAge"));
//		cr.setProjection(pList);
		
//		TypedQuery query = ssn.getNamedQuery("byName");
//		query.setParameter("name", "Ella");
		Transaction tx = ssn.beginTransaction();
		Trainee tr = ssn.get(Trainee.class, 1);
		ssn.close();
		ssn = sf.openSession();
		Transaction tt = ssn.beginTransaction();
		Trainee tr1 = ssn.get(Trainee.class, 1);
//		Trainee tr = (Trainee) query.getSingleResult();
//		System.out.println(tr);
//		Query query = ssn.createQuery("Update Trainee set tName=:name where tId=:id ");
//		Query query = ssn.createQuery("delete from Trainee where tId=101");
//		query.setParameter("name", "Raj");
//		query.setParameter("id", 101);
//		int i = query.executeUpdate();
//		System.out.println(i);
//		List<Trainee> tr = cr.list();
//		for(Trainee t:tr) {
//			System.out.println(t);
//		}
//		List<Trainee> tr = query.getResultList();
//		Trainee tr1 = ssn.get(Trainee.class, 101);
//		Laptop lp1 = ssn.get(Laptop.class, 1);
//
//		ssn.save(lap1);
//		ssn.save(lap2);
//		ssn.save(tr);
//		ssn.save(tre);
		
//		tr.forEach(obj->System.out.println(obj));
		
//		tx.commit();
		sf.close();

//		for(Object t:tr) {
//			Object[] trs=(Object[])t;
//			System.out.println("Name = "+trs[0]+"Age = "+trs[1]);
//		}
	}}

