package com.simple.flow.enums;

import lombok.Getter;

/**
 * 功能描述：节点类型枚举
 *
 * @author runrab
 * @date 2025/4/14 14:19
 */
@Getter
public enum NodeTypeEnum {
    //网关
    GATEWAY("gateway"),
    TASK("task"),
    USER_NODE("userNode");
    private final String value;
    NodeTypeEnum(String value) {
        this.value = value;
    }
}
