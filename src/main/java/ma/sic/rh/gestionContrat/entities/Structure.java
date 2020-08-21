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
	
	private String label;
	
	@OneToMany(mappedBy = "structure")
	private Collection<SDLReference> sDLReference;
   
   @OneToMany(mappedBy = "structure")
	private Collection<DelegateReference> referencielDelegataire;
	
	public Structure() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Structure(String libelle, Collection<SDLReference> sDLReference,
			Collection<DelegateReference> referencielDelegataire) {
		super();
		this.label = libelle;
		this.sDLReference = sDLReference;
		this.referencielDelegataire = referencielDelegataire;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public String getLibelle() {
		return label;
	}

	public void setLibelle(String libelle) {
		this.label= libelle;
	}



	public Collection<SDLReference> getReferencielSDL() {
		return sDLReference;
	}



	public void setReferencielSDL(Collection<SDLReference> sDLReference) {
		this.sDLReference = sDLReference;
	}



	public Collection<DelegateReference> getReferencielDelegataire() {
		return referencielDelegataire;
	}



	public void setReferencielDelegataire(Collection<DelegateReference> referencielDelegataire) {
		this.referencielDelegataire = referencielDelegataire;
	}
	
	
	

}
