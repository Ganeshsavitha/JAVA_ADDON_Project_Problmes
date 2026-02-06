package Digital_wallet_simulation;

	import java.util.Scanner;

	public class WalletApp {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Wallet wallet = new Wallet();
	        int choice;

	        do {
	            System.out.println("\n--- Di11 gital Wallet Simulator ---");
	            System.out.println("1. Add Money");
	            System.out.println("2. Pay Money");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Transaction History");
	            System.out.println("5. Set Spending Limit");
	            System.out.println("6. Wallet Summary");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");

	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter amount to add: ");
	                    double addAmount = sc.nextDouble();
	                    wallet.addMoney(addAmount);
	                    break;

	                case 2:
	                    System.out.print("Enter amount to pay: ");
	                    double payAmount = sc.nextDouble();
	                    wallet.payMoney(payAmount);
	                    break;

	                case 3:
	                    wallet.checkBalance();
	                    break;

	                case 4:
	                    wallet.showTransactions();
	                    break;

	                case 5:
	                    System.out.print("Enter new spending limit: ");
	                    double limit = sc.nextDouble();
	                    wallet.setSpendingLimit(limit);
	                    break;

	                case 6:
	                    wallet.showSummary();
	                    break;

	                case 7:
	                    System.out.println("Thank you for using Digital Wallet.");
	                    break;

	                default:
	                    System.out.println("Invalid choice.");
	            }

	        } while (choice != 7);

	        sc.close();
	    }
	}


