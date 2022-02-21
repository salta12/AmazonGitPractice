package com.digital_nomads.applications;

import static com.digital_nomads.applications.Bank.transferFunds;
import static com.digital_nomads.applications.Bank.transferFunds;

public class BankerDemo {


    public static void main(String[] args) throws Exception {


        DemirBank nursultanDemirBankAccount = new DemirBank(118000001234l,123456789);
        DemirBank urmatDemirBankAccount = new DemirBank(118000000312l,987654321);

        System.out.println(nursultanDemirBankAccount.getBalance());
        nursultanDemirBankAccount.deposit(5000);
        System.out.println("After deposit: " + nursultanDemirBankAccount.getBalance());

        transferFunds(nursultanDemirBankAccount,urmatDemirBankAccount,2000);

        System.out.println("Urmat's balance after transfer is: " + urmatDemirBankAccount.getBalance());
        System.out.println("Nursultan's balance after transfer is: " + nursultanDemirBankAccount.getBalance());

        transferFunds(urmatDemirBankAccount,nursultanDemirBankAccount,2101);
        System.out.println(nursultanDemirBankAccount.getBalance());

    }

}