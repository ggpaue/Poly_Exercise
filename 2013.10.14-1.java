/**
 * 
 * 括号匹配
 * 给定一堆括号序列，请判断是不是合法的括号序列
 * ()合法
 * (() 不合法
 * (())()合法
 * 
 */

import java.util.*;
public class Solution {
	public static boolean isValid(String s) {
		int len = s.length();
		if(len == 0) return false;
		Stack<Character> st = new Stack<Character>();
		st.add(s.charAt(0));
		int i = 1;
		while(i < len) {
			if(s.charAt(i) == '(') {
				st.add(s.charAt(i));
			} else {
				if(!st.empty() && st.peek() == '(') {
					st.pop();
				} else {
					return false;
				}
			}
			i++;
		}
		return st.empty();
	}
	
	public static void main(String[] args) {
		String s = "(()";
		System.out.println(isValid(s));
	}

}
