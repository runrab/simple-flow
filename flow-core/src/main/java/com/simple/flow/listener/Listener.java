package com.simple.flow.listener;
import java.io.Serializable;

/**
 * 监听器
 */
public interface Listener extends Serializable {

    /**
     * 开始监听器，任务开始办理时执行
     */
    String LISTENER_START = "start";

    /**
     * 分派监听器，动态修改代办任务信息
     */
    String LISTENER_ASSIGNMENT = "assignment";

    /**
     * 完成监听器，当前任务完成后执行
     */
    String LISTENER_FINISH = "finish";

    /**
     * 创建监听器，任务创建时执行
     */
    String LISTENER_CREATE = "create";

    /**
     * 表单数据加载监听器，内置表单使用
     */
    String LISTENER_FORM_LOAD = "formLoad";


    void notify(ListenerVariable listenerVariable);
}
