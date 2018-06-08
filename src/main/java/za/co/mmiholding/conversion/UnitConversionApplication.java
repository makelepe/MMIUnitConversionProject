package za.co.mmiholding.conversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot base application class to bootstrap the application
 * 
 * 
 * @author Samuel Radingwane <mailto: makelepe1@gmail.com>
 * @since 2018-06-06
 * 
 */

@SpringBootApplication (scanBasePackages = {"za.co.mmiholding.conversion"})
public class UnitConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitConversionApplication.class, args);
	}
}
