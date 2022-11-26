package programmers.level02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

import programmers.level02.Ex000000.Solution;

// 
public class Ex29 {
	public static void main(String[] args) throws Exception {
		Solution sol = new Solution();
		
		int n = 437674;
		int k = 3;
		// int n = 110011;
		// int k = 10;
		
		System.out.println(sol.solution(n, k));
	}
	
	public static class Solution {
		 public int solution(int n, int k) {
	        int answer = 0;
	        
	        StringTokenizer st = new StringTokenizer(Integer.toString(n, k), "0");
	        
	        List<Integer> arr = new ArrayList<>();
	        int max = 0;
	        while(st.hasMoreTokens()) {
	        	int num = Integer.parseInt(st.nextToken());
	        	max = Math.max(max, num);
	        	arr.add(num);
	        }
	        
	        // 에라토스테네스의 체 사용
	        boolean[] isPrime = new boolean[max + 1];
	        isPrime[0] = isPrime[1] = true;
	        
	        ArrayList<Integer> prime_arr = new ArrayList<>();
	        for(int i = 2; i <= max; i++) {
	        	if(isPrime[i]) continue;
	        	prime_arr.add(i);
	        	for(int j = 2 * i; j <= max; j += i) {
	        		isPrime[j] = true;
	        	}
	        }
	        
	        for(int val : arr) {
	        	if(prime_arr.contains(val)) {
	        		answer++;
	        	}
	        }
	        
	        return answer;
	    }
	}
}
