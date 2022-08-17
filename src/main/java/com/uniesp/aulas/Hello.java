package com.uniesp.aulas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Hello {
@GetMapping ("/")
    public static String main() {
        return "Hello world";

    }

}
