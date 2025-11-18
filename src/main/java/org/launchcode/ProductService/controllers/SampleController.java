package org.launchcode.ProductService.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/sayHello")
    public String sayHelloWorld()
    {
        return "Hello World";
    }

    @GetMapping("/sayBye/{name}")
        public String sayBye(@PathVariable("name") String name)
        {
            return "Bye" + name;
        }
}

