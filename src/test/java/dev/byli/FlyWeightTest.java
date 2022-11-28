package dev.byli;

import dev.byli.utils.MemoryUtils;
import dev.byli.v1.LedgerA;
import dev.byli.v1.Movement;
import dev.byli.v1.Transaction;
import dev.byli.v2.LedgerB;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

/**
 * Unit test for simple FlyWeight.
 */
public class FlyWeightTest
        extends TestCase {

    public FlyWeightTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(FlyWeightTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void test() throws IOException {
        //arrange
        LedgerA ledger = new LedgerA();
        LedgerB ledgerFlyWeight = new LedgerB();
        //act
        for (int i = 0; i < 500; i++) {
            ledger.createTransaction(BigDecimal.valueOf(i), i%2==0?Movement.EGRESS:Movement.INGRESS);
            ledgerFlyWeight.createTransaction(BigDecimal.valueOf(i), i%2==0?Movement.EGRESS:Movement.INGRESS);
        }
        //assert
        assertTrue(MemoryUtils.getBytesFromList(ledger.getBook())>MemoryUtils.getBytesFromList(ledgerFlyWeight.getBook()));
    }
}
