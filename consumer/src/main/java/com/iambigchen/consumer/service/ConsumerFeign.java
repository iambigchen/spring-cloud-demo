package com.iambigchen.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(name = "user")
public interface ConsumerFeign {
    @RequestMapping("/hello")
    String hello();
}
