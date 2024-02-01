package com.example.ddd.order_1;

public class Address {
    private String address1;
    private String zddress2;
    private String zipcode;

    public Address(String address1, String zddress2, String zipcode) {
        this.address1 = address1;
        this.zddress2 = zddress2;
        this.zipcode = zipcode;
    }

    public String getAddress1() {
        return address1;
    }

    public String getZddress2() {
        return zddress2;
    }

    public String getZipcode() {
        return zipcode;
    }
}
