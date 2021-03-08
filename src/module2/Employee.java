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
public class Employee {
    
    private String name;
    private double hoursWorked;
    private double hourlyRate;
    private double federalTaxRate;
    private double stateTaxRate;
    
    public Employee(){
        System.out.println("An instance of Employee class is created.");
    }
    
    public double getStateTaxRate(){
        return this.stateTaxRate;
    }
    
    public void setStateTaxRate(double stateTaxRate){
        this.stateTaxRate = stateTaxRate;
    }
    
    
    public double getFederalTaxRate(){
        return this.federalTaxRate;
    }
    
    public void setFederalTaxRate(double federalTaxRate){
        this.federalTaxRate = federalTaxRate;
    }
    
    public double getHourlyRate(){
        return this.hourlyRate;
    }
    
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    
    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    
    public double getHoursWorked(){
        return this.hoursWorked;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String toString(){
        return String.format(
                "Name: %s\nHours Worked: %1.2f\nHourly Rate: %1.2f\nFederal Tax Rate: %1.2f\nState Tax Rate: %1.2f",
                this.name, this.hoursWorked, this.hourlyRate, this.federalTaxRate, this.stateTaxRate
               );
    }
}
