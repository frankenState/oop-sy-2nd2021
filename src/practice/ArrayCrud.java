/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;
import java.util.*;
/**
 *
 * @author frank lou
 */
public class ArrayCrud {
    
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[][] data = new String[10][5];
        /*
            Columns => ID, Name, Email, Program, Year
        */
       
        //initialize empty string value
        for (String data1[] : data)
            for (int i = 0; i < data1.length; i++)
                data1[i] = "";
                
            
        
        
        while (true){
            
            System.out.print("Choose your action: "
                    + "\n   Create (c)"
                    + "\n   Read (r)"
                    + "\n   Update (u)"
                    + "\n   Delete (d)"
                    + "\nType your operation here => ");
            
            char operation = s.next().charAt(0);
            
            
            switch(operation){
                case 'c':
                case 'C':
                // find an empty row
                    for (int i = 0; i < data.length; i++) {
                        if (data[i][0].length() == 0){
                            System.out.print("Enter the id: ");
                            data[i][0] = s.next();
                            System.out.print("Enter the first name: ");
                            data[i][1] = s.next();
                            System.out.print("Enter the last name: ");
                            data[i][2] = s.next();
                            System.out.print("Enter the program: "); // BSIT/ BSIS/ ...
                            data[i][3] = s.next();
                            System.out.print("Enter the email: ");
                            data[i][4] = s.next();
                            break;
                        }
                    }
                break;
                case 'R':
                case 'r':
                    System.out.printf("%43s\n", "--- Read ---");
                    for (int i = 0; i < data.length; i++)
                        System.out.printf("%-10s %-20s %-15s %-10s %-20s\n", data[i][0], data[i][1], data[i][2], data[i][3], data[i][4]);
                break;
                case 'U':
                case 'u':
                    System.out.print("Enter the ID :");
                    String id = s.next();
                    for (int i = 0; i < data.length; i++)
                        if (data[i][0].equalsIgnoreCase(id)){
                            System.out.print("Enter the id: ");
                            data[i][0] = s.next();
                            System.out.print("Enter the first name: ");
                            data[i][1] = s.next();
                            System.out.print("Enter the last name: ");
                            data[i][2] = s.next();
                            System.out.print("Enter the program: "); // BSIT/ BSIS/ ...
                            data[i][3] = s.next();
                            System.out.print("Enter the email: ");
                            data[i][4] = s.next();
                            break;
                        }
                break;
                case 'D':
                case 'd':
                    System.out.print("Enter the ID :");
                    String temp_id = s.next();
                    for (int i = 0; i < data.length; i++)
                        if (data[i][0].equalsIgnoreCase(temp_id))
                            for (int j = 0; j < data[i].length; j++) 
                                data[i][j] = "";
                        
                break;
                default: 
                    System.out.println("Invalid operation. Please try again.");
                  
            }
        }
    }
}
