package com.bank.lesson.entity;

import com.bank.lesson.entity.Bill;

public class Person {

    private String firsName;
    private String SecondName;
    private String phoneNumber;

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Person(String firsName, String secondName, String phoneNumber) {
        this.firsName = firsName;
        SecondName = secondName;
        this.phoneNumber = phoneNumber;
    }

    public static class Deposit {

        private Bill bill;

        public Deposit(Bill bill) {
            this.bill = bill;
        }

        public Bill getBill() {
            return bill;
        }

        public void setBill(Bill bill) {
            this.bill = bill;
        }
    }
}
