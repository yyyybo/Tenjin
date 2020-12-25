package com.yibo.data.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 触发器配置
 *
 * @author 莫问
 * @date 2020-12-24
 */
@Data
@Entity(name = "trigger")
public class TriggerEntity {

    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 触发器名称
     */
    private String title;

    /**
     * 触发器表达式
     */
    private String corn;

    /**
     * 备注
     */
    private String remark;

    /**
     * 触发器状态
     *
     * @see com.yibo.data.enums.SwitchStatusEnum
     */
    private Integer status;

    /**
     * 关联业务组ID
     */
    private Integer groupId;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;
}
