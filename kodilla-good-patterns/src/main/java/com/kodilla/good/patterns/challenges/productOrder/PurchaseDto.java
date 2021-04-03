package com.kodilla.good.patterns.challenges.productOrder;

public class PurchaseDto {

    public ShopUser shopUser;
    public boolean isAvailable;

    public ShopUser getUser() { return shopUser; }

    public boolean isRented() { return isAvailable; }

    public PurchaseDto(final ShopUser shopUser, final boolean isAvailable) {
        this.shopUser = shopUser;
        this.isAvailable = isAvailable;

    }
}
