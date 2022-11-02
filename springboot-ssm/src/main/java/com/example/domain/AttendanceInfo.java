package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceInfo{
    private static final long serialVersionUID = 2644424913864584193L;
    private Long id;

    private Long userId;
    /**
     * 签到日期
     */
    private Long attendanceDate;
    /**
     * '签到状态，0-未签到（日期未到），1-已签到，2-待补签（日期已过，但未签到），3-已补签',
     */
    private Integer attendanceStatus;

    /**
     * 连续签到天数
     */
    private Integer continuousDays;

    private Date createTime;

    private Date updateTime;
    /**
     * 操作人
     */
    private String operator;
}