
// MyDate program

public class FirstClass 
{
	private int dd;
	String mm;
	private int yy;
	private static int count;  // static variable use
	
	public static int getCount()
	{
		return count;
	}
	
	public FirstClass()
	{
		dd=16;
		mm="aug";
		yy=2021;
		//System.out.println("hello in constructor");
		count++;
	}

	
	public FirstClass(int d,String m,int y)
	{
		dd= d;
		mm= m;
		yy= y;
		//System.out.println("hello in second constructor");
		count++;
	}
	
	public void setDate(int d) // set method
	{
		dd=d;
	}
	
	public int getDate()  // get method
	{
		return dd;
	}
	
	public void setMonth(String m) // set method
	{
		mm=m;
	}
	public String getMonth()  // get method
	{
		return mm;
	}
	
	public void setYear(int y) // set method
	{
		yy=y;
	}
	
	public int getYear()  // get method
	{
		return yy;
	}
	
	public void displayDate()
	{
		
	System.out.println("date is "+dd+"-"+mm+"-"+yy);
		
	}
	
	public void setDate(int d,String m,int y)
	{
		dd= d;
		mm= m;
		yy= y;
		
	}
	
	public void init()
	{
		dd=16;
		mm="aug";
		yy=2021;
	}

}
	
	


