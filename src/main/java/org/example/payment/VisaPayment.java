package org.example.payment;

public class VisaPayment extends Payment implements PaymentMethod {
    private int pin;
    private int inputPin;

    public VisaPayment(int paymentNumber, int transactionID, double amount,int pin, int inputPin) {
        super(paymentNumber, transactionID, amount);
        this.pin = pin;
    }

    public int getInputPin() {
        return inputPin;
    }
    public void setInputPin(int inputPin) {
        this.inputPin = inputPin;
    }

    @Override
    public boolean securityCheck() {
        return this.pin == inputPin;
    }

    @Override
    public void pay(double amount) {
        if (this.securityCheck()) {
            System.out.println("Payment successful");
        }
        else {
            System.out.println("Payment failed");
        }
    }
}
