package com.eli.springbootvue.data;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

/**
 * @Author: tmind
 * @Date: 2024/2/28 08:59
 * @Description:
 */
@Data
public class Packages {

    @JacksonXmlProperty(localName = "package")
    private Pac	pac;
}
