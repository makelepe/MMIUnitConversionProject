package za.co.mmiholding.conversion;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import za.co.mmiholding.conversion.bean.ConversionResult;
import za.co.mmiholding.conversion.config.ApplicationConfiguration;
import za.co.mmiholding.conversion.data.entity.Unit;
import za.co.mmiholding.conversion.service.UnitConversionService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
@DirtiesContext(classMode = ClassMode.AFTER_CLASS)
public class UnitConversionServiceTest {
	
	@Autowired
	private UnitConversionService unitConversionService;

	@Test
	public void testUnitRepo() {
		List<Unit> units = unitConversionService.getAllUnits();
		assertTrue ("Units failed to load", units!=null && units.size() > 1);
		
		ConversionResult results1 = unitConversionService.convert(1, 5, "1");
		assertTrue ("Valid result must return two list items!", results1 != null);

		ConversionResult results2 = unitConversionService.convert(1, 1, "1");
		assertTrue ("Invalid results must return one list item!", results2 == null);
	}

}
