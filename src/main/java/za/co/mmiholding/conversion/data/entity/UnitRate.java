package za.co.mmiholding.conversion.data.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "unit_rate")
@XmlRootElement
public class UnitRate implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "conversion_rate")
    private Float conversionRate;
 
	@ManyToOne
	@JoinColumn(name="metric_unit_id")
	private Unit metricUnit;

	@ManyToOne
	@JoinColumn(name="imperial_unit_id")
	private Unit imperialUnit;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(Float conversionRate) {
		this.conversionRate = conversionRate;
	}

	public Unit getMetricUnit() {
		return metricUnit;
	}

	public void setMetricUnit(Unit metricUnit) {
		this.metricUnit = metricUnit;
	}

	public Unit getImperialUnit() {
		return imperialUnit;
	}

	public void setImperialUnit(Unit imperialUnit) {
		this.imperialUnit = imperialUnit;
	}

    
}
