package org.example.payment;

public abstract class Payment {

    private int paymentNumber;
    private int transactionID;
    private double amount;

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

    public double getTotalPrice() {
        return amount;
    }
    public void setTotalPrice(double totalPrice) {
        this.amount = totalPrice;
    }
    public Payment(int paymentNumber, int transactionID, double totalPrice) {
        this.setTotalPrice(totalPrice);
    }
    abstract public boolean pay();
}
