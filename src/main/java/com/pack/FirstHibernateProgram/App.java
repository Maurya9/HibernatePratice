package com.pack.FirstHibernateProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        Configuration con =new Configuration();
        con.configure();
        SessionFactory ss=con.buildSessionFactory();
        College clg =new College();
        clg.setId(104);
        clg.setName("guru");
        clg.setCity("parlok");
        
        
        Addresses dd=new Addresses();
       dd.setAddid(2);
       dd.setCity("mumbai");
       dd.setState("pune");
       dd.setAddDate(new Date());
        FileInputStream ff=new FileInputStream("src/main/java/Chrysanthemum.jpg");
        byte[] data=new byte[ff.available()];
        ff.read(data);
        dd.setImage(data);
        Session session=ss.openSession();
        Transaction tr=session.beginTransaction();
        session.save(clg);
        session.save(dd);
        tr.commit();
        session.close();
    }
}
