package org.example.payment;

public interface PaymentMethod {
    public boolean securityCheck();
    void pay(double amount);
}
