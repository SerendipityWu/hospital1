package demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"demo.mapper"})
public class HospitalApp {
    public static void main(String[] args) {
        SpringApplication.run(HospitalApp.class);
    }
}
