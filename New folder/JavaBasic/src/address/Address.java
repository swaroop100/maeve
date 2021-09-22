package address;
public class Address 
{
	String country;
	String state;
	String city;
	
	public Address()
	{
		
		country="India";
		state="Maharashtra";
		city="Pune";
		System.out.println("hello in constructor");
	}

	public Address(String c,String s,String ct)
	{
		country=c;
		state = s;
		city= ct;	
		System.out.println("hello in second constructor");
	}
	
	public void setCountry(String c) // set method
	{
		country=c;
	}
	
	public String getCountry()  // get method
	{
		return country;
	}
	
	public void setCity(String ct) // set method
	{
		city=ct;
	}
	public String getCity()  // get method
	{
		return city;
	}
	
	public void displayAddress()
	{
	System.out.println("I live in ");
	System.out.println("country - "+country+" state -"+state+ " city -"+city);	
	}
	
	public void setAddress(String c,String s,String ct)
	{
	country=c;
	state = s;
	city= ct;	
	}

	public void init()
	{
		country="India";
		state="Maharashtra";
		city="Pune";
	}

	public static void main(String[] args) 
	{
	
		Address ad = new Address();
		//ad.init();
		ad.displayAddress();
		//ad.setAddress("India", "Maharashtra", "Pune");
		Address adr = new Address("India", "Maharashtra", "Pune");
		adr.setCountry("USA");
		adr.displayAddress();
		
	}
	
	
	
	
	
}
