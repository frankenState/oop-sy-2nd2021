/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module2;
import java.util.*;
//import javax.swing.*;
//import java.io.*;
/**
 *
 * @author frank lou
 */

public class TestCircle {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(11.5);
        Circle circle3;
        int[] arraysample = new int[5];
        
        Circle[] circleArray = new Circle[10];
        
        
        int i = 1, j = 2;
        i = j;
        // j = 2;
        // i = 2;
        
        
        
        
        System.out.print("Enter the radius:");
        double radius = s.nextDouble();
        
        circle1.setRadius(radius);
        double area = circle1.getArea();
        double perimter = circle1.getPerimeter();
        
        System.out.println("--------- before assignment --------"); 
        System.out.println("--------- circle1 --------"); 
        System.out.println("   Radius: " + circle1.getRadius());
        System.out.println("   Area: " + area); 
        System.out.println("   Perimter: " + perimter); 
        
        System.out.printf("     Area: %1.2f\n", area); 
        System.out.printf("     Perimter: %1.2f\n", perimter);
        
        System.out.println("--------- circle2 --------"); 
        System.out.println("   Radius: " + circle2.getRadius());
        System.out.println("   Area: " + circle2.getArea()); 
        System.out.println("   Perimter: " + circle2.getPerimeter()); 
        
        System.out.printf("     Area: %1.2f\n",  circle2.getArea()); 
        System.out.printf("     Perimter: %1.2f\n", circle2.getPerimeter()); 
        
        circle1 = circle2;
        
        System.out.println("--------- after assignment --------"); 
        System.out.println("--------- circle1 --------"); 
        System.out.println("   Radius: " + circle1.getRadius());
        System.out.println("   Area: " + circle1.getArea()); 
        System.out.println("   Perimter: " + circle1.getPerimeter()); 
        
        System.out.printf("     Area: %1.2f\n", area); 
        System.out.printf("     Perimter: %1.2f\n", perimter);
        
        System.out.println("--------- circle2 --------"); 
        System.out.println("   Radius: " + circle2.getRadius());
        System.out.println("   Area: " + circle2.getArea()); 
        System.out.println("   Perimter: " + circle2.getPerimeter()); 
        
        System.out.printf("     Area: %1.2f\n",  circle2.getArea()); 
        System.out.printf("     Perimter: %1.2f\n", circle2.getPerimeter()); 
        
        
        
        int numOfInstances = Circle.getNumberObjects();
        System.out.println("Number of instances: " +  Circle.getNumberObjects());
        
    }
    
}
