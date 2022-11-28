package dev.byli.v2;

import dev.byli.v1.Movement;

import java.io.Serializable;
import java.math.BigDecimal;

public class Transaction implements Serializable {
    private ImmutableData immutableData;
    private BigDecimal amount;
    private Movement movement;

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

    public ImmutableData getImmutableData() {
        return immutableData;
    }

    public void setImmutableData(ImmutableData immutableData) {
        this.immutableData = immutableData;
    }
}
