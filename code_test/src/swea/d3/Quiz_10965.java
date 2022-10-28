package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

// 제곱수 만들기
// DP, 에라토스테네스의 체
// 다시 풀어보자
public class Quiz_10965 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		int maxValue = (int)Math.pow(10, 7) + 1; // a의 최대값
		ArrayList<Integer> primeArr = new ArrayList<>(); // 소수값 배열
		
		int sqrt = (int)Math.sqrt(maxValue) + 1;
		boolean[] isPrime = new boolean[sqrt + 1];
		// 에라토스테네스의 체 실행
		for(int i = 2; i <= sqrt; i++) {
			if(isPrime[i]) continue;
			primeArr.add(i);
			for(int j = 1; j * i <= sqrt; j++) {
				isPrime[j * i] = true;
			}
		}
		
		ArrayList<Integer> sqrArr = new ArrayList<>();
		for(Integer i : primeArr) {
			sqrArr.add(i * i);
		}
		
		System.out.println(primeArr);
		System.out.println(sqrArr);
		
		for(int tc = 1; tc <= t; tc++) {
			int a = Integer.parseInt(br.readLine());
			
			for(int i = 0; i <= sqrt; i++) {
				int divnum = sqrArr.get(i);
				if(a < divnum) break;
				
				while(true) {
					if(a % divnum == 0) a /= divnum;
					else break;
				}
			}
			sb.append("#" + tc + " " + a + "\n");
		}
		System.out.println(sb);
	}
}

/*
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		int maxNum = (int) Math.pow(10, 7) + 1; // a의 최대값
		ArrayList<Integer> primeArr = new ArrayList<>(); // 소수값
		
		int sqrt = (int) Math.sqrt(maxNum) + 1;
		boolean[] isPrime = new boolean[sqrt + 1]; // 소수 확인
		for(int i = 2; i <= sqrt; i++) {
			if(isPrime[i]) continue;
			primeArr.add(i);
			for(int j = 1; j * i <= sqrt; j++) {
				isPrime[j * i] = true;
			}
		}
		
		ArrayList<Integer> squArr = new ArrayList<>(); // 소수 제곱값
		for(Integer i : primeArr) {
			squArr.add(i * i);
		}
		
		for(int tc = 1; tc <= t; tc++) {
			int a = Integer.parseInt(br.readLine());
			
			for(int i = 0; i <= sqrt; i++) {
				int divnum = squArr.get(i);
				if(a < divnum) break;
				
				while(true) {
					if(a % divnum == 0) a /= divnum;
					else break;
				}
			}
			sb.append("#"+tc+" "+a+"\n");
		}
		System.out.println(sb);
 */
