package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 돌 게임
public class Quiz_09655 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] stone = {"SK", "CY"};
		
		System.out.println(stone[N > 2 ? ((N / 3) + (N % 3) + 1) % 2 : (N - 1) % 2]);
	}
}