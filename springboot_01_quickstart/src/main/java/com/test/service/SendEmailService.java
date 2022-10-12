/**
 * @(#)SendEmailService.java, 2022/10/12.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.test.service;

/**
 * @Author zcwang
 * @Date 2022/10/12
 */
public interface SendEmailService {

    void sendEmail();

    void sendEmail(String to);
}