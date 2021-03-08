/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module2;

/**
 *
 * @author frank lou
 */
public class Circle {

    // data field
    private double radius = 1; // 0.0
    // static property  
    static int numberOfObjects;
    
    // Constructors
    // constructor overloading
    public Circle() {
        this(1);
        numberOfObjects++;
    }

    public Circle(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }

    // getter for double property
    public double getRadius() {
        return this.radius;
    }

    // setter for double property
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    // static method
    static int getNumberObjects() {
        return numberOfObjects;
    }

    // methods
    public double getArea() {
        // pi * r ^ 2
        return Math.PI * Math.pow( this.radius, 2);
        // return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        // 2 * radius * PI
        return 2 * this.radius * Math.PI;
    }

}
