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
	
	 private String Name;
	  
	   private String Firstname;
	   
	   private String Tel;
	  
	   private String mail;
	   
	   @OneToMany(mappedBy = "manager")
		private Collection<SDLReference> sDLReference;
	   
	   @OneToMany(mappedBy = "manager")
		private Collection<DelegateReference> delegateReference;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}


	public Manager(String name, String firstname, String tel, String mail, Collection<SDLReference> sDLReference,
			Collection<DelegateReference> delegateReference) {
		super();
		Name = name;
		Firstname = firstname;
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

	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getFirstname() {
		return Firstname;
	}


	public void setFirstname(String firstname) {
		Firstname = firstname;
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
