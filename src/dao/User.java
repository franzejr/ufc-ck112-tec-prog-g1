package dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.NotNull;






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
	//followers ArrayList<User>
	//following ArrayList<User>
	//privateMsgs ArrayList<PrivateMessage>
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
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
		this.password = password;
	}
	public long getId() {
		return id;
	}
	
	
	
	
}
