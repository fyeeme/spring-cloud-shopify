package com.example.user.controller.api;

import com.example.user.api.UserApi;
import com.example.user.dto.request.UserQueryDto;
import com.example.user.dto.request.UserRequestDto;
import com.example.user.dto.response.UserResponseDto;
import com.example.user.manager.UserManager;
import com.exmaple.lang.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {

    private final UserManager userManager;

    @Override
    public String echo(@PathVariable String string) {
        return "hello Nacos Discovery " + string;
    }

    @Override
    public String divide(@RequestParam Integer a, @RequestParam Integer b) {
        return String.valueOf(a / b);
    }

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
}
