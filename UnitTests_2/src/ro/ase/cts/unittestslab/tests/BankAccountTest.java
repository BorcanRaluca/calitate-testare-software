package ro.ase.cts.unittestslab.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ase.cts.unittestslab.Bank;
import ro.ase.cts.unittestslab.BankAccount;

import java.util.Locale;

import static org.junit.Assert.*;

public class BankAccountTest {
    BankAccount bankAccount;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setIbanCode() {
        bankAccount = new BankAccount();
        String iban = "RO23ROBTDNI3q2173N37232j";
        bankAccount.setIbanCode(iban);
        assertEquals("setIbanCode() nu este implementat corect", iban, bankAccount.getIbanCode());

        bankAccount.setIbanCode("ROM23ROBTDNI3q2173N37232j");
        assertEquals("setIbanCode() nu este implementat corect", "", bankAccount.getIbanCode());

        bankAccount.setIbanCode("RO123ROBTDNI3q2173N37232j");
        assertEquals("setIbanCode() nu este implementat corect", "", bankAccount.getIbanCode());

        bankAccount.setIbanCode("RO23ROTDNI3q2173N37232j");
        assertEquals("setIbanCode() nu este implementat corect", "",  bankAccount.getIbanCode());
    }

    @Test
    public void setCurrency() {
        bankAccount = new BankAccount();
        String currency = "EUR";

        bankAccount.setCurrency(currency);
        assertEquals("setCurrency() nu este implementat corect", currency, bankAccount.getCurrency());

        bankAccount.setCurrency("euro");
        assertEquals("setCurrency() nu este implementat corect", "", bankAccount.getCurrency());
    }
}
