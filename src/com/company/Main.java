package com.company;

public class Main {

    public static void main(String[] args) {
//        BankAccount blankBankAccount = new BankAccount();
//
//        System.out.println("account number= " + blankBankAccount.getAccountNumber());
//        System.out.println("balance= " + blankBankAccount.getBalance());
//        System.out.println("name= " + blankBankAccount.getName());
//        System.out.println("email= " + blankBankAccount.getEmail());
//        System.out.println("phone number= " + blankBankAccount.getPhoneNumber());System.out.println("account number= " + blankBankAccount.getAccountNumber());
//
//        BankAccount bobsBankAccount = new BankAccount(123456,1000.00,"Cathy Hacker","mail@yahoo.com","6183151234");
//
//        System.out.println("account number= " + bobsBankAccount.getAccountNumber());
//        System.out.println("balance= " + bobsBankAccount.getBalance());
//        System.out.println("name= " + bobsBankAccount.getName());
//        System.out.println("email= " + bobsBankAccount.getEmail());
//        System.out.println("phone number= " + bobsBankAccount.getPhoneNumber());
//
//        bobsBankAccount.deposit(1000);
//        bobsBankAccount.withdrawal(500);
//        bobsBankAccount.withdrawal(1501);
//        bobsBankAccount.withdrawal(1500);
//
//        bobsBankAccount.setAccountNumber(654321);
//        bobsBankAccount.setName("Mike Hacker");
//        bobsBankAccount.setEmail("hack1973@swbell.net");
//        bobsBankAccount.setPhoneNumber("618-237-4737");
//
//        System.out.println("account number= " + bobsBankAccount.getAccountNumber());
//        System.out.println("name= " + bobsBankAccount.getName());
//        System.out.println("email= " + bobsBankAccount.getEmail());
//        System.out.println("phone number= " + bobsBankAccount.getPhoneNumber());
//
//        BankAccount notCompleteBankAccount = new BankAccount("Bella", "mail@mail.com", "6185551212");
//
//        System.out.println("account number= " + notCompleteBankAccount.getAccountNumber());
//        System.out.println("balance= " + notCompleteBankAccount.getBalance());
//        System.out.println("name= " + notCompleteBankAccount.getName());
//        System.out.println("email= " + notCompleteBankAccount.getEmail());
//        System.out.println("phone number= " + notCompleteBankAccount.getPhoneNumber());

        VipCustomer blank = new VipCustomer();

        System.out.println("name= " + blank.getName());
        System.out.println("email= " + blank.getEmail());
        System.out.println("credit limit = " + blank.getCreditLimit());

        VipCustomer partial = new VipCustomer("Mike", "hack1973@swbell.net");

        System.out.println("name= " + partial.getName());
        System.out.println("email= " + partial.getEmail());
        System.out.println("credit limit = " + partial.getCreditLimit());

        VipCustomer full = new VipCustomer("Cathy", 1500.00, "cathyhacker53@yahoo.com");

        System.out.println("name= " + full.getName());
        System.out.println("email= " + full.getEmail());
        System.out.println("credit limit = " + full.getCreditLimit());
    }
}
