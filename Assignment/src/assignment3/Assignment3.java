package assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {
	
	// assignments
		/**
		 * Write a method to find N numbers which are power of three. e.g. n=4,
		 * return {1,3,9,27}
		 */
		public int[] findPowerOfThree(int n) {
			int[] pow3 = new int[n];
			
			for(int i = 0; i < n; i++){
				pow3[i] = (int) Math.pow(3, i);
			}
			
			return pow3;
		}

		/**
		 * Given a integer 'n', return n%count, count is the number of digits of n
		 * For example, n = 100, return 1
		 */
		public int countDigits(int n) {
			int count = 0;
			int num = n;
			
			while(num > 0){
				count++;
				num /= 10;
			}
			
			return n % count;
		}

		/**
		 * Given a integer 'n', if n is odd, print n odd numbers, if n is even,
		 * print n even numbers. For example, n = 3, print 1 3 5 n = 4, print 0 2 4
		 * 6
		 */
		public void printNumbers(int n) {
			if(n % 2 == 1){
				for(int i = 0; i < n; i++){
					System.out.print((2 * i + 1) + " ");
				}
			}
			else{
				for(int i = 0; i < n; i++){
					System.out.print((2 * i) + " ");
				}
			}
			System.out.print("\n");
		}

		/**
		 * Given numRows, generate the first numRows of Pascal's triangle. For
		 * example, given numRows = 5, return: [1] [1,1] [1,2,1] [1,3,3,1]
		 * [1,4,6,4,1]
		 */
		public int[][] generatePascalsTriangle(int n) {
			int[][] pascals = new int[n][n];
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j <= i; j++){
					if(j == 0 || j == i)
						pascals[i][j] = 1;
					else
						pascals[i][j] = pascals[i - 1][j - 1] + pascals[i - 1][j];
				}
			}
			
			return pascals;
		}

		/**
		 * Write a function that takes a string as input and reverse only the vowels
		 * of a string. For example: Given s = "hello", return "holle".
		 */
		public String reverseVowels(String s) {
			String reverseVowels = "";
			char[] chars = s.toCharArray();
			
			int leftFlag = 0;
			int rightFlag = s.length() - 1;
					
			while(rightFlag > leftFlag){
				char c1 = chars[leftFlag];
				boolean bVowels1 = (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u');
				if(!bVowels1)
					leftFlag++;
				
				char c2 = chars[rightFlag];
				boolean bVowels2 = (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u');
				if(!bVowels2)
					rightFlag--;
				
				if(bVowels1 && bVowels2){
					// swap
					char temp;
					temp = chars[leftFlag];
					chars[leftFlag] = chars[rightFlag];
					chars[rightFlag] = temp;
					leftFlag++;
					rightFlag--;
				}
			}
			
			return reverseVowels.valueOf(chars);
		}

		/**
		 * Given a string s consists of upper/lower-case alphabets and empty space
		 * characters ' ', return the length of last word in the string. If the last
		 * word does not exist, return 0. Note: A word is defined as a character
		 * sequence consists of non-space characters only.
		 */
		public int lengthOfLastWord(String str) {
			String[] words = str.split(" ");
			
			if(words[words.length - 1] != null)
				return words[words.length - 1].length();
			else
				return 0;
		}

		/**
		 * Reverse a string by words. Do not use 'split' function. e.g. "I like
		 * soccer" --> "soccer like I"
		 */
		public String reverseString2(String str) {
			StringBuilder result = new StringBuilder(0);
			StringBuilder temp = new StringBuilder(0);
			
			for(int i = str.length() - 1; i >= 0; i--){
				
				if(str.charAt(i) != ' ')
					temp.append(str.charAt(i));
				
				if(str.charAt(i) == ' ' || i == 0){
					temp.reverse();
					result.append(temp.toString());
					
					if(i != 0)
						result.append(" ");
					
					temp.setLength(0);
				}
			}
			
			return result.toString();
		}

		// Bonus
		/**
		 * A robot from Mars send a long message to Earth which only contains many
		 * "SOS", like "SOSSOS", "SOSSOSSOSSOSSOS" But the radiation from universe
		 * changed some characters of the massage. Write a method to count how many
		 * characters were changed. For example, "SOSSOSSOS" might be changed to
		 * "SOSSUSSOP", then your method should return 2. The message was consisted
		 * by "SOS" so its length will be multiple of 3. You could assume the
		 * message only contains upper letter.
		 */
		public int checkMessage(String message) {
			int count = 0;
			
			for(int i = 0; i < message.length(); i++){
				if(i % 3 == 0 || i % 3 == 2){
					if(message.charAt(i) != 'S')
						count++;
				}
				else{
					if(message.charAt(i) != 'O')
						count++;
				}
			}
			
			return count;
		}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Assignment3 caseTest = new Assignment3();
		
		System.out.println("Enter a number (findPowerOfThree) :");
		int num = sc.nextInt();
		System.out.println(Arrays.toString(caseTest.findPowerOfThree(num)));
		System.out.println("============================================\n");
		
		System.out.println("Enter a number (countDigits) :");
		num = sc.nextInt();
		System.out.println(caseTest.countDigits(num));
		System.out.println("============================================\n");
		
		System.out.println("Enter a number (printNumbers) :");
		num = sc.nextInt();
		caseTest.printNumbers(num);
		System.out.println("============================================\n");
		
		System.out.println("Enter a number (generatePascalsTriangle) :");
		num = sc.nextInt();
		int[][] pascals = caseTest.generatePascalsTriangle(num);
		for(int i = 0; i < num; i++){
			System.out.print("[");
			for(int j = 0; j <= i; j++){
				System.out.print(pascals[i][j]);
				if(j != i){
					System.out.print(", ");
				}
			}
			System.out.print("]\n");
		}
		System.out.println("============================================\n");
		
		System.out.println("Enter a String (reverseVowels) :");
		String s = sc.next();
		System.out.println(caseTest.reverseVowels(s));
		System.out.println("============================================\n");
		
		System.out.println("Enter a String (lengthOfLastWord) :");
		s = sc.nextLine();
		s = sc.nextLine();
		System.out.println(caseTest.lengthOfLastWord(s));
		System.out.println("============================================\n");
		
		System.out.println("Enter a String (reverseString2) :");
		s = sc.nextLine();
		System.out.println(s);
		System.out.println(caseTest.reverseString2(s));
		System.out.println("============================================\n");
		
		System.out.println("Enter a String (checkMessage) :");
		s = sc.nextLine();
		System.out.println(caseTest.checkMessage(s));
		System.out.println("============================================\n");
	}

}
