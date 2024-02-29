package com.eli.springbootvue.data;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

/**
 * @Author: tmind
 * @Date: 2024/2/27 21:02
 * @Description:
 */
@Data
public class DeliveryOrderCode {

    // @JacksonXmlProperty(localName = "deliveryOrderCode")
    private String deliveryOrderId;
}
