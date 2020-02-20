package duomenys.mitybai;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Maistines_medz {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String pav;
    private Integer id_grupes;
    
   
	public Maistines_medz(Integer id, String pav, Integer id_grupes) {
		super();
		this.id = id;
		this.pav = pav;
		this.id_grupes = id_grupes;
		
	}
	
	public Maistines_medz() {
		
	}
	/**
	 * @return the id
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
	/**
	 * @return the id_grupes
	 */
	public Integer getId_grupes() {
		return id_grupes;
	}

	/**
	 * @param pav the id_grupes to set
	 */
	public void setId_grupes(Integer id_grupes) {
		this.id_grupes = id_grupes;
	}

	/*public String Id_grupes_string() {
		
		return id_grupes.toString();	
	}*/
}
