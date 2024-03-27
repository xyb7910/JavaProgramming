package com.simon.web.tcpdemo01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class TcpServerDemo01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream is = null;
        ByteArrayOutputStream  baos = null;
        try {
            // 1.open server port
            serverSocket = new ServerSocket(8080);
            // 2.wait for client connection
            accept = serverSocket.accept();
            // 3.receive client message
            is = accept.getInputStream();

            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while( (len = is.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            System.out.println(baos.toString());
            System.out.println("数据来源为：" + accept.getInetAddress().getHostAddress());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(baos != null) {
                    baos.close();
                }
                if(is != null) {
                    is.close();
                }
                if(accept != null) {
                    accept.close();
                }
                if(serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
