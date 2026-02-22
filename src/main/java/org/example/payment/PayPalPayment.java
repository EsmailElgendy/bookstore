package org.example.payment;

public class PayPalPayment extends  Payment implements PaymentMethod{

    private String email;
    private String password;
    private String inputPassword;
    private String inputEmail;

    public  PayPalPayment(int paymentNumber, int transactionID, double amount,String email, String password) {
        super( paymentNumber,transactionID,amount);
        this.setEmail(email);
        this.setPassword(password);
        this.setInputPassword(password);
        this.setInputEmail(email);
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInputPassword() {
        return inputPassword;
    }

    public String getInputEmail() {
        return inputEmail;
    }

    public void setInputEmail(String inputEmail) {
        this.inputEmail = inputEmail;
    }

    public void setInputPassword(String inputPassword) {
        this.inputPassword = inputPassword;
    }

    @Override
    public boolean securityCheck() {
        return this.password.equals(inputPassword) && this.email.equals(inputEmail);
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
