package ro.ase.cts.unittestslab.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ase.cts.unittestslab.BankAccount;
import ro.ase.cts.unittestslab.Client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClientTest {
    Client client;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setName() {
        client = new Client();

        client.setName("Ion Alexandru Popescu");
        assertEquals("setName() nu a fost implementat corect", "Ion Alexandru Popescu", client.getName());
        assertTrue("setName() nu este implementat corect", client.getName().length() >= 5);

        client.setName("Ion");
        assertEquals("setName() nu este implementat corect", "", client.getName());

        client.setName("Io n");
        assertEquals("setName() nu este implementat corect", "", client.getName());
    }
}
