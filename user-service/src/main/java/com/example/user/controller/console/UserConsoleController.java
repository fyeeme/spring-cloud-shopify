package com.example.user.controller.console;

import com.example.user.api.UserConsoleApi;
import com.example.user.dto.request.UserQueryDto;
import com.example.user.dto.request.UserRequestDto;
import com.example.user.dto.response.UserResponseDto;
import com.example.user.manager.UserManager;
import com.exmaple.lang.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserConsoleController  implements UserConsoleApi {
    private final UserManager userManager;

    /**
     * 新增用户
     *
     * @param requestDto
     * @return UserResponseDto
     */
    @PostMapping
    public Boolean inset(@RequestBody UserRequestDto requestDto) {
        userManager.insert(requestDto);
        return true;
    }

    /**
     * 根据Id 更新用户
     *
     * @param id
     * @param requestDto
     * @return
     */
    @PutMapping("/{id}")
    public Long update(@PathVariable Long id, @RequestBody UserRequestDto requestDto) {
        Long userId = userManager.update(id, requestDto);
        return userId;
    }

    /**
     * 根据ID查找用户
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public UserResponseDto findById(@PathVariable Long id) {
        UserResponseDto userResponseDto = userManager.findById(id);
        return userResponseDto;
    }

    /**
     * 根据 用户ID 和 状态查找用户
     * @param userId
     * @param status
     * @return
     */
    @GetMapping("/user/{userId}/status/{status}")
    public UserRequestDto findByUserIdAndStatus(@PathVariable Long userId, @PathVariable Integer status){
       return  userManager.findByUserIdAndStatus(userId, status);
    }
    /**
     * 根据Id 删除用户
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable long id) {
        userManager.deleteByid(id);
        return true;
    }

    @PostMapping("/search")
    public Page<UserResponseDto> findAll(@RequestBody UserRequestDto requestDto){
        return null;
    }

    @PostMapping("/list")
    public List<UserResponseDto> findList(@RequestBody UserRequestDto requestDto){
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
