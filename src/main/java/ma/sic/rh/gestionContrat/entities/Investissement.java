package ma.sic.rh.gestionContrat.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Investissement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String typeInvestissement;
    private Double montant;
    private String objectifs;
    private String status;
    private String pj;
    private String observations;

    @ManyToOne
    private DelegateReference delegateReference;
    @ManyToOne
    private SDLReference sDLReference;

    public Investissement() {
    }

   

    public Investissement(String typeInvestissement, Double montant, String objectifs, String status, String pj,
			String observations, DelegateReference delegateReference, SDLReference sDLReference) {
		super();
		this.typeInvestissement = typeInvestissement;
		this.montant = montant;
		this.objectifs = objectifs;
		this.status = status;
		this.pj = pj;
		this.observations = observations;
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

    public String getTypeInvestissement() {
        return typeInvestissement;
    }

    public void setTypeInvestissement(String typeInvestissement) {
        this.typeInvestissement = typeInvestissement;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getObjectifs() {
        return objectifs;
    }

    public void setObjectifs(String objectifs) {
        this.objectifs = objectifs;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
