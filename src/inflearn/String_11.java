package inflearn;

import java.util.Scanner;

public class String_11 {
//ù�ٿ� ���ڿ��� �־����� ���ڿ� ���� 100 ���� �ʴ´�
// ù�ٿ� ����� ���ڿ� ����Ѵ�.
//ù��° ���ڸ� 1�� �ϰ� ������ ������ i+1�� ��
//�ٸ��� �ٽ� 1�� �ʱ�ȭ
//�������� �� ���� �־��־���� �׷����� ������ ���ڰ� 1�� ��
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
