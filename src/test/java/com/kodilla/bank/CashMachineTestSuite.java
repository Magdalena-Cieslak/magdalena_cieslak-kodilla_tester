package com.kodilla.bank;

import com.kodilla.bank.homework.CashMachine;
import com.kodilla.school.Grades;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashMachineTestSuite {
    CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldHaveZeroLength() {
        int[] values = cashMachine.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddThreeElementsToArray() {
        cashMachine.add(200);
        cashMachine.add(120);
        cashMachine.add(-300);

        int[] values = cashMachine.getValues();
        assertEquals(3, values.length);
        assertEquals(200, values[0]);
        assertEquals(120, values[1]);
        assertEquals(-300, values[2]);
    }

    @Test
    public void shouldCalculateBalance() {
        cashMachine.add(200);
        cashMachine.add(-75);
        cashMachine.add(190);

        assertEquals(315, cashMachine.getBalance());
    }

}
