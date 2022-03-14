package com.InterestCalculator;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
       //Creating Bank Object- SBI
        Interests SBI = new Interests("SBI", "85SAD","SBIB0085623","964563215","Attibele","04244875362");
       //Setting rate of interests and time period- SBI
        SBI.setInterests(4.0,5.6,3.0,3.45, 2, 15,3,1, 2500.56);

       //Creating Bank Object- INDIAN BANK
        Interests INDIAN_BANK = new Interests("Indian Bank", "85FB8","IDIB656AS623","862345956","JP Nagar","04244237585");
       //Setting rate of interests and time period- INDIAN BANK
        INDIAN_BANK.setInterests(4.2,5.0,2.7,3.8, 2, 16,2,1, 2756.85);

       //Creating Bank Object- AXIS BANK
        Interests AXIS = new Interests("Axis", "8A511D","AXIB0SD56623","8454613225","Bommasandara","04244726453");
       //Setting rate of interests and time period- AXIS BANK
        AXIS.setInterests(2.0,4.0,1.7,2.95, 1, 17,2,1, 2223.46);

       //Creating Bank Object- HDFC BANK
        Interests HDFC = new Interests("HDFC", "7WE86","HDF986S232","8662105753","BTM Layout","04244153642");
       //Setting rate of interests and time period- HDFC BANK
        HDFC.setInterests(4.0,5.8,3.2,3.7, 4, 13,4,1, 2900.56);

       //Creating Bank Object- ICICI BANK
        Interests ICICI = new Interests("ICICI", "178AS","ICI6563S589","753056352","Electronic City","04244756325");
       //Setting rate of interests and time period- ICICI BANK
        ICICI.setInterests(4.7,4.23,7.1,4.5, 3, 17,4,1, 2575.44);

       //Creating objects for classes present in the package
        Scanner sc = new Scanner(System.in);
        DisplayInterest di = new DisplayInterest();
        InterestCalculator ic = new InterestCalculator();
        UserDetails ud = new UserDetails();
        ud.getUserDetails(sc);//get user details from the user

       //Select Bank from the available options
        String youChose;
        do {
            System.out.println("Select a bank:---------------------------------------------------");
            System.out.print("Enter 1 for State Bank of India\nEnter 2 for Indian Bank\nEnter 3 for Axis Bank\nEnter 4 for HDFC Bank\nEnter 5 for ICICI Bank\nYour choice?");
            int bankChoice = sc.nextInt();
            //Select the type of loan
            System.out.print("Enter 1 for gold loan\nEnter 2 for Personal Loan\nEnter 3 for Housing Loan\nEnter 4 for Educational Loan\nYour Choice?");
            int typeOfLoan = sc.nextInt();
            double PrincipalAmount = 0.0;
            double noOfGramsOfGold = 0.0;

            //Get the weight of gold in grams if it is gold loan option(1) or get the principal option(2,3,4)
            if (typeOfLoan == 1) {
                System.out.print("Enter Gold weight (in grams):");
                noOfGramsOfGold = sc.nextDouble();
            } else {
                System.out.print("Enter the Principal Amount (in rupees):");
                PrincipalAmount = sc.nextDouble();
            }
            System.out.println("-------------------------------------------------------------------------------");
            //display user details
            ud.displayUserDetails();
            double SimpleInterest;
            switch (bankChoice) {//controlling the flow using switch
                //SBI Bank
                case 1 -> {
                    if (typeOfLoan == 1) {//Gold Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(noOfGramsOfGold, SBI.getGoldRate(), SBI.getGoldLoan(), SBI.getGoldLoanTimePeriod());
                        SBI.getBankDetails();
                        di.displayAmount("Gold Loan", noOfGramsOfGold, SBI.getGoldRate(), SBI.getGoldLoan(), SBI.getGoldLoanTimePeriod(), SimpleInterest);
                    } else if (typeOfLoan == 2) {//Personal Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(PrincipalAmount, SBI.getPersonalLoan(), SBI.getPersonalLoanTimePeriod());
                        SBI.getBankDetails();
                        di.displayAmount("Personal Loan", PrincipalAmount, SBI.getPersonalLoan(), SBI.getPersonalLoanTimePeriod(), SimpleInterest);
                    } else if (typeOfLoan == 3) {//Housing Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(PrincipalAmount, SBI.getHousingLoan(), SBI.getHousingLoanTimePeriod());
                        SBI.getBankDetails();
                        di.displayAmount("Housing Loan", PrincipalAmount, SBI.getHousingLoan(), SBI.getHousingLoanTimePeriod(), SimpleInterest);
                    } else if (typeOfLoan == 4) {//Educational Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(PrincipalAmount, SBI.getEducationalLoan(), SBI.getEducationalLoanTimePeriod());
                        SBI.getBankDetails();
                        di.displayAmount("Educational Loan", PrincipalAmount, SBI.getEducationalLoan(), SBI.getEducationalLoanTimePeriod(), SimpleInterest);
                    }
                }

                //INDIAN BANK
                case 2 -> {
                    if (typeOfLoan == 1) {//Gold Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(noOfGramsOfGold, INDIAN_BANK.getGoldRate(), INDIAN_BANK.getGoldLoan(), INDIAN_BANK.getGoldLoanTimePeriod());
                        INDIAN_BANK.getBankDetails();
                        di.displayAmount("Gold Loan", noOfGramsOfGold, INDIAN_BANK.getGoldRate(), INDIAN_BANK.getGoldLoan(), INDIAN_BANK.getGoldLoanTimePeriod(), SimpleInterest);
                    } else if (typeOfLoan == 2) {//Personal Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(PrincipalAmount, INDIAN_BANK.getPersonalLoan(), INDIAN_BANK.getPersonalLoanTimePeriod());
                        INDIAN_BANK.getBankDetails();
                        di.displayAmount("Personal Loan", PrincipalAmount, INDIAN_BANK.getPersonalLoan(), INDIAN_BANK.getPersonalLoanTimePeriod(), SimpleInterest);
                    } else if (typeOfLoan == 3) {//Housing Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(PrincipalAmount, INDIAN_BANK.getHousingLoan(), INDIAN_BANK.getHousingLoanTimePeriod());
                        INDIAN_BANK.getBankDetails();
                        di.displayAmount("Housing Loan", PrincipalAmount, INDIAN_BANK.getHousingLoan(), INDIAN_BANK.getHousingLoanTimePeriod(), SimpleInterest);
                    } else if (typeOfLoan == 4) {//Educational Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(PrincipalAmount, INDIAN_BANK.getEducationalLoan(), INDIAN_BANK.getEducationalLoanTimePeriod());
                        INDIAN_BANK.getBankDetails();
                        di.displayAmount("Educational Loan", PrincipalAmount, INDIAN_BANK.getEducationalLoan(), INDIAN_BANK.getEducationalLoanTimePeriod(), SimpleInterest);
                    }
                }
                //AXIS BANK
                case 3 -> {
                    if (typeOfLoan == 1) {//Gold Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(noOfGramsOfGold, AXIS.getGoldRate(), AXIS.getGoldLoan(), AXIS.getGoldLoanTimePeriod());
                        AXIS.getBankDetails();
                        di.displayAmount("Gold Loan", noOfGramsOfGold, AXIS.getGoldRate(), AXIS.getGoldLoan(), AXIS.getGoldLoanTimePeriod(), SimpleInterest);
                    } else if (typeOfLoan == 2) {//Personal Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(PrincipalAmount, AXIS.getPersonalLoan(), AXIS.getPersonalLoanTimePeriod());
                        AXIS.getBankDetails();
                        di.displayAmount("Personal Loan", PrincipalAmount, AXIS.getPersonalLoan(), AXIS.getPersonalLoanTimePeriod(), SimpleInterest);
                    } else if (typeOfLoan == 3) {//Housing Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(PrincipalAmount, AXIS.getHousingLoan(), AXIS.getHousingLoanTimePeriod());
                        AXIS.getBankDetails();
                        di.displayAmount("Housing Loan", PrincipalAmount, AXIS.getHousingLoan(), AXIS.getHousingLoanTimePeriod(), SimpleInterest);
                    } else if (typeOfLoan == 4) {//Educational Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(PrincipalAmount, AXIS.getEducationalLoan(), AXIS.getEducationalLoanTimePeriod());
                        AXIS.getBankDetails();
                        di.displayAmount("Educational Loan", PrincipalAmount, AXIS.getEducationalLoan(), AXIS.getEducationalLoanTimePeriod(), SimpleInterest);
                    }
                }
                //HDFC
                case 4 -> {
                    if (typeOfLoan == 1) {//Gold Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(noOfGramsOfGold, HDFC.getGoldRate(), HDFC.getGoldLoan(), HDFC.getGoldLoanTimePeriod());
                        HDFC.getBankDetails();
                        di.displayAmount("Gold Loan", noOfGramsOfGold, HDFC.getGoldRate(), HDFC.getGoldLoan(), HDFC.getGoldLoanTimePeriod(), SimpleInterest);
                    } else if (typeOfLoan == 2) {//Personal Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(PrincipalAmount, HDFC.getPersonalLoan(), HDFC.getPersonalLoanTimePeriod());
                        HDFC.getBankDetails();
                        di.displayAmount("Personal Loan", PrincipalAmount, HDFC.getPersonalLoan(), HDFC.getPersonalLoanTimePeriod(), SimpleInterest);
                    } else if (typeOfLoan == 3) {//Housing Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(PrincipalAmount, HDFC.getHousingLoan(), HDFC.getHousingLoanTimePeriod());
                        HDFC.getBankDetails();
                        di.displayAmount("Housing Loan", PrincipalAmount, HDFC.getHousingLoan(), HDFC.getHousingLoanTimePeriod(), SimpleInterest);
                    } else if (typeOfLoan == 4) {//Educational Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(PrincipalAmount, HDFC.getEducationalLoan(), HDFC.getEducationalLoanTimePeriod());
                        HDFC.getBankDetails();
                        di.displayAmount("Educational Loan", PrincipalAmount, HDFC.getEducationalLoan(), HDFC.getEducationalLoanTimePeriod(), SimpleInterest);
                    }
                }
                //ICICI
                case 5 -> {
                    if (typeOfLoan == 1) {//Gold Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(noOfGramsOfGold, ICICI.getGoldRate(), ICICI.getGoldLoan(), ICICI.getGoldLoanTimePeriod());
                        ICICI.getBankDetails();
                        di.displayAmount("Gold Loan", noOfGramsOfGold, ICICI.getGoldRate(), ICICI.getGoldLoan(), ICICI.getGoldLoanTimePeriod(), SimpleInterest);
                    } else if (typeOfLoan == 2) {//Personal Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(PrincipalAmount, ICICI.getPersonalLoan(), ICICI.getPersonalLoanTimePeriod());
                        ICICI.getBankDetails();
                        di.displayAmount("Personal Loan", PrincipalAmount, ICICI.getPersonalLoan(), ICICI.getPersonalLoanTimePeriod(), SimpleInterest);
                    } else if (typeOfLoan == 3) {//Housing Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(PrincipalAmount, ICICI.getHousingLoan(), ICICI.getHousingLoanTimePeriod());
                        ICICI.getBankDetails();
                        di.displayAmount("Housing Loan", PrincipalAmount, ICICI.getHousingLoan(), ICICI.getHousingLoanTimePeriod(), SimpleInterest);
                    } else if (typeOfLoan == 4) {//Educational Loan
                        //findTotalInterest
                        SimpleInterest = ic.calculateInterest(PrincipalAmount, ICICI.getEducationalLoan(), ICICI.getEducationalLoanTimePeriod());
                        ICICI.getBankDetails();
                        di.displayAmount("Educational Loan", PrincipalAmount, ICICI.getEducationalLoan(), ICICI.getEducationalLoanTimePeriod(), SimpleInterest);
                    }
                }
                //Wrong option
                default -> System.out.println("Invalid Choice. Please Try Again");
            }
            //ask the user if he/she needs to calculate more interests
            System.out.print("Wish to view results of other banks(yes/no)?");
            youChose = sc.next();
        }while(youChose.equals("yes"));
        System.out.println("Thank you:)");
    }

}
