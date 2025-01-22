package com.vvv.spring_first_app.controller;

import com.vvv.spring_first_app.domain.User;
import com.vvv.spring_first_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

//    public HelloWorldController(HelloWorldService helloWorldService){
//        this.helloWorldService = helloWorldService;
//    }

    @GetMapping  // se ("/get") = /hello-world/get
    public String helloWorld(){
        return helloWorldService.helloWorld("Vinicius");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestBody User body){
        // injeto no param id String o parametro que vier na url. ("id") mapeia
        // injeta no param body da classe User tudo que vier do body da Requisição
        return "Hello, World POST" + body + id;
    }
}
