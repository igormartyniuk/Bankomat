package com.bank.lesson.entity;

public class Bill {

    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Bill(int amount) {
        this.amount = amount;
    }
}
