package inflearn;

import java.util.Scanner;
import java.util.Stack;

public class StackQueue2 {
	public String solution(String str) {
		String answer =" ";
		Stack<Character> stack  = new Stack();
		for(char x : str.toCharArray()) {
			if(x != ')') {
				while(stack.pop() != '(');
			}else stack.push(x);
		}	
	return answer;
	}
	
	
	
	public static void main(String args[]) {
		StackQueue2 T =  new StackQueue2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

}
