package dao;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;


public class HiberManager {	
	
	
	public static Session createSession(){
		return new AnnotationConfiguration().configure().buildSessionFactory().openSession();		
	}
	
	
	
	
	

}
