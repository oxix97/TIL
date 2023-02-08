package com.example.hello.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/post-test")
public class PostApiController {

    @PostMapping("/json-test")
    public void post(@RequestBody Map<String, Object> requestData) {
        requestData.forEach((key, value) ->
                System.out.println("key : " + key + " , value : " + value)
        );
    }
}
