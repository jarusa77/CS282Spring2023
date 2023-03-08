
public class StackLL 
{
	
	private class Node
	{
		String data;
		
		Node tail;
		
		public Node(String s)
		{
			data = s;
			tail = null;
		}
		
		public String getData()
		{
			return data;
		}
		
		public Node getTail()
		{
			return tail;
		}
			
		public void setTail(Node t)
		{
			tail = t;
		}
	}
	
	private Node head;
	private int count;//keeps track of number of integers in stack
	
	public StackLL()
	{
		head=null;
	}
	
	
	public boolean isEmpty()
	{
		if(head==null)
			return true;
		
		return false;
	}
	
	public void push(String s)
	{
		Node temp=new Node(s);
		
		if(!isEmpty())
			temp.setTail(head.getTail());
		
		head=temp;
	}
	
	public String pop()
	{
		if(isEmpty())
			return "Empty Stack";
			
		
		String out=head.getData();
		
		head = head.getTail();
		
		return out;
		
	}
	
	public String top()
	{
		if(isEmpty())
			return "Empty Stack";
		
		return head.getData();
	}
	
	

}
