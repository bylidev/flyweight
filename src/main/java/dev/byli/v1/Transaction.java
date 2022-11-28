package dev.byli.v1;

import java.io.Serializable;
import java.math.BigDecimal;

public class Transaction implements Serializable {
    private String bank;
    private String branch_office;
    private Currency currency;
    private BigDecimal amount;
    private Movement movement;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBranch_office() {
        return branch_office;
    }

    public void setBranch_office(String branch_office) {
        this.branch_office = branch_office;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Movement getMovement() {
        return movement;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }
}
