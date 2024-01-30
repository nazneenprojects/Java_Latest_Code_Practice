package dev.contructordemo;

public class BankMain {
    public static void main(String[] args) {

        //Default Constructor
        BankAccount bab = new BankAccount();

        BankAccount ba = new BankAccount(109, 90000.23, "Yellow Fox", "yelllowfox@gmail.com" ,1111432 );

        /*ba.setAccountBalance(1000);
        ba.setAccountNumber(12345);
        ba.setEmail("yellowfox@gmail.com");
        ba.setCustomerName("MR. Fantastic Fox");
        ba.setPhoneNumber(987654321);*/

        System.out.println(ba.depositAmount(200));
        System.out.println(ba.withdrawAmount(100));

    }
}
