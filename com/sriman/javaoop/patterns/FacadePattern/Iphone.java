package com.sriman.javaoop.patterns.FacadePattern;

/**
 * @author srima
 */
public class Iphone implements MobileShop{
    public void modelNo() {
        System.out.println("Iphone 13");
    }

    public void price() {
        System.out.println("$1000.00");
    }
}
