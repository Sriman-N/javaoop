package com.sriman.javaoop.inheritance;

class Employee{
    float salary = 4000;

    protected void textHi() {
        System.out.println("Hello, I am from Employee");
    }
}

public class Programmer extends Employee{
    int bonus = 10000;
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer.main " + p.bonus);
        System.out.println("Programmer.main " + p.salary);
        p.textHi();
    }
}
