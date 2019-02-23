package naukma.annotations.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:tenniscoach.properties")
@ComponentScan(basePackages = "naukma.annotations.practice")
public class Config {

    @Bean
    public List<String> studentList() {
        List<String> studentList = new ArrayList<String>();
        studentList.add("Vitaliy");
        studentList.add("Tom");
        return studentList;
    }

}
