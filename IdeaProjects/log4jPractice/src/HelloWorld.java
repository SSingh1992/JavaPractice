import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Created by ssingh on 7/1/17.
 */
public class HelloWorld {
    final static Logger logger = Logger.getLogger(HelloWorld.class);
    public static void main(String[] args){
        System.out.println("hello with log4j import");
        //BasicConfigurator.configure();
        logger.info("This lo4j statement");
        logger.debug("This is a debug message");
        logger.error("This is an error message");
    }
}
