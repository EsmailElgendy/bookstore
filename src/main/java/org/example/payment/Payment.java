package org.example.payment;

public abstract class Payment {

    private int paymentNumber;
    private int transactionID;
    private double amount;
    public Payment(int paymentNumber, int transactionID, double amount) {
        this.paymentNumber = paymentNumber;
        this.transactionID = transactionID;
        this.amount = amount;
    }

    public int getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(int paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
