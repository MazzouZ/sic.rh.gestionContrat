package ma.sic.rh.gestionContrat.entities;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inlineDocument", types = { Document.class })
public interface InlineDocument {
	Long getId();
	String getDocumentName();
	DocumentType getDocumentType();
	Date getCreationDate();
	String getDocument();
	String getObservations();
}
