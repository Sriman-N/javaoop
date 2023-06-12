package com.sriman.javaoop.inheritance;

class Operation{
    int square(int n) {
        return n*n;
    }
    double addByEachOther(double n) {
        return n+n;
    }
}

public class Circle {
    Operation op; //Aggregation
    double pi = 3.14;

    double area(int radius) {
        op = new Operation();
        int rsquare = op.square(radius); //Code reusability
        return pi*rsquare;
    }

    double circumference(int radius) {
        op = new Operation();
        double piByTwo = op.addByEachOther(pi);
        return piByTwo*radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
        double result1 = c.circumference(5);
        System.out.println(result1);
    }
}
