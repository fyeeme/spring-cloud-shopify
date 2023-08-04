package com.example.user.domain.query;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserPageQuery {
    private Long id;
    private String name;
    private String email;
}
