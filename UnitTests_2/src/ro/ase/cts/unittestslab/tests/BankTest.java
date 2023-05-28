package ro.ase.cts.unittestslab.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ase.cts.unittestslab.Bank;
import ro.ase.cts.unittestslab.BankAccount;

import java.util.Locale;

import static org.junit.Assert.*;

public class BankTest {
    BankAccount bankAccount;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setName() {
        Bank bank = new Bank();
        String testStr = "shswhrf bank";
        bank.setName(testStr);
        assertEquals("Set nu este implementat corect", testStr, bank.getName());
        assertTrue("Minim 5 caratere", bank.getName().length() >= 5);
        assertTrue("Trebuie sa contina cuvantul bank", bank.getName().toLowerCase(Locale.ROOT).contains("bank"));
    }

    @Test
    public void setAddress() {
        Bank bank = new Bank();

        bank.setAddress("str ion");
        assertEquals("setAddress() nu este implementat corect", "", bank.getAddress());

        bank.setAddress("str ion mihalache");
        assertEquals("setAddress() nu este implementat corect", "str ion mihalache", bank.getAddress());
        assertTrue("setAddress() nu este implementat corect", bank.getAddress().length() >= 10);
    }

    @Test
    public void setSwiftCode() {
        Bank bank = new Bank();

        bank.setSwiftCode("ROBTCCXZ3242");
        assertEquals("setAddress() nu este implementat corect", "", bank.getSwiftCode());

        bank.setSwiftCode("ROBT-CC-XZ-342");
        assertEquals("setAddress() nu este implementat corect", "ROBT-CC-XZ-342", bank.getSwiftCode());
    }
}