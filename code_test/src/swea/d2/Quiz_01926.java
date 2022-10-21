package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 간단한 369게임
public class Quiz_01926 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb  = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 1;
		while(cnt <= n) {
			String num = String.valueOf(cnt);
			if(num.contains("3") || num.contains("6") || num.contains("9")) {
				char[] arr = num.toCharArray();
				String result = "";
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] == '3') result += "-";
					if(arr[i] == '6') result += "-";
					if(arr[i] == '9') result += "-";
				}
				sb.append(result).append(' ');
			} else {
				sb.append(num).append(' ');
			}
			cnt++;
		}
		System.out.println(sb);
	}
}
