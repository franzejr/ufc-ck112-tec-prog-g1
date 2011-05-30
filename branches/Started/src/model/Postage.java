package model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Postage {
	
	/*
	 * Id used in Database;
	 */
	@Id @GeneratedValue
	private long id;
	/*
	 * User that made the postage;
	 */
	private User poster;

	/*
	 * Body of the file.Formating in html.
	 */
	private String postBody;
	/*
	 * References(wikipedia,books,etc) used to make the postage.Pay atention in view that
	 * this must be links.
	 */
	private ArrayList<String> references;
	/*
	 * What about the postage is.
	 */	
	private String subject;	
	
	
	/*
	 * Single builder of the class.
	 */
	public Postage(User poster, String postBody, ArrayList<String> references,
			String subject) {
		super();
		this.poster = poster;
		this.postBody = postBody;
		this.references = references;
		this.subject = subject;
	}
	
	

	public String getPostBody() {
		return postBody;
	}
	
	public void setPostBody(String postBody) {
		this.postBody = postBody;
	}	
	/*
	 * Return Object because Java is a bitch.
	 * 
	 */
	public Object[] getReferences(){
		return references.toArray();
	}
	
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public long getId() {
		return id;
	}
	
	public User getPoster() {
		return poster;
	}
	
		
	public void removeReference(String reference) {
		this.references.remove(reference);
	}
	
	public void updateReference(String oldReference,String newReference){
		int index = 0;
		for(String reference:references){
			if(reference.equals(oldReference)){
					references.set(index,newReference);
					break;
			}
			index++;
		}
	}
	
	public void addReference(String reference) {
		this.references.add(reference);
	}
	
	
	
	
	
	

}
