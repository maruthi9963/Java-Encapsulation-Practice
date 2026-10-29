package encapsulation;

public class bank {
	 private double balance = 5000;

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful");
	        } else {
	            System.out.println("Invalid deposit amount");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful");
	        } else {
	            System.out.println("Invalid withdrawal amount");
	        }
	    }
	    public double getBalance() {
	        return balance;
	    }
	    public static void main(String[] args) {
	        bank b  = new bank();

	     b.deposit(2000);
	      b.withdraw(1000);

	        System.out.println("Balance: " + b.getBalance());
	    }

}
