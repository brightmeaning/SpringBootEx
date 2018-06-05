package com.packjjo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.packjjo.persistence")
public class AppMybatisApplication {

  public static void main(String[] args) {
    SpringApplication.run(AppMybatisApplication.class, args);
  }
}

