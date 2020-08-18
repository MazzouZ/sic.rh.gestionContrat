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
    private ReferencielDelegataire referencielDelegataire;
    @ManyToOne
    private ReferencielSDL referencielSDL;

    public Investissement() {
    }

    public Investissement(String typeInvestissement, Double montant, String objectifs, String status, String pj, String observations, ReferencielDelegataire referencielDelegataire, ReferencielSDL referencielSDL) {
        this.typeInvestissement = typeInvestissement;
        this.montant = montant;
        this.objectifs = objectifs;
        this.status = status;
        this.pj = pj;
        this.observations = observations;
        this.referencielDelegataire = referencielDelegataire;
        this.referencielSDL = referencielSDL;
    }

    @Override
    public String toString() {
        return "Investissement{" +
                "id=" + id +
                ", typeInvestissement='" + typeInvestissement + '\'' +
                ", montant=" + montant +
                ", objectifs='" + objectifs + '\'' +
                ", status='" + status + '\'' +
                ", pj='" + pj + '\'' +
                ", observations='" + observations + '\'' +
                ", referencielDelegataire=" + referencielDelegataire +
                ", referencielSDL=" + referencielSDL +
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

    public ReferencielDelegataire getReferencielDelegataire() {
        return referencielDelegataire;
    }

    public void setReferencielDelegataire(ReferencielDelegataire referencielDelegataire) {
        this.referencielDelegataire = referencielDelegataire;
    }

    public ReferencielSDL getReferencielSDL() {
        return referencielSDL;
    }

    public void setReferencielSDL(ReferencielSDL referencielSDL) {
        this.referencielSDL = referencielSDL;
    }
}
