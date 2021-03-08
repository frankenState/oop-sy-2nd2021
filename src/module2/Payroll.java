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
public class Payroll {

    /**
     * @return the grosspay
     */
    public double getGrosspay() {
        return grosspay;
    }

    /**
     * @param grosspay the grosspay to set
     */
    public void setGrosspay(double grosspay) {
        this.grosspay = grosspay;
    }

    /**
     * @return the netpay
     */
    public double getNetpay() {
        return netpay;
    }

    /**
     * @param netpay the netpay to set
     */
    public void setNetpay(double netpay) {
        this.netpay = netpay;
    }

    /**
     * @return the federalWithHolding
     */
    public double getFederalWithHolding() {
        return federalWithHolding;
    }

    /**
     * @param federalWithHolding the federalWithHolding to set
     */
    public void setFederalWithHolding(double federalWithHolding) {
        this.federalWithHolding = federalWithHolding;
    }

    /**
     * @return the stateWithHolding
     */
    public double getStateWithHolding() {
        return stateWithHolding;
    }

    /**
     * @param stateWithHolding the stateWithHolding to set
     */
    public void setStateWithHolding(double stateWithHolding) {
        this.stateWithHolding = stateWithHolding;
    }
    private double netpay;
    private double federalWithHolding;
    private double stateWithHolding;
    private double grosspay;

    public Payroll() {
        System.out.println("A new instance of Payroll is created.");
    }

    public double calculateGrossPay(double hourlyRate, double hoursWorked) {
//        double grossPay = hourlyRate * hoursWorked;
        return hourlyRate * hoursWorked;
    }

    public double calculateFederalWithHolding(double federalTaxRate, double grossPay) {
        return federalTaxRate * grossPay;
    }

    public double calculateStateWithHolding(double stateTaxRate, double grossPay) {
        return stateTaxRate * grossPay;
    }
    
    public double totalDeduction(){
        return this.federalWithHolding + this.stateWithHolding;
    }
    
    public double calculateNetpay() {
        return this.getGrosspay() - this.totalDeduction();
    }
     
    
    
}
