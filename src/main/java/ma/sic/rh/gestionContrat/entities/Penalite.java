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
    private ReferencielSDL referencielSDL;

    @ManyToOne
    private ReferencielDelegataire referencielDelegataire;
	
    @ManyToOne
    private Contrat contrat;

    public Penalite() {
    }

    public Penalite(Double montant, String motifs, String status, Date dateReglement, Double montantReglement, String numRecuReglement, String pj, String observations, ReferencielSDL referencielSDL, ReferencielDelegataire referencielDelegataire, Contrat contrat) {
        this.montant = montant;
        this.motifs = motifs;
        this.status = status;
        this.dateReglement = dateReglement;
        this.montantReglement = montantReglement;
        this.numRecuReglement = numRecuReglement;
        this.pj = pj;
        this.observations = observations;
        this.referencielSDL = referencielSDL;
        this.referencielDelegataire = referencielDelegataire;
        this.contrat = contrat;
    }

    @Override
    public String toString() {
        return "Penalite{" +
                "id=" + id +
                ", montant=" + montant +
                ", motifs='" + motifs + '\'' +
                ", status='" + status + '\'' +
                ", dateReglement=" + dateReglement +
                ", montantReglement=" + montantReglement +
                ", numRecuReglement='" + numRecuReglement + '\'' +
                ", pj='" + pj + '\'' +
                ", observations='" + observations + '\'' +
                ", referencielSDL=" + referencielSDL +
                ", referencielDelegataire=" + referencielDelegataire +
                ", contrat=" + contrat +
                '}';
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

    public ReferencielSDL getReferencielSDL() {
        return referencielSDL;
    }

    public void setReferencielSDL(ReferencielSDL referencielSDL) {
        this.referencielSDL = referencielSDL;
    }

    public ReferencielDelegataire getReferencielDelegataire() {
        return referencielDelegataire;
    }

    public void setReferencielDelegataire(ReferencielDelegataire referencielDelegataire) {
        this.referencielDelegataire = referencielDelegataire;
    }

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }
}
