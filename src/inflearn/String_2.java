package inflearn;

import java.util.Scanner;

// 가장 긴단어를 출력하는 프로그램 긴것 중에선 앞쪽에 위치한것
public class String_2 {
public String solution(String str) {
	

	String answer ="";
	int m = Integer.MIN_VALUE;
	String[] s = str.split(" ");
	for(String x : s) {
		int len = x.length();
		if(len > m) {
			m=len;
			answer = x;
		}
	}
	
	return answer;
}
	
	
	
	
	
	public static void main(String[] args) {
		String_2 T = new String_2();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
		
	}
	
	
}
