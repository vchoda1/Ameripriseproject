package com.example.Rest.Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SampleController {
//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/sample")

    public String getHelloWorld(){
        return "Hello World";
    }
}

//    } sample(@RequestParam(value = "name", defaultValue = "World") String name) {
//        return new Sample(counter.incrementAndGet(),String.format(template,name));
//    }
//
//
//    }

