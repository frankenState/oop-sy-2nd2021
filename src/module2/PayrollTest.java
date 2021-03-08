/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module2;
import java.util.*;
/**
 *
 * @author frank lou
 */
public class PayrollTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Employee emp1 = new Employee();
        Payroll pay1 = new Payroll();
        
        System.out.print("Enter employee's name: ");
        /*
         String name = s.nextLine();
         emp1.setName(name);
        */
        emp1.setName( s.nextLine() );
        
        System.out.print("Enter number of hours worked in a week: ");
        emp1.setHoursWorked(s.nextDouble() );
        
        System.out.print("Enter hourly pay rate: ");
        emp1.setHourlyRate( s.nextDouble() );
        
        System.out.print("Enter federal tax withholding rate: ");
        emp1.setFederalTaxRate( s.nextDouble() );
        
        System.out.print("Enter state tax withholding rate: ");
        emp1.setStateTaxRate(s.nextDouble() );
        
//        System.out.println(emp1);
        System.out.println("\n");
        System.out.println("Employee Name: " + emp1.getName());
        System.out.println("Hours Worked: " + emp1.getHoursWorked());
        System.out.println("Hourly Pay Rate: " + emp1.getHourlyRate());
        
        double grossPay = pay1.calculateGrossPay( emp1.getHourlyRate() , emp1.getHoursWorked() );
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Deductions:");
        
        double federalWithholding = pay1.calculateFederalWithHolding( emp1.getFederalTaxRate(), grossPay);
        System.out.println("  Federal Withholding: " + federalWithholding);
        
        double stateWithholding = pay1.calculateStateWithHolding( emp1.getStateTaxRate(), grossPay);
        System.out.println("  State Withholding: " + stateWithholding);
        
        System.out.println("  Total Deduction: " + (federalWithholding + stateWithholding));
        
        System.out.println("Net Pay: " + ( grossPay - (federalWithholding + stateWithholding) ));

    }
}
