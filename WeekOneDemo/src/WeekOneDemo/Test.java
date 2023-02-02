package WeekOneDemo;

public class Test 
{
	private int number;
	
	public static int countObjects;
	
	public Test()
	{
		countObjects++;
	}
	
	public Test(Test input)
	{
		this.number = input.number;
		countObjects++;
	}
	
	
	//accessor
	public int getNumber()
	{
		return number;
	}
	
	public void setNumber(int input)
	{
		number = input;
	}
	
}
