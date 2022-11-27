package programmers.level02;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// k진수에서 소수 개수 구하기
// int 보다 큰 값이 나타나는 경우가 있어서 Long으로 처리해야한다.
// 에라토스테네스로 하기엔 Long 값의 배열을 만들 수 가 없으므로 제곱근 보다 낮은 값의 수가 있는지를 확인해야한다!
public class Ex29 {
	public static void main(String[] args) throws Exception {
		Solution sol = new Solution();
		
		// int n = 437674;
		// int k = 3;
		// int n = 110011;
		// int k = 10;
		int n = 885733;
		int k = 3;
		
		System.out.println(sol.solution(n, k));
	}
	
	public static class Solution {
		 public int solution(int n, int k) {
	        int answer = 0;
	        
	        StringTokenizer st = new StringTokenizer(Integer.toString(n, k), "0");
	        
	        List<Long> arr = new ArrayList<>();
	        while(st.hasMoreTokens()) {
	        	long num = Long.parseLong(st.nextToken());
	        	arr.add(num);
	        }
	        
	        for(long val : arr) {
	        	if(isPrime(val)) {
	        		answer++;
	        	}
	        }
	        
	        /*
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
	        */
	        
	        return answer;
	    }
	}
	
	// 제곱근 이하의 수 확인
	public static boolean isPrime(long num) {
		if(num == 1) {
			return false;
		} else if(num == 2) {
			return true;
		}
		
		int limit = (int) Math.sqrt(num);
		for(int i = 2; i <= limit; ++i) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
