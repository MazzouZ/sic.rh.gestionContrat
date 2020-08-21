package ma.sic.rh.gestionContrat.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
public class Penalite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double montant;
    private String motifs;
    private String status;
    private Date dateReglement;
    private Double montantReglement;
    private String numRecuReglement;
    private String pj;
    private String observations;
    @ManyToOne
    private SDLReference sDLReference;

    @ManyToOne
    private DelegateReference delegateReference;
	
    @ManyToOne
    private Contrat contrat;

    public Penalite() {
    }

   

    public Penalite(Double montant, String motifs, String status, Date dateReglement, Double montantReglement,
			String numRecuReglement, String pj, String observations, SDLReference sDLReference,
			DelegateReference delegateReference, Contrat contrat) {
		super();
		this.montant = montant;
		this.motifs = motifs;
		this.status = status;
		this.dateReglement = dateReglement;
		this.montantReglement = montantReglement;
		this.numRecuReglement = numRecuReglement;
		this.pj = pj;
		this.observations = observations;
		this.sDLReference = sDLReference;
		this.delegateReference = delegateReference;
		this.contrat = contrat;
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

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getMotifs() {
        return motifs;
    }

    public void setMotifs(String motifs) {
        this.motifs = motifs;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateReglement() {
        return dateReglement;
    }

    public void setDateReglement(Date dateReglement) {
        this.dateReglement = dateReglement;
    }

    public Double getMontantReglement() {
        return montantReglement;
    }

    public void setMontantReglement(Double montantReglement) {
        this.montantReglement = montantReglement;
    }

    public String getNumRecuReglement() {
        return numRecuReglement;
    }

    public void setNumRecuReglement(String numRecuReglement) {
        this.numRecuReglement = numRecuReglement;
    }

    public String getPj() {
        return pj;
    }

    public void setPj(String pj) {
        this.pj = pj;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
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



	public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }
}
