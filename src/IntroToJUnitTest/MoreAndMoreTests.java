package IntroToJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class MoreAndMoreTests {
	

	public int multiply(int a, int b)
	{
		return a*b;
	}
	
	public boolean isPrime(int a)
	{
		for(int i = 2; i < a; i++)
		{
			if(a%i == 0)
			{
				return false;
			}
			
		}
		return true;
		
	}
	
	public boolean isSquare(int b)
	{
		for(int i = 0; i <= b; i++)
		{
			if (i*i == b)
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean isCube(int c)
	{
		for(int i = 0; i <= c; i++)
		{
			if (i*i*i == c)
			{
				return true;
			}
		}
		return false;
	}
	//@Test
	//  public void MultTest() {

	 //   assertEquals(0, multiply(10, 0));
	 //   assertEquals(100, multiply(10, 10));
	//    assertEquals(88, multiply(8, 11));
	//  }

	//@Test
	 // public void PrimeTest() {

		//assertTrue(isPrime(3));
	   // assertTrue(isPrime(5));
	   // assertTrue(isPrime(541));
	   // assertFalse(isPrime(4));
	   // assertFalse(isPrime(12));
	   // assertFalse(isPrime(527));

	 // }

	//@Test
	//  public void SquareTest() {

	  //  assertTrue(isSquare(4));
	  //  assertTrue(isSquare(144));
	  //  assertTrue(isSquare(64));
	  //  assertTrue(isSquare(10201));
	  //  assertTrue(isSquare(1));
	  //  assertFalse(isSquare(3));
	  //  assertFalse(isSquare(22));
	  //  assertFalse(isSquare(143));

	//  }

	//@Test
	 // public void CubeTest() {

	   // assertTrue(isCube(27));
	   // assertTrue(isCube(216));
       // assertTrue(isCube(729));
	   // assertTrue(isCube(1));
	   // assertFalse(isCube(3));
	  //  assertFalse(isCube(22));
	   // assertFalse(isCube(143));

	//  }



}
