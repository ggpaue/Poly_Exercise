/**
 * 
 * @author GGPAUE
 * 
 * 青蛙过河加强版
 * 过河规则和第一题一样，不过加了一个限制条件：河中间有些石子上面很光滑，小青蛙如果跳到这些石子上会掉到水里过不了河，给出石子个数和光滑石子的编号，求出小青蛙过河的方法数
 * Input: 
 * 第一行：N石子个数，M其中光滑石子个数 (1 < N&M < 1000000)
 * 第二行：从左往右M个光滑石子的编号，以逗号分隔
 * Output: 过河方法的个数，如果小青蛙没法过河，输出 -1
 *  
 */

public class Solution {
	public static int countWays(int n, int[] slips) {
		int[] river = new int[n + 2];
		
		river[0] = 1;
		river[1] = 2;
		
		for(int i = 0; i < slips.length; i++) {
			river[slips[i]] = -1;
		}
		
		for(int i = 2; i <= n + 1; i++) {
			int sum = 0;
			if(river[i] == -1) continue;
			if(river[i - 1] != -1) sum += river[i - 1];
			if(river[i - 2] != -1) sum += river[i - 2];
			river[i] = sum;
		}
		
		return river[n + 1] == 0 ? -1 : river[n + 1];
	}
	
	public static void main(String[] args) {
		int[] slips = {3, 5};
		System.out.println(countWays(5, slips));
	}

}
