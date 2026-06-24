package example.training.com;
class NRIAccount extends BankAccount{
//	float interestRate=6.5f;
	void applyFixedDeposit(int interestRate) {
		System.out.println(interestRate);
		
	}
	
	
	
}
class SeniorCitizen extends BankAccount{
	//float interestRate=10.5f;
	void applyFixedDeposit(int interestRate) {
		System.out.println(interestRate);
		
	}
}
public class InheritanceDemo {
	public static void main(String[] args) {
		NRIAccount n=new NRIAccount();
		n.applyFixedDeposit(2);
		n.depositMoney(2000.0f);
		n.withdrawMoney(500.0f);
		SeniorCitizen s=new SeniorCitizen();
		s.applyFixedDeposit(3);
		s.depositMoney(1000.0f);
		s.withdrawMoney(200.0f);
		
	}

}
