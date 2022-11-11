package programmers.level02;

// 점프와 순간이동
public class Ex17 {
	public static void main(String[] args) throws Exception {
		Solution s = new Solution();
		
		// int n = 5;
		// int n = 5;
		int n = 5000;
		
		System.out.println(s.solution(n));
	}
	
	static class Solution {
		public int solution(int n) {
			int answer = 0;
			
			return answer;
		}
	}
}

//BFS인줄 알았는데 10억이 넘어가서 배열로는 에러가 뜨니까 그냥 while문 처리로 했던것...
//처음에 그렇게 했는데 거기에서 알고리즘 생각을 못했음... 다시 풀어보자