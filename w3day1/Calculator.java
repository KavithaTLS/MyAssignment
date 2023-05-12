package week3.day1;

public class Calculator {

	//
		public void add (int x, int y)
		{
			System.out.println(x+y);
			
		}
		public void add(int x, int y,int z)
		{
			System.out.println(x+y+z);

	}
		public void multi(double x,double y)
		{
			System.out.println(x*y);
		}
		public void multi(float a, float b) 
		{
			System.out.println(a*b);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Calculator calc= new Calculator();
			calc.add(204, 600);
			calc.add(20,30,40);
			calc.multi(20, 20);
			calc.multi(22.5f, 11.5f);
			

}
}
