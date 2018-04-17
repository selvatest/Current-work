package GenericMethods;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {
/*
	Logger log = Logger.getLogger(Log.class);
	PropertyConfigurator.*/
	
	public  static Logger log = Logger.getLogger(Log.class);
	//PropertyConfigurator.configure("Log4j.properties");
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Log  a= new Log();
         a.error("error log");
	}
*/
	public void info(String logname) {

		log.info(logname);
	}

	public void warn(String logname) {

		log.warn(logname);
	}

	public void fatal(String logname) {
		log.fatal(logname);
	}

	public void error(String logname) {
		log.error(logname);
	}

}
