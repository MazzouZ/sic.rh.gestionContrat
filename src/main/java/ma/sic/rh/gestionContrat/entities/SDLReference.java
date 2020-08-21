package ma.sic.rh.gestionContrat.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
public class SDLReference implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String socialReason;

    private String publicLiability;

    private String taxIdentification;

    private String commonCompanyIdentifier;

    private String numCnss;

    private String adresse;

    private String telephone;

    private String fax;

    private String email;

    private Double capitale;

    private Double capitalPerShareholder;

    private String activitySector;
    @ManyToOne
    private Document Status;
    @ManyToOne
    private Document ModeleJ;

    @ManyToOne
    private Manager manager;

    @ManyToOne
    private Structure structure;

    @OneToMany(mappedBy = "sDLReference")
    private Collection<Penalite> penalites;

    @OneToMany(mappedBy = "sDLReference")
    private Collection<Contrat> contrats;

    @OneToMany(mappedBy = "sDLReference")
    private Collection<Investissement> investissements;

    @OneToMany(mappedBy = "sDLReference")
    private Collection<IndicateurSuivie> indicateurSuivie;

    public SDLReference() {
        // TODO Auto-generated constructor stub
    }

    public SDLReference(String socialReason, String publicLiability, String taxIdentification,
			String commonCompanyIdentifier, String numCnss, String adresse, String telephone, String fax, String email,
			Double capitale, Double capitalPerShareholder, String activitySector, Document status, Document modeleJ,
			Manager manager, Structure structure, Collection<Penalite> penalites, Collection<Contrat> contrats,
			Collection<Investissement> investissements, Collection<IndicateurSuivie> indicateurSuivie) {
		super();
		this.socialReason = socialReason;
		this.publicLiability = publicLiability;
		this.taxIdentification = taxIdentification;
		this.commonCompanyIdentifier = commonCompanyIdentifier;
		this.numCnss = numCnss;
		this.adresse = adresse;
		this.telephone = telephone;
		this.fax = fax;
		this.email = email;
		this.capitale = capitale;
		this.capitalPerShareholder = capitalPerShareholder;
		this.activitySector = activitySector;
		Status = status;
		ModeleJ = modeleJ;
		this.manager = manager;
		this.structure = structure;
		this.penalites = penalites;
		this.contrats = contrats;
		this.investissements = investissements;
		this.indicateurSuivie = indicateurSuivie;
	}

	public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

	public String getSocialReason() {
		return socialReason;
	}

	public void setSocialReason(String socialReason) {
		this.socialReason = socialReason;
	}

	public String getPublicLiability() {
		return publicLiability;
	}

	public void setPublicLiability(String publicLiability) {
		this.publicLiability = publicLiability;
	}

	public String getTaxIdentification() {
		return taxIdentification;
	}

	public void setTaxIdentification(String taxIdentification) {
		this.taxIdentification = taxIdentification;
	}

	public String getCommonCompanyIdentifier() {
		return commonCompanyIdentifier;
	}

	public void setCommonCompanyIdentifier(String commonCompanyIdentifier) {
		this.commonCompanyIdentifier = commonCompanyIdentifier;
	}

	public String getNumCnss() {
		return numCnss;
	}

	public void setNumCnss(String numCnss) {
		this.numCnss = numCnss;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getCapitale() {
		return capitale;
	}

	public void setCapitale(Double capitale) {
		this.capitale = capitale;
	}

	public Double getCapitalPerShareholder() {
		return capitalPerShareholder;
	}

	public void setCapitalPerShareholder(Double capitalPerShareholder) {
		this.capitalPerShareholder = capitalPerShareholder;
	}

	public String getActivitySector() {
		return activitySector;
	}

	public void setActivitySector(String activitySector) {
		this.activitySector = activitySector;
	}

	public Document getStatus() {
		return Status;
	}

	public void setStatus(Document status) {
		Status = status;
	}

	public Document getModeleJ() {
		return ModeleJ;
	}

	public void setModeleJ(Document modeleJ) {
		ModeleJ = modeleJ;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Structure getStructure() {
		return structure;
	}

	public void setStructure(Structure structure) {
		this.structure = structure;
	}

	public Collection<Penalite> getPenalites() {
		return penalites;
	}

	public void setPenalites(Collection<Penalite> penalites) {
		this.penalites = penalites;
	}

	public Collection<Contrat> getContrats() {
		return contrats;
	}

	public void setContrats(Collection<Contrat> contrats) {
		this.contrats = contrats;
	}

	public Collection<Investissement> getInvestments() {
		return investissements;
	}

	public void setInvestments(Collection<Investissement> investissements) {
		this.investissements = investissements;
	}

	public Collection<IndicateurSuivie> getTrackedIndicator() {
		return indicateurSuivie;
	}

	public void setTrackedIndicator(Collection<IndicateurSuivie> indicateurSuivie) {
		this.indicateurSuivie = indicateurSuivie;
	}

}
