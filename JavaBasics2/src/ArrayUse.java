

	

public class ArrayUse {


	public static void main(String[] args) 
	{
		int arr[]= new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println("array length is "+arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("array contains "+arr[i]);
		}
		
		//object creation without new keyword
		
		int []val ={11,22,33,44,55,66,100};
		for(int value:val)
		{
			System.out.println(value);
		}
			
		int intarr[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("2D array elements "+intarr[i][j]);
			}
		}
		
		int [][]arri= new int[2][2];
		arri[0][0]=12;
		arri[0][1]=24;
		arri[1][0]=36;
		arri[1][1]=48;
		
		for(int [] eachrow:arri)
		{
			for(int v:eachrow)
			{
				System.out.println(v);
			}
		}
		
		// Array of references
		MyDate [] fcls= new MyDate[2]; 
		fcls[0]= new MyDate(1,"jan",1990);
		fcls[1]= new MyDate(2,"oct",1991);
	
		for(MyDate md:fcls)
		{
			md.displayDate(); // FirstClass obj fc we used here
		}
	
	
	
	
	}
}		



