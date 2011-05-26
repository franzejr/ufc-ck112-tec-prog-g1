package dao;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;


public class SessionFactory {	
	
	
	public static Session createSession(){
		return new AnnotationConfiguration().configure().buildSessionFactory().openSession();		
	}
	
	
	

}
