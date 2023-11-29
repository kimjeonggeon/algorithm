package inflearn;

import java.util.Scanner;

public class String_12 {

	// 첫줄에는 보낸 문자의 개수(10 을넘지 않는다) 다음 줄에는 문자의 개수의 일곱 배 만큼의 #또는 *신호가 입력됩니다. 현수는 항상 
	//대문자로  해석할 수 있는 신호를 보낸다고 가정합니다.
	//#**#를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로 *이진수의 0으로 변환한다, 결과는 1000001로변환 2진수를 10진화한다.
	//그러면 65가 된다.
	public String solution(int n, String s) {
		
		String answer = ""; 
		for(int i=0; i<n; i++) {
			String tmp = s.substring(0,7).replace('#','1').replace('*','0');
			int num = Integer.parseInt(tmp,2);
			answer += (char)num;
		}
			return answer;
	
	}	
	public static void main(String[] args) {
		String_12 T = new String_12();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		int n = kb.nextInt();
		System.out.println(T.solution(n, str));
	}
	
}
