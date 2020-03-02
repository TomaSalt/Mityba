package duomenys.mitybai;
import java.util.List;
//import java.util.stream.*;
//import org.springframework.data.repository.Repository;
import org.springframework.data.repository.CrudRepository;



public interface ProduktaiRepository extends CrudRepository<Produktai, Integer>{
	
	List<Produktai> findByPav(String pav);

}
