package za.co.mmiholding.conversion.bean;

public class ConversionResult {
	
	private String value;
	private String metricUnitName;
	private String imperialUnitName;
	private String convertedMetric;
	private String convertedImperial;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getMetricUnitName() {
		return metricUnitName;
	}
	public void setMetricUnitName(String metricUnitName) {
		this.metricUnitName = metricUnitName;
	}
	public String getImperialUnitName() {
		return imperialUnitName;
	}
	public void setImperialUnitName(String imperialUnitName) {
		this.imperialUnitName = imperialUnitName;
	}
	public String getConvertedMetric() {
		return convertedMetric;
	}
	public void setConvertedMetric(String convertedMetric) {
		this.convertedMetric = convertedMetric;
	}
	public String getConvertedImperial() {
		return convertedImperial;
	}
	public void setConvertedImperial(String convertedImperial) {
		this.convertedImperial = convertedImperial;
	}

}
