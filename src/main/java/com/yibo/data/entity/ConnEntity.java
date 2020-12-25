package com.yibo.data.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 数据库连接配置
 *
 * @author 莫问
 * @date 2020-12-16
 */
@Data
@Entity(name = "conn")
public class ConnEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer connId;

    /**
     * 名称
     */
    private String name;

    /**
     * 类型
     *
     * @see com.yibo.data.enums.ConnTypeEnum
     */
    private String type;

    /**
     * 数据库链接
     */
    private String connString;

    /**
     * 账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String lastUpdateTime;

    /**
     * 状态
     *
     * @see com.yibo.data.enums.ConnTypeEnum
     */
    private Integer status;
}
