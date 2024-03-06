/**
 * @(#)WeeKInfoBo.java, 2022/4/24.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.eli.springbootvue.data;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author zcwang
 * @Date 2022/4/24
 */
@Data
public class WeekInfoBO implements Serializable {

    private static final long serialVersionUID = -8257847770069791918L;

    /**
     * 日期，格式yyyy-MM-dd
     */
    private String date;

    /**
     * com.netease.yanxuan.act.attendance.common.constants.enums.SignInStatusEnum
     */
    private Integer signInStatus;

    /**
     * 当日签到奖励积分
     */
    private Long attendancePoint;

    /**
     * 是否是当日
     */
    private Boolean isToday;
}