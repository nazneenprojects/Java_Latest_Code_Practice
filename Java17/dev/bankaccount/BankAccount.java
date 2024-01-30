package dev.bankaccount;

public class BankAccount {

    int accountNumber;
    double accountBalance;
    String customerName;
    String email;
    int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String depositAmount(double amount){
        accountBalance += amount;
        return "You today deposited "+ amount + "& now your account balance is : " + accountBalance;
    }

    public String withdrawAmount(double withdrawAmount){
        if((accountBalance - withdrawAmount) < 0)
        {
            return "Your account balance is low!, you have only "+ accountBalance;
        }else{
             accountBalance -= withdrawAmount;
            return "After withdrawal you current balance is : " + accountBalance;
        }

    }
}
