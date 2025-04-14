package com.simple.flow.handler;

/**
 * 功能描述：全局租户处理器接口
 *
 * @author runrab
 * @date 2025/4/14 15:07
 */
public interface TenantHandler {

    /**
     * 获取租户ID
     *
     * @return 租户ID
     */
    String getTenantId();

}
