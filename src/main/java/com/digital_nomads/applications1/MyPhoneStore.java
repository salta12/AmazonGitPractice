package com.digital_nomads.applications1;

public class MyPhoneStore  extends StoreProductRange {
    private int discount = 10;

    public MyPhoneStore(String phones, String earphones, String charges) throws Exception {
        super(phones, earphones, charges);
    }

    @Override
    public int price() {
        return 0;
    }

    @Override
    public void sell(double amount) {

    }

    @Override
    public void buy(double amount) {

    }
}


