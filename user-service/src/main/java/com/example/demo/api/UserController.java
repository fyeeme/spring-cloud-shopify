package com.example.demo.api;

import com.example.demo.api.UserApi;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {

    @Override
    public String echo(@PathVariable String string) {
        return "hello Nacos Discovery " + string;
    }

    @Override
    public String divide(@RequestParam Integer a, @RequestParam Integer b) {
        return String.valueOf(a / b);
    }

}