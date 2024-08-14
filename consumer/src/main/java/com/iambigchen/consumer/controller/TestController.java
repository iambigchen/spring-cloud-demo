package com.iambigchen.consumer.controller;
import com.iambigchen.consumer.service.ConsumerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private ConsumerFeign consumerFeign;

    @GetMapping("/a")
    @ResponseBody
    public  String a()
    {
        return "a";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello()
    {
        return consumerFeign.hello();
    }
}
