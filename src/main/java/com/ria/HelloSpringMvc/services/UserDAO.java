package com.ria.HelloSpringMvc.services;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class UserDAO {
	
	Configuration cfg;
	SessionFactory sessionFactory;
	Session session;
	Transaction tx;
	
	public UserDAO() {
		// TODO Auto-generated constructor stub
		cfg = new Configuration();
		sessionFactory = cfg.configure().addAnnotatedClass(User.class).buildSessionFactory();
 	}
	public void insert(int id,String username,String password)
	{
		session = sessionFactory.openSession();
		tx =session.beginTransaction();
		User u = new User(id,username,password);
		session.save(u);
		tx.commit();
		session.close();
		this.closeFactory();
	}
	
	public List find(String user,String pass)
	{
		session = sessionFactory.openSession();
		tx =session.beginTransaction();
		Criteria c = session.createCriteria(User.class);
		c.add(Restrictions.eq("username", user));
		c.add(Restrictions.eq("password", pass));
		//User u = new User(username,password);
		//session.save(u);
		List l = c.list();
		tx.commit();
		session.close();
		this.closeFactory();
		return l;
	}
	public void closeFactory()
	{
		sessionFactory.close();
	}

}
