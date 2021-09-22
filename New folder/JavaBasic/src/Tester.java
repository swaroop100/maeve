
public class Tester {

	
	public static void main(String[] args) 
	{
		System.out.println("count of firstclass object is "+FirstClass.getCount());
		
		FirstClass fc = new FirstClass();
		System.out.println("count of firstclass object is "+FirstClass.getCount());
		//fc.init();
		fc.displayDate();
		fc.setDate(11, "aug", 21);
		//FirstClass f = new FirstClass(17, "aug", 21);
		System.out.println("count of firstclass object is "+FirstClass.getCount());

		fc.setDate(15); // call set method to change date
		fc.setYear(22); // call set method to change year
		fc.displayDate();
		
		
		
		
		
	
	
	
	}

}

/*p = 13000; r = 12; t = 2;
si = (p*r*t)/100; principal amt , rate ,time
System.out.println("Simple Interest is: " +si);

*/