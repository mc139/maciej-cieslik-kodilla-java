package com.kodilla.good.patterns.challenges.foodchallenge.supplier;

import java.math.BigDecimal;

public abstract class FoodSupplier {

    private final String supplierName;
    private final String email;
    private final BigDecimal phoneNumber;

    public FoodSupplier(String supplierName, String email, BigDecimal phoneNumber) {
        this.supplierName = supplierName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return supplierName +
                ", email: " + email +
                " Phone : " + phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FoodSupplier that = (FoodSupplier) o;

        if (supplierName != null ? !supplierName.equals(that.supplierName) : that.supplierName != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        return phoneNumber != null ? phoneNumber.equals(that.phoneNumber) : that.phoneNumber == null;
    }

    @Override
    public int hashCode() {
        int result = supplierName != null ? supplierName.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }
}
