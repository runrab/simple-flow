package com.simple.flow.logic;

import lombok.Data;

import java.util.Map;

/**
 * 功能描述：
 *
 * @author runrab
 * @date 2025/4/14 14:01
 */
@Data
public class LogicEdge {
    private String type;
    private String sourceNodeId;
    private String targetNodeId;
    private Map<String,Object> properties;
}
