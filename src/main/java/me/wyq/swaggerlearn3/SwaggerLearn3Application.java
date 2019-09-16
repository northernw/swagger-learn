package me.wyq.swaggerlearn3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SwaggerLearn3Application {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerLearn3Application.class, args);
    }

}
