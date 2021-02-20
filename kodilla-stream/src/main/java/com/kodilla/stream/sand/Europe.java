package com.kodilla.stream.sand;

import java.math.BigDecimal;

public class Europe implements SandStorage {

    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("23123421323175324834");
        return sandQuantity;
    }
}
