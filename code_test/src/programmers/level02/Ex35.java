package programmers.level02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

// 스킬트리
public class Ex35 {
	public static void main(String[] args) throws Exception {
		Solution sol = new Solution();
		
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		System.out.println(sol.solution(skill, skill_trees));
	}
	
	public static class Solution {
		 public int solution(String skill, String[] skill_trees) {
			 int answer = 0;
			 List<Character> skill_tree = new ArrayList<>();
			 for(char c : skill.toCharArray()) {
				 skill_tree.add(c);
			 }
			 
			 for(String s : skill_trees) {
				 int idx = 0;
				 boolean check = true;
				 for(char c : s.toCharArray()) {
					 if(skill_tree.contains(c)) {
						 if(skill_tree.get(idx) == c) {
							 idx++;
						 } else {
							 check = false;
							 break;
						 }
					 } 
				 }
				 if(check) answer++;
			 }
			 
			 return answer;
	    }
	}
}
