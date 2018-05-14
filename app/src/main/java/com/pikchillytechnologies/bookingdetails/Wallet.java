package com.pikchillytechnologies.bookingdetails;

public class Wallet {


    private String mTransactionDate;
    private String mTransactionAcccountNumber;
    private String mTransactionAmount;
    private String mTransactionDescription;

    public Wallet(String transactionDate, String transactionAcccountNumber,String transactionAmount,String transactionDescription) {

        this.mTransactionDate = transactionDate;
        this.mTransactionAcccountNumber = transactionAcccountNumber;
        this.mTransactionAmount = transactionAmount;
        this.mTransactionDescription = transactionDescription;
    }


    public String getmTransactionDate() {
        return mTransactionDate;
    }

    public void setmTransactionDate(String mTransactionDate) {
        this.mTransactionDate = mTransactionDate;
    }

    public String getmTransactionAcccountNumber() {
        return mTransactionAcccountNumber;
    }

    public void setmTransactionAcccountNumber(String mTransactionAcccountNumber) {
        this.mTransactionAcccountNumber = mTransactionAcccountNumber;
    }

    public String getmTransactionAmount() {
        return mTransactionAmount;
    }

    public void setmTransactionAmount(String mTransactionAmount) {
        this.mTransactionAmount = mTransactionAmount;
    }

    public String getmTransactionDescription() {
        return mTransactionDescription;
    }

    public void setmTransactionDescription(String mTransactionDescription) {
        this.mTransactionDescription = mTransactionDescription;
    }
}
