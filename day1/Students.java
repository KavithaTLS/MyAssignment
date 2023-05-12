package week3.day1;

public class Students {
	
	public void getStudentInfo(int Id)
	{
		System.out.println(Id);
		
	}
	public void getStudentInfo(int Id,String name)
	{
		System.out.println(Id + name);
		System.out.println("Student id:"+  Id  + "Student Name:" +name);
		
	}
	public void getStudentInfo(String Mailid,int PhoneNumber)
	{
		System.out.println(Mailid + PhoneNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students sts =new Students();
		sts.getStudentInfo(44);
		sts.getStudentInfo(45, "kavitha");
		sts.getStudentInfo("kavi123@gmail.com", 765478358);
		

	}

}
