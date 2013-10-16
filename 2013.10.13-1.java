/**
 * 
 * @author GGPAUE
 * 
 * 如图所示，河中间有相同间隔的一系列石子，一只小青蛙要从河的左岸跳到右岸去（图中有六只青蛙，题目中只有一只青蛙:(  ） 
 * 小青蛙可以一次跳一颗石头，也可以一次跳两颗石头，小青蛙只能从左往右跳，
 * 请问: 给出河中间石头的颗数，求出小青蛙过河总共有多少种方法
 * 
 */

public class Solution {
	public static int findWays(int n) {
		int[] river = new int[n + 1];
		river[0] = 1;
		river[1] = 2;
		for(int i = 2; i <= n; i++) {
			river[i] = river[i - 1] + river[i - 2];
		}
		return river[n];
	}
	
	public static void main(String[] args) {
		int n = 10;
		System.out.println(findWays(n));
	}

}
