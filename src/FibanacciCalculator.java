import java.util.ArrayList;

public class FibanacciCalculator {
private int num;





FibanacciCalculator(int num)
{
	super();
	this.num = num;
}

public int fibbI(int num) 
{ 
int a = 1;
int b = 1;
int c = 1;

if (num<= 2)
{
	return 1;
	
}
	for (int i = 3; i <= num; i++)
	{
		a = b;
		b=c;
		c = a + b ;
	}
	return c;

	
	  }
	 
	 public int fibbR(int nums) 
	  { 
		 if (nums <= 2) 
	  { 
		  return 1; 
	  } 
	  else 
	  { 
		  return fibbR(nums-1)+fibbR(nums-2);
	  } 
		 
	  }
	 
}
