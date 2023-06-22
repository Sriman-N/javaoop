package com.sriman.javaoop.patterns.BuilderPattern;

/**
 * @author srima
 */
public class Samsung extends Company {
    @Override
    public int price() {
        return 15;
    }

    @Override
    public String pack() {
        return "Samsung CD";
    }
}
