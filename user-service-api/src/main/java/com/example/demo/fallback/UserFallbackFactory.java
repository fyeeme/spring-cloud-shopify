package com.example.demo.fallback;

import com.example.demo.api.UserApi;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UserFallbackFactory implements FallbackFactory<UserApi> {
    @Override
    public UserApi create(Throwable cause) {
        return new UserApi() {
            @Override
            public String echo(String string) {
                return "fallback cause = " + cause.getMessage();
            }

            @Override
            public String divide(Integer a, Integer b) {
                return "fallback cause = " + cause.getMessage();
            }
        };
    }
}
