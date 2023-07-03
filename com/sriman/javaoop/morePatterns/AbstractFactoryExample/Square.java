package com.sriman.javaoop.morePatterns.AbstractFactoryExample;

public class Square implements Shape {
    private final String name;

    public Square() {
        name = "Square";
    }

    public String getShapeName() {
        return name;
    }
}
