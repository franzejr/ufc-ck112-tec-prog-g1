package dao;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SessionFactory {
	
	
	public static Session createSession(){
		return new Configuration().configure().buildSessionFactory().openSession();		
	}
	
	
	

}
