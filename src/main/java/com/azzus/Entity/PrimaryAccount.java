package com.azzus.Entity;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by azzus on 2/12/2018.
 */
public class PrimaryAccount {
    private Long id;
    private  int accountNumber;
    private BigDecimal accountbalance;

    private List<PrimaryTransaction> primaryTransactionList;

    public PrimaryAccount() {
    }

    public PrimaryAccount(Long id, int accountNumber, BigDecimal accountbalance, List<PrimaryTransaction> primaryTransactionList) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountbalance = accountbalance;
        this.primaryTransactionList = primaryTransactionList;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountbalance() {
        return accountbalance;
    }

    public void setAccountbalance(BigDecimal accountbalance) {
        this.accountbalance = accountbalance;
    }

    public List<PrimaryTransaction> getPrimaryTransactionList() {
        return primaryTransactionList;
    }

    public void setPrimaryTransactionList(List<PrimaryTransaction> primaryTransactionList) {
        this.primaryTransactionList = primaryTransactionList;
    }
}

