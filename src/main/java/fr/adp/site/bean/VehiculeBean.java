package fr.adp.site.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import fr.adp.site.viewdto.Vehicule;

@ManagedBean
@ViewScoped
public class VehiculeBean implements Serializable {

	private static final long serialVersionUID = -7323112909855379726L;

	private List<Vehicule> vehicules;
	private VehiculeFilters filters = new VehiculeFilters();
	private String idVehiculeSelectionne;
	private Vehicule vehiculeSelectionne;

	public List<Vehicule> getVehicules() {
		return vehicules;
	}

	public void setVehicules(List<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}

	public VehiculeFilters getFilters() {
		return filters;
	}

	public void setFilters(VehiculeFilters filters) {
		this.filters = filters;
	}

	public Vehicule getVehiculeSelectionne() {
		return vehiculeSelectionne;
	}

	public void setVehiculeSelectionne(Vehicule vehiculeSelectionne) {
		this.vehiculeSelectionne = vehiculeSelectionne;
	}

}
