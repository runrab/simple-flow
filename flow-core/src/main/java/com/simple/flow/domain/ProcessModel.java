package com.simple.flow.domain;

import lombok.Data;

import java.util.List;

/**
 * 功能描述：
 *
 * @author runrab
 * @date 2025/4/14 13:49
 */
@Data
public class ProcessModel {

    private String id;

    private String key;

    /**
     * 版本
     * */
    private Integer version=0;

    /**节点*/
    private List<ProcessNode> nodes;
    /**
     * 连线
     * */
    private List<ProcessEdge> edges;

}
