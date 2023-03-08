
public class Queue 
{
	public static int MaxSize = 20;
	private int [] container = new int [MaxSize];
	private int count;//keeps track of number of integers in stack
	private int front;
	private int back;
	
	
	public Queue()
	{
		count = 0;
		front = -1;
		back=-1;
		
	}
	
	public boolean isEmpty()
	{
		if(count == 0)
			return true;
		
		return false;
	}
	
	public boolean isFull()
	{
		if(count>=MaxSize)
			return true;
		
		return false;
	}
	
	public boolean enqueue(int i)
	{
		if(isFull())
			return false;//fail
		
		if(back==-1)
		{
			front=0;
			back=0;
		}
		else 
			back++;
		
		back = back % MaxSize;
		
		container[back] = i;
		count++;
		
		return true;
	}
	
	public int dequeue()
	{
		if (isEmpty())
			return -9999;
		int temp = container[front++];
		
		front = front % MaxSize;
		
		if(--count<=0)
		{
			front=-1;
			back=-1;
		}
		
		return temp;
		
		
	}
	
	

}
