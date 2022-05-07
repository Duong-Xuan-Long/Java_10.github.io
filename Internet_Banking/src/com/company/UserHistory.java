package com.company;

import java.time.LocalDate;

public class UserHistory {
    private User u;
    private LocalDate date;
    private String description;
    private String account;
    private long money;

    public UserHistory(User u, LocalDate date, String description, String account, long money) {
        this.u = u;
        this.date = date;
        this.description = description;
        this.account = account;
        this.money = money;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }

    @Override
    public String toString() {
        return
                 DDatePattern.datePattern(date) +
                " - " + description +
                         " - " + account +
                         " - " + money
                ;
    }
}
