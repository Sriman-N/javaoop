package com.sriman.javaoop.morePatterns.AbstractFactoryExample;

/**
 * @author srima
 */
public class FactoryCreator {
    public static AbstractFactory getFactory(String choice) {
        if(choice.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("Color")) {
            return new ColorFactory();
        }
        return null;
    }
}
