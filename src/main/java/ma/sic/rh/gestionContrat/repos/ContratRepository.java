package ma.sic.rh.gestionContrat.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import ma.sic.rh.gestionContrat.entities.Contrat;

@RepositoryRestResource
@CrossOrigin("*")
public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
