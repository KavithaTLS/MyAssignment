package week1.day2;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=12;
		boolean flag=false;
		for(int i=2;i<input/2;i++)
		{
			if(input%i==0)
			{
				flag=true;
				break;
				
			}
		}
		if(flag!=true)
		{
			System.out.println(input+ "is a Prime number");
		}
			else 
			{
				System.out.println(input+ " is not a prime number");
			}
			}
		

		}


