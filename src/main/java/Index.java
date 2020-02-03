import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Index {

    // Initialize the SLF4J for Logging
    private final static Logger indexLogger = LoggerFactory.getLogger(Index.class);

    public static void main(String args[]){
        run();
    }

    public static void run(){
        String METHOD_NAME = "Run()";
        indexLogger.info("Enter Method"+METHOD_NAME);
        indexLogger.info("Exit Logger"+METHOD_NAME);
    }
}
