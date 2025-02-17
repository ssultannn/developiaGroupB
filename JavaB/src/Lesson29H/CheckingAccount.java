package Lesson29H;

public class CheckingAccount extends BankAccount {


	public CheckingAccount(int acc) {
		super(acc);
	}

	public void deposit(double amount) {
		setBalance(getBalance() + amount);
	}
	public void withdraw(double ammount) {
		int com = 1;
		setBalance(getBalance()-(ammount+com));
	}
}
//50-(5+1)=44