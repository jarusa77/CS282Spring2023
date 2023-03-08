
public class Stack 
{
	public static int MaxSize = 2;
	private int [] container = new int [MaxSize];
	private int count;//keeps track of number of integers in stack
	
	public Stack() 
	{
		count = 0;
	}
	
	public boolean isEmpty()
	{
		if(count == 0)
			return true;
		
		return false;
	}
	
	public boolean push(int i)
	{
		
		if(count >= MaxSize)
			//return false;//fail
		
		{
			MaxSize = MaxSize*2;
			int [] temp = new int [MaxSize] ;
			for(int j=0 ; j<count; j++)
			{
				temp[j]=container[j];
				container = temp;
			}
			
		}
		
		container[count++]=i;
		
		return true;//success
	}
	
	public int top()
	{
		if(isEmpty())
			return -9999;
			
		
		return container[count -1];
	}
	
	public int size()
	{
		return count;
	}
	
	public int pop()
	{
		if(isEmpty())
			return -9999;
		
		return container[--count];
	}
	
}




