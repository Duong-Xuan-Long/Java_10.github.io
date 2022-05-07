package com.company;

public class User {
    private String userName;
    private String password;
    private String accountNumber ;
    private long balance;

    public User(String userName, String password, String accountNumber, long balance) {
        this.userName = userName;
        this.password = password;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
    public void copy(User u){
        this.userName = u.userName;
        this.password = u.password;
        this.accountNumber = u.accountNumber;
        this.balance = u.balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", Balance=" + balance +
                '}';
    }
}
