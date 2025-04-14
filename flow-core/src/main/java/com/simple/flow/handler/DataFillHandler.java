package com.simple.flow.handler;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.ObjectUtil;
import com.simple.flow.entity.RootEntity;

import java.util.Date;
import java.util.Objects;


/**
 * 功能描述：数据填充handler，以下三个接口按照实际情况实现
 *
 * @author runrab
 * @date 2025/4/14 15:06
 */

public interface DataFillHandler {

    /**
     * id填充
     *
     * @param object
     */
    default void idFill(Object object) {
        RootEntity entity = (RootEntity) object;
        if (ObjectUtil.isNotNull(entity)) {
            if (Objects.isNull(entity.getId())) {
                entity.setId(String.valueOf(IdUtil.getSnowflakeNextId()));
            }
        }
    }

    /**
     * 新增填充
     *
     * @param object
     */
    default void insertFill(Object object) {
        RootEntity entity = (RootEntity) object;
        if (ObjectUtil.isNotNull(entity)) {
            entity.setCreateTime(ObjectUtil.isNotNull(entity.getCreateTime()) ? entity.getCreateTime() : new Date());
            entity.setUpdateTime(ObjectUtil.isNotNull(entity.getUpdateTime()) ? entity.getUpdateTime() : new Date());
        }
    }

    /**
     * 设置更新常用参数
     *
     * @param object
     */
    default void updateFill(Object object) {
        RootEntity entity = (RootEntity) object;
        if (ObjectUtil.isNotNull(entity)) {
            entity.setUpdateTime(ObjectUtil.isNotNull(entity.getUpdateTime()) ? entity.getUpdateTime() : new Date());
        }
    }
}
