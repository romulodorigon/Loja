package br.com.casadocodigo.loja.conf;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;

/**
 * 
 * @author romulo
 * @description Classe produtora de FacesContext.CurrentInstance
 * @date 2017.05.07
 */
public class FacesContextProducer {

	@RequestScoped
	@Produces
	public FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
}
