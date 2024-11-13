package in.co.encapsulation;

public class Account {
	private int number;
	private String account;
	private double balance;

	public Account(int number, String account, double balance) {
		this.number = number;
		this.account = account;
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit succesful. New balance: " + balance);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful.New balance: " + balance);

		} else {
			System.out.println("Invalid withdrawal amount or insufficient balance.");
		}
	}

	public static void main(String[] args) {
		Account account = new Account(123456, "savings", 100.0);

		System.out.println("Number Number: " + account.getNumber());
		System.out.println("Account Type: " + account.getAccount());
		System.out.println("Balance: " + account.getBalance());

		account.deposit(15000.00);
		account.withdraw(200.0);

	}

}
