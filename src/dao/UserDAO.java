package dao;

import model.User;

import org.hibernate.Session;


public class UserDAO {
	
	private static Session session = HiberManager.createSession();
	
	
	public static void save(User user){
		session.getTransaction().begin();
		session.save(user);
		session.getTransaction().commit();
	}
	
	public static void remove(User user){
		session.getTransaction().begin();
		session.delete(user);
		session.getTransaction().commit();
	}


	
	public static void update(User user) {
		session.getTransaction().begin();
		session.update(user);
		session.getTransaction().commit();
		
	}

	public static User getUser(String email) {	
		session.getTransaction().begin();
		User user = (User)session.load(User.class,email);
		session.getTransaction().commit();
		return user;
	}
	public static User getUser(long id) {	
		session.getTransaction().begin();
		User user = (User)session.load(User.class,id);
		session.getTransaction().commit();
		return user;
	}
	
	

}
