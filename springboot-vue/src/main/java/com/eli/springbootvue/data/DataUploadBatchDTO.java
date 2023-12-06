package com.eli.springbootvue.data;

import lombok.Data;

/**
 * @author tangjinghua
 * @since 2023-11-07
 */
@Data
public class DataUploadBatchDTO {
    /**
     * 人群 ID，多个值以逗号分割，推呗分配
     */
    private String crowdIds;

    /**
     * 批次号(指定同一批次数据)
     */
    private String batchId;

    /**
     * 设备号集，批量上传以”,”分割
     */
    private String deviceIds;

    /**
     * 设备类型：包含 phone;IMEI;OAID;IDFA
     */
    private String deviceType;
}
