/**
 * @(#)Socket.java, 2023/2/21.
 * <p/>
 * Copyright 2023 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package work;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @Author zcwang
 * @Date 2023/2/21
 */
public class Socket {

    public static void main(String[] args) {
        System.out.println("启动服务器端");

        //创建服务器端对象；
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8866);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(serverSocket.getLocalPort());
        }

    }
}