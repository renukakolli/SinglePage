package example.training.com;

public class BankAccount {
	float withdrawAmount,depositAmount,interestRate , balance;
	void depositMoney(float depositAmount) {
		System.out.println("depositMoney "+depositAmount);
	}
	void withdrawMoney(float withdrawAmount) {
		balance=depositAmount-withdrawAmount;
		System.out.println("balance "+balance);
		//System.out.println("balance "+balance);
	}
}
	

