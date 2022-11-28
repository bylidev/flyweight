package dev.byli.v2;

import dev.byli.v1.Currency;
import dev.byli.v1.Movement;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LedgerB {

    private final String BANK_NAME = "BYLI_BANK";
    private final String BANK_OFFICE = "BYLI_ARGENTINA";
    private final Currency CURRENCY = Currency.ARS;

    private List<Transaction> transactions;

    private ImmutableFactory immutableFactory;

    public LedgerB() {
        immutableFactory = new ImmutableFactory();
        transactions = new ArrayList<>();
    }

    // Operation
    public Transaction createTransaction(BigDecimal amount, Movement movement){
        Transaction transaction = new Transaction();
        transaction.setImmutableData(immutableFactory.getFlyWeight(BANK_NAME,BANK_OFFICE,CURRENCY));
        transaction.setMovement(movement);
        transaction.setAmount(amount);

        this.register(transaction);

        return transaction;
    }
    public List<Transaction> getBook() throws IOException {
        return transactions;
    }

    private void register(Transaction transaction){
        transactions.add(transaction);
    }
}
