package bachtiar.firdaus.spring_design_pattern_creational.singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SingletonApplication {

    @Bean
    public Counter counter(){
        return new Counter();
    }

}
