package com.simple.flow.helper;

import com.simple.flow.domain.ProcessModel;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 功能描述：模型缓存
 *
 * @author runrab
 * @date 2025/4/14 13:46
 */
public class ModelHelper {
    private final static ConcurrentHashMap<String, ProcessModel> CACHE=new ConcurrentHashMap<>();


    public void put( String key,ProcessModel model){
        CACHE.put(key, model);
    }

    public ProcessModel get(String key){
       return CACHE.get(key);
    }

    public void putIfAbsent(String key,ProcessModel model){
        CACHE.putIfAbsent(key,model);
    }

    public void remove(String key){
        CACHE.remove(key);
    }

    public void clean(){
        CACHE.clear();
    }


}
