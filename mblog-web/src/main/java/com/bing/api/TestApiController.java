package com.bing.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bing on 2018/10/24.
 */
@RestController
@RequestMapping("/api")
public class TestApiController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
