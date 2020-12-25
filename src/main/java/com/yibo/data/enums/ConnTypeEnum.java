package com.yibo.data.enums;

import lombok.Getter;

import java.util.Objects;

/**
 * 数据库连接类型
 *
 * @author 莫问
 * @date 2020-12-16
 */
public enum ConnTypeEnum {

    /**
     * MySql
     */
    MYSQL("MySql", "com.mysql.jdbc.Driver"),

    /**
     * SqlServer
     */
    SQL_SERVER("SqlServer", "Sql Server"),

    /**
     * Oracle
     */
    ORACLE("Oracle", "Oracle");

    @Getter
    private final String code;
    @Getter
    private final String desc;

    ConnTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取值对应的枚举对象
     *
     * @param code code码
     * @return 结果
     */
    public static ConnTypeEnum getInstance(String code) {
        for (ConnTypeEnum obj : ConnTypeEnum.values()) {
            if (obj.getCode().equals(code)) {
                return obj;
            }
        }
        return null;
    }
}
