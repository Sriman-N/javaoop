package com.sriman.javaoop.patterns.BuilderPattern;

/**
 * @author srima
 */
public class Sony extends Company{
    @Override
    public int price() {
        return 20;
    }

    @Override
    public String pack() {
        return "Sony CD";
    }//a
}
