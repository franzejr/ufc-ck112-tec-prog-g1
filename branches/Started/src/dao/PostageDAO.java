package dao;

import java.util.ArrayList;
import java.util.List;

import model.Postage;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

public class PostageDAO {
	
	public static Session session = HiberManager.createSession();
	
	
	public static void save(Postage post){
		session.getTransaction().begin();
		session.save(post);
		session.getTransaction().commit();		
	}
	
	public static Postage get(long id){
		session.getTransaction().begin();
		Postage post = (Postage)session.load(Postage.class,id);
		session.getTransaction().commit();
		return post;
	}
	
	/*
	 * Use it for search not using primary keys.
	 * @param :whereArguments - put there arguments in like a 'where' from a SQL Query.
	 * 	eg: "subject = 'teste'".
	 * @returns : the ArrayList object containing copies from the database objects.(Remember
	 * 	to update those after modyfing).
	 *   
	 */
	
	
	public static ArrayList<Postage> get(String whereArguments){
		ArrayList<Postage> posts = new ArrayList<Postage>();
		SQLQuery query = session.createSQLQuery("SELECT * FROM postage WHERE ?");
		query.setString(0, whereArguments);
		List l = query.list();
		posts.addAll(l);
		
		return posts;
		
		
		
	}
	
	 
	
	
	

}
