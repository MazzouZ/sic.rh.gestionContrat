package ma.sic.rh.gestionContrat.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
@Entity
public class Contrat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numContrat;
    private String intituleContrat;
    private String objetContrat;
    private Date dateMiseVigueur;
    private Date dateFin;
    private String secteur;
    private String montantContrat;
    private String numMarche;
    private String pi;
    private String observations;
	
    @OneToMany(mappedBy = "contrat")
    private Collection<Penality> penalities;

    @ManyToOne
    private SDLReference sDLReference;

    @ManyToOne
    private DelegateReference delegateReference;

    @ManyToOne
    private Document marcheSigne;

    @ManyToOne
    private Document contratSigne;

    public Contrat() {
    }

    

    public Contrat(String numContrat, String intituleContrat, String objetContrat, Date dateMiseVigueur, Date dateFin,
			String secteur, String montantContrat, String numMarche, String pi, String observations,
			Collection<Penality> penalities, SDLReference sDLReference, DelegateReference delegateReference,
			Document marcheSigne, Document contratSigne) {
		super();
		this.numContrat = numContrat;
		this.intituleContrat = intituleContrat;
		this.objetContrat = objetContrat;
		this.dateMiseVigueur = dateMiseVigueur;
		this.dateFin = dateFin;
		this.secteur = secteur;
		this.montantContrat = montantContrat;
		this.numMarche = numMarche;
		this.pi = pi;
		this.observations = observations;
		this.penalities = penalities;
		this.sDLReference = sDLReference;
		this.delegateReference = delegateReference;
		this.marcheSigne = marcheSigne;
		this.contratSigne = contratSigne;
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

    public String getNumContrat() {
        return numContrat;
    }

    public void setNumContrat(String numContrat) {
        this.numContrat = numContrat;
    }

    public String getIntituleContrat() {
        return intituleContrat;
    }

    public void setIntituleContrat(String intituleContrat) {
        this.intituleContrat = intituleContrat;
    }

    public String getObjetContrat() {
        return objetContrat;
    }

    public void setObjetContrat(String objetContrat) {
        this.objetContrat = objetContrat;
    }

    public Date getDateMiseVigueur() {
        return dateMiseVigueur;
    }

    public void setDateMiseVigueur(Date dateMiseVigueur) {
        this.dateMiseVigueur = dateMiseVigueur;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public String getMontantContrat() {
        return montantContrat;
    }

    public void setMontantContrat(String montantContrat) {
        this.montantContrat = montantContrat;
    }

    public String getNumMarche() {
        return numMarche;
    }

    public void setNumMarche(String numMarche) {
        this.numMarche = numMarche;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Collection<Penality> getPenalites() {
        return penalities;
    }

    public void setPenalites(Collection<Penality> penalities) {
        this.penalities = penalities;
    }

    

    public SDLReference getsDLReference() {
		return sDLReference;
	}



	public void setsDLReference(SDLReference sDLReference) {
		this.sDLReference = sDLReference;
	}



	public DelegateReference getDelegateReference() {
		return delegateReference;
	}



	public void setDelegateReference(DelegateReference delegateReference) {
		this.delegateReference = delegateReference;
	}



	public Document getMarcheSigne() {
        return marcheSigne;
    }

    public void setMarcheSigne(Document marcheSigne) {
        this.marcheSigne = marcheSigne;
    }

    public Document getContratSigne() {
        return contratSigne;
    }

    public void setContratSigne(Document contratSigne) {
        this.contratSigne = contratSigne;
    }
}
