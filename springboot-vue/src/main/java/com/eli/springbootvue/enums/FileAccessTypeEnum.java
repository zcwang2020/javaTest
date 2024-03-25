package com.eli.springbootvue.enums;

/**
 * @author cyzhao
 * @date 2019/10/22 10:25
 */
public enum FileAccessTypeEnum {

    /**
     * 公开
     */
    OPEN(1),

    /**
     * 登录
     */
    AUTH(2),

    /**
     * 私有
     */
    OWN(3);

    private final Integer code;


    FileAccessTypeEnum(Integer code) {
        this.code = code;
    }

    public int getValue() {
        return code;
    }

    public static FileAccessTypeEnum valueOf(Integer accessType) {
        for (FileAccessTypeEnum value : values()) {
            if (value.getValue() == accessType) {
                return value;
            }
        }
        return null;
    }
}
