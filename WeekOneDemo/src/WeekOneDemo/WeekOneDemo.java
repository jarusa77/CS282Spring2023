package WeekOneDemo;

/**
 * 
 */
/**
 * @author CC.Student
 *
 */



public class WeekOneDemo
{
	
	
	public static void main(String[] args)
	{
		Test t = new Test();
		
		t.setNumber(50);
		System.out.println(t.getNumber());
		
		System.out.println(Test.countObjects);
		
		Test t2 = new Test();
		
		System.out.println(Test.countObjects);

		Test t3 = new Test(t2);
		System.out.println(Test.countObjects);
		
		System.out.println("Hello World");
	}

}


