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
public class GeometricObjectTest {
    
    public static void main(String[] args) {
        
        GeometricObject go1 = new GeometricObject();
        go1.setColor("grey");
        go1.setFilled(false);
        
        System.out.println("Color of go1: " + go1.getColor());
        System.out.println("isFilled? : " + go1.isFilled());
        
        Circle c1 = new Circle(7, "lightblue", true);
//        c1.setRadius(7);
        c1.printCircle();
        System.out.println("S.O.P: " + c1.getArea());
//        c1.setColor("powderblue");
//        c1.setFilled(true);
        System.out.println("Color of c1: " + c1.getColor());
        System.out.println("isFilled? : " + c1.isFilled());
        
        System.out.println("-- end of c1 --");
        
        Rectangle r1 = new Rectangle();
        r1.setWidth(5);
        r1.setHeight(18);
        System.out.printf("----Rectangle---\nWidth: %1.2f\nHeight: %1.2f\nArea: %1.2f\nPerimeter: %1.2f\n",
            r1.getWidth(),
            r1.getHeight(),
            r1.getArea(),
            r1.getPerimeter()
        );
        
        
        
    }
    
}
