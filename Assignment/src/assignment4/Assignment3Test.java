package assignment4;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Assignment3Test {
	
	private Assignment3 a3 = new Assignment3();
	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Test
	public void testFindPowerOfThree() { 
		int[] pow3 = {1, 3, 9, 27};
		assertArrayEquals(pow3, a3.findPowerOfThree(4));
	}
	
	@Test
	public void testCountDigits(){
		assertEquals(1, a3.countDigits(100));
	}
	
	@Test
	public void testPrintNumbers(){
		System.setOut(new PrintStream(outContent));
		a3.printNumbers(4);
		assertEquals("0 2 4 6 \n", outContent.toString());
		outContent.reset();
		a3.printNumbers(3);
		assertEquals("1 3 5 \n", outContent.toString());
		System.setOut(null);
	}
	
	@Test
	public void testPascalsTriangle(){
		int[][] test = {{1, 0, 0 ,0 ,0}, {1, 1, 0 ,0 ,0}, {1, 2, 1 ,0 ,0}, {1, 3, 3 ,1 ,0}, {1, 4, 6 ,4 ,1}};
		int[][] pascals = a3.generatePascalsTriangle(5);
		assertArrayEquals(test, pascals);
	}
	
	@Test
	public void testReverseVowels(){
		assertEquals("holle", a3.reverseVowels("hello"));
	}
	
	@Test
	public void testLengthOfLastWord(){
		String string = "I Love Soccer";
		assertEquals(6, a3.lengthOfLastWord(string));
	}
	
	@Test
	public void testReverseString2(){
		assertEquals("Soccer Like I", a3.reverseString2("I Like Soccer"));
	}
	
	@Test
	public void testCheckMessage(){
		assertEquals(2, a3.checkMessage("SOSSUSSOP"));
	}
}
