package com.sriman.javaoop.morePatterns.AbstractFactoryExample;

public class Circle implements Shape {
    private final String name;

    public Circle() {
        name = "Circle";
    }

    public String getShapeName() {
        return name;
    }
}
