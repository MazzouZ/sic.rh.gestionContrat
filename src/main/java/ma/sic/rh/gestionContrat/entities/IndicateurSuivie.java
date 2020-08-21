package ma.sic.rh.gestionContrat.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
public class IndicateurSuivie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String typeIndicateur;
    private String nom;
    private String description;
    private String valeurContractuelle;
    private String valeurConstate;
    private Date dateValeur;

    @ManyToOne
    private DelegateReference delegateReference;
    @ManyToOne
    private SDLReference sDLReference;

    public IndicateurSuivie() {
    }

    public IndicateurSuivie(String typeIndicateur, String nom, String description, String valeurContractuelle,
			String valeurConstate, Date dateValeur, DelegateReference delegateReference, SDLReference sDLReference) {
		super();
		this.typeIndicateur = typeIndicateur;
		this.nom = nom;
		this.description = description;
		this.valeurContractuelle = valeurContractuelle;
		this.valeurConstate = valeurConstate;
		this.dateValeur = dateValeur;
		this.delegateReference = delegateReference;
		this.sDLReference = sDLReference;
	}





    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeIndicateur() {
        return typeIndicateur;
    }

    public void setTypeIndicateur(String typeIndicateur) {
        this.typeIndicateur = typeIndicateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValeurContractuelle() {
        return valeurContractuelle;
    }

    public void setValeurContractuelle(String valeurContractuelle) {
        this.valeurContractuelle = valeurContractuelle;
    }

    public String getValeurConstate() {
        return valeurConstate;
    }

    public void setValeurConstate(String valeurConstate) {
        this.valeurConstate = valeurConstate;
    }

    public Date getDateValeur() {
        return dateValeur;
    }

    public void setDateValeur(Date dateValeur) {
        this.dateValeur = dateValeur;
    }

	public DelegateReference getDelegateReference() {
		return delegateReference;
	}

	public void setDelegateReference(DelegateReference delegateReference) {
		this.delegateReference = delegateReference;
	}

	public SDLReference getsDLReference() {
		return sDLReference;
	}

	public void setsDLReference(SDLReference sDLReference) {
		this.sDLReference = sDLReference;
	}

    
}
