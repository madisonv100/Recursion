import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibTest {

	@Test
	void fibbIBelowTwo() 
	{ int num = 0;
	    //Arrange 
		FibanacciCalculator calulator = new FibanacciCalculator(num);
		//Act
		num = 0;
		//Assert
		assertEquals(1,calulator.fibbI(num));
		
	
	}
	
	@Test 
	void fibbIGreaterTwo()
	{ int num =0;
		//Arrange
		FibanacciCalculator calulator = new FibanacciCalculator(num);
		//Act
		num = 4;
		//Assert
		assertEquals(3,calulator.fibbI(num));
	}
	
	@Test 
	void fibbRBelowTwo()
	{
		int num = 0;
	    //Arrange 
		FibanacciCalculator calulator = new FibanacciCalculator(num);
		//Act
		num = 0;
		//Assert
		assertEquals(1,calulator.fibbR(num));
	}
	
	@Test 
	void fibbRGreaterTwo()
	{
		int num = 0;
	    //Arrange 
		FibanacciCalculator calulator = new FibanacciCalculator(num);
		//Act
		num = 4;
		//Assert
		assertEquals(3,calulator.fibbR(num));
	}

}
