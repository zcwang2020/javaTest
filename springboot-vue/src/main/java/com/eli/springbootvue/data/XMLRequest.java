package com.eli.springbootvue.data;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.List;

/**
 * @Author: tmind
 * @Date: 2024/2/27 20:43
 * @Description:
 */
@Data
@JacksonXmlRootElement(localName = "request")
public class XMLRequest {

    // @JacksonXmlProperty(localName = "deliveryOrder")
    // @JacksonXmlElementWrapper(useWrapping = false)
    private DeliveryOrderCode deliveryOrder;

    @JacksonXmlProperty(localName = "packages")
    private Packages packages;

}
