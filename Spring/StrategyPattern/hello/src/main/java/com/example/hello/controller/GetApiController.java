package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/get-test")
public class GetApiController {

    @GetMapping(path = "/hello") // http://localhost:9090/api/get-test/hello
    public String printHello() {
        return "get Hello";
    }

    // get,post,pu,delete 지정 할 수 있으며 위의 get mapping의 경우를 이전에 사용한 경우다.
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() {
        return "get hi";
    }

    //http:localhost:9090/api/get-test/path-variable/{name}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName) {
        System.out.println("name : " + pathName);
        return pathName;
    }
}
