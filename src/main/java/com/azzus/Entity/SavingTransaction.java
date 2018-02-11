package com.azzus.Entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by azzus on 2/12/2018.
 */
public class SavingTransaction {
    private Long id;
    private Date date;
    private String description;
    private String type;
    private String status;
    private double amount;
    private BigDecimal availableBalance;


    private SavingAccount savingsAccount;

    public SavingTransaction() {
    }

    public SavingTransaction(Long id, Date date, String description, String type, String status, double amount, BigDecimal availableBalance, SavingAccount savingsAccount) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.type = type;
        this.status = status;
        this.amount = amount;
        this.availableBalance = availableBalance;
        this.savingsAccount = savingsAccount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public SavingAccount getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }
}
