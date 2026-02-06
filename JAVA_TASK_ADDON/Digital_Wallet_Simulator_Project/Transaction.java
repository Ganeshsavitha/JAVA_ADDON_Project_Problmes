package Digital_wallet_simulation;

	public class Transaction {

	    String type;     // Add, Pay, Cashback
	    double amount;

	    public Transaction(String type, double amount) {
	        this.type = type;
	        this.amount = amount;
	    }

	    public String toString() {
	        return type + " : ₹" + amount;
	    }
	}


