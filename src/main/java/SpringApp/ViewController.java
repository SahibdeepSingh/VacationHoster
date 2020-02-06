package SpringApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {

    // Initialize the SLF4J for Logging
    private final static Logger indexLogger = LoggerFactory.getLogger(ViewController.class);

    @GetMapping("/View")
    public View view(@RequestParam(value = "name", defaultValue = "World") String name){
        return new View("Sahibdeep","Singh",991425027);
    }

    @RequestMapping("/view")
    public static void run(){
        String METHOD_NAME = "Run()";
        indexLogger.info("Enter Method"+METHOD_NAME);
        indexLogger.info("Exit Method"+METHOD_NAME);
    }
}
