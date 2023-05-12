package week3.day1;

public  class Automation extends MultipleLanguage implements Language,TestTool
{

	

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Testing Tool is Selenium");
		
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Programming Language is Java");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation  ats = new Automation();
		ats.python();
		ats.selenium();
		ats.Java();

	}

}
