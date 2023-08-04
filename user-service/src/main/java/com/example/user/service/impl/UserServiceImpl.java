package com.example.user.service.impl;

import com.example.user.domain.entity.UserDO;
import com.example.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public Long insert(UserDO userDO) {
        return null;
    }

    @Override
    public List<Long> batchCreate(List<UserDO> userDOs) {
        return null;
    }

    @Override
    public Integer update(UserDO userDO) {
        return null;
    }

    @Override
    public Integer delete(Long id) {
        return null;
    }

    @Override
    public List<Integer> batchDelete(List<Long> ids) {
        return null;
    }
}
