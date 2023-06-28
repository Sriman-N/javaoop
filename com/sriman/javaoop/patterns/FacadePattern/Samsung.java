package com.sriman.javaoop.patterns.FacadePattern;

/**
 * @author srima
 */
public class Samsung implements MobileShop{
    public void modelNo() {
        System.out.println("Samsung galaxy A10");
    }

    public void price() {
        System.out.println("$900");
    }
}
