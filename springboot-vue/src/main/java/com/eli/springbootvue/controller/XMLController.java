package com.eli.springbootvue.controller;

import com.alibaba.fastjson.JSON;
import com.eli.springbootvue.data.XMLRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: tmind
 * @Date: 2024/2/27 20:42
 * @Description:
 */
@RequestMapping(value = "/xml")
@RestController
public class XMLController {

    @PostMapping(value = "/test"
            , produces = MediaType.APPLICATION_XML_VALUE)
    public String test(@RequestBody XMLRequest request) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String xml = objectMapper.writeValueAsString(request);
            return xml;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}
