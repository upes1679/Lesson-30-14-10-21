package com.volatile_demo;

public class Main {
    public static void main(String[] args) {

    }
}

class Calendar {
    private int years;
    private int months;
    private volatile int days;

    public void writeValues(int years, int months, int days) {
        this.years = years;
        this.months = months;
        this.days = days;
    }

    public int getTotalDays() {
        int totalDays = this.days;
        totalDays += this.months * 30;
        totalDays += this.years * 365;

        return totalDays;
    }
}
