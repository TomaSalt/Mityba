package duomenys.mitybai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class PageController {
	@Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
	private ProduktaiRepository produktai_rep;
	@Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data	
	private Maistines_medzRepository maistines_medz_rep;
	@Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data	
	private Maisto_medz_grupesRepository maisto_medz_grupes_rep;
	@Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data	
	private Produktai_medziagosRepository produktai_medziagos_rep;
	
	@RequestMapping(path="/produktai", method={ RequestMethod.GET, RequestMethod.POST })
    public String produktai(
    		@RequestParam(name="pav", required=false, defaultValue="") String pav
    		, @RequestParam(name="pildyti", required=false, defaultValue="nepildyti") String pildyti
    		, Model model 
    	) {
        
        if ( pildyti.equals("papildyti") ) {
        	
        	Produktai produktas = new Produktai( pav );
        	produktai_rep.save( produktas );
        }
        
        model.addAttribute("lst", produktai_rep.findAll() );
        
        return "produktas";
    }	
	@RequestMapping(path="/maistines_medz", method={ RequestMethod.GET, RequestMethod.POST })
    public String maistines_medz(
    		@RequestParam(name="pav", required=false, defaultValue="") String pav
    		, @RequestParam(name="id_grupes", required=false, defaultValue="") Integer id_grupes
    		, @RequestParam(name="pildyti", required=false, defaultValue="nepildyti") String pildyti
    		, Model model 
    	) {
        
        if ( pildyti.equals("papildyti") ) {
        	
        	Maistines_medz maistine_medz = new Maistines_medz( pav, id_grupes );
        	maistines_medz_rep.save( maistine_medz );
        }
        
        model.addAttribute("lst", maistines_medz_rep.findAll() );
        
        return "maistine_medz";
    }
	@RequestMapping(path="/maisto_medz_grupes", method={ RequestMethod.GET, RequestMethod.POST })
    public String maisto_medz_grupes(
    		@RequestParam(name="pav", required=false, defaultValue="") String pav
    		, @RequestParam(name="pildyti", required=false, defaultValue="nepildyti") String pildyti
    		, Model model 
    	) {
        
        if ( pildyti.equals("papildyti") ) {
        	
        	Maisto_medz_grupes maisto_medz_grupe = new Maisto_medz_grupes( pav );
        	maisto_medz_grupes_rep.save( maisto_medz_grupe );
        }
        
        model.addAttribute("lst", maisto_medz_grupes_rep.findAll() );
        
        return "maisto_medz_grupe";
    }
	@RequestMapping(path="/produktai_medziagos", method={ RequestMethod.GET, RequestMethod.POST })
    public String produktai_medziagos(
    		@RequestParam(name="id_produkto", required=false, defaultValue="") Integer id_produkto
    		, @RequestParam(name="id_medziagos", required=false, defaultValue="") Integer id_medziagos
    		, @RequestParam(name="kiekis", required=false, defaultValue="0") Double kiekis
    		, @RequestParam(name="pildyti", required=false, defaultValue="nepildyti") String pildyti
    		, Model model 
    	) {
        
        if ( pildyti.equals("papildyti") ) {
        	
        	Produktai_medziagos produktas_medziaga = new Produktai_medziagos( id_produkto, id_medziagos, kiekis );
        	produktai_medziagos_rep.save( produktas_medziaga );
        }
        
        model.addAttribute("lst", produktai_medziagos_rep.findAll() );
        
        return "produktas_medziaga";
    }
}
