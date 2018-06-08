package za.co.mmiholding.conversion.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import za.co.mmiholding.conversion.bean.UnitCalculator;

/**
 * Spring Config class - is a very important class which defines all config's of this project.
 *  - define all beans used in the project
 * 
 * 
 * @author Samuel Radingwane <mailto: makelepe1@gmail.com>
 * @since 2018-06-06
 */

@Configuration
@ComponentScan("za.co.mmiholding.conversion")
@EnableJpaRepositories("za.co.mmiholding.conversion.data")
public class ApplicationConfiguration {

	/**
	 * auto create tables and insert static data on init.
	 * @return datasource
	 */
	@Bean
	public DataSource dataSource() {
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase db = builder
			.setType(EmbeddedDatabaseType.H2) 
			.addScript("db/sql/create-db.sql")
			.addScript("db/sql/insert-data.sql")
			.build();
		return db;
	}

	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter bean = new HibernateJpaVendorAdapter();
		bean.setDatabase(Database.H2);
		bean.setGenerateDdl(true);
		return bean;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
			DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setDataSource(dataSource);
		bean.setJpaVendorAdapter(jpaVendorAdapter);
		bean.setPackagesToScan("za.co.mmiholding.conversion");
		return bean;
	}

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
		return new JpaTransactionManager(emf);
	}
	
	@Bean
	public UnitCalculator unitCalculatorBean () {
		return new UnitCalculator();
	}
}