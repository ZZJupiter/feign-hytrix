package com.spring.test.hytrixtest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author catface
 * @date 2019-06-02 14:06
 * @description
 */
@FeignClient(name = "hello", url = "http://localhost:8090",fallbackFactory = HelloApiFallback.class)
public interface HelloApi {

  /**
   * say hello
   *
   * @param delay 延时
   * @return 返回值
   */
  @PostMapping(value = "/syaHello")
  String sayHello(Integer delay);
}
