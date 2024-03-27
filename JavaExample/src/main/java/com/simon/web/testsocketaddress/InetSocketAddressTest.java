package com.simon.web.testsocketaddress;

import java.net.InetSocketAddress;

public class InetSocketAddressTest {
    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 8080);
        InetSocketAddress address1 = new InetSocketAddress("127.0.0.1", 22);

        System.out.println(address.getHostName());
        System.out.println(address.getAddress());
        System.out.println(address.getPort());

        System.out.println(address1.getHostName());
        System.out.println(address1.getAddress());
        System.out.println(address1.getPort());
    }
}
