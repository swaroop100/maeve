
public class Account
{
	private int acc_no;
	private String acc_holder_name;
	private int bal;
	private int years;
	static int int_rate, int_amt;
	
	public static int getInterestAmount()
	{
		
		return int_amt;
	}

	public void int_amount()
	{
		int_amt=(bal*int_rate*years)/100;
	}

	/*public Account()
	{
		bal=16000;
		acc_holder_name=" sam ";
		acc_no=202111;
		int_rate=10;
		years=2;
		//System.out.println("hello in constructor");
		
	}*/
	
	public Account(int d,int rate,int time)
	{
		bal= d;
		int_rate= rate;
		years= time;
		//System.out.println("hello in second constructor");
		
	}

	public void display()
	{
		System.out.println("Interest amount of sam acc is "+int_amt);
	}
	
	public void setAccount(int d,int rate,int time)
	{
		bal= d;
		int_rate= rate;
		years= time;
	}

	public void setbal(int d) // set method
	{
		bal=d;
	}
	
	public int getbal()  // get method
	{
		return bal;
	}


	public void setyear(int time) // set method
	{
		years=time;
	}
	
	public int getyear()  // get method
	{
		return years;
	}


	public void setInterestRate(int rate) // set method
	{
		int_rate=rate;
	}
	
	public int getInterestRate()  // get method
	{
		return int_rate;
	}











}
