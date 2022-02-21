package com.digital_nomads.applications1;

public abstract class StoreProductRange implements Store {
    private String phones;
    private String earphones;
    private String charges;

    public StoreProductRange (String phones,String earphones,String charges) throws Exception {
        if(phones.equals("iphone")||(earphones.equals("ipod"))){
            throw new Exception("out of stock");
        }
        else {
            this.phones=phones;
            this.earphones=earphones;
            this.charges=charges;

        }
    }

    public String getPhones() {
        return phones;
    }

    public String getEarphones() {
        return earphones;
    }

    public String getCharges() {
        return charges;
    }
}
