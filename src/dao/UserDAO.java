package dao;

import model.User;

import org.hibernate.Session;


public class UserDAO {
	
	private static Session session = SessionFactory.createSession();

	
	public static void update(User user) {
		session.getTransaction().begin();
		session.update(user);
		session.getTransaction().commit();
		
	}

	public static User getUser(String email) {		
		return (User)session.load(User.class,email);		
	}
	
	

}
