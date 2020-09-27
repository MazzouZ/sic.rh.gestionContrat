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
    private String titleContract;
    private String contractObject;
    private Date effectiveDate;
    private Date endDate;
    private String sector;
    private String contractAmount;
    private String numMarket;
    private String pi;
    private String observations;
	
    @OneToMany(mappedBy = "contrat")
    private Collection<Penality> penalities;

    @ManyToOne
    private SDLReference sDLReference;

    @ManyToOne
    private DelegateReference delegateReference;

    @ManyToOne
    private Document signedMarket;

    @ManyToOne
    private Document signedContract;

    public Contrat() {
    }


    public Contrat(String numContrat, String titleContract, String contractObject, Date effectiveDate, Date endDate,
			String sector, String contractAmount, String numMarket, String pi, String observations,
			Collection<Penality> penalites, SDLReference sDLReference, DelegateReference delegateReference,
			Document signedMarket, Document signedContract) {
		super();
		this.numContrat = numContrat;
		this.titleContract = titleContract;
		this.contractObject = contractObject;
		this.effectiveDate = effectiveDate;
		this.endDate = endDate;
		this.sector = sector;
		this.contractAmount = contractAmount;
		this.numMarket = numMarket;
		this.pi = pi;
		this.observations = observations;
		this.penalities = penalities;
		this.sDLReference = sDLReference;
		this.delegateReference = delegateReference;
		this.signedMarket = signedMarket;
		this.signedContract = signedContract;
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

    public String getTitleContract() {
		return titleContract;
	}


	public void setTitleContract(String titleContract) {
		this.titleContract = titleContract;
	}


	public String getContractObject() {
		return contractObject;
	}


	public void setContractObject(String contractObject) {
		this.contractObject = contractObject;
	}


	public Date getEffectiveDate() {
		return effectiveDate;
	}


	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public String getSector() {
		return sector;
	}


	public void setSector(String sector) {
		this.sector = sector;
	}


	public String getContractAmount() {
		return contractAmount;
	}


	public void setContractAmount(String contractAmount) {
		this.contractAmount = contractAmount;
	}


	public String getNumMarket() {
		return numMarket;
	}


	public void setNumMarket(String numMarket) {
		this.numMarket = numMarket;
	}


	public Document getSignedMarket() {
		return signedMarket;
	}


	public void setSignedMarket(Document signedMarket) {
		this.signedMarket = signedMarket;
	}


	public Document getSignedContract() {
		return signedContract;
	}


	public void setSignedContract(Document signedContract) {
		this.signedContract = signedContract;
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


}
