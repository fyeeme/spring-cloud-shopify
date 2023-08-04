package com.example.user.manager;

import com.example.user.domain.entity.AccountDo;
import com.example.user.domain.entity.UserDO;
import com.example.user.dto.request.UserRequestDto;
import com.example.user.dto.response.UserResponseDto;
import com.example.user.service.AccountService;
import com.example.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * manager 不需要接口，是一种 facade 模式， 算是一种防腐设计：
 * 1. 降低  controller 的业务复杂度
 * 2. 防止 service 层相互调用，造成的循环依赖和后期业务拆分的复杂度
 */
@Service
@RequiredArgsConstructor
public class UserManager {
    private final UserService userService;
    private final AccountService accountService;

    @Transactional
    public Long insert(UserRequestDto userRequestDto) {
        UserDO userDO = convertToUserDo(userRequestDto);
        Long userId = userService.insert(userDO);
        userDO.setId(userId);

        AccountDo accountDO = convertToAccountDo(userDO);
        Long accountId = accountService.insert(accountDO);
        return userId;
    }

    private AccountDo convertToAccountDo(UserDO userDO) {
        return new AccountDo();
    }

    //TODO convert to UserDO
    private UserDO convertToUserDo(UserRequestDto userRequestDto) {
        return new UserDO();
    }

    public Long update(Long id, UserRequestDto requestDto) {
        return id;
    }

    public UserResponseDto findById(Long id) {
        return null;
    }

    public void deleteByid(long id) {
    }

    public UserRequestDto findByUserIdAndStatus(Long userId, Integer status) {
        return null;
    }
}
