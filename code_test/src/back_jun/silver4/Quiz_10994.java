package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 별 찍기 - 19
// 다시 풀기
public class Quiz_10994 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int size = (n - 1) * 4 + 1;
		char[][] star = print_star(n);
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				sb.append(star[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	public static char[][] print_star(int val) {
		int size = (val - 1) * 4 + 1;
		char[][] star = new char[size][size];
		for(int i = 0; i < star.length; i++) {
			Arrays.fill(star[i], ' ');
		}
		
		if(val == 1) {
			star[0][0] = '*';
			return star;
		}
		
		char[][] pre_star = print_star(val - 1);
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(i == 0 || i == size - 1 || j == 0 || j == size - 1) {
					star[i][j] = '*';
				}
				else if(i >= 2 && i < size - 2 && j >= 2 && j < size - 2) {
					star[i][j] = pre_star[i - 2][j - 2];
				}
			}
		}
		return star;
	}
}