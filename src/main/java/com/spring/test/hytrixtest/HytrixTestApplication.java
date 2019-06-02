package com.spring.test.hytrixtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HytrixTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(HytrixTestApplication.class, args);
  }

}
