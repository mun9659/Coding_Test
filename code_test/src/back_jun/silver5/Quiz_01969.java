package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// DNA
public class Quiz_01969 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // DNA 수
		int m = Integer.parseInt(st.nextToken()); // DNA 길이
		
		String[] arr = new String[n];
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		
		int[][] check = new int[m][4]; // ['A', 'T', 'G', 'C']로 구분
		char[] c_arr = {'A', 'T', 'G', 'C'};
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				switch(arr[i].charAt(j)) {
				case 'A' : 
					check[j][0]++;
					break;
				case 'T' : 
					check[j][1]++;
					break;
				case 'G' : 
					check[j][2]++;
					break;
				default :
					check[j][3]++;
					break;
				}
			}
		}
		
		String result = "";
		int min = 0;
		for(int i = 0; i < m; i++) {
			int index = 0;
			int max = 0;
			for(int j = 0; j < 4; j++) {
				if(max < check[i][j]) {
					index = j;
					max = check[i][j];
				} else if(max == check[i][j]) {
					if(c_arr[index] > c_arr[j]) {
						index = j;
					}
				}
			}
			
			for(int j = 0; j < 4; j++) {
				if(index != j) min += check[i][j];
			}
			
			result += c_arr[index]; // 최대값에 해당하는 index의 DNA 출력
		}
		
		System.out.println(result);
		System.out.println(min);
	}
}