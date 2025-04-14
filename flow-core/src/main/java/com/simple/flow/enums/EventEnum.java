package com.simple.flow.enums;

/**
 * 事件枚举
 * */
public enum EventEnum {
    START("start"),
    END("end"),
    TASK("task"),
    GATEWAY("gateway"),
    SUB_PROCESS("subProcess"),
    SIGNAL("signal"),
    MESSAGE("message"),
    ERROR("error"),
    ESCALATION("escalation"),
    COMPENSATION("compensation"),
    CANCEL("cancel"),
    TIMER("timer"),
    MULTI_INSTANCE("multiInstance"),
    SCRIPT("script"),
    SEND("send"),
   RECEIVE("receive"),
    SIGNAL_EVENT("signalEvent");
    private final String value;
    EventEnum(String value){
        this.value=value;
    }
    public String getValue(){
        return value;
    }
}
