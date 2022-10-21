package com.bridgelabz.stock_Account_Management;

import java.util.ArrayList;
import java.util.Scanner;

public class StockExchange {
    //ArrayList of Stock Account object
    ArrayList<StockAccount> stockAccount = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    //Stock account class object
    StockAccount data = new StockAccount();

    //method Add Fund into demat Account
    public void addFund() {
        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        data.setAccountBalance(amount + data.getAccountBalance());
        System.out.println(amount + " Rs" + " Fund Added in Account");
        System.out.println("Account Balance: Rs."+data.getAccountBalance());
       // stockAccount.add(data);
        System.out.println();
    }


    //method Add buy Stock into demat Account
    public void buyStock() {
        System.out.println();
        System.out.println("Account Balance: " + data.getAccountBalance() + "Rs");
        System.out.print("Enter Stock Name: ");
        String stockName = sc.next();

        System.out.print("Enter Current Price of Stock: ");
        double sharePrice = sc.nextDouble();

        System.out.print("How much Quantity of share You want to buy: ");
        int shareQuantity = sc.nextInt();

        double totalSharePrice = sharePrice * shareQuantity;
        System.out.println("Total Share Price is " + totalSharePrice + "Rs");
        System.out.println();
        double remaningBalance = data.getAccountBalance() - totalSharePrice;
        if (totalSharePrice <= data.getAccountBalance()) {
            StockAccount stockData = new StockAccount(stockName, sharePrice, shareQuantity, totalSharePrice, remaningBalance);
            stockAccount.add(stockData);
            System.out.println(stockName + " Stock added Successfully in Your Portfolio");
            double acBalance = remaningBalance;
            data.setAccountBalance(acBalance);
            System.out.println("Remaining Account Balance: " + data.accountBalance + "Rs");
        } else {
            System.out.println("Insufficient balance.. \nYou Can Not buy This stock \nPlease select another stock \n Or Reduce the shears Quantity");
        }
        System.out.println();
    }


    //method for view portfolio
    public void showPortfolio() {
        if (stockAccount.size() == 0) {
            System.out.println("Empty Portfolio..");
            System.out.println();
        } else {
            System.out.println();
            System.out.println(stockAccount.size() + " Company Stocks available in Portfolio");
            for (int i = 0; i < stockAccount.size(); i++) {
                System.out.println(stockAccount.get(i));
                System.out.println(" ");
            }
        }
        System.out.println("Account Balance: " +data.getAccountBalance());
        System.out.println();
    }

    //method for sell stocks
    public void sellStock() {
        if (stockAccount.size() == 0) {
            System.out.println("Empty Portfolio..");
            System.out.println();
        } else {
            System.out.print("Enter The Stock Name You want to Sell from Your Holdings: ");
            String sname = sc.next();
            for (int i = 0; i < stockAccount.size(); i++) {
                StockAccount stockdata = stockAccount.get(i);
                if (!sname.equals(stockdata.stockName)) {
                    System.out.println("Stock does not exist");
                } else {
                    double acbalance =  data.accountBalance + stockdata.totalSharePrice;
                    data.setAccountBalance(acbalance);

                    //remove stock
                    stockAccount.remove(i);
                    System.out.println();
                    System.out.println("Successfully to sell stock...\namount Successfully added to Your account \nplease check Your Portfolio");
                }
            }
        }
        System.out.println();
    }

    public void withdrawsMoney(){
        if (data.getAccountBalance() == 0) {
            System.out.println("Insufficient balance \nplease Add Fund");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Account Balance: " +data.getAccountBalance());
            System.out.println("How much Money You want to withdraws?");
            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();
            if (amount <= data.getAccountBalance()) {
                System.out.println(amount+ "Rs successfully Withdraw");
                System.out.println("The amount of Rs." +amount+ " has been initiated to your bank account and will reflect in 1 working day");
                double remaning = data.getAccountBalance() - amount;
                data.setAccountBalance(remaning);

                System.out.println();
                System.out.println("Now Your Demat Account Balance: " +data.getAccountBalance());
                System.out.println();
            } else {
                System.out.println("Insufficient balance");
            }
        }
        System.out.println();
    }
}
