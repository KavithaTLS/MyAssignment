package week3.day1;

public class AxisBank extends BankInfo
{
	public void Deposit()
	{
		System.out.println("Deposit amount:20000");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank axs=new AxisBank();
		axs.Savings();
		axs.Fixed();
		axs.Deposit();

	}

}
