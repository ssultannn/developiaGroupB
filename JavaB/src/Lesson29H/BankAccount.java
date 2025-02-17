package Lesson29H;

public abstract class BankAccount {
	private int accountNumber;
	private double balance;

	public BankAccount(int acc) {
		accountNumber = acc;
		balance = 0;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);
}
//Инкапсуляция+