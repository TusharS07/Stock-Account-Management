package com.bridgelabz.stock_Account_Management;

public class StockAccount {
    String stockName;
    double sharePrice;
    int shareQuantity;
    double totalSharePrice;
    double accountBalance;



    public StockAccount(String stockName, double sharePrice, int shareQuantity, double totalSharePrice, double accountBalance) {
        this.accountBalance = accountBalance;
        this.stockName = stockName;
        this.sharePrice = sharePrice;
        this.shareQuantity = shareQuantity;
        this.totalSharePrice = totalSharePrice;

    }

    public StockAccount() {

    }


    public double getAccountBalance() {
        return accountBalance;
    }

    public String getStockName() {
        return stockName;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public int getShareQuantity() {
        return shareQuantity;
    }

    public double getTotalSharePrice() {
        return totalSharePrice;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public void setShareQuantity(int shareQuantity) {
        this.shareQuantity = shareQuantity;
    }

    public void setTotalSharePrice(double totalSharePrice) {
        this.totalSharePrice = totalSharePrice;
    }

    public String toString() {
        //System.out.println("-------portfolio-------");
        System.out.println("Holdings");
        return " Stock_Name: " + stockName + "\n Share_Price: " + sharePrice + "\n Total Qantity Shares: " + shareQuantity + "\n Total Shares Price: " + totalSharePrice;
    }
}
