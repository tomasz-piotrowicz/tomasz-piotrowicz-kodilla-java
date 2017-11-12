package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;


    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        Item item1 = new Item(product1, new BigDecimal(25.00), 100, new BigDecimal(100));
        Item item2 = new Item(product1, new BigDecimal(50.00), 60, new BigDecimal(20));
        Item item3 = new Item(product2, new BigDecimal(60.00), 1000, new BigDecimal(20.00));
        Invoice invoice1 = new Invoice("1/17");
        Invoice invoice2 = new Invoice("2/17");
        invoice1.getItems().add(item1);
        invoice2.getItems().add(item2);
        invoice2.getItems().add(item3);

        //When.
        productDao.save(product1);
        productDao.save(product2);

        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();
        invoiceDao.save(invoice2);
        int invoice2Id = invoice2.getId();

        //Then
        Assert.assertNotEquals(0, invoice1Id);
        Assert.assertNotEquals(0, invoice2Id);

        /*//CleanUp
        invoiceDao.delete(invoice1Id);
        invoiceDao.delete(invoice2Id);

        productDao.delete(product1);
        productDao.delete(product2);*/

    }

}
