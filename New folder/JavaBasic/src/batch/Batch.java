package batch;


public class Batch 
{	
	private String batchID;
	private String module;
	private int duration;
	//private LocalDate startDate;
	
	public Batch()
	{
		batchID="Java123";
		module="java";
		duration=5;
	}

	public Batch(String batchID,String module,int duration)
	{
		this.batchID=batchID;
		this.module=module;
		this.duration=duration;
	}

	public void display()
	{
		System.out.println("Batch info:\n batchID - "+batchID+"" +
				"\n module name - "+module+"\n duration - "+duration);
	}
	
	public void setBatchDetails(String batchID,String module,int duration)
	{
		this.batchID=batchID;
		this.module=module;
		this.duration=duration;
	}
}
	
	
	
	
	
	
	
	














