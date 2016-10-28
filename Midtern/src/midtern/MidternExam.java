package midtern;

import java.util.HashMap;

public class MidternExam {
	/*
	 * 1)
	 * */
	public int longestPalindrome(String s) {
		int longest = 0;
		int start, end;
		
		// Odd number of letters scenario
		for(int i = 0; i < s.length(); i++){
			int count = 0;
			start = i;
			end = i;
			
			while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
				if(start == end){
					count++;
				}
				else{
					count += 2;
				}
				start--;
				end++;
			}
			
			if(count > longest)
				longest = count;
		}
		
		// Even number of letters scenario
		for(int i = 0; i < s.length(); i++){
			int count = 0;
			start = i;
			end = i + 1;
			
			while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
				count += 2;
				start--;
				end++;
			}
			
			if(count > longest)
				longest = count;
		}
		
		return longest;
	}
	
	/*
	 * 2)
	 * */
	public int maxProfit(int[] prices) {
		if(prices == null || prices.length == 0){
			return 0;
		}
		// find multiple increasing subsequence
		int sum = 0;
		int dayForBuying = 0;
		int dayForSelling = 0;
		int count = 0;
		
		for(int i = 0; i < prices.length; i++){
			if(i == prices.length - 1 || prices[i] > prices[i + 1]){
				dayForSelling = i;
				dayForBuying = i - count;
				sum += prices[dayForSelling] - prices[dayForBuying];
				count = 0;
			}
			else{
				count++;
			}
		}
		
		return sum;
	}
	
	/*
	 * 3)
	 * */
	public int titleToNumber(String title){
		int sum = 0;
		int count = 0;
		
		for(int i = title.length() - 1; i >= 0; i--){
			int charNumber = (title.charAt(i) - 'A') + 1;
			charNumber *= Math.pow(26, count++);
			sum += charNumber;
		}
		
		return sum;
	}
	
	/*
	 * Bonus
	 * */
	public int twoSum(int[] nums, int target) {
		int count = 0;
		
		for(int i = 0; i < nums.length - 1; i++){
			for(int j = i + 1; j < nums.length; j++){
				if(nums[i] + nums[j] == target)
					count++;
			}
		}
	
		return count;
	}
	
	/*
	 * Bonus O(n) method
	 * */
	public int twoSumII(int[] nums, int target) {
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		// initialized hash map, calculate margin of each number and target then store it in hashmap.
		for(int i = 0; i < nums.length; i++){
			map.put(nums[i], target - nums[i]);
		}
		
		for(int i = 0; i < map.size(); i++){
			int margin = map.get(nums[i]);
			if(map.containsKey(margin) && nums[i] != margin){ //no duplicates, so nums[i] can not be equal to margin
				map.remove(nums[i]);
				count++;
			}
		}
	
		return count;
	}
}
