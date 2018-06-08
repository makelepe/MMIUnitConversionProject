package za.co.mmiholding.conversion;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import za.co.mmiholding.conversion.bean.UnitCalculator;
import za.co.mmiholding.conversion.config.ApplicationConfiguration;
import za.co.mmiholding.conversion.data.entity.UnitRate;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
@DirtiesContext(classMode = ClassMode.AFTER_CLASS)
public class UnitCalculatorTest {
	
	@Autowired
	private UnitCalculator unitCalculator;

	@Test
	public void calculatorTest() {
		UnitRate rate = new UnitRate();
		rate.setConversionRate(2.3f);
		
		String result1 = unitCalculator.calculateImperialUnitRate(rate, "10");
		assertTrue ("Imperial Unit Rate calculator failed", Float.valueOf(result1).intValue() == 4);
	
		String result2 = unitCalculator.calculateMetricUnitRate(rate, "10");
		assertTrue ("Metric Unit Rate calculator failed", Float.valueOf(result2).intValue() == 23);
	}
	
	
}
