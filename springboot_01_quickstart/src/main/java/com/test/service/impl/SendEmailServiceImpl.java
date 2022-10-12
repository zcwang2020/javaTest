/**
 * @(#)SendEmailServiceImpl.java, 2022/10/12.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.test.service.impl;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
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

    private String context = "<img src ='https://up.tt98.com/edpic/4a/42/e8/4a42e84dee00e0db05b1fade35972548.jpg'/><a href = 'https://www.baidu.com'> 点开有惊喜</a>";

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

    @Override
    public void sendEmail(String to) {
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            // 发送人
            mimeMessageHelper.setFrom(from + "(蜡笔小新)");
            // 接收人
            mimeMessageHelper.setTo(to);
            // 主题
            mimeMessageHelper.setSubject("复杂邮件测试");
            // 正文
            mimeMessageHelper.setText(context, true);
            // 附件
            File file = new File("D:\\download\\常用工具包\\geek.7z");
            File file2 = new File("D:\\app\\Steam\\steamapps\\workshop\\content\\431960\\2282186999\\preview.jpg");
            mimeMessageHelper.addAttachment("7z", file);
            mimeMessageHelper.addAttachment("image", file2);
            javaMailSender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}