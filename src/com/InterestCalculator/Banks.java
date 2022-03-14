package com.InterestCalculator;
//Base class containing all the basic details of the bank
public class Banks {
    //Declaration of attributes for identifying the Bank
    public String BankName;
    public String BankId;
    public String IFSCCode;
    public String MICRCode;
    public String BankLocation;
    public String phoneNumber;

    //Constructor for initializing the attributes
    public Banks(String bankName, String bankId, String IFSCCode, String MICRCode, String bankLocation, String phoneNumber) {
        this.BankName = bankName;
        this.BankId = bankId;
        this.IFSCCode = IFSCCode;
        this.MICRCode = MICRCode;
        this.BankLocation = bankLocation;
        this.phoneNumber = phoneNumber;
    }

    //Display the bank details
    public void getBankDetails(){
        System.out.println("..........Bank Details Fetched..........");
        System.out.println("Bank Name:"+this.BankName);
        System.out.println("Bank Id:"+this.BankId);
        System.out.println("IFSC Code:"+this.IFSCCode);
        System.out.println("MICR Code:"+this.MICRCode);
        System.out.println("Bank Location:"+this.BankLocation);
        System.out.println("Phone Number:"+this.phoneNumber);
    }
}
