package fr.adp.site.bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class AppBean {
	
	private String mailAdress = "jj.lenair@atelier-des-portes.fr";
	private String phoneNumber = "+0033677148391";
	private String formatPhoneNumber = "06 77 14 83 91";
	private String formatFaxNumber = "08 26 99 53 64";

	public String getMailAdress() {
		return mailAdress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getFormatPhoneNumber() {
		return formatPhoneNumber;
	}

	public String getFormatFaxNumber() {
		return formatFaxNumber;
	}
	

}
