package com.kodilla.stream.invoice.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleInvoiceTestSuite {

    @Test
    void testGetValueToPay() {
        //GIVEN
        SimpleInvoice invoice = new SimpleInvoice();

        //WHEN

        SimpleProduct product2 = new SimpleProduct("Product2",40);
        SimpleItem item2 = new SimpleItem(product2,2);


        invoice.addItem(new SimpleItem(new SimpleProduct("Product1",17.28),2.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product2",11.99),3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product3",6.49),5.0));

        //THEN
        invoice.getValueToPay();
        assertEquals(108.975, invoice.getValueToPay(),0.001);
    }

}
