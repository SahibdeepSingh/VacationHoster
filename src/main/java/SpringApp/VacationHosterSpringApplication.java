package SpringApp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@Slf4j
public class VacationHosterSpringApplication {

    public static void main(String[] args){
        String method_Name = "main()";
        SpringApplication.run(VacationHosterSpringApplication.class, args);
        log.error("Entering Method: "+method_Name);
        log.error("Exiting Method: "+method_Name);
    }
}
