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
public class Rectangle extends GeometricObject {
    private double width;
    private double height;
    
    public Rectangle(){
        this(0, 0);
    }
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea(){
        return this.height * this.width;
    }
    
    public double getPerimeter(){
        return (this.height * 2) + (this.width * 2);
    }
    
}
