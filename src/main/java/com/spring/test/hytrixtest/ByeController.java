package com.spring.test.hytrixtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author catface
 * @date 2019-06-02 14:10
 * @description
 */
@Slf4j
@RestController
public class ByeController {

  @Autowired
  private ByeApi byeApi;

  @GetMapping(value = "/call/bye")
  public String sayHello(Integer delay) {
    log.info("delay:{}", delay);
    String result = byeApi.bye(delay);
    System.out.println(result);
    return result;
  }

}
