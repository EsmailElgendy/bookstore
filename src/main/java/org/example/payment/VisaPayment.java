package org.example.payment;

public class VisaPayment extends Payment implements PaymentMethod {
    private int pin;
    private int inputPin;

    public VisaPayment(int paymentNumber, int transactionID, double amount,int pin, int inputPin) {
        super(paymentNumber, transactionID, amount);
        this.pin = pin;
        this.inputPin = inputPin;
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
            System.out.println("You have successfully paid " + amount + ".");
        }
        else {
            System.out.println("Payment failed");
        }
    }
}
