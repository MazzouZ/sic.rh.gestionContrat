package ma.sic.rh.gestionContrat.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Manager implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 private String Nom;
	  
	   private String Prenom;
	   
	   private String Tel;
	  
	   private String mail;
	   
	   @OneToMany(mappedBy = "manager")
		private Collection<SDLReference> sDLReference;
	   
	   @OneToMany(mappedBy = "manager")
		private Collection<DelegateReference> delegateReference;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}



	public Manager(String nom, String prenom, String tel, String mail, Collection<SDLReference> sDLReference,
			Collection<DelegateReference> delegateReference) {
		super();
		Nom = nom;
		Prenom = prenom;
		Tel = tel;
		this.mail = mail;
		this.sDLReference = sDLReference;
		this.delegateReference = delegateReference;
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



	public Collection<SDLReference> getsDLReference() {
		return sDLReference;
	}



	public void setsDLReference(Collection<SDLReference> sDLReference) {
		this.sDLReference = sDLReference;
	}



	public Collection<DelegateReference> getDelegateReference() {
		return delegateReference;
	}



	public void setDelegateReference(Collection<DelegateReference> delegateReference) {
		this.delegateReference = delegateReference;
	}
	

}
