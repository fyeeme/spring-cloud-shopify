package com.example.user.service;

import com.example.user.domain.entity.AccountDo;

import java.util.List;

public interface AccountService {
    Long insert(AccountDo accountDO);

    List<Long> batchCreate(List<AccountDo> accountDOs);

    Integer update(AccountDo userDO);

    AccountDo getById(Long id);

    List<AccountDo> list();

    Integer delete(Long id);

    List<Integer> batchDelete(List<Long> ids);
}
