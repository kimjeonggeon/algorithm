package inflearn;

import java.util.Scanner;

public class String_12 {

	// ù�ٿ��� ���� ������ ����(10 ������ �ʴ´�) ���� �ٿ��� ������ ������ �ϰ� �� ��ŭ�� #�Ǵ� *��ȣ�� �Էµ˴ϴ�. ������ �׻� 
	//�빮�ڷ�  �ؼ��� �� �ִ� ��ȣ�� �����ٰ� �����մϴ�.
	//#**#�� �ϰ��ڸ��� �������� �ٲߴϴ�. #�� �������� 1�� *�������� 0���� ��ȯ�Ѵ�, ����� 1000001�κ�ȯ 2������ 10��ȭ�Ѵ�.
	//�׷��� 65�� �ȴ�.
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
