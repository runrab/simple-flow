package com.simple.flow.logic;

import lombok.Data;

import java.util.Map;

/**
 * 功能描述：
 *
 * @author runrab
 * @date 2025/4/14 14:00
 */
@Data
public class LogicNode {
    private String id;
    private String type;
    private Integer x;
    private Integer y;
    private String text;
    private Map<String,Object> properties;


}
