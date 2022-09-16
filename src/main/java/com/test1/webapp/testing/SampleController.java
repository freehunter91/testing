package com.test1.webapp.testing;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {
    @RequestMapping(value="/")
    @ResponseBody
    public String sampleHome() {
        return "Hello Spring Boot.";
    }

    @RequestMapping(value="/health")
    @ResponseBody
    public String sampleHealth() {
        return "OK";
    }
}
