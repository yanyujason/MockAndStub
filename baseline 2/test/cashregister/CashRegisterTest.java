package cashregister;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CashRegisterTest {

    @Test
    public void shouldPrintInformation() {
        MockPrinter mockPrinter = new MockPrinter();
        CashRegister cashRegister = new CashRegister(mockPrinter);

        MockPurchase mockPurchase = new MockPurchase("item info");
        cashRegister.process(mockPurchase);

        assertTrue(mockPrinter.receive().equals("item info"));
    }

    //Mockito
}
