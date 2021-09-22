

	public class Employee 
	{

		private int empID;
		private String empName;
		private int salary;
		private String address;
		private Address add;
		
		Employee()
		{
			empID=123;
			empName="sam";
			salary=100000;
			address="pune";
			add=new Address();
			
			
		}
		
		
		public Employee(int empID,String empName,int salary,Address add)
		{
			this.empID=empID;
			this.empName=empName;
			this.salary=salary;
			this.add=add;
			
			
		}
		
		
		public void display()
		{
			
			System.out.println("EMPLOYEE DETAILS :\n empID: "+empID+"\n emp name : "+empName+"\n emp salary : "+salary);
			System.out.println("employee Address :");
			add.displayAddress();          
			
		}
		
		
		
		
		
		
		
	

	
	
	
	
	
}
