package com.simple.flow.service;

import com.simple.flow.domain.ProcessInstance;
import com.simple.flow.domain.ProcessModel;
import com.simple.flow.enums.ProcessStatus;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface RuntimeService {
    // 启动流程实例
    void startProcessInstance(String processInstanceId, Map<String,Object> variables);
    void startProcessInstance(String processInstanceId);
    void deleteProcessInstance(String processInstanceId);
    void deleteProcessInstance(String processInstanceId, String deleteReason);
    // 挂起流程实例
    void suspendProcessInstance(String processInstanceId);
    // 激活流程实例
    void activateProcessInstance(String processInstanceId);
    void addEventListener(String eventType, String listenerType, String listenerId);
    void delEventListener(String eventType, String listenerType, String listenerId);
    void addEventListener(String eventType, String listenerType, String listenerId, Map<String,Object> properties);

    // 部署流程
    void deploy(ProcessModel processModel);
    void deploy(InputStream inputStream);
    void deploy(String str);

    // 流程模型相关
    ProcessModel getProcessModel(String processModelId);
    ProcessModel getProcessModel(String processModelId, String processModelVersion);
    List<ProcessModel> getProcessModelByKey(String processModelKey);
    // 流程实例相关
    ProcessInstance getProcessInstance(String processInstanceId);
    List<ProcessInstance> getProcessInstanceByKey(String processInstanceKey);
    List<ProcessInstance> getProcessInstanceByKey(String processInstanceKey, String processInstanceVersion);

    // 获得流程实例的状态
    ProcessStatus getProcessInstanceStatus(String processInstanceId);
}
