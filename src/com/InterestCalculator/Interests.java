package com.InterestCalculator;

public class Interests extends Banks{
    //Inheriting from the parent class Bank

    //Calling the parent method object
    public Interests(String bankName, String bankId, String IFSCCode, String MICRCode, String bankLocation, String phoneNumber) {
        super(bankName, bankId, IFSCCode, MICRCode, bankLocation, phoneNumber);
    }

    //Declaring the rate of interests and the time periods as private modifiers
    private double PersonalLoan;
    private int PersonalLoanTimePeriod;
    private double HousingLoan;
    private int HousingLoanTimePeriod;
    private double educationalLoan;
    private int educationalLoanTimePeriod;
    private double goldLoan;
    private int goldLoanTimePeriod;
    private double goldRate;

    //setting the rate of interests and time period
    public void setInterests(double personalLoan, double housingLoan, double EducationalLoan, double GoldLoan , int personalLoanTimePeriod, int housingLoanTimePeriod, int EducationalLoanTimePeriod, int GoldLoanTimePeriod, double GoldRate){
        PersonalLoan = personalLoan;
        HousingLoan = housingLoan;
        educationalLoan = EducationalLoan;
        goldLoan = GoldLoan;
        PersonalLoanTimePeriod = personalLoanTimePeriod;
        HousingLoanTimePeriod = housingLoanTimePeriod;
        educationalLoanTimePeriod = EducationalLoanTimePeriod;
        goldLoanTimePeriod = GoldLoanTimePeriod;
        goldRate = GoldRate;
    }

    //getter and setter for the private attributes


    public double getPersonalLoan() {
        return PersonalLoan;
    }

    public void setPersonalLoan(double personalLoan) {
        PersonalLoan = personalLoan;
    }

    public int getPersonalLoanTimePeriod() {
        return PersonalLoanTimePeriod;
    }

    public void setPersonalLoanTimePeriod(int personalLoanTimePeriod) {
        PersonalLoanTimePeriod = personalLoanTimePeriod;
    }

    public double getHousingLoan() {
        return HousingLoan;
    }

    public void setHousingLoan(double housingLoan) {
        HousingLoan = housingLoan;
    }

    public int getHousingLoanTimePeriod() {
        return HousingLoanTimePeriod;
    }

    public void setHousingLoanTimePeriod(int housingLoanTimePeriod) {
        HousingLoanTimePeriod = housingLoanTimePeriod;
    }

    public double getEducationalLoan() {
        return educationalLoan;
    }

    public void setEducationalLoan(double educationalLoan) {
        this.educationalLoan = educationalLoan;
    }

    public int getEducationalLoanTimePeriod() {
        return educationalLoanTimePeriod;
    }

    public void setEducationalLoanTimePeriod(int educationalLoanTimePeriod) {
        this.educationalLoanTimePeriod = educationalLoanTimePeriod;
    }

    public double getGoldLoan() {
        return goldLoan;
    }

    public void setGoldLoan(double goldLoan) {
        this.goldLoan = goldLoan;
    }

    public int getGoldLoanTimePeriod() {
        return goldLoanTimePeriod;
    }

    public void setGoldLoanTimePeriod(int goldLoanTimePeriod) {
        this.goldLoanTimePeriod = goldLoanTimePeriod;
    }

    public double getGoldRate() {
        return goldRate;
    }

    public void setGoldRate(double goldRate) {
        this.goldRate = goldRate;
    }
}
