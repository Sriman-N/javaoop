package com.sriman.javaoop.morePatterns.AbstractFactoryExample;

public class Red implements Color {
    private final String colorName;

    public Red() {
        colorName = "Red";
    }

    public String getColorName() {
        return colorName;
    }
}
