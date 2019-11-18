package com.wqm.designation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wqm.designation.dao")
public class DesignationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignationApplication.class, args);
    }

}
