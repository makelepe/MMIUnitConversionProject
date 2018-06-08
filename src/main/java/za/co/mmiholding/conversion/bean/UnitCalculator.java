package za.co.mmiholding.conversion.bean;

import za.co.mmiholding.conversion.data.entity.UnitRate;

/**
 * This service class is responsible for calculating unit rates (Metric to Imperial and vice versa).
 * 
 * @author Samuel Radingwane <mailto: makelepe1@gmail.com>
 * @since 2018-06-06
 */
public class UnitCalculator {
	
	/**
	 * calculate metric unit rate from given rate and value.
	 * 
	 * @param rate - metric rate
	 * @param value - value to be converted / calculated
	 * @return results
	 */
	public String calculateMetricUnitRate (UnitRate rate, String value) {
		return String.valueOf(rate.getConversionRate() * Float.valueOf(value));
	}
	
	/**
	 * calculate imperial unit rate from given rate and value.
	 * 
	 * @param rate - metric rate
	 * @param value - value to be converted / calculated
	 * @return results
	 */
	public String calculateImperialUnitRate (UnitRate rate, String value) {
		return String.valueOf((1 / rate.getConversionRate()) * Float.valueOf(value));
	}

}
