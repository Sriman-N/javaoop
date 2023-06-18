package com.sriman.javaoop.inheritance;

class Vehicle{
    void run() {
        System.out.println("Vehicle is running");
    }
}

public class Bike extends Vehicle{

    void run() {
        System.out.println("Bike is running safely");
    }
}
