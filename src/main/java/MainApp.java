import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "SimpleCamelRouting")
//@EnableAutoConfiguration
public class MainApp {

    public static void main(String... args){
        System.out.println(("Hi"));
        SpringApplication.run(MainApp.class, args);
    }
}
