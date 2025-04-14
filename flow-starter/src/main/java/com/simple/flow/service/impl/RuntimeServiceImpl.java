package com.simple.flow.service.impl;

import com.simple.flow.entity.FlowInstance;
import com.simple.flow.mapper.InstanceMapper;

/**
 * 功能描述：
 *
 * @author runrab
 * @date 2025/4/14 15:00
 */
public class RuntimeServiceImpl {

    private InstanceMapper instanceMapper;

    public String getProcessInstanceStatus(String processInstanceId){
        return instanceMapper.getProcessInstanceStatus(processInstanceId);
    }

    public FlowInstance getProcessInstance(String processInstanceId){
        return instanceMapper.selectById(processInstanceId);
    }
}
