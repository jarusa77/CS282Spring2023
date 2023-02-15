
public class Week3Demo {

	public static void main(String[] args) 
	{
		int [] x = new int[1000];
		
		x[0]=10;
		
		for(int i=0; i < x.length; ++i )
		{
			x[i]=99;
		}
		
		int [] y = {50,22,33,45,1};
		
		System.out.println(y.length);
		
		LinkedList l1= new LinkedList();
		
		l1.addItem(15);
		l1.addItem(2);
		l1.addItem(1);
		
		//System.out.println(l1.getCurrentPos());
		l1.addItem(22);
		l1.addItem(150);
		l1.addItem(47);
		
		//System.out.println(l1.getCurrentPos());
		l1.addItem(78);
		l1.addItem(99);
		l1.addItem(58);
		l1.addItem(36);
		l1.addItem(24);
		l1.addItem(13);
		
		if(!l1.isEmpty())
		{
			boolean test;
			l1.setStart();
			do 
			{
				System.out.println(l1.getCurrentPos());
				//test= l1.next();
				//System.out.println(test);
			}while(l1.next());
		}
		
		
			
		
		

	}

}
