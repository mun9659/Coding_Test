package swea.d3;

import java.util.ArrayList;
import java.util.Scanner;

// [S/W 문제해결 기본] 10일차- 비밀번호(Scanner 버전)
public class Quiz_01234 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= 10; tc++) {
			int n = sc.nextInt();
			char[] password = sc.next().toCharArray();
			ArrayList<Character> arr = new ArrayList<>();
			for(int i = 0; i < n; i++) {
				arr.add(password[i]);
			}
			
			while(true) {
				boolean check = false;
				for(int i = 0; i < arr.size() - 1; i++) {
					if(arr.get(i) == arr.get(i + 1)) {
						for(int j = 0; j < 2; j++) arr.remove(i);
						check = true;
						break;
					}
				}
				if(!check) break;
			}
			
			
			sb.append("#"+tc+" ");
			for(int i = 0; i < arr.size(); i++) {
				sb.append(arr.get(i));
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}