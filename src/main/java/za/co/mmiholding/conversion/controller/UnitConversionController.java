package za.co.mmiholding.conversion.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import za.co.mmiholding.conversion.bean.ConversionResult;
import za.co.mmiholding.conversion.data.entity.Unit;
import za.co.mmiholding.conversion.service.UnitConversionService;

@CrossOrigin
@RestController
@RequestMapping (path = "/conversion", produces = MediaType.APPLICATION_JSON_VALUE)
public class UnitConversionController {
	private static final Logger log = LoggerFactory.getLogger(UnitConversionController.class);

	@Autowired
	private UnitConversionService conversionService;


	@GetMapping("/ping")
    public String welcomeUser(@RequestParam(name="name", required=false, defaultValue="Radingwane") String name) {
		log.info("ping controller : " + name);
        return String.format("Welcome Mr/Mrs. %s!", name);
    }
	
	@GetMapping("/units")
    public  List<Unit> getAllUnits() {
    	List<Unit> units = new ArrayList<>();
    	try {
    		units = conversionService.getAllUnits();
    		log.info("fetched [" + (units!=null? units.size() : 0) + " units from databse");
    	} catch (Exception e) {
    		log.error("Error fetching units from database : " + e.getMessage(), e);
    	}
    	return units;
    }	
	
	@GetMapping("/convert")
    public  ResponseEntity<ConversionResult> convert(
    			@RequestParam(name="metricUnitId", required=true) Integer metricUnitId,
    			@RequestParam(name="imperialUnitId", required=true) Integer imperialUnitId,
    			@RequestParam(name="value", required=true) String value) {
    	
    	ConversionResult result = null;
    	try {
    		result = conversionService.convert(metricUnitId, imperialUnitId, value);

    	} catch (Exception e) {
    		log.error("Error converting units : " + e.getMessage(), e);
    	}
    	return new ResponseEntity<ConversionResult>(result, new HttpHeaders(), HttpStatus.OK);
    }
    
}
