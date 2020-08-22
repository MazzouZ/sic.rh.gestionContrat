package ma.sic.rh.gestionContrat.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ParentCompany implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	 private String socialReason;
	  
	   private String city;
	   
	   private String activitySector;
	   
	public ParentCompany() {
		// TODO Auto-generated constructor stub
	}

	public ParentCompany(String socialReason, String city, String activitySector) {
		super();
		this.socialReason = socialReason;
		this.city = city;
		this.activitySector = activitySector;
	}





	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public String getSocialReason() {
		return socialReason;
	}

	public void setSocialReason(String socialReason) {
		this.socialReason = socialReason;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getActivitySector() {
		return activitySector;
	}

	public void setActivitySector(String activitySector) {
		this.activitySector = activitySector;
	}

	
	
	

}
