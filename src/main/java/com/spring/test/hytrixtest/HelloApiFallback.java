package com.spring.test.hytrixtest;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author catface
 * @date 2019-06-02 14:07
 * @description
 */
@Slf4j
@Component
public class HelloApiFallback implements FallbackFactory<HelloApi> {

  @Override
  public HelloApi create(Throwable throwable) {
    return new HelloApi() {
      @Override
      public String sayHello(Integer delay) {
        log.error("调用异常!",throwable);
        return "rpc error!";
      }
    };
  }
}
