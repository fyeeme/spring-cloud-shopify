package com.example.user.fallback;

import com.example.user.api.UserApi;
import com.example.user.dto.request.UserQueryDto;
import com.example.user.dto.request.UserRequestDto;
import com.example.user.dto.response.UserResponseDto;
import com.exmaple.lang.Page;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFallbackFactory implements FallbackFactory<UserApi> {
    @Override
    public UserApi create(Throwable cause) {
        return new UserApi() {
            @Override
            public Boolean inset(UserRequestDto requestDto) {
                return null;
            }

            @Override
            public Long update(Long id, UserRequestDto requestDto) {
                return null;
            }

            @Override
            public UserResponseDto findById(Long id) {
                return null;
            }

            @Override
            public UserRequestDto findByUserIdAndStatus(Long userId, Integer status) {
                return null;
            }

            @Override
            public Boolean deleteById(long id) {
                return null;
            }

            @Override
            public Boolean deleteAllById(List<Long> ids) {
                return null;
            }

            @Override
            public Page<UserResponseDto> findAll(UserQueryDto queryDto) {
                return null;
            }

            @Override
            public List<UserResponseDto> findList(UserQueryDto queryDto) {
                return null;
            }

            @Override
            public String echo(String string) {
                return null;
            }

            @Override
            public String divide(Integer a, Integer b) {
                return null;
            }
        };
    }
}
