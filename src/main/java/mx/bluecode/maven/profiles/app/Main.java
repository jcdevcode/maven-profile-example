package mx.bluecode.maven.profiles.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.bluecode.maven.profiles.config.ApplicationProperties;

public class Main {	
	
	private static final Logger log = LoggerFactory.getLogger(Main.class);
	private static final String HOST = "db.host";
	private static final String PORT = "db.port";
	private static final String USER = "db.user";
	private static final String PASSWORD = "db.password";
	private static final String ENVIROMENT = "app.env";
	
	private static final String[] PROPERTIES = {ENVIROMENT, HOST, PORT, USER, PASSWORD};
	
	public void printValues(){
		log.info("Getting properties values.");
		for(int i = 0; i < PROPERTIES.length; i++){
			log.info("[ Key property: {}] - [ Value property: {}]",PROPERTIES[i], ApplicationProperties.getValue(PROPERTIES[i]));
		}
	}
	
	public static void main(String[] args) {
		new Main().printValues();
	}

}
