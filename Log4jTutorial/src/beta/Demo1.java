package beta;
import org.apache.logging.log4j.*;

public class Demo1 {

	
	private static Logger log=LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		
		
		log.debug("I am debugging");
		if(2>0)
			
		{
			log.info("Object is present1");
			log.debug("Object is present1");
			log.fatal("This is fatle1");
			
		
			log.error("object is not present1");
		}
		
		

	}

}
