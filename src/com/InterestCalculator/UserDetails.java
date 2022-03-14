package com.InterestCalculator;

import java.util.Scanner;

public class UserDetails {
    public String userName;
    public long accountNumber;

    //Get user details
    public void getUserDetails(Scanner sc){
        System.out.print("Enter your Name: ");
        userName = sc.nextLine();
        System.out.print("Enter your account Number: ");
        accountNumber = sc.nextLong();
    }
    //Display user details
    public void displayUserDetails(){
        System.out.println(".............User Details:.............");
        System.out.println("Account Holder:"+userName);
        System.out.println("Account Number:"+accountNumber);
    }
}
