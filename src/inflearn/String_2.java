package inflearn;

import java.util.Scanner;

// ���� ��ܾ ����ϴ� ���α׷� ��� �߿��� ���ʿ� ��ġ�Ѱ�
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
