package swea.d3;

import java.util.LinkedList;
import java.util.Scanner;

// [S/W 문제해결 기본] 8일차- 암호문3(Scanner 버전)
public class Quiz_01230 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= 10; tc++) {
			int n = sc.nextInt();
			LinkedList<Integer> n_arr = new LinkedList<>();
			for(int i = 0; i < n; i++) {
				n_arr.add(sc.nextInt());
			}
			
			int command = sc.nextInt();
			
			for(int i = 0; i < command; i++) {
				String s = sc.next();
				
				if(s.equals("I")) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					for(int j = 0; j < y; j++) {
						n_arr.add(x, sc.nextInt());
						x++;
					}
				} else if(s.equals("D")) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					for(int j = 0; j < y; j++) {
						n_arr.remove(x);
					}
				} else {
					int y = sc.nextInt();
					for(int j = 0; j < y; j++) {
						n_arr.add(sc.nextInt());
					}
				}
			}
			
			sb.append("#"+tc+" ");
			for(int i = 0; i < 10; i++) {
				sb.append(n_arr.poll() + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}