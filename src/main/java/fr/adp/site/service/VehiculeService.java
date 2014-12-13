package fr.adp.site.service;

import java.util.List;

import fr.adp.site.bean.VehiculeFilters;
import fr.adp.site.viewdto.Vehicule;

public interface VehiculeService {
	
	List<Vehicule> rechercherVehicules(VehiculeFilters filters);

	Vehicule recupererVehicule(String id);
}
