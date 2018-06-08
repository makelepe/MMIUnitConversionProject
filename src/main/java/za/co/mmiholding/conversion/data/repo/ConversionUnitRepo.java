package za.co.mmiholding.conversion.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mmiholding.conversion.data.entity.Unit;

/**
 * JPA Repository class to manage Unit entity/table.
 * 
 * @author Samuel Radingwane <mailto: makelepe1@gmail.com>
 * @since 2018-06-06
 */

public interface ConversionUnitRepo extends JpaRepository<Unit, Integer> {
	
	/**
	 * Spring Data JPA : Query will be generated at runtime
	 * 
	 * @Query: select * from unit where category=':category' and type=":type";
	 */
	List<Unit> findAllByCategoryAndType (String category, String type);

}
