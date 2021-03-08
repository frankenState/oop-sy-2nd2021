/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author frank lou
 */
public class SampleProblem {

private static Scanner inputDevice;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float inpMinutes, toHours, toDays;

        System.out.print("Enter number of minutes: ");

        inpMinutes = sc.nextFloat();

        

        toHours = inpMinutes / 60;

        toDays = toHours / 24;

        

        System.out.println(String.format("%.0f minutes equals "

                + "%.0f hours and equals %.3f days", inpMinutes, toHours, toDays));
//     Scanner scan = new Scanner(System.in);
//        System.out.print("Enter No. of Minutes: ");
//        int minutes = scan.nextInt();
//        
//        int hour = 60;
//        double day = 24;
//       
//        int hours = minutes / hour;
//        double days = hours / day;
//        System.out.println(minutes + " minutes" + " is equal " + 
//                hours + " hours" + " and equals " + days + " days" );

//     Scanner scan=new Scanner(System.in);
//
//        
//
//        double days,min;
//
//        int hours, minutes;
//
//        
//
//        System.out.print("Enter the number of minutes:");
//
//        minutes=scan.nextInt();
//
//        
//
//        hours=(minutes/60);
//
//        min=6000/60;
//
//        days=(min/24);
//
//        
//
//        System.out.println("Hours:"+hours);
//
//        System.out.println("Days:"+days);

        

//  		
//		int minutes, hours; 
//		float days; 
//		
//		inputDevice = new Scanner(System.in);
//		System.out.println("Please enter minutes for conversion >> ");		
//		minutes = inputDevice.nextInt();									
//		
//		
//	     hours = minutes / 60; 
//	     days = hours / 24.0f;
//				
//		
//		System.out.println("\nYou have entered " + minutes + " minutes." + "\n" + minutes + " minutes is " + hours + " hour(s). \n" + minutes 
//				+ " minutes is " + days + " days(s). ");             
//
//        try {
//
//        BufferedReader bf = new BufferedReader 
//
//                        (new InputStreamReader (System.in));
//
//   
//
//        System.out.println ("Enter Minute/s:");
//
//        String Input = (bf.readLine());
//
//        double mins;
//
//        
//
//        mins = Double.parseDouble(Input);
//
//        double hours = mins/60;
//
//        double days = hours/24;
//
//        double daysround = (double)Math.round(days*1000)/1000;
//
//        
//
//        System.out.println ("Hour/s:" + hours + "\nDay/s:" + daysround);
//
//        
//
//        } catch (Exception e){
//
//           System.out.println(e);
//
//             
//
//     
//
//      }   
        
//        Scanner sc = new Scanner(System.in);
//
//
//
//        System.out.print("Input the number of minutes: ");
//
//
//
//        int min = sc.nextInt();
//
//
//
//        int days = (int) (min / 60 / 24);
//
//        int hours = min % 60;
//
//
//
//        System.out.println((int) min + " minutes is approximately " + days + " days " + hours + " hours.");
//        Scanner arjay = new Scanner (System.in);
//     
//     DecimalFormat df = new DecimalFormat("#.###");
//        df.setRoundingMode(RoundingMode.CEILING);
//     
//     int minutes;
//     int hour;
//     double day;
//     
//     try {
//         System.out.print("Enter minutes: ");
//         minutes = arjay.nextInt();
//        
//         hour = (int) (minutes/60);
//         day = (double) (hour/24.0);
//         
//         
//         System.out.println(minutes + " minutes = " + hour + " hours ");  
//         System.out.println(minutes + " minutes = " + df.format(day) + " days ");      
//     }
//    catch (Exception e){
//        System.out.println("Error...");
//        
//        
//        /**
//        *Arjay G. Moldez
//        *BSIS - 1B
//        *Computer Programming 2
//        */
//     
//    }
        
//
//        double minutesInYear = 60 * 24 * 365;
//
//        Scanner UserInput = new Scanner(System.in);
//
//        System.out.print("Input the number of minutes: ");
//
//        double min = UserInput.nextDouble();
//
//        long years = (long) (min / minutesInYear);
//        int days = (int) (min / 60 / 24) % 365;
//
//        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
//            Scanner input = new Scanner(System.in);
//
//            System.out.print("Enter minutes: ");
//            int min = input.nextInt();
//
//            double hours = (double) min / 60;
//            double days = (double) min / 1440;
//
//            System.out.println(min + " minute/s is " + hours + " hours.");
//            System.out.println(min + " minute/s is " + days + " days.");


//    Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter No. of Minutes: ");
//
//        int minutes = scan.nextInt();
//
//         
//
//        int hour = 3840;
//
//        double day = 160;
//
//        
//
//        int hours = minutes / hour;
//
//        double days = hours / day; 
//
//        System.out.println(minutes + " minutes" + " is equal " +  
//
//                hours + " hours" + " and equals " + days + " days" );

//        Scanner input = new Scanner(System.in);
//        System.out.print("ENTER THE NUMBER OF MINUTES:");
//        int Minutes = input.nextInt();
//        int hours = (int) (Minutes / 60);
//        int days = (int) (hours / 24);
//        System.out.println("EQUIVALENT: " + hours + " hours and " + days + " days");
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Input the number of minutes: ");
//
//        int min = input.nextInt();
//
//        int days = (int) (min / 60 / 24);
//        int hours = min % 60;
//
//        System.out.println((int) min + " minutes is approximately " + days + " days " + hours + " hours.");
//  Scanner sc = new Scanner(System.in);
//try {
//int hours;
//int min;
//double days;
//System.out.print("Enter minutes here:");
//int txt = sc.nextInt();
//System.out.println("______________________________________");
//System.out.print(txt);
//
//min =  txt / 60;
//hours =  min * 60 ;
//days = txt/1440.0;
//System.out.println( " mins "+ min + " hours " + days + "days" );
//}catch (NumberFormatException e){
//System.out.println(e);
//}
//      
//        DecimalFormat dex = new DecimalFormat("#");
//
//   DecimalFormat dix = new DecimalFormat("#,###");
//
//
//double Minutes, Days, Hours;
//
//   int hours, days;
//
//   Scanner Input = new Scanner(System.in);
//
//
//System.out.println("Enter Minutes: ");
//
//   Minutes = Input.nextDouble();
//
//
//  Hours = (Minutes / 60);
//
//   Days = (Minutes / 1440) ;
//
//   
//
//   System.out.println(dix.format(Minutes)+ " minutes equals " +dex.format(Hours)+ " Hours " + "and equals "+ dex.format(Days)+ " days");

//          Scanner mar = new Scanner(System.in );
//  double min, hours;
// 
//  System.out.println("NUMBER OF MINUTES: ");
//  min = mar.nextFloat();
//  hours = min/60;
//  int days = (int) (min / 60 / 24) % 365;
// 
// 
//  System.out.println(min  +" minutes equals " +  hours + " hours and " + days + " days. ");
//          Scanner scan = new Scanner(System.in);
//
//        
//
//        System.out.print("Enter a number of minutes to convert into hours and days: ");
//
//        int minutes = scan.nextInt();
//
//        
//
//        int hours = minutes / 60;
//
//        float days = (float) hours / 24;
//
//        
//
//        System.out.print(minutes + " minutes is equal to " + hours + " hours and also equal to ");
//
////        System.out.printf("%.3f", days);
//
//        System.out.println(" days.");
//        
//        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Enter the inches value: ");
//        int inches = input.nextInt();
//        
//        int feet = (int)(inches / 12);
//        inches = inches % 12;
//        
////        System.out.println(
////                "Equivalent: " + feet 
////              + " feet and " + inches 
////              + " inches"
////        );
//        System.out.printf("Equivalent %d feet and %d inches\n", feet, inches);
//        // using print format in java
//            int i = 0, j  = 0;
//            System.out.println("Initial Value for i = " + i);
//            System.out.println("Initial Value for j = " + j);
//           
//            System.out.println("Pre-increment: " + ++i);
//            System.out.println("Post-increment: " + j++);
//            System.out.println("j : " + j);
//            
    }

}
