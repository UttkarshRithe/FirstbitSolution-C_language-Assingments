//8. BankAccount
//o accountNumber
//o holderName
//o currentBalance
//o interestRate
class BankAccount
{
	int accountNumber;
	String holderName;
	double currentBalance;
	double interestRate;
	
	BankAccount()
	{
		this.accountNumber=454;
		this.holderName="Sonu";
		this.currentBalance=13000;
		this.interestRate=4.6;
	}
	
	BankAccount(int accountNumber, String holderName, double currentBalance, double interestRate) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.currentBalance = currentBalance;
		this.interestRate = interestRate;
	}

	int getAccountNumber() {
		return accountNumber;
	}

	void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	String getHolderName() {
		return holderName;
	}

	void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	double getCurrentBalance() {
		return currentBalance;
	}

	void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	double getInterestRate() {
		return interestRate;
	}

	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	void display()
	{
		System.out.println("accountNumber:"+this.accountNumber);
		System.out.println("HolderName:"+this.holderName);
		System.out.println("CurrentBalance:"+this.currentBalance);
		System.out.println("InterestRatr:"+this.interestRate);
	}
}

public class Q8 {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount();
		b1.display();
		BankAccount b2 = new BankAccount(123,"Uttkarsh",120000,1.2);
		b2.display();
	}
	

}
