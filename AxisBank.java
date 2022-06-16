package Week3.day1.assignments;

public class AxisBank extends BankInfo{
	
	//Method overriding
	
	public void deposit()
	{
		System.out.println("This is NOT a deposit Account");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank mybank = new AxisBank();
		mybank.deposit();
		mybank.fixed();
		mybank.saving();
	}

}
