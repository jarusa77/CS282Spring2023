
public class Week6Demo 
{

	public static void main(String[] args) 
	{
		
		//Stack Code
		
		Stack s1 = new Stack();
		
		System.out.println(s1.isEmpty());
		System.out.println(s1.top());
		System.out.println(s1.pop());
		
		s1.push(15);
		
		System.out.println(s1.isEmpty());
		
		
		
		System.out.println(s1.size());
		System.out.println(s1.top());
		
		s1.push(47);
		s1.push(13);
		s1.push(99);
		s1.push(12);
		
		System.out.println(s1.size());
		System.out.println(s1.top());
		
		
		System.out.println(s1.pop());
		System.out.println(s1.top());
		
		System.out.println(s1.size());
		
		System.out.println(s1.MaxSize);
		
		
		Queue q1 = new Queue();
		
		q1.enqueue(2);
		
		

	}

}
