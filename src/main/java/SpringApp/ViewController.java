package SpringApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {

    @GetMapping("/View")
    public View view(@RequestParam(value = "name", defaultValue = "World") String name){
        return new View("Sahibdeep","Singh",991425027);
    }

    @RequestMapping("/view")
    public static void run(){
        String METHOD_NAME = "Run()";
    }
}
