package com.bank.lesson.entity;

public class Account {

    private Bill bill;
    private Person person;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Account(Bill bill, Person person) {
        this.bill = bill;
        this.person = person;
    }
}