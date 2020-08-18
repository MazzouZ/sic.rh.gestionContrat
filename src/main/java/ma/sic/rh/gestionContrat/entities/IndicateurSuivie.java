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
    private ReferencielDelegataire referencielDelegataire;
    @ManyToOne
    private ReferencielSDL referencielSDL;

    public IndicateurSuivie() {
    }

    public IndicateurSuivie(String typeIndicateur, String nom, String description, String valeurContractuelle, String valeurConstate, Date dateValeur, ReferencielDelegataire referencielDelegataire, ReferencielSDL referencielSDL) {
        this.typeIndicateur = typeIndicateur;
        this.nom = nom;
        this.description = description;
        this.valeurContractuelle = valeurContractuelle;
        this.valeurConstate = valeurConstate;
        this.dateValeur = dateValeur;
        this.referencielDelegataire = referencielDelegataire;
        this.referencielSDL = referencielSDL;
    }

    @Override
    public String toString() {
        return "IndicateurSuivie{" +
                "id=" + id +
                ", typeIndicateur='" + typeIndicateur + '\'' +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", valeurContractuelle='" + valeurContractuelle + '\'' +
                ", valeurConstate='" + valeurConstate + '\'' +
                ", dateValeur=" + dateValeur +
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
