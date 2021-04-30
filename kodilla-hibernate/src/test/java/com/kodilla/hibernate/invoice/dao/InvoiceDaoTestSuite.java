package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invd;

    @Test
    void testInvoiceDaoSave() {

        //GIVEN
        Invoice invoice = new Invoice();

        Product product1 = new Product("product One");
        Product product2 = new Product("product Two");
        Product product3 = new Product("product Three");

        Item item1 = new Item(product1,new BigDecimal("20.0"),6);
        Item item2 = new Item(product2,new BigDecimal("50.0"),16);
        Item item3 = new Item(product3,new BigDecimal("80.0"),61);

        List<Item> myItems = new ArrayList<Item>();
        myItems.add(item1);
        myItems.add(item2);
        myItems.add(item3);

        invoice.setItems(myItems);

        //WHEN
        invd.save(invoice);
        int size = invoice.getItems().size();

        //THEN
        Assertions.assertEquals(3,size);

        //CLEANUP
        try {
            invd.deleteById(invoice.getId());
        } catch (Exception e) {
            //do nothing
        }
    }

}
