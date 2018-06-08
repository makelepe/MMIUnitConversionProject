package za.co.mmiholding.conversion.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.mmiholding.conversion.bean.ConversionResult;
import za.co.mmiholding.conversion.bean.UnitCalculator;
import za.co.mmiholding.conversion.data.entity.Unit;
import za.co.mmiholding.conversion.data.entity.UnitRate;
import za.co.mmiholding.conversion.data.repo.ConversionUnitRateRepo;
import za.co.mmiholding.conversion.data.repo.ConversionUnitRepo;

/**
 * This service class is responsible for fetching data from database, perform conversion and send results to the client.
 * 
 * @author Samuel Radingwane <mailto: makelepe1@gmail.com>
 * @since 2018-06-06
 */

@Service
public class UnitConversionService {
	private static final Logger log = LoggerFactory.getLogger(UnitConversionService.class);
	 
	@Autowired
	private ConversionUnitRepo conversionUnitRepo;
	
	@Autowired
	private ConversionUnitRateRepo conversionUnitRateRepo;
	
	@Autowired
	private UnitCalculator unitCalculator;

	/**
	 * 	convert metric unit to imperial and vice versa. Utilize supplied units and value to do conversion.
	 *  supplied ID's are resolved into UNIT entities.  
	 * 
	 * @param metricUnitId - metric unit database record ID 
	 * @param imperialUnitId - imperial unit database record ID
	 * @param value - value to be converted
	 * @return List<String> - results
	 * @throws general exception in case of failure to be caught in Controller.
	 * 
	 */
	public ConversionResult convert(Integer metricUnitId, Integer imperialUnitId, String value) {
		ConversionResult result = null;
		
		// fetch units
		Optional<Unit> metricUnitOpt = conversionUnitRepo.findById(metricUnitId);
		Optional<Unit> imperialUnitOpt = conversionUnitRepo.findById(imperialUnitId);
		
		Unit metricUnit = metricUnitOpt.isPresent() ? metricUnitOpt.get() : new Unit();
		Unit imperialUnit = imperialUnitOpt.isPresent() ? imperialUnitOpt.get() : new Unit();
		
		UnitRate rate  = conversionUnitRateRepo.findByMetricUnitAndImperialUnit(metricUnit,imperialUnit); 
		if (rate != null) {
			log.info("rate >> " + rate.getConversionRate());
			result = new ConversionResult();
			result.setValue(value);
			result.setImperialUnitName(imperialUnit.getName());
			result.setMetricUnitName(metricUnit.getName());
			result.setConvertedMetric(unitCalculator.calculateMetricUnitRate(rate, value));
			result.setConvertedImperial(unitCalculator.calculateImperialUnitRate(rate, value));
			
		} 
		
		else {
			log.info("rate not found ");
		}
		
		return result;
	}
	
	/**
	 * fetches all available units from database
	 * 
	 * @return List<Unit> - list of available units in database
	 * 
	 */

	public List<Unit> getAllUnits () {
		
		List<Unit> units = conversionUnitRepo.findAll();
		
		return units;
	}

}
