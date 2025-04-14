package com.simple.flow.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.simple.flow.entity.FlowInstance;

/**
 * 功能描述：
 *
 * @author runrab
 * @date 2025/4/14 15:02
 */
public interface InstanceMapper extends BaseMapper<FlowInstance> {

    String getProcessInstanceStatus(String processInstanceId);
}
