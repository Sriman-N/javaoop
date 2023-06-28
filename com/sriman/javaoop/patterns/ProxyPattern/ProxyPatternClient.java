package com.sriman.javaoop.patterns.ProxyPattern;

import java.net.Proxy;

/**
 * @author srima
 */
public class ProxyPatternClient {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Sriman Meduri");
        access.grantInternetAccess();
    }
}
