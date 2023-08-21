package com.example.user.api;

import com.example.user.dto.request.UserQueryDto;
import com.example.user.dto.request.UserRequestDto;
import com.example.user.dto.response.UserResponseDto;
import com.example.user.fallback.UserFallbackFactory;
import com.exmaple.lang.Page;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "user-service", path = "/users", fallbackFactory = UserFallbackFactory.class)
public interface UserApi {

    /**
     * 新增用户
     *
     * @param requestDto
     * @return UserResponseDto
     */
    @PostMapping()
    Boolean inset(@RequestBody UserRequestDto requestDto);

    /**
     * 根据Id 更新用户
     *
     * @param id
     * @param requestDto
     * @return
     */
    @PostMapping("/{id}")
    Long update(@PathVariable Long id, @RequestBody UserRequestDto requestDto);

    /**
     * 根据ID查找用户
     *
     * @param id
     * @return
     */
    @PostMapping("/findById")
    UserResponseDto findById(@PathVariable Long id);

    /**
     * 根据 用户ID 和 状态查找用户
     *
     * @param userId 用户ID
     * @param status 用户状态
     * @return UserRequestDto
     */
    @GetMapping("/findByUserIdAndStatus")
    UserRequestDto findByUserIdAndStatus(@PathVariable Long userId, @PathVariable Integer status);

    @PostMapping("/delete/{id}")
    Boolean deleteById(@PathVariable long id);

    @DeleteMapping("/batch/{ids}")
    Boolean deleteAllById(@PathVariable List<Long> ids);

    @PostMapping("/search")
    Page<UserResponseDto> findAll(@RequestBody UserQueryDto queryDto);

    @PostMapping("/list")
    List<UserResponseDto> findList(@RequestBody UserQueryDto queryDto);

    //--- api for test
    @GetMapping("/echo/{string}")
    String echo(@PathVariable String string);

    @GetMapping("/divide")
    String divide(@RequestParam Integer a, @RequestParam Integer b);



}
