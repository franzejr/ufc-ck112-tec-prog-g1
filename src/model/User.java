package model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.NotNull;

import dao.UserDAO;



@Entity
public class User {
	@Id @GeneratedValue
	private long id;
	@Id
	private String cpf;
	@NotNull
	private String name;
	@Id
	private String email;
	@NotNull
	private String password;
	private String aboutYou;
	//get from a .properties(talk to Franzé).
	private String country;
	private String learningInstitution;
	private ArrayList<User> followers;
	private ArrayList<User> following;
	
	
	
		
	public User(String cpf,String name,String email,String password){
		this.setCpf(cpf);
		this.setName(name);
		this.setEmail(email);
		this.setPassword(password);
	}
	
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		for(char c : cpf.toCharArray()){
			if(!Character.isDigit(c)){
				throw new IllegalArgumentException("CPF only accept digits.");				
				}
		}
		if(cpf.length()!=11){
			throw new IllegalArgumentException("CPF must contain 11 digits.");
		}				
		this.cpf = cpf;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		if(!email.contains("@")){
			throw new IllegalArgumentException("Invalid e-mail");
		}
		if(email.isEmpty()){
			throw new IllegalArgumentException("E-mail cannot be empty");
		}
		this.email = email;
	}
	public String getAboutYou() {
		return aboutYou;
	}
	
	public void setAboutYou(String aboutYou) {
		this.aboutYou = aboutYou;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getLearningInstitution() {
		return learningInstitution;
	}
	public void setLearningInstitution(String learningInstitution) {
		this.learningInstitution = learningInstitution;
	}
	
	public String getPassword() {		
		return password;
	}
	public void setPassword(String password) {
		if(password.length()<6){
			throw new IllegalArgumentException("Password must have at least 6 characters");
		}
		this.password = password;
	}
	public long getId() {
		return id;
	}
	
	public Object[] getFollowers(){
		return followers.toArray();		
	}
	
	public Object[] getFollowing(){
		return following.toArray();
		
	}
	
	
	
	public void follow(User user){
		this.following.add(user);
		UserDAO.update(user);
	}
		
	public void follow(String email){
		User user = UserDAO.getUser(email);
		this.follow(user);
	}	 
	
	public void unfolow(User user){
		this.following.remove(user);
		UserDAO.update(user);
	}
	
	public void unfolow(String email){
		User user = UserDAO.getUser(email);
		this.unfolow(user);
	}
	
	
	
	
}
