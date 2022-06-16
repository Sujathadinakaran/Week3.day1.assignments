package Week3.day1.assignments;

public class Students {
	
	// Method getStudentInfo overloading
	
	public void getStudentInfo()
	{
		System.out.println("Get Student Info");
	}
	public void getStudentInfo(int studentId, String studentName)
	{
		System.out.println("Get Student ID:" +studentId+ "&Name:" +studentName);
		
		}
	public void getStudentInfo(String emailId, int studentPhone)
	{
		System.out.println("Get Student emailID:" +emailId+ "&Phone:" +studentPhone);
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students mystudent = new Students();
		mystudent.getStudentInfo();
		mystudent.getStudentInfo(1234, "Suja");
		mystudent.getStudentInfo("sujatha.2402@gmail.com", 123456789);
	}

}
