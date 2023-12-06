package com.eli.springbootvue.data;

import lombok.Data;

import java.util.List;

/**
 * @author tangjinghua
 * @since 2023-11-07
 */
@Data
public class DataUploadDTO {

    /**
     * 时间戳
     */
    private long timestamp;

    /**
     * 分批数据
     */
    private List<DataUploadBatchDTO> batchDTOList;
}
