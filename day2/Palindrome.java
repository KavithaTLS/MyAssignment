package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=34343;
		int input=num;
		int output=0,rem;
		for(num=input;num>0;num=num/10)
		{
			rem=num%10;
			output=output*10+rem;
			if(input==output) {
				System.out.println("is a palindrome");
			}
			else
			{
				System.out.println("not a palindrome");
			}
		}

	}

}
