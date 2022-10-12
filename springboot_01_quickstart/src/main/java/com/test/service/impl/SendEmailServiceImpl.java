/**
 * @(#)SendEmailServiceImpl.java, 2022/10/12.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.test.service.SendEmailService;

/**
 * @Author zcwang
 * @Date 2022/10/12
 */

@Service
public class SendEmailServiceImpl implements SendEmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String from;

    private String to = "xxx";

    /**
     * 引入mailjar包，配置发送相关配置，发送
     */
    @Override
    public void sendEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
        System.out.println(from);
        message.setFrom(from);
        message.setTo(to);
        message.setSubject("javaTest");
        message.setText("邮件发送测试");
        javaMailSender.send(message);
    }
}