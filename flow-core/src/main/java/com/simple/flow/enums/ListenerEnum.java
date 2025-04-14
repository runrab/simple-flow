package com.simple.flow.enums;

import lombok.Getter;

/**
 * 功能描述：监听器枚举
 *
 * @author runrab
 * @date 2025/4/14 14:11
 */
@Getter
public enum ListenerEnum {
    //发起流程
    START("start"),
    //结束流程
    END("end"),
    // 分配处理人
    ASSIGNEE("assignee"),
    // 超时
    TIMEOUT("timeout"),
    TIMEOUT_NOTICE("timeoutNotice"),
    // 完成任务
    COMPLETE("complete"),
    CANCEL("cancel"),
    // 创建、更新、删除节点
    CREATE("create"),
    UPDATE("update"),
    DELETE("delete"),

    SIGNAL("signal"),
    MESSAGE("message"),
    ERROR("error"),
    ESCALATION("escalation"),
    COMPENSATION("compensation"),
    SEND("send"),
    RECEIVE("receive"),
    SIGNAL_EVENT("signalEvent"),
    MULTI_INSTANCE("multiInstance");
    private final String value;
    ListenerEnum(String value) {
        this.value = value;
    }
}
