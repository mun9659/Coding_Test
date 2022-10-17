package back_jun.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 가장 큰 김민수
// 브루트포스
public class Quiz_01526 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[] nums = {'0', '1', '2', '3', '5', '6', '8', '9'};
		
		while(n >= 4) {
			char[] n_arr = String.valueOf(n).toCharArray();
			boolean chk = true;
			for(int i = 0; i < n_arr.length; i++) {
				for(int j = 0; j < nums.length; j++) {
					if(n_arr[i] == nums[j]) {
						chk = false;
						break;
					}
				}
				if(!chk) break;
			}
			if(chk) break;
			n--;
		}
		
		System.out.println(n);
	}
}
