/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module01;
import module2.Circle;
/**
 *
 * @author frank lou
 */
public class MethodsDiscussion {

    public static int sum(int start, int end) {
        int result = 0;
        for (int i = start; i <= end; i++) {
            result += i;
        }

        return result;
    }

    public static void main(String[] args) {
        
        Circle circle1 = new Circle(8.9);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Area: " + circle1.getPerimeter());
        
//        System.out.println("Sum from 1 to 10: " + sum(1, 10));
//        System.out.println("Sum from 20 to 37: " + sum(20, 37));
//        System.out.println("Sum from 35 to 47: " + sum(35, 47));
//        
//        
//        System.out.println("Max number 35 or 47? : " + max(35, 47));
//        
//        int larger = max(1998, 2021);
//        
//        System.out.println("1998 vs 2021?: " + larger);
//        int i = 5, j = 2, k = max(i, j);
//
//        System.out.println(
//                "The maximum of "
//                + i + " and " + j + " is " + k);

//        System.out.print("The grade is ");
//        printGrade(78.5);
//        
//        System.out.print("The grade is ");
//        printGrade(59.5);

//          nPrintln("Hello", 4);

//        int x = 1;
//        
//        System.out.println("Before the call, x is " + x);
//        
//        increment(x);
//        
//        System.out.println("After the call, x is " + x);

//        int num1 = 1, num2 = 2;
//        
//        System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
//        
//        MethodsDiscussion.swap(num1, num2);
//        
//        System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
//        
    
    
    
    }
    
    public static void swap(int n1, int n2){
        System.out.println("\tInsie the swap method");
        System.out.println("\t\tBefore swapping, n1 is " + n1 + " and n2 is " + n2);
        
        int temp = n1;
        n1 = n2;
        n2 = temp;
        
        System.out.println("\t\tAfter swapping, n1 is " + n1 + " and n2 is " + n2);
        
    }
    
    public static void increment(int n){
        n++;
        System.out.println("n inside the method is " + n);
    }
    
    public static void nPrintln(String message, int n){
        for (int i = 0; i < n; i++)
            System.out.println(message);
    }
    
    
    public static void printGrade(double score){
        if (score >= 90.0) 
            System.out.println("A");
        else if (score >= 80.0) 
            System.out.println("B");
        else if (score >= 70.0) 
            System.out.println("C");
        else if (score >= 60.0) 
            System.out.println("D");
        else
            System.out.println("F");
        
    }

    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) 
            result = num1;
        else 
            result = num2;
        

        return result;
    }

}
