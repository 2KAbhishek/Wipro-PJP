package com.tm3.bean;

abstract class Account {
    double interestRate;
    double amount;

    abstract double calculateInterest();
}
