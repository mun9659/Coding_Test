package back_jun.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 짐 챙기는 슘
public class Quiz_01817 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int answer = 1;
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        if(n == 0) System.out.println(0);
        else {
        	 st = new StringTokenizer(br.readLine());
        	
        	 int[] arr = new int[n];
             for(int i = 0; i < n; i++) {
             	arr[i] = Integer.parseInt(st.nextToken());
             }
             
             int sum = 0;
             for(int i = 0; i < n; i++) {
             	sum += arr[i];
             	if(sum > m) {
             		answer++;
             		sum = arr[i];
             	}
             }
             System.out.println(answer);
        }
	}
}
