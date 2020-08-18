package ma.sic.rh.gestionContrat.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Document implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 private String typeDocument;
	   
	   private String nomDocument;
	  
	   private String dateDeCreation;
	   
	   private String document;
	  
	   private String observations;

	public Document() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Document(String typeDocument, String nomDocument, String dateDeCreation, String document,
			String observations) {
		super();
		this.typeDocument = typeDocument;
		this.nomDocument = nomDocument;
		this.dateDeCreation = dateDeCreation;
		this.document = document;
		this.observations = observations;
	}



	public static long getSerialVersionUID() {
		return serialVersionUID;
	}



	public Long getId() {
		return id;
	}


	public String getTypeDocument() {
		return typeDocument;
	}



	public void setTypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}



	public String getNomDocument() {
		return nomDocument;
	}



	public void setNomDocument(String nomDocument) {
		this.nomDocument = nomDocument;
	}



	public String getDateDeCreation() {
		return dateDeCreation;
	}



	public void setDateDeCreation(String dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}



	public String getDocument() {
		return document;
	}



	public void setDocument(String document) {
		this.document = document;
	}



	public String getObservations() {
		return observations;
	}



	public void setObservations(String observations) {
		this.observations = observations;
	}
	
	

}
