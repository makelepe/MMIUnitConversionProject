package za.co.mmiholding.conversion;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import za.co.mmiholding.conversion.config.ApplicationConfiguration;
import za.co.mmiholding.conversion.data.entity.Unit;
import za.co.mmiholding.conversion.data.entity.UnitRate;
import za.co.mmiholding.conversion.data.repo.ConversionUnitRateRepo;
import za.co.mmiholding.conversion.data.repo.ConversionUnitRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
@DirtiesContext(classMode = ClassMode.AFTER_CLASS)
public class UnitConversionRepoIntegrationTest {
	
	@Autowired
	private ConversionUnitRateRepo unitRateRepository;

	@Autowired
	private ConversionUnitRepo unitRepository;

	@Test
	public void testUnitRepo() {
		List<Unit> lengthMetricUnits = unitRepository.findAllByCategoryAndType("length", "metric");
		assertTrue ("Length Metric Units failed to load", lengthMetricUnits!=null && lengthMetricUnits.size() > 1);
		
		List<Unit> lengthImperialUnits = unitRepository.findAllByCategoryAndType("length", "imperial");
		assertTrue ("Length Imperial Units failed to load", lengthImperialUnits!=null && lengthImperialUnits.size() > 1);

		List<Unit> allUnits = unitRepository.findAll();
		assertTrue ("all units are not more than length imperial units", allUnits!=null && allUnits.size() > lengthImperialUnits.size());
	}


	@Test
	public void testUnitRateRepo() {
		List<Unit> lengthMetricUnits = unitRepository.findAllByCategoryAndType("length", "metric");
		List<Unit> lengthImperialUnits = unitRepository.findAllByCategoryAndType("length", "imperial");

		UnitRate unitRate = unitRateRepository.findByMetricUnitAndImperialUnit(
																lengthMetricUnits.get(0), 
																lengthImperialUnits.get(0));
		assertTrue ("Invalid Unit Rate", unitRate!=null && unitRate.getConversionRate() > 0);
	}

}
