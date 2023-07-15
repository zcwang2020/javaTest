package io; /**
 * @(#)IoTest.java, 2021/10/26.
 * <p/>
 * Copyright 2021 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import work.ViewableUnitInfoVO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * @Author Tmind
 * @Date 2021/10/26
 */
public class IoTest {

    public static void main(String[] args) {
        ViewableUnitInfoVO viewableUnitInfoVO = new ViewableUnitInfoVO();
        viewableUnitInfoVO.setDepartmentId(1L);
        viewableUnitInfoVO.setAssignPoliceType(0);
        String queryJson = JSON.toJSONString(viewableUnitInfoVO);
        System.out.println(queryJson);
    }

    @Test
    public void copy() {
        try (
                FileReader fileReader = new FileReader("helloWorld.txt");
                FileWriter fileWriter = new FileWriter("hello.txt"))
         {
            char[] chars = new char[5];
            int read;
            while ((read = fileReader.read(chars)) != -1) {
                for (int i = 0; i < read; i++) {
                    fileWriter.write(chars);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getPath() {
        File file = new File("helloWorld.txt");
        System.out.println(file.getClass().getResource("path"));
        System.out.println(file.getPath());
    }



}