/**
 * 
 * @author GGPAUE
 * Given an array of integers, every element appears twice except for one. 
 *   (a) Find that single element.  Your algorithm should have a linear run time complexity. 
 *   (b) Could you implement it without using extra memory?
 */
public class Solution {
	public static int findUnique(int[] array) {
		int result = array[0];
		for(int i = 1; i < array.length; i++) {
			result ^= array[i];
		}
		return result;
	}

}
