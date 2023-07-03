package com.sriman.javaoop.morePatterns.AbstractFactoryExample;

public class Blue implements Color {
    private final String colorName;

    public Blue() {
        colorName = "Blue";
    }

    public String getColorName() {
        return colorName;
    }
}
