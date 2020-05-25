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
import java.util.Arrays;

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
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Książka");
        Product product2 = new Product("Komputer");
        Product product3 = new Product("Smartwatch");
        Product product4 = new Product("Maska");

        Item item1 = new Item(product1, new BigDecimal(15), 2);
        Item item2 = new Item(product2, new BigDecimal(2000), 1);
        Item item3 = new Item(product3, new BigDecimal(250), 1);
        Item item4 = new Item(product4, new BigDecimal(5), 10);

        Invoice invoice = new Invoice("012546228");

        invoice.setItems(Arrays.asList(item1, item2, item3, item4));

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //then
        Assert.assertEquals(4, productDao.count());
        Assert.assertEquals(4, itemDao.count());
        Assert.assertEquals(1, invoiceDao.count());
        Assert.assertNotEquals(0, invoiceId);

        //cleanup
        productDao.deleteAll();
        itemDao.deleteAll();
        invoiceDao.deleteAll();
    }
}
