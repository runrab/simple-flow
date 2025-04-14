package com.simple.flow.service;

import com.simple.flow.entity.FlowComment;
import com.simple.flow.entity.TaskEntity;

import java.util.Map;

public interface TaskService {
    void complete(String taskId);
    void complete(String taskId, Map<String,Object> variables);

    FlowComment addComment(String taskId, String message);
    void delComment(String commentId);
    void updateComment(String commentId, String message);

    void delete(String taskId);
    // 委派
    void delegate(String taskId, String userId);
    // 转办
    void resolve(String taskId, String userId);
    // 设置处理人
    void setAssignee(String taskId, String userId);
    // 设置拥有者
    void setOwner(String taskId, String userId);
    // 创建任务
    TaskEntity newTask();
    /**
     * 创建任务
     * @param isIndependent 是否独立任务
     * */
    TaskEntity newTaskOf(String taskId,boolean isIndependent);
    // 保存任务
    void saveTask(TaskEntity taskEntity);
    // 保存任务
    void saveTask(TaskEntity taskEntity, Map<String,Object> variables);
}
