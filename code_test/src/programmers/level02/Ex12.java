package programmers.level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

// 행렬의 곱셈
public class Ex12 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		// int[][] arr1 = {{1,4}, {3,2},{4,1}};
		// int[][] arr2 = {{3,3}, {3,3}};
		// int[][] arr1 = {{2,3,2}, {4,2,4},{3,1,4}};
		// int[][] arr2 = {{5,4,3}, {2,4,1},{3,1,1}};
		int[][] arr1 = {{2,3,2,5}, {4,2,4,1},{3,1,4,2}};
		int[][] arr2 = {{5,4},{2,4},{7,1},{3,3}};
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(Arrays.toString(s.solution(arr1, arr2)[i]));
		}
	}
	
	static class Solution {
		public int[][] solution(int[][] arr1, int[][] arr2) {
			// System.out.println(arr1.length + " | " + arr1[0].length + " | " + arr2.length + " | " + arr2[0].length);
			
			int[][] result = new int[arr1.length][arr2[0].length];
			
			for(int i = 0; i < arr1.length; i++) {
				for(int j = 0; j < arr2[0].length; j++) {
					for(int k = 0; k < arr2.length; k++) {
						// System.out.println(i + " | " + j + " | " + k);
						result[i][j] += arr1[i][k] * arr2[k][j]; 
					}
				}
			}
			
			return result;
		}
	}
}