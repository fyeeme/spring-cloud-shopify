package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private final UserApi userApi;

    public OrderController(UserApi userApi) {
        this.userApi = userApi;
    }

    @GetMapping("/echo/{string}")
    public String echo(@PathVariable String string) {
        String userMsg = userApi.echo(string);
        return "hello Nacos Discovery " + string + ",msg from user api: " + userMsg;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer a, @RequestParam Integer b) {
        return String.valueOf(a / b);
    }

}