package com.example.user.fallback;

import com.example.user.api.UserConsoleApi;
import com.example.user.dto.request.UserQueryDto;
import com.example.user.dto.request.UserRequestDto;
import com.example.user.dto.response.UserResponseDto;
import com.exmaple.lang.Page;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFallbackFactory implements FallbackFactory<UserConsoleApi> {
    @Override
    public UserConsoleApi create(Throwable cause) {
        return new UserConsoleApi() {
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
        };
    }
}
