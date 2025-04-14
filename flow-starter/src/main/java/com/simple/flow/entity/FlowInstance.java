package com.simple.flow.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.simple.flow.enums.ProcessStatus;
import lombok.Data;

/**
 * 功能描述：
 *
 * @author runrab
 * @date 2025/4/14 15:25
 */
@TableName("flow_instance")
@Data
public class FlowInstance {
    private String id;
    private ProcessStatus status;
}
