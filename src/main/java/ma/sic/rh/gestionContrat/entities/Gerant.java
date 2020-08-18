package ma.sic.rh.gestionContrat.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Gerant implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 private String Nom;
	  
	   private String Prenom;
	   
	   private String Tel;
	  
	   private String mail;
	   
	   @OneToMany(mappedBy = "gerant")
		private Collection<ReferencielSDL> referencielSDL;
	   
	   @OneToMany(mappedBy = "gerant")
		private Collection<ReferencielDelegataire> referencielDelegataire;
	
	public Gerant() {
		// TODO Auto-generated constructor stub
	}

	

	public Gerant(String nom, String prenom, String tel, String mail, Collection<ReferencielSDL> referencielSDL,
			Collection<ReferencielDelegataire> referencielDelegataire) {
		super();
		Nom = nom;
		Prenom = prenom;
		Tel = tel;
		this.mail = mail;
		this.referencielSDL = referencielSDL;
		this.referencielDelegataire = referencielDelegataire;
	}



	public Long getId() {
		return id;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}



	public Collection<ReferencielSDL> getReferencielSDL() {
		return referencielSDL;
	}



	public void setReferencielSDL(Collection<ReferencielSDL> referencielSDL) {
		this.referencielSDL = referencielSDL;
	}



	public Collection<ReferencielDelegataire> getReferencielDelegataire() {
		return referencielDelegataire;
	}



	public void setReferencielDelegataire(Collection<ReferencielDelegataire> referencielDelegataire) {
		this.referencielDelegataire = referencielDelegataire;
	}
	
	
	
	

}
