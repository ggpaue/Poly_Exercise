/**
 * There are two sorted arrays A and B with size m and n for each.  
 *    (a) Finding intersection of A and B.
 *    (b) Could you implement this with the complexity of O(m+n), and without extra memory?
 */

import java.util.ArrayList;
public class Solution {
	public static ArrayList<Integer> findIntersection(int[] A, int[] B, int m, int n) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int i = 0, j = 0;
		while(i < m && j < n) {
			if(A[i] > B[j]) {
				j++;
			} else if(A[i] < B[j]) {
				i++;
			} else {
				result.add(A[i]);
				i++;
				j++;
			}
		}
		return result;
	}

}
