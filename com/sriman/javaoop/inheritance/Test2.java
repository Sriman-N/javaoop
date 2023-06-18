package com.sriman.javaoop.inheritance;

class Bank{
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank{
    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank{
    int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank{
    int getRateOfInterest() {
        return 9;
    }
}

public class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
    }
}
