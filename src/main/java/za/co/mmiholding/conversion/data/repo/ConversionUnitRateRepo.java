package za.co.mmiholding.conversion.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import za.co.mmiholding.conversion.data.entity.Unit;
import za.co.mmiholding.conversion.data.entity.UnitRate;

/**
 * JPA Repository class to manage UnitRate entity/table.
 * 
 * @author Samuel Radingwane <mailto: makelepe1@gmail.com>
 * @since 2018-06-06
 */


public interface ConversionUnitRateRepo extends JpaRepository<UnitRate, Integer> {

	/**
	 * Spring Data JPA : Query will be generated at runtime
	 * 
	 * @Query: select * from unit_rate where metric_unit_id=':metricUnitId' and imperial_unit_id=":imperialUnitId";
	 */
	UnitRate findByMetricUnitAndImperialUnit (Unit metricUnit, Unit imperialUnit);

}
