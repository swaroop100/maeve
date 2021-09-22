
public class Student {

	private int stuID;
	private String stuName;
	private int stuYear;
	private String address;
	private Address add;
	
	Student()
	{
		stuID=123;
		stuName="sam";
		stuYear=2;
		address="pune";
		add=new Address();
		
	}
	
	public Student(int stuID,String stuName,int stuYear,Address add)
	{
		this.stuID=stuID;
		this.stuName=stuName;
		this.stuYear=stuYear;
		this.add=add;
	}
	
	
	public void display()
	{
		
		System.out.println("Student DETAILS :\n stuID: "+stuID+"\n stu name : "+stuName+"\n  student year : "+stuYear);
		System.out.println("student Address :");
		add.displayAddress();          
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
