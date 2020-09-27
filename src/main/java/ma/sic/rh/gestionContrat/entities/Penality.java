package ma.sic.rh.gestionContrat.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
public class Penality implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private String patterns;
    private String status;
    private Date regulationDate;
    private Double amountRegulation;
    private String numRecuRegulation;
    private String pj;
    private String observations;
    @ManyToOne
    private SDLReference sDLReference;

    @ManyToOne
    private DelegateReference delegateReference;
	
    @ManyToOne
    private Contrat contrat;

    public Penality() {
    }

   

    public Penality(Double amount, String patterns, String status, Date regulationDate, Double amountRegulation,
			String numRecuRegulation, String pj, String observations, SDLReference sDLReference,
			DelegateReference delegateReference, Contrat contrat) {
		super();
		this.amount = amount;
		this.patterns = patterns;
		this.status = status;
		this.regulationDate = regulationDate;
		this.amountRegulation = amountRegulation;
		this.numRecuRegulation = numRecuRegulation;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPatterns() {
        return patterns;
    }

    public void setPatterns(String patterns) {
        this.patterns = patterns;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRegulationDate() {
        return regulationDate;
    }

    public void setRegulationDate(Date regulationDate) {
        this.regulationDate = regulationDate;
    }

    public Double getAmountRegulation() {
        return amountRegulation;
    }

    public void setAmountRegulation(Double amountRegulation) {
        this.amountRegulation = amountRegulation;
    }

    public String getNumRecuRegulation() {
        return numRecuRegulation;
    }

    public void setNumRecuRegulation(String numRecuRegulation) {
        this.numRecuRegulation = numRecuRegulation;
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
