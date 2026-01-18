package com.helalferrari.helloworld.controller;

import com.helalferrari.helloworld.model.Produto;
import com.helalferrari.helloworld.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    @Qualifier("v2")
    private IMessageService service;

    @GetMapping("/hello")
    public String sayHello() {
        return service.sayCustomMessage("Hello World");
    }


}
