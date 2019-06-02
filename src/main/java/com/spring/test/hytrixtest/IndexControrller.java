package com.spring.test.hytrixtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author catface
 * @date 2019-06-02 11:36
 * @description
 */
@Slf4j
@RestController
public class IndexControrller {


  @PostMapping(value = "/syaHello")
  public String sayHello(@RequestBody Integer delay) throws InterruptedException {
    log.info("delay:{}", delay);
    if (delay == null) {
      return "sayHello";
    }
    Thread.sleep(delay * 1000);
    return "sayHello";
  }


  @PostMapping(value = "/bye")
  public String bye(@RequestBody Integer delay) throws InterruptedException {
    log.info("delay:{}", delay);
    if (delay == null || delay <= 0) {
      return "bye";
    }
    Thread.sleep(delay * 1000);
    return "bye";
  }
}
