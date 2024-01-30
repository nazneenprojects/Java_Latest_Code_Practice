package dev.bankaccount;

public class BankMain {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();

        ba.setAccountBalance(1000);
        ba.setAccountNumber(12345);
        ba.setEmail("yellowfox@gmail.com");
        ba.setCustomerName("MR. Fantastic Fox");
        ba.setPhoneNumber(987654321);

        System.out.println(ba.depositAmount(200));
        System.out.println(ba.withdrawAmount(100));

    }
}
