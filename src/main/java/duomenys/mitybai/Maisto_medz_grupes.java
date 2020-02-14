package duomenys.mitybai;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Septintas
 *
 */
@Entity
public class Maisto_medz_grupes {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String pav;
    
	public Maisto_medz_grupes() {

	}    
    
	public Maisto_medz_grupes(String pav) {
		super();
		this.pav = pav;
	}
	
	@Override
	public String toString() {
		return "Maisto_medz_grupes [id=" + id + ", pav=" + pav + "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPav() {
		return pav;
	}
	public void setPav(String pav) {
		this.pav = pav;
	}	

}
