package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 영화감독 숌
public class Quiz_01436 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0, num = 666;
		while(cnt != n) {
			if(String.valueOf(num).contains("666")) {
				cnt++;
			}
			num++;
		}
		
		System.out.println(num - 1);
	}
}

/*
int n = Integer.parseInt(br.readLine());
		
		int i = 666, cnt = 0;
		while(cnt < n) {
			if(String.valueOf(i).contains("666")) {
				cnt++;
			}
			i++;
		}
		System.out.println(i - 1);
*/