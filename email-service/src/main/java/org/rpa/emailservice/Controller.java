package org.rpa.emailservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("Hello");
        return "Hello";
    }
}
