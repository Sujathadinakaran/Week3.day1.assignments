package Week3.day1.assignments;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Name of the student");
	}
	public void studentDept()
	{
		System.out.println("Department of the student");
	}
	public void studentID()
	{
		System.out.println("This is ID of the student");
	}
	
	//Call all the methods using multilevel inheritance
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student mystudent = new Student();
		mystudent.studentID();
		mystudent.studentDept();
		mystudent.studentName();
		mystudent.deptName();
		mystudent.collegeRank();
		mystudent.collegeCode();
		mystudent.collegeName();		
	}

}
