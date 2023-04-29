package week1.day2;

public class FibSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int range =8;
	        int Num1= 0;
	        int Num2 = 1;
	        int sum;
	     // Print first number
	        System.out.println(Num1);
	        System.out.println(Num2);
	        
	     
	        for (int i = 1; i <= range; i++) {
			   	
	        	sum = Num1+Num2;
	        	Num1 = Num2;
	        	Num2 = sum;
	        	
	        	
	        	System.out.println(sum);
			}

	}

}
