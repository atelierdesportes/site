package fr.adp.site.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Named;

import fr.adp.site.bean.VehiculeFilters;
import fr.adp.site.service.VehiculeService;
import fr.adp.site.viewdto.TypeVehicule;
import fr.adp.site.viewdto.Vehicule;

@Named(value="VehiculeService")
public class VehiculeServiceImpl implements VehiculeService {
	
	private static final Map<String, Vehicule> vehicules = new HashMap<String, Vehicule>();
	static{
		Vehicule vehicule = new Vehicule();
		vehicule.setAnnee(1959);
		vehicule.setId("1");
		vehicule.setDescription("Without doubt the finest MGA I have ever seen. This car has just emerged from a vastly expensive restoration & has done zero miles since. I am sure it is far better then they ever left the factory. Finished in gleaming black paint to the outside & a red leather interior the car is very striking to look at. This is a car you can enter & win prizes with. Nothing more needs to be said. Simply put you have to see it to appreciate it.");
		vehicule.setExtract("Without doubt the finest MGA I have ever seen");
		vehicule.setImagePrincipale("http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/mg/mga/mg-mga-S1494394-1.jpg");
		vehicule.setImages(Arrays.asList(
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/mg/mga/mg-mga-S1494394-2.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/mg/mga/mg-mga-S1494394-3.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/mg/mga/mg-mga-S1494394-4.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/mg/mga/mg-mga-S1494394-5.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/mg/mga/mg-mga-S1494394-6.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/mg/mga/mg-mga-S1494394-7.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/mg/mga/mg-mga-S1494394-8.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/mg/mga/mg-mga-S1494394-9.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/mg/mga/mg-mga-S1494394-10.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/mg/mga/mg-mga-S1494394-11.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/mg/mga/mg-mga-S1494394-12.jpg"
				));
		vehicule.setMarque("MG");
		vehicule.setModele("mga");
		vehicule.setTarif(22500);
		vehicule.setTitle("MGA Fixed Head Coupe. Left Hand Drive.");
		vehicule.setType(TypeVehicule.AUTO);
		vehicules.put("1", vehicule);
		
		
		Vehicule vehicule1 = new Vehicule();
		vehicule1.setAnnee(1958);
		vehicule1.setId("2");
		vehicule1.setDescription("This Frogeye Sprite is finished in a high-lustre Primrose Yellow as supplied when new and is impeccable.  Passers-by smile at the cheeky, pert and charming character so strong that it is out of all proportion to its size!  The fastidious previous owner wanted panel gaps to be perfect and this is reflected in the vast expenditure to create a real show winning example.  All chrome has a mirror finish and only the front screen shows signs of aging.  The windscreen frame still has a row of nine lift-the-dot fasteners only fitted to very early production cars and so sought after today. The black hood and rare one-piece side screens are included along with the optional tonneau cover unmarked.  The complete metal bonnet assembly is pristine with the correct round Sprite badge wearing the coat of arms.  This is a remarkable survivor perfect for immediate shows and fun outings.   ");
		vehicule1.setExtract("A Very Early Production Austin-Healey Frogeye Sprite in Amazing Condition");
		vehicule1.setImagePrincipale("http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/austin-healey/sprite/austin-healey-sprite-S1470475-1.jpg");
		vehicule1.setImages(Arrays.asList(
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/austin-healey/sprite/austin-healey-sprite-S1470475-2.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/austin-healey/sprite/austin-healey-sprite-S1470475-3.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/austin-healey/sprite/austin-healey-sprite-S1470475-4.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/austin-healey/sprite/austin-healey-sprite-S1470475-5.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/austin-healey/sprite/austin-healey-sprite-S1470475-6.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/austin-healey/sprite/austin-healey-sprite-S1470475-7.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/austin-healey/sprite/austin-healey-sprite-S1470475-8.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/austin-healey/sprite/austin-healey-sprite-S1470475-9.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/austin-healey/sprite/austin-healey-sprite-S1470475-10.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/austin-healey/sprite/austin-healey-sprite-S1470475-11.jpg",
				"http://img.pistonheads.com.s3-eu-west-1.amazonaws.com/Fullsize/austin-healey/sprite/austin-healey-sprite-S1470475-12.jpg"
				));
		vehicule1.setMarque("Austin Healey");
		vehicule1.setModele("sprite MK1");
		vehicule1.setTitle("Austin Healey Frogeye Sprite MK1");
		vehicule1.setType(TypeVehicule.AUTO);
		vehicules.put("2", vehicule1);
	}

	@Override
	public List<Vehicule> rechercherVehicules(VehiculeFilters filters) {
		//TODO connexion API
		return new ArrayList<Vehicule>(vehicules.values());
	}
	
	@Override
	public Vehicule recupererVehicule(String id){
		//TODO connexion API
		Vehicule vehicule = vehicules.get(id);
		return vehicule;
	}

}
