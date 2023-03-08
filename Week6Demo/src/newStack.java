
public class newStack <Type>implements StackInterface <Type>
{
	private static int MaxSize = 20;
	private Type [] container ;
	private int count;//keeps track of number of integers in stack
	
	public newStack() 
	{
		count = 0;
		//container =  (Type[ ]) Object[MaxSize];
		
	}
	
	@Override
	public void push(Type t)
	{
		
		
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Type top() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type pop() {
		// TODO Auto-generated method stub
		return null;
	}
}