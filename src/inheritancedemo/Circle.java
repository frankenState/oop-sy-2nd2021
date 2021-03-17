/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancedemo;

/**
 *
 * @author frank lou
 */
public class Circle extends GeometricObject {
    
    private double radius;
    
    public Circle(){
        this(0.0);
    }
    
    public Circle(double radius){
        this(radius, "", false);
    }
    
    public Circle(double radius, String color, boolean isFilled){
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    
    public double getDiameter(){
        return this.radius * 2;
    }
    
    public void printCircle() {
        System.out.printf("----Circle----\nRadius: %1.2f\nArea: %1.2f\nPerimeter: %1.2f\nDiameter: %1.2f\n",
                this.getRadius(), // this.radius
                this.getArea(),
                this.getPerimeter(),
                this.getDiameter()
                );
    }
    
}
