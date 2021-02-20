package com.kodilla.stream.invoice.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleInvoiceTestSuite {

    @Test
    void testGetValueToPay() {
        //GIVEN
        SimpleInvoice invoice = new SimpleInvoice();

        //WHEN
        invoice.addItem(new SimpleItem(new SimpleProduct("product1",17.28),2.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("product2",11.99),3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("product3",6.49),5.0));
        //THEN
        assertEquals(108.975, invoice.getValueToPay(),0.001);
    }

}
