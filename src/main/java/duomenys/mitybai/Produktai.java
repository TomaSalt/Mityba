package duomenys.mitybai;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produktai {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String pav;
   
	public Produktai(Integer id, String pav) {
		super();
		this.id = id;
		this.pav = pav;
		
	}
	
	public Produktai() {
		
	}
	/**
	 * @return the pav
	 */
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * @return the pav
	 */
	public String getPav() {
		return pav;
	}

	/**
	 * @param pav the pav to set
	 */
	public void setPav(String pav) {
		this.pav = pav;
	}

	/*public String ThAtstumasKm() {
		
		return atstumas_km.toString();	
	}*/
}
