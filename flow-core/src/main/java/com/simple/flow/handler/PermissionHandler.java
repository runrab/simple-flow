package com.simple.flow.handler;

import java.util.List;

/**
 * 功能描述：
 *
 * @author runrab
 * @date 2025/4/14 15:07
 */
public interface PermissionHandler {

    /**
     * 审批前获取当前办理人，办理时会校验的该权限集合
     * 后续在{@link FlowParams#getPermissionFlag}  中获取
     * 返回当前用户权限集合
     *
     */
    List<String> permissions();

    /**
     * 获取当前办理人
     * @return 当前办理人
     */
    String getHandler();

}
