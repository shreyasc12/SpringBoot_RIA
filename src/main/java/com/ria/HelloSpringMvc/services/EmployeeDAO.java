package com.ria.HelloSpringMvc.services;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class EmployeeDAO {
	Configuration cfg;
	SessionFactory sessionFactory;
	Session session;
	Transaction tx;
	
	public EmployeeDAO() {
		cfg = new Configuration();
		sessionFactory = cfg.configure().addAnnotatedClass(Employee.class).buildSessionFactory();
 	}
	public void insert(int id,String name,Address address,int salary)
	{
		session = sessionFactory.openSession();
		tx =session.beginTransaction();
		Employee e = new Employee(id,name,address,salary);
		session.save(e);
		tx.commit();
		session.close();
		this.closeFactory();
	}
	public List showData(String userid)
	{
		session = sessionFactory.openSession();
		tx =session.beginTransaction();
		Criteria c = session.createCriteria(Employee.class);
		c.add(Restrictions.eq("name", userid));
		
		//User u = new User(username,password);
		//session.save(u);
		List l = c.list();
		this.closeFactory();
		return l;
	}
	public void closeFactory()
	{
		sessionFactory.close();
	}
	/*
	 * public List printrows() { session = sessionFactory.openSession(); tx
	 * =session.beginTransaction();
	 * 
	 * Criteria c = session.createCriteria(Student.class); //Criteria c2 =
	 * session.createCriteria(Student.class); c.add(Restrictions.lt("marks", 100));
	 * //c.add(Restrictions.eq("s_name", "shreyas")); List l = c.list();
	 * //System.out.println(l); tx.commit(); session.close(); this.closeFactory();
	 * return l; }
	 */
	

}
