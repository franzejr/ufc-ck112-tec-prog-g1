package dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity
public class User {

	@Id @GeneratedValue
	private Long id;
	@Id
	private String cpf;
	private String name;
	private String email;
	private String aboutYou;
	//get from a .properties(talk to Franz�).
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
	public Long getId() {
		return id;
	}
	
	
	
	
}