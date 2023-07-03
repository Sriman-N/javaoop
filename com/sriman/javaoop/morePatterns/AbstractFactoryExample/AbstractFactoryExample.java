package com.sriman.javaoop.morePatterns.AbstractFactoryExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author srima
 */
public class AbstractFactoryExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a shape (Circle, Square, Rectangle): ");
        String shapeName = br.readLine();

        AbstractFactory shapeFactory = FactoryCreator.getFactory("shape");

        Shape s = shapeFactory.getShape(shapeName);
        System.out.println(s.getShapeName());

        System.out.print("Enter a color (Red, Green, Blue): ");
        String colorName = br.readLine();

        AbstractFactory colorFactory = FactoryCreator.getFactory("color");

        Color c = colorFactory.getColor(colorName);
        System.out.println(c.getColorName());


    }
}
