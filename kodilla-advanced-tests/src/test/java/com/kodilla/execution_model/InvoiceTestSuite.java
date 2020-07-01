package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item milk = new Item("Milk", 3.5);
    Item eggs = new Item("Eggs", 8.0);
    Item bread = new Item("Bread", 4.15);

    @Test
    public void shouldAddItemToInvoice() {
        //when
        int numberOfItems = invoice.getSize();

        //then
        assertEquals(3, numberOfItems);
    }

    @Test
    public void shouldGetExistingItem() {
        //when
        Item result = invoice.getItem(2);

        //then
        assertEquals("Bread", result.getName());
        assertEquals(4.15, result.getPrice());
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        //when
        Item result = invoice.getItem(-3);

        //then
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {
        //when
        Item result = invoice.getItem(6);

        //then
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice() {
        //when
        invoice.clear();

        //then
        assertEquals(0, invoice.getSize());
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Reseting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}
