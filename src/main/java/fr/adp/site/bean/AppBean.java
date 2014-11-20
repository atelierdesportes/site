package fr.adp.site.bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class AppBean {
	
	private String mailAdress = "jj.lenair@atelier-des-portes.fr";
	private String phoneNumber = "06 77 14 83 91";

	public String getMailAdress() {
		return mailAdress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	

}
