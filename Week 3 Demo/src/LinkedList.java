
public class LinkedList 
{
	private static class  Node
	{
		private int data;
		private Node tail;
		
		public Node(int d,Node t)
		{
			data = d;
			tail = t;	
		}
		
		public int getData()
		{
			return data;
		}
		
		public Node getTail()
		{
			return tail;
		}
		
		public void setData(int d)
		{
			data =d;
		}
		
		public void setTail(Node t)
		{
			tail = t;
		}
		
		
	}
	
	private Node head;
	private Node currentPos;
	private int size;
	
	public LinkedList()
	{
		head=null;
		currentPos=head;
		size = 0;
	}
	
	public boolean isEmpty() 
	{
		return head == null;
	}
	
	public void addItem(int d)
	{
		
		head = new Node(d,head);
		
		if(currentPos == null)
			currentPos =head;
		size++;
		
		//Node temp = new Node(d,head);
		//head =temp;
	}
	
	public int getCurrentPos()
	{
		return currentPos.getData();
	}
	
	public void setStart()
	{
		currentPos=head;
	}
	
	public boolean next()//returns false when end of list
	{
		if(isEmpty())
		{
			System.out.println("empty");
			return false;
		}
		if(currentPos.tail==null)
		{
			System.out.println("end of list");
			return false;
		}
		currentPos=currentPos.tail;
		return true;
		
	}
	
	public int deleteAtHead()
	{
		int data;
		if(isEmpty())
			return 9999;
		
		data =head.getData();
		
		if(head.tail == null) //only a head, no other nodes.
			head = null;
		else
		{
			head=head.tail;
		}
		return data;
	}
	
	
	public int deleteCurrentPos()
	{
		int data;
		
		if (currentPos==null)
			return 9999;
		
		data = currentPos.getData();
		
		if(currentPos == head)
			head=currentPos.tail;
		else 
		{
			Node before = head;
			
			while(before.tail != currentPos)
				before=before.tail;
			before.tail = currentPos.tail;
			
		}
		
		return data;
		
		
		
		return data;
		
	}
	
	

}
