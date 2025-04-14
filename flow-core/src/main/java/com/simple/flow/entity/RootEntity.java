package com.simple.flow.entity;
import java.io.Serializable;
import java.util.Date;

/**
 * 功能描述：流程基础entity
 *
 * @author runrab
 * @date 2025/4/14 15:04
 */
public interface RootEntity extends Serializable {

    public String getId();

    public RootEntity setId(String id);

    public Date getCreateTime();

    public RootEntity setCreateTime(Date createTime);

    public Date getUpdateTime();

    public RootEntity setUpdateTime(Date updateTime);

    public String getTenantId();

    public RootEntity setTenantId(String tenantId);

    public String getDelFlag();

    public RootEntity setDelFlag(String delFlag);

}
