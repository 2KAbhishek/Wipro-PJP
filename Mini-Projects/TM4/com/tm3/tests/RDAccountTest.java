package com.tm3.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tm3.bean.RDAccount;

public class RDAccountTest {
    private RDAccount rdAccount = new RDAccount();

    @Test
    public void setAmountTest() {
        rdAccount.setAmount(10000.0);
        assertEquals(10000.0, rdAccount.getAmount(), 0.0);
    }

    @Test
    public void getSetInterestTest() {
        rdAccount.setInterestRate(5);
        assertEquals(5, rdAccount.getInterestRate(), 0);
    }

    @Test
    public void getSetgetNoOfMonthTest() {
        rdAccount.setNoOfMonth(6);
        assertEquals(6, rdAccount.getNoOfMonth());
    }

    @Test
    public void getSetMonthlyAmountTest() {
        rdAccount.setMonthlyAmount(500);
        assertEquals(500, rdAccount.getMonthlyAmount(), 0);
    }

    @Test
    public void getSetAgeOfACHolderTest() {
        rdAccount.setAgeOfACHolder(65);
        assertEquals(65, rdAccount.getAgeOfACHolder());
    }

    @Test
    public void calculateInterestTest() {
        rdAccount.setAmount(10000.0);
        rdAccount.setNoOfMonth(6);
        rdAccount.setAgeOfACHolder(65);
        assertEquals(800.0, rdAccount.calculateInterest(), 0.0);
    }

}
