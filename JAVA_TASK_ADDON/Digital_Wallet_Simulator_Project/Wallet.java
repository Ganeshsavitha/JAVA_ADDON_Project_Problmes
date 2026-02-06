package Digital_wallet_simulation;

	import java.util.ArrayList;

	public class Wallet {

	    private double balance;
	    private double spendingLimit;
	    private ArrayList<Transaction> transactions;

	    public Wallet() {
	        balance = 0;
	        spendingLimit = 5000; // default spending limit
	        transactions = new ArrayList<>();
	    }

	    // Add Money
	    public void addMoney(double amount) {
	        balance += amount;
	        transactions.add(new Transaction("Added Money", amount));
	        System.out.println("Money added successfully.");
	    }

	    // Pay Money
	    public void payMoney(double amount) {
	        if (amount > spendingLimit) {
	            System.out.println("Payment exceeds spending limit.");
	        } 
	        else if (amount > balance) {
	            System.out.println("Insufficient balance.");
	        } 
	        else {
	            balance -= amount;
	            transactions.add(new Transaction("Paid Money", amount));

	            // Cashback logic (5%)
	            double cashback = amount * 0.05;
	            balance += cashback;
	            transactions.add(new Transaction("Cashback", cashback));

	            System.out.println("Payment successful. Cashback added.");
	        }
	    }

	    // Check Balance
	    public void checkBalance() {
	        System.out.println("Current Balance: ₹" + balance);
	    }

	    // Transaction History
	    public void showTransactions() {
	        if (transactions.isEmpty()) {
	            System.out.println("No transactions yet.");
	        } else {
	            for (Transaction t : transactions) {
	                System.out.println(t);
	            }
	        }
	    }

	    // Set Spending Limit
	    public void setSpendingLimit(double limit) {
	        spendingLimit = limit;
	        System.out.println("Spending limit updated.");
	    }

	    // Summary
	    public void showSummary() {
	        System.out.println("----- Wallet Summary -----");
	        System.out.println("Balance: ₹" + balance);
	        System.out.println("Spending Limit: ₹" + spendingLimit);
	        System.out.println("Total Transactions: " + transactions.size());
	    }
	}


