package com.bridgelabz.stock_Account_Management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*_*_*_*_*_*_*_*_*_*_Welcome to National Stock Exchange_*_*_*_*_*_*_*_*_*_*");
        StockExchange stockExchange = new StockExchange();
        int choice;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    1: Add Fund.\s
                    2: Buy Stocks.\s
                    3: Sell Stocks.\s
                    4: View Portfolio.\s
                    5: Withdraw Money.""" );
            System.out.println();
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    stockExchange.addFund();
                    break;

                case 2:
                    stockExchange.buyStock();
                    break;

                case 3:
                    stockExchange.sellStock();
                    break;

                case 4:
                    System.out.println("\n-------portfolio-------");
                    stockExchange.showPortfolio();
                    System.out.println("-------portfolio-------\n");
                    System.out.println();
                    break;

                case 5:
                    stockExchange.withdrawsMoney();
                    break;

                default:
                    System.out.println("You have Entered Wrong Choice ");
            }
        }
    }
}
