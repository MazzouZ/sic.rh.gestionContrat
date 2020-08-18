package ma.sic.rh.gestionContrat.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Structure implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String libelle;
	
	@OneToMany(mappedBy = "structure")
	private Collection<ReferencielSDL> referencielSDL;
   
   @OneToMany(mappedBy = "structure")
	private Collection<ReferencielDelegataire> referencielDelegataire;
	
	public Structure() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Structure(String libelle, Collection<ReferencielSDL> referencielSDL,
			Collection<ReferencielDelegataire> referencielDelegataire) {
		super();
		this.libelle = libelle;
		this.referencielSDL = referencielSDL;
		this.referencielDelegataire = referencielDelegataire;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
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
