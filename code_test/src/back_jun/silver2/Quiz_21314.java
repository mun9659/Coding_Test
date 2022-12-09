package back_jun.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 민겸 수
public class Quiz_21314 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		
		List<String> arr = new ArrayList<>();
		
		int k = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'K') {
				arr.add(s.substring(k, i + 1));
				k = i + 1;
			} 
			
			if(i == s.length() - 1 && k <= s.length() - 1) {
				arr.add(s.substring(k, i + 1));
			}
		}
		
		String min_val = "", max_val = "";
		for(int i = 0; i < arr.size(); i++) {
			max_val += max(arr.get(i));
			min_val += min(arr.get(i));
		}
		
		sb.append(max_val).append("\n").append(min_val);
		System.out.println(sb);
	}
	
	public static String max(String s) {
		
		String result = "";
		if(s.contains("K")) {
			result += "5";
			for(int i = 0; i < s.length() - 1; i++) {
				result += "0";
			}
		} else {
			for(int i = 0; i < s.length(); i++) {
				result += "1";
			}
		}
		
		return result;
	}
	
	public static String min(String s) {
		
		String result = "";
		if(s.contains("K")) {
			if(s.contains("M")) {
				result += "1";
				for(int i = 0; i < s.length() - 2; i++) {
					result += "0";
				}
			} 
			result += "5";
		} else {
			result += "1";
			for(int i = 0; i < s.length() - 1; i++) {
				result += "0";
			}
		}
		return result;
	}
}