package com.sriman.javaoop.morePatterns.AbstractFactoryExample;

public class Green implements Color {
    private final String colorName;

    public Green() {
        colorName = "Green";
    }

    public String getColorName() {
        return colorName;
    }

}
