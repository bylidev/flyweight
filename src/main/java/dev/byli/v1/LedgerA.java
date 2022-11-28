package dev.byli.v1;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LedgerA {

    private final String BANK_NAME = "BYLI_BANK";
    private final String BANK_OFFICE = "BYLI_ARGENTINA";
    private final Currency CURRENCY = Currency.ARS;

    private List<Transaction> transactions;

    public LedgerA() {
        this.transactions = new ArrayList<>();
    }

    // Operation
    public Transaction createTransaction(BigDecimal amount, Movement movement){
        Transaction transaction = new Transaction();
        transaction.setBank(BANK_NAME);
        transaction.setBranch_office(BANK_OFFICE);
        transaction.setCurrency(CURRENCY);
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
