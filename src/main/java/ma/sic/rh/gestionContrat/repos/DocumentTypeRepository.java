package ma.sic.rh.gestionContrat.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import ma.sic.rh.gestionContrat.entities.DocumentType;

@RepositoryRestResource
@CrossOrigin("*")
public interface DocumentTypeRepository extends JpaRepository<DocumentType,Long>{
	DocumentType findByLabel(String label);
}
