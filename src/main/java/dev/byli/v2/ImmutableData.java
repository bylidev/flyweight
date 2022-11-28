package dev.byli.v2;

import dev.byli.v1.Currency;

import java.io.Serializable;

public class ImmutableData implements Serializable {
    private String bank;
    private String branch_office;
    private Currency currency;

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
}
