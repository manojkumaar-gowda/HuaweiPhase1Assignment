package com.InterestCalculator;

public class DisplayInterest {
    //Display the loan details with interest for gold loans
    public void displayAmount(String category,double noOfGrams, double goldRate, double rate, int timePeriod,double simpleInterest){
        System.out.println(".............Loan Details.............");
        System.out.println("Category:"+category);
        System.out.println("No of grams:"+noOfGrams);
        System.out.format("Today's cost of gold(Fixed by the bank):%.2f",goldRate);
        System.out.println("\nInterest Rate:"+rate);
        double principal = noOfGrams*goldRate;
        System.out.format("Principal:%.2f",principal);
        System.out.println("\nTime period:"+(timePeriod*12)+" months");
        System.out.format("Overall Interest:%.2f",simpleInterest);
        double monthlyPay = (principal/(timePeriod*12))+(simpleInterest/(timePeriod*12));
        System.out.format("\nTo Pay(monthly):%.2f",monthlyPay);
        System.out.println("\n-------------------------------------------------------------------------------");
    }
    //Display the loan details with interest for other loans except gold loans
    public void displayAmount(String category,double principal, double rate, int timePeriod,double simpleInterest){
        System.out.println(".............Loan Details.............");
        System.out.println("Category:"+category);
        System.out.format("Principal:%.2f",principal);
        System.out.println("\nInterest Rate:"+rate);
        System.out.println("Time period:"+(timePeriod*12)+" months");
        System.out.println("Interest Rate:"+rate);
        System.out.format("Overall Interest():%.2f",simpleInterest);
        double monthlyPay = (principal/(timePeriod*12))+(simpleInterest/(timePeriod*12));
        System.out.format("\nTo Pay(monthly):%.2f",monthlyPay);
        System.out.println("\n-------------------------------------------------------------------------------");
    }
}
