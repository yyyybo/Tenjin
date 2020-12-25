package com.yibo.data.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 巡检组
 *
 * @author 莫问
 * @date 2020-12-16
 */
@Data
@Entity(name = "group")
public class GroupEntity {

    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer groupId;

    /**
     * 巡检组code
     */
    private String groupCode;

    /**
     * 巡检组名称
     */
    private String name;

    /**
     * 状态
     *
     * @see com.yibo.data.enums.SwitchStatusEnum
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 发送条件
     *
     * @see com.yibo.data.enums.TriggerConditionEnum
     */
    private Integer triggerCondition;

    /**
     * 是否发送邮件
     */
    private Integer isSendEmail;

    /**
     * 接收邮箱
     */
    private String emails;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

}
