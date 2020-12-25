package com.yibo.data.enums;

import lombok.Getter;

import java.util.Objects;

/**
 * 发送条件
 *
 * @author 莫问
 * @date 2020-12-16
 */
public enum TriggerConditionEnum {

    /**
     * 默认
     */
    DEFAULT(1, "默认(只有查询到数据,才触发发送事件)"),

    /**
     * 发送
     */
    SEND(2, "发送");

    @Getter
    private final int code;
    @Getter
    private final String desc;

    TriggerConditionEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取值对应的枚举对象
     *
     * @param code code码
     * @return 结果
     */
    public static TriggerConditionEnum getInstance(Integer code) {
        for (TriggerConditionEnum obj : TriggerConditionEnum.values()) {
            if (Objects.equals(obj.getCode(), code)) {
                return obj;
            }
        }
        return null;
    }
}
