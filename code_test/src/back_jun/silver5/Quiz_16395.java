package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 파스칼의 삼각형
public class Quiz_16395 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		ArrayList<int[]> arr = new ArrayList<>();
		arr.add(new int[]{1});
		
		for(int i = 1; i <= n; i++) {
			int[] array = new int[i+1];
			
			for(int j = 0; j < array.length; j++) {
				if(j == 0) array[j] = arr.get(i - 1)[0];
				else if(j == array.length - 1) array[j] = arr.get(i - 1)[j - 1];
				else {
					array[j] = arr.get(i - 1)[j - 1] + arr.get(i - 1)[j];
				}
			}
			arr.add(array);
		}
		System.out.println(arr.get(n-1)[k-1]);
	}
}
