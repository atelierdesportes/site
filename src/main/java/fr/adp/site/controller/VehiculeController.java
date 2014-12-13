package fr.adp.site.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import fr.adp.site.bean.VehiculeBean;
import fr.adp.site.service.VehiculeService;
import fr.adp.site.service.impl.VehiculeServiceImpl;

@ManagedBean
@RequestScoped
public class VehiculeController {
	
	@ManagedProperty(value = "#{vehiculeBean}")
	private VehiculeBean vehiculeBean;
	
	@Inject
	@Named(value="VehiculeService")
	private VehiculeService vehiculeService = new VehiculeServiceImpl();
	
	public void loadVehicules(){
		vehiculeBean.setVehicules(vehiculeService.rechercherVehicules(vehiculeBean.getFilters()));
	}
	
	public void afficherDetail(){
		String vehiculeId = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter("vehicule_id");
		vehiculeBean.setVehiculeSelectionne(vehiculeService.recupererVehicule(vehiculeId));
	}

	public void setVehiculeBean(VehiculeBean vehiculeBean) {
		this.vehiculeBean = vehiculeBean;
	}
	
	

}
