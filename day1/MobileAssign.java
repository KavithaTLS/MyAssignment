package week1.day1;

public class MobileAssign {

	public void makeCall(String mobilemodel,float mobileweight)
	{
		System.out.println("mobilemodel =Samsung");
		System.out.println(mobileweight);
	}
	
	public void sendMsg(boolean  fullCharged,int mobileCost)
	{
		System.out.println(fullCharged);
		System.out.println(mobileCost);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileAssign moa= new MobileAssign();
		moa.makeCall("samsung", 365f);
		moa.sendMsg(true,400);
		System.out.println("This is my Mobile");
				

	} 

}
