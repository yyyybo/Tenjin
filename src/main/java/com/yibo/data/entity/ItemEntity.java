package com.yibo.data.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 检查项配置
 *
 * @author 莫问
 * @date 2020-12-24
 */
@Data
@Entity(name = "item")
public class ItemEntity {

    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联数据库连接配置ID
     */
    private Integer connId;

    /**
     * 检查项名称
     */
    private String title;

    /**
     * 检查SQL
     */
    private String sql;

    /**
     * 检查项状态
     *
     * @see com.yibo.data.enums.SwitchStatusEnum
     */
    private Integer status;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 关联巡检组ID
     */
    private Integer groupId;

    /**
     * TODO 待定
     */
    private Integer successType;
}
