package duomenys.mitybai;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produktai_medziagos {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private Integer id_produkto;
    private Integer id_medziagos;
    private Double kiekis;
    
	public Produktai_medziagos(Integer id_produkto, Integer id_medziagos, Double kiekis) {
		super();
		this.id_produkto = id_produkto;
		this.id_medziagos = id_medziagos;
		this.kiekis = kiekis;
	}
    
	public Produktai_medziagos() {
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_produkto() {
		return id_produkto;
	}

	public void setId_produkto(Integer id_produkto) {
		this.id_produkto = id_produkto;
	}

	public Integer getId_medziagos() {
		return id_medziagos;
	}

	public void setId_medziagos(Integer id_medziagos) {
		this.id_medziagos = id_medziagos;
	}

	public Double getKiekis() {
		return kiekis;
	}

	public void setKiekis(Double kiekis) {
		this.kiekis = kiekis;
	}
	
}

