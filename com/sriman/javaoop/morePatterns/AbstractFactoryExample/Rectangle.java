package com.sriman.javaoop.morePatterns.AbstractFactoryExample;

public class Rectangle implements Shape {
    private final String name;

    public Rectangle() {
        name = "Rectangle";
    }

    public String getShapeName() {
        return name;
    }
}
