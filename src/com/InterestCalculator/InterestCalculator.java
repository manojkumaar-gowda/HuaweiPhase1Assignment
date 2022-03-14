package com.InterestCalculator;

public class InterestCalculator {
    //Formula to find simpleInterest SI = (PNR)/100
    //calculate interest for gold loans
    public double calculateInterest(double noOfGramsOfGold, double goldRate, double rate, int timePeriod){
        /*System.out.println("gold in grams"+noOfGramsOfGold);
        System.out.println("Gold Rate:"+goldRate);
        System.out.println("Interest:"+rate);
        System.out.println("Time Period:"+timePeriod);*/
        return (noOfGramsOfGold*goldRate) * timePeriod*rate/100;
    }
    //calculate interest for other loans except gold loans
    public double calculateInterest(double principal, double rate, int timePeriod){
        /*System.out.println("Principal:"+principal);
        System.out.println("Interest:"+rate);
        System.out.println("Time Period:"+timePeriod);*/
        return (principal*timePeriod*rate)/100;

    }
}
