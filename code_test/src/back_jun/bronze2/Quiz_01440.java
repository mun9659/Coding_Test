package back_jun.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 타임머신
// 브루트포스 알고리즘
public class Quiz_01440 {
	static int result = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str_arr = br.readLine().split(":");
		
		time(str_arr);
		
		// StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		// int t1 = Integer.parseInt(st.nextToken());
		// int t2 = Integer.parseInt(st.nextToken());
		// int t3 = Integer.parseInt(st.nextToken());
		
		// time(t1, t2, t3);
		
		System.out.println(result);
	}
	
	private static void time(String[] str_arr) {
		for(int i = 0; i < str_arr.length; i++) {
			for(int j = 0; j < str_arr.length; j++) {
				for(int k = 0; k < str_arr.length; k++) {
					int t1 = Integer.parseInt(str_arr[i]);
					int t2 = Integer.parseInt(str_arr[j]);
					int t3 = Integer.parseInt(str_arr[k]);
					
					if(i != j && j != k && k != i) {
						if(t1 >= 1 && t1 <= 12) {
							if(t2 >= 0 && t2 <= 59) {
								if(t3 >= 0 && t3 <= 59) result++;
							}
						}
					}
				}
			}
		}
	}
	
	/*
	private static void time(int t1, int t2, int t3) {
		
		if(t1 >= 1 && t1 <= 12) {
			if(t2 >= 0 && t2 <= 59) {
				if(t3 >= 0 && t3 <= 59) result++;
			}
			
			if(t3 >= 0 && t3 <= 59) {
				if(t2 >= 0 && t2 <= 59) result++;
			}
		}
		
		if(t2 >= 1 && t2 <= 12) {
			if(t1 >= 0 && t1 <= 59) {
				if(t3 >= 0 && t3 <= 59) result++;
			}
			
			if(t3 >= 0 && t3 <= 59) {
				if(t1 >= 0 && t1 <= 59) result++;
			}
		}
		
		if(t3 >= 1 && t3 <= 12) {
			if(t1 >= 0 && t1 <= 59) {
				if(t2 >= 0 && t2 <= 59) result++;
			}
			
			if(t2 >= 0 && t2 <= 59) {
				if(t1 >= 0 && t1 <= 59) result++;
			}
		}
	}
	*/
}
