package com.azzus.Entity;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by azzus on 2/12/2018.
 */
public class SavingAccount {
    private Long id;
    private int accountNumber;
    private BigDecimal accountbalance;

    private List<SavingTransaction> savingTransactionList;

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

    public List<SavingTransaction> getSavingTransactionList() {
        return savingTransactionList;
    }

    public void setSavingTransactionList(List<SavingTransaction> savingTransactionList) {
        this.savingTransactionList = savingTransactionList;
    }
}