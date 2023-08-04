package com.example.user.service.impl;

import com.example.user.domain.entity.AccountDo;
import com.example.user.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public Long insert(AccountDo accountDO) {
        return null;
    }

    @Override
    public List<Long> batchCreate(List<AccountDo> accountDOs) {
        return null;
    }

    @Override
    public Integer update(AccountDo userDO) {
        return null;
    }

    @Override
    public AccountDo getById(Long id) {
        return null;
    }

    @Override
    public List<AccountDo> list() {
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
