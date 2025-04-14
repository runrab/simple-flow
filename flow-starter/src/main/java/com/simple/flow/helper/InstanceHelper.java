package com.simple.flow.helper;

import com.simple.flow.domain.ProcessInstance;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 功能描述：流程实例缓存
 *
 * @author runrab
 * @date 2025/4/14 13:53
 */
public class InstanceHelper {
    private final static ConcurrentHashMap<String, ProcessInstance> CACHE=new ConcurrentHashMap<>();

}
