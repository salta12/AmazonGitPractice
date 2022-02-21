package com.digital_nomads.applications1;

public interface Store {
    int price();
    void sell (double amount);
    void buy (double amount);

    static void transactionShopping (Store buyer,Store seller,double transactionAmount){
        buyer.buy(transactionAmount);
        seller.sell(transactionAmount);
    }
}
