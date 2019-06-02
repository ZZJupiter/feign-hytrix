package com.spring.test.hytrixtest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author catface
 * @date 2019-06-02 16:25
 * @description
 */
@FeignClient(name = "bye", url = "http://localhost:8090",fallbackFactory = ByeApiFallback.class)
public interface ByeApi {

  /**
   * say hello
   *
   * @param delay 延时
   * @return 返回值
   */
  @PostMapping(value = "/bye")
  String bye(Integer delay);
}
