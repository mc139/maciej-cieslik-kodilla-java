package com.kodilla.good.patterns.challenges.productOrder;

public class ShopUser {

    private String name;
    private String userName;
    private double walletValue;

    public String getName() {
        return name;
    }

    public double getWalletValue() {
        return walletValue;
    }

    public String getUserName() {
        return userName;
    }

    public ShopUser(String name, String userName, double walletValue) {
        this.name = name;
        this.userName = userName;
        this.walletValue = walletValue;
    }
}
