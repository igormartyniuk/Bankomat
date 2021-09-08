package com.bank.lesson.entity;

public class Person {

    private String firsName;
    private String SecondName;
    private int code;

    public Person(String firsName, String secondName, int code) {
        this.firsName = firsName;
        SecondName = secondName;
        this.code = code;
    }

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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
