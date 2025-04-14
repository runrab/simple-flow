package com.simple.flow.enums;

import lombok.Getter;

@Getter
public enum ProcessStatus {
    RUNNING("running"),
    SUSPENDED("suspended"),
    COMPLETED("completed"),
    CANCELLED("cancelled");

    private final String value;

    ProcessStatus(String value) {
        this.value = value;
    }

}
