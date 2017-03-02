package mx.bluecode.maven.profiles.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Read application properties.
 * @author Julio Cesar Bolaños Palacios
 * @since 02/03/2017
 * @version 1.0
 */
public class ApplicationProperties {
	
	private static final Logger LOG = LoggerFactory.getLogger(ApplicationProperties.class);
    private static final String APPLICATION_PROPERTIES = "/application.properties";
    private static Properties config;
    private static InputStream is = null;
    
    static {       
        if (config == null) {
            config = new Properties();
            is = ApplicationProperties.class
                    .getResourceAsStream(APPLICATION_PROPERTIES);            
        }
    }
    
    public static Properties getConfig(){
        try {
            config.load(is);
        } catch (IOException e) {           
            LOG.error("ERROR AL CARGAR ARCHIVO PROPERTIES");
        }catch(NullPointerException e){            
            LOG.error("ERROR AL CARGAR PROPIEDAD");
        }
        return config;
    }
    
    public static String getValue(String key){
        return getConfig().getProperty(key);
    }
}
