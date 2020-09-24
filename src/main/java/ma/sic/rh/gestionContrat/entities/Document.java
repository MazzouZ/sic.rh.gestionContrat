package ma.sic.rh.gestionContrat.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Document implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	   @ManyToOne
	   private DocumentType documentType;
	   
	   private String documentName;
	  
	   private Date creationDate;
	   
	   private String document;
	  
	   private String observations;

	public Document() {
	}
	

	public Document(DocumentType documentType, String documentName, Date creationDate, String document,
			String observations) {
		super();
		this.documentType = documentType;
		this.documentName = documentName;
		this.creationDate = creationDate;
		this.document = document;
		this.observations = observations;
	}


	@Override
	public String toString() {
		return "Document [id=" + id + ", documentType=" + documentType + ", documentName=" + documentName
				+ ", creationDate=" + creationDate + ", document=" + document + ", observations=" + observations + "]";
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}
