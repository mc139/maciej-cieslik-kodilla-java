package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invd;

    @Test
    void testInvoiceDaoSave() {

        //GIVEN
        Invoice invoice = new Invoice("00110333");

        Product product1 = new Product("product One");
        Product product2 = new Product("product Two");
        Product product3 = new Product("product Three");

        Item item1 = new Item(product1, new BigDecimal("20.0"), 6);
        Item item2 = new Item(product2, new BigDecimal("50.0"), 16);
        Item item3 = new Item(product3, new BigDecimal("80.0"), 61);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        List<Item> list = Arrays.asList(item1, item2, item3);
        invoice.setItems(list);

        //WHEN
        invd.save(invoice);
        int size = invoice.getItems().size();

        //THEN
        Assertions.assertEquals(3, size);

        //CLEANUP
        invd.deleteById(invoice.getId());

    }

}
