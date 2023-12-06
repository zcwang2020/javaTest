package com.eli.springbootvue.data;

import lombok.Data;

/**
 * @Author: tmind
 * @Date: 2023/11/23 13:38
 * @Description:
 */
@Data
public class TuiBeiDataTO {

    /**
     * 人群id
     */
    private String crowId;

    /**
     * 批次号
     */
    private String batchId;

    /**
     * 设备类型
     */
    private String deviceType;

    /**
     * 手机设备号，作为用户唯一标识
     */
    private String deviceId;
}
