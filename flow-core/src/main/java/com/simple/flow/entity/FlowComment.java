package com.simple.flow.entity;

import lombok.Data;

/**
 * 功能描述：
 *
 * @author runrab
 * @date 2025/4/14 14:40
 */
@Data
public class FlowComment {
    private String id;
    private String taskId;
    private String message;
    private String userId;
    private String type="comment";
}
