package com.example.user.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;


@AllArgsConstructor
@Getter
public enum MediaEnum {

    VIDEO("video","0"),
    AUDIO("audio","1"),
    IMAGE("image","2"),
    OTHER("other","3");

    private final String name ;
    private final String index ;

    //cache values;
    static final MediaEnum[] VALUES;

    static {
        VALUES = MediaEnum.values();
    }

    public static MediaEnum fromName(String value) {
        return Arrays.stream(VALUES)
                .filter(item -> item.getName().equalsIgnoreCase(value))
                .findFirst().orElse(null);
    }

    public static MediaEnum fromValue(String value) {
        return Arrays.stream(VALUES)
                .filter(item -> item.getIndex().equalsIgnoreCase(value))
                .findFirst().orElse(null);
    }
}
