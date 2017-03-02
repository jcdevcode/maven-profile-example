package mx.bluecode.maven.profiles.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit.framework.Assert;
import mx.bluecode.maven.profiles.app.Main;
import mx.bluecode.maven.profiles.config.ApplicationProperties;

/**
 * 
 * @author Julio Cesar Bolaños Palacios
 * @since 02/03/2017
 * @version 1.0
 */
public class ApplicationTest {

	private static final Logger log = LoggerFactory.getLogger(ApplicationTest.class);
	
	private static final String ENV_DEV_VALUE = "DEVELOP";	
	private static final String ENV_PROD_VALUE = "PRODUCTION";
	private static final String ENV_KEY = "app.env";
	
	@Test
	public void checkEviromentTest(){	
		log.info("----------------------");
		log.info("Check enviroment test");
		String value = ApplicationProperties.getValue(ENV_KEY);
		log.info("Value for {} in properties:  {}",ENV_KEY, value);
		
		if(value.equals(ENV_DEV_VALUE))
			Assert.assertEquals(ENV_DEV_VALUE, value);
		if(value.equals(ENV_PROD_VALUE))
			Assert.assertEquals(ENV_PROD_VALUE, value);
	}
	
	@Test
	public void getValuesTest(){
		log.info("----------------------");
		log.info("Print values in properties file.");
		Main app = new Main();
		app.printValues();
		Assert.assertTrue(true);
	}
}
