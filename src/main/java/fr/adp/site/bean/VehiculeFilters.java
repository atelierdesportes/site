package fr.adp.site.bean;

import java.io.Serializable;

public class VehiculeFilters implements Serializable {

	private static final long serialVersionUID = 2875558918515612215L;
	
	private String marque;
	private String modele;

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

}
