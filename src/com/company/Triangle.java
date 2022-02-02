package com.company;

public class Triangle {
    double a;
    double b;
    double c;


    void area() {
        double s = (a + b + c) / 2;
        System.out.println("The area of triangle is: " + Math.sqrt(s * (s - a) * (s - b) * (s - c)));



    }

}
