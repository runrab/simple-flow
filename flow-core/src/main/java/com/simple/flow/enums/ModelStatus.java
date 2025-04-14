package com.simple.flow.enums;

import lombok.Getter;


@Getter
public enum ModelStatus {
    // 运行
    RUNNING("running"),
    // 暂停
    SUSPENDED("suspended");

    private final String value;

    ModelStatus(String value) {
        this.value = value;
    }

}
