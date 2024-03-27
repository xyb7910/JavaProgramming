package com.simon.web.testipaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress1 = InetAddress.getByName("172.0.0.1");
        System.out.println(inetAddress1);
        InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
        System.out.println(inetAddress2);
        InetAddress inetAddress3 = InetAddress.getLocalHost();
        System.out.println(inetAddress3);


        //getHostName
        System.out.println(inetAddress2.getHostName());
        //getHostAddress
        System.out.println(inetAddress2.getHostAddress());

        System.out.println(inetAddress2.getCanonicalHostName());
    }
}
