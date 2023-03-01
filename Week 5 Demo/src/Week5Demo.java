
public class Week5Demo
{

    public static void main(String[] args)
    {
	System.out.println(factorial(5));
	
	int [] arry = {5, 45 , 32, 16};
	
	printReverse(arry,0);
	
    }

    public static  int factorial(int i)
    {
	if(i == 1) //base case
	    return 1;
	
	return factorial(i-1) * i;
	

    }
    
    public static void printReverse(int [] arry,int i)
    {
	
	if(i == arry.length-1)//base case
	{
	    System.out.println(arry[i]);
	}
	else
	{
	    printReverse(arry,i+1);
	    System.out.println(arry[i]);
	}

	
	
    }

}
