package dev.byli.v2;

import dev.byli.v1.Currency;

import java.util.ArrayList;
import java.util.List;

public class ImmutableFactory {
    private List<ImmutableData> immutableCache;

    public ImmutableFactory() {
        this.immutableCache = new ArrayList<>();
    }

    public ImmutableData getFlyWeight(
            String bank,
            String branch_office,
            Currency currency) {
        return this.immutableCache.stream()
                .filter(i -> i.getBank().equals(bank))
                .filter(i -> i.getBranch_office().equals(branch_office))
                .filter(i -> i.getCurrency().equals(currency)).findFirst()
                .orElse(create(bank, branch_office, currency));
    }

    private ImmutableData create(
            String bank,
            String branch_office,
            Currency currency) {
        ImmutableData immutableData = new ImmutableData();
        immutableData.setBank(bank);
        immutableData.setBranch_office(branch_office);
        immutableData.setCurrency(currency);
        immutableCache.add(immutableData);
        return immutableData;
    }
}
