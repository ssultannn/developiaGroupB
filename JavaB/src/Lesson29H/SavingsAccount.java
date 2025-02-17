package Lesson29H;

public class SavingsAccount extends BankAccount {
	
	public SavingsAccount(int acc) {
		super(acc);
	}
	
	public void deposit(double amount) {
		setBalance(getBalance()+amount);
	}
	public void withdraw(double amount) {
		if (getBalance()>=5) {
			setBalance(getBalance()-amount);
		}
	}
}
