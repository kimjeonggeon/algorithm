package inflearn;

import java.util.Scanner;

public class Find_1 {
	//대문자를 소문자 소문자를 대문자
	
	public String solution(String str) {
		String answer="";
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer+=Character.toLowerCase(x);
		}
		return answer;
	}
	
	public static void main(String[ ] args) {
		Find_1 T = new Find_1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
		
	}

}
