package momo.learn.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Contact implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private String photo;
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}

	

	




	public Contact( String nom, String prenom, String email, String tel, Date dateNaissance, String photo) {
	
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
		this.dateNaissance = dateNaissance;
		this.photo = photo;
	}








	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public 	String getTel() {
		return tel;
	}

	public void setTel(	String tel) {
		this.tel = tel;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	
	
	

}
