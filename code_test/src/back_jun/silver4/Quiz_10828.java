package back_jun.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 스택
public class Quiz_10828 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			
			switch(str[0]) {
				case "push":
					stack.push(Integer.parseInt(str[1]));
					break;
				case "pop":
					if(stack.empty()) {
						System.out.println("-1"); 
						break;
					}
					System.out.println(stack.pop());
					break;
				case "size":
					System.out.println(stack.size());
					break;
				case "empty":
					System.out.println(stack.empty() ? 1 : 0);
					break;
				case "top":
					if(stack.empty()) {
						System.out.println("-1"); 
						break;
					}
					System.out.println(stack.peek());
					break;
			}
		}
	}
}
