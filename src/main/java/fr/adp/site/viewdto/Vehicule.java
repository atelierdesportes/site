package fr.adp.site.viewdto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Vehicule implements Serializable {

	private static final long serialVersionUID = -1442494557212604341L;

	private String id;
	private TypeVehicule type;
	private String marque;
	private String modele;
	private int annee;
	private List<String> images;
	private String imagePrincipale;
	private double tarif;
	private String title;
	private String extract;
	private String description;
	private int garantie;
	private Map<String, String> extras;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TypeVehicule getType() {
		return type;
	}

	public void setType(TypeVehicule type) {
		this.type = type;
	}

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

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getImagePrincipale() {
		return imagePrincipale;
	}

	public void setImagePrincipale(String imagePrincipale) {
		this.imagePrincipale = imagePrincipale;
	}

	public double getTarif() {
		return tarif;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getExtract() {
		return extract;
	}

	public void setExtract(String extract) {
		this.extract = extract;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getGarantie() {
		return garantie;
	}

	public void setGarantie(int garantie) {
		this.garantie = garantie;
	}

	public Map<String, String> getExtras() {
		return extras;
	}

	public void setExtras(Map<String, String> extras) {
		this.extras = extras;
	}

}
