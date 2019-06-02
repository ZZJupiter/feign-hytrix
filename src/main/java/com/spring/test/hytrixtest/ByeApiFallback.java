package com.spring.test.hytrixtest;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author catface
 * @date 2019-06-02 16:27
 * @description
 */
@Slf4j
@Component
public class ByeApiFallback implements FallbackFactory<ByeApi> {

  @Override
  public ByeApi create(Throwable cause) {
    return new ByeApi() {
      @Override
      public String bye(Integer delay) {
        log.error("调用异常!",cause);
        return "rpc error!";
      }
    };
  }
}
