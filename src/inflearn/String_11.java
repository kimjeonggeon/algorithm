package inflearn;

import java.util.Scanner;

public class String_11 {
//첫줄에 문자열이 주어진다 문자열 길이 100 넘지 않는다
// 첫줄에 압축된 문자열 출력한다.
//첫번째 문자를 1로 하고 다음이 같으면 i+1로 함
//다르면 다시 1로 초기화
//마지막에 빈 문자 넣어주어야함 그래야지 마지막 문자가 1이 들어감
	public String solution(String s) {
		String answer ="";
		s= s+" ";
		int cnt = 1;
		for(int i=0; i<s.length() -1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) cnt++;
			else {
				answer += s.charAt(i);
				if(cnt>1) answer += String.valueOf(cnt);
				cnt =1;
				
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		String_11 t = new  String_11();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		
		
		
	}
	
	
}
