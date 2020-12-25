package com.yibo.data.enums;

import lombok.Getter;

/**
 * 检查项状态
 *
 * @author 莫问
 * @date 2020-12-24
 */
public enum SwitchStatusEnum {

    /**
     * 正常
     */
    NORMAL(1, "正常"),

    /**
     * 停用
     */
    STOP(2, "停用"),

    /**
     * 删除
     */
    DELETE(3, "删除");

    @Getter
    private final int code;
    @Getter
    private final String desc;

    SwitchStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取值对应的枚举对象
     *
     * @param code code码
     * @return 结果
     */
    public static SwitchStatusEnum getInstance(Integer code) {
        for (SwitchStatusEnum obj : SwitchStatusEnum.values()) {
            if (obj.getCode() == code) {
                return obj;
            }
        }
        return null;
    }
}
