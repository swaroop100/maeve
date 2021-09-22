package address;

public class Employee 
{

	private int empID;
	private String empName;
	private int salary;
	private String address;
	
	Employee()
	{
		empID=123;
		empName="sam";
		salary=100000;
		address="pune";
		
		
		
	}
	
	
	Employee(int empID,String empName,int salary,String address)
	{
		this.empID=empID;
		this.empName=empName;
		this.salary=salary;
		this.address=address;
		
		
	}
	
	
	public void display()
	{
		
		System.out.println("EMPLOYEE DETAILS :\n empID: "+empID+"\n emp name : "+empName+"\n emp salary : "+salary+"\n address :"+address);
		
	}
	
	
	
	public static void main(String[] args) 
	{
		Address ad = new Address();
		Employee emp =new Employee();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}


