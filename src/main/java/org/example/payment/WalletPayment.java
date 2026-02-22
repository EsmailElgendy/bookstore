package org.example.payment;

public class WalletPayment extends Payment implements PaymentMethod {
    int OTP;
    int inputOTP;

    public WalletPayment(int paymentNumber, int transactionID, double amount,int OTP, int inputOTP) {
        super(paymentNumber, transactionID, amount);
        this.inputOTP = inputOTP;
        this.OTP = OTP;
    }

    public int getOTP() {
        return OTP;
    }

    public void setOTP(int OTP) {
        this.OTP = OTP;
    }

    public int getInputOTP() {
        return inputOTP;
    }

    public void setInputOTP(int inputOTP) {
        this.inputOTP = inputOTP;
    }

    @Override
    public boolean securityCheck() {
        return this.inputOTP == this.OTP;
    }

    @Override
    public void pay(double amount) {
        if (securityCheck()) {
            System.out.println("Payment Successful");
        }
        else {
            System.out.println("Payment Failed");
        }
    }
}
