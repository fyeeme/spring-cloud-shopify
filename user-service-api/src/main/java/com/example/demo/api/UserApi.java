package com.example.demo.api;

import com.example.demo.fallback.UserFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service", fallbackFactory = UserFallbackFactory.class)
public interface UserApi {

    @GetMapping("/echo/{string}")
    String echo(@PathVariable String string);

    @GetMapping("/divide")
    String divide(@RequestParam Integer a, @RequestParam Integer b);

}
