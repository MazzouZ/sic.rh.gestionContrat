package ma.sic.rh.gestionContrat.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
public class ReferencielSDL implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String raisonSocial;

    private String rc;

    private String IdentifiantFiscal;

    private String ice;

    private String numCnss;

    private String adresse;

    private String tel;

    private String fax;

    private String email;

    private Double capitale;

    private Double capitaleParActionnaire;

    private String secteurActivitee;
    @ManyToOne
    private Document Status;
    @ManyToOne
    private Document ModeleJ;

    @ManyToOne
    private Gerant gerant;

    @ManyToOne
    private Structure structure;

    @OneToMany(mappedBy = "referencielSDL")
    private Collection<Penalite> penalites;

    @OneToMany(mappedBy = "referencielSDL")
    private Collection<Contrat> contrats;

    @OneToMany(mappedBy = "referencielDelegataire")
    private Collection<Investissement> investissements;

    @OneToMany(mappedBy = "referencielDelegataire")
    private Collection<IndicateurSuivie> indicateurSuivies;

    public ReferencielSDL() {
        // TODO Auto-generated constructor stub
    }


    public ReferencielSDL(String raisonSocial, String rc, String iF, String ice, String numCnss, String adresse,
                          String tel, String fax, String email, Double capitale, Double capitaleParActionnaire,
                          String secteurActivitee, Document status, Document modeleJ, Gerant gerant, Structure structure) {
        super();
        this.raisonSocial = raisonSocial;
        this.rc = rc;
        IdentifiantFiscal = iF;
        this.ice = ice;
        this.numCnss = numCnss;
        this.adresse = adresse;
        this.tel = tel;
        this.fax = fax;
        this.email = email;
        this.capitale = capitale;
        this.capitaleParActionnaire = capitaleParActionnaire;
        this.secteurActivitee = secteurActivitee;
        Status = status;
        ModeleJ = modeleJ;
        this.gerant = gerant;
        this.structure = structure;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }

    public String getIdentifiantFiscal() {
        return IdentifiantFiscal;
    }

    public void setIF(String IF) {
        this.IdentifiantFiscal = IF;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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

    public Double getCapitaleParActionnaire() {
        return capitaleParActionnaire;
    }

    public void setCapitaleParActionnaire(Double capitaleParActionnaire) {
        this.capitaleParActionnaire = capitaleParActionnaire;
    }

    public String getSecteurActivitee() {
        return secteurActivitee;
    }

    public void setSecteurActivitee(String secteurActivitee) {
        this.secteurActivitee = secteurActivitee;
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


    public Gerant getGerant() {
        return gerant;
    }


    public void setGerant(Gerant gerant) {
        this.gerant = gerant;
    }


    public Structure getStructure() {
        return structure;
    }


    public void setStructure(Structure structure) {
        this.structure = structure;
    }


}
