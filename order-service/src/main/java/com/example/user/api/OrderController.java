package com.example.user.api;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final UserApi userApi;

    @Value("${spring.application.name}")
    private String name;

    @GetMapping("/echo/{string}")
    public String echo(@PathVariable String string) {
        String userMsg = userApi.echo(string);
        return "hello Nacos Discovery " + string + name + ",msg from user api: " + userMsg;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer a, @RequestParam Integer b) {
        return String.valueOf(a / b);
    }

}