package com.pack.FirstHibernateProgram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetchrecord {
	public static void main(String[] args) {
		 Configuration con =new Configuration();
	        con.configure();
	        SessionFactory ss=con.buildSessionFactory();
	        Session session=ss.openSession();
	        College clg=session.get(College.class, 104);
	        System.out.println(clg);
	        Addresses add=session.get(Addresses.class, 2);
	       System.out.println(add.getCity());
	       
	       Addresses add1=session.load(Addresses.class, 2);
	       System.out.println(add1.getCity());
	        session.close();
	}

}
