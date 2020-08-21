package ma.sic.rh.gestionContrat.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ActivityArea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String label;
    

	public ActivityArea() {
		// TODO Auto-generated constructor stub
	}
	

	public ActivityArea(Long id, String label) {
		super();
		this.id = id;
		this.label = label;
	}


	@Override
	public String toString() {
		return "ActivityArea [id=" + id + ", label=" + label + "]";
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
