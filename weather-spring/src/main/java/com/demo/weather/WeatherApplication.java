package com.demo.weather;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.demo.weather.mapper")
@SpringBootApplication
public class WeatherApplication {   

    public static void main(String[] args) {
        SpringApplication.run(WeatherApplication.class, args);
    }

}
