package dev.lydtech.ctf_getting_started_starting_point;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/api/v1/hello")
    public String sayHello(){
        return "Hello there";
    }
}
