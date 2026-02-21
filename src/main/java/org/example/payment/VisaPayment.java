package org.example.payment;

public class VisaPayment extends Payment {
    private int pin;
    public boolean pinCheck(int pin) {
        if (this.pin == pin) {
            return true;
        }
        else
            return false;
    }
    public void  setPin(int pin) {
        this.pin = pin;
    }

    public VisaPayment(int paymentNumber, int idNumber,double totalPrice,int pin) {
        super(paymentNumber,idNumber,totalPrice);
        this.pin = pin;
    }

    public boolean pinCheck() {
        if (this.pin == pin) {
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean pay() {
        return this.pinCheck();
    }
}
