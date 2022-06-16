package Week3.day1.assignments;

public class Desktop extends Computer{

	//Desktop method
	
	public void desktoplocation()
		{
		System.out.println("This is Desktop location");
	}
	//Calling computer methods using single inheritance
	
	public static void main(String[] args)
	{
		Desktop d = new Desktop();
		d.computerAsset();
		d.desktoplocation();
	}
}
