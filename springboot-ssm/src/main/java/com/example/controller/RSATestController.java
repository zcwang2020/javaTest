/**
 * @(#)RSATest.java, 2023/1/31.
 * <p/>
 * Copyright 2023 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.controller;

import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.example.service.EncrypRSA;

/**
 * @Author zcwang
 * @Date 2023/1/31
 */
@RestController
public class RSATestController {

    @GetMapping("/signStr")
    public String signStr(@RequestParam String userName)  throws Exception{
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userName",userName);
        // jsonObject.put("regionCode","22222");

        //公钥
        String sign = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCX0BFHf3vgN8N9/sixjrErXQJatz7awCT0qXdM\n" +
                "kZ+1VBvkIJGjGVjYWEcsLsoHvygi+ZWlAYINUPaMPW/OhjL+2fCeYRpTObQrN4810sShbBb948p1\n" +
                "4pMPg8tf3DvgBh4Gyy4oHg78MLXviNbWPp2f/vOJwKAFXjsqIWVhzYrARQIDAQAB";
        byte[] bytes1 = EncrypRSA.decryptBASE64(sign);


        KeyFactory keyFactory1 = KeyFactory.getInstance(EncrypRSA.KEY_ALGORITHM);
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bytes1);
        RSAPublicKey publicKey = (RSAPublicKey) keyFactory1.generatePublic(x509EncodedKeySpec);

        byte[] bytes = jsonObject.toString().getBytes();
        byte[] encrypt = EncrypRSA.encrypt(publicKey, bytes);


        //加密后的字符串  加在跳转链接后即可
        String signStr = EncrypRSA.encryptBASE64(encrypt);

        return signStr;
    }

}