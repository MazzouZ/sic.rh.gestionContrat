package ma.sic.rh.gestionContrat.services;

import org.springframework.context.annotation.Configuration;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.sun.xml.txw2.Document;

import ma.sic.rh.gestionContrat.entities.DelegateReference;
import ma.sic.rh.gestionContrat.entities.Manager;
import ma.sic.rh.gestionContrat.entities.SDLReference;
@Configuration
public class MyRepositoryRestConfigurerAdapter implements RepositoryRestConfigurer{
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(SDLReference.class,Manager.class,DelegateReference.class);
    }
}
