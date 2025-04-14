package com.simple.flow.listener;

import com.simple.flow.domain.ProcessInstance;
import com.simple.flow.domain.ProcessModel;
import com.simple.flow.domain.ProcessNode;
import com.simple.flow.dto.FlowParams;

import java.util.List;
import java.util.Map;

/**
 * 功能描述：
 *
 * @author runrab
 * @date 2025/4/14 15:12
 */
public class ListenerVariable {
    private ProcessModel processModel;
    private ProcessInstance processInstance;
    private ProcessNode processNode;

    private List<ProcessNode> nextNodes;
    private List<ProcessNode> prevNodes;

    /**
     * 流程变量
     */
    private Map<String, Object> variable;

    /**
     * 工作流内置参数
     */
    private FlowParams flowParams;


    public ListenerVariable() {
    }
}
