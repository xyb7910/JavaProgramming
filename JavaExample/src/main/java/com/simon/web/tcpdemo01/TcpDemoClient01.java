package com.simon.web.tcpdemo01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpDemoClient01 {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        OutputStream os = null;
        try {
            // 1.link to server by address and port
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");
            int port = 8080;
            //2.create socket
            socket = new Socket(serverIP, port);
            //3.create input and output stream
            os = socket.getOutputStream();
            os.write("hello".getBytes());
        } catch (UnknownHostException e) {
        e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        }
}
