package week1.day1;

public class Mobile {
	
	public void sendSMS() {
		System.out.println("ABCD");
	}
	
	 protected void AllowVoiceCall()
	{
		System.out.println(" Voice call Allowed ");
	}
	  private void takeVideo()
	  {
		  System.out.println("Video");
	  }
	  public static void main(String[] args) {
		  Mobile mob=new Mobile();
		  mob.sendSMS();
		  mob.AllowVoiceCall();
		  mob.takeVideo();
	  }

		  
	  }
	  
	  
	
	


