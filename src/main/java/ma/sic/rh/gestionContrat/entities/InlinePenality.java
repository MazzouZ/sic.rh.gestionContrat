package ma.sic.rh.gestionContrat.entities;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inlinePenality", types = { Penality.class })
public interface InlinePenality {
	Long   getId();
    Double getAmount();
    String getpatterns();
    String getStatus();
    Date   getRegulationDate();
    Double getAmountRegulation();
    String getNumRecuRegulation();
    String getPj();
    String getObservations();
    SDLReference getSDLReference();
    DelegateReference getDelegateReference();
    Contrat getContrat();
}
