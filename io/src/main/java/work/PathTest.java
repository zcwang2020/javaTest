/**
 * @(#)PathTest.java, 2023/2/22.
 * <p/>
 * Copyright 2023 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.alibaba.druid.wall.violation.ErrorCode;

/**
 * @Author zcwang
 * @Date 2023/2/22
 */
public class PathTest {
    public static void main(String[] args) {

        File file = new File("D:\\IDEA_workspace\\javaTest\\io\\screenshot-20230207-183440.png");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Path sourcePath = Paths.get("D:\\IDEA_workspace\\javaTest\\io\\screenshot-20230207-183440.png");
        String name = file.getName();
        name = name.replace(" ", "");
        System.out.println("name = " + name);
        Path path = Paths.get("D:\\IDEA_workspace\\javaTest\\io\\yuna-storage", name);
        System.out.println("path = " + path);
        try {
            Files.copy(fileInputStream, path);
        } catch (IOException e) {
            System.out.println("e = " + e);
        }
    }
}