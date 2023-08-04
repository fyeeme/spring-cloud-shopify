package com.example.user.service;

import com.example.user.domain.entity.UserDO;

import java.util.List;

public interface UserService {
    Long insert(UserDO userDO);

    List<Long> batchCreate(List<UserDO> userDOs);

    Integer update(UserDO userDO);

    Integer delete(Long id);

    List<Integer> batchDelete(List<Long> ids);
}
