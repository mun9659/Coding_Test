package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

// 빙고
// 다시 풀자
public class Quiz_02578 {
	
	public static int count = 0;
	public static int[][] bingo;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		bingo = new int[5][5];
		int num = 0;
		
		for(int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 5; j++) {
				bingo[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 5; j++) {
				num++;
				bingo(Integer.parseInt(st.nextToken()));
				bingoCheck();
				if(count >= 3) {
					System.out.println(num);
					return;
				}
			}
		}
	}
	
	public static void bingo(int num) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(bingo[i][j] == num) {
					bingo[i][j] = -1;
				}
			}
		}
	}
	
	public static void bingoCheck() {
		count = 0;
		int row = 0;
		int col = 0;
		int xy = 0;
		int yx = 0;
		int index = 0;
		for(int i = 0; i < 5; i++) {
			row = 0;
			col = 0;
			for(int j = 0; j < 5; j++) {
				row += bingo[i][j];
				col += bingo[i][j];
				
				if(i == j) xy += bingo[i][j];
				if(i == index && j == 4 - index) {
					yx += bingo[i][j];
					index++;
				}
			}
			if(row == -5) {
				count++;
			}
			if(col == -5) {
				count++;
			}
			if(xy == -5) {
				count++;
			}
			if(yx == -5) {
				count++;
			}
		}
	}
}