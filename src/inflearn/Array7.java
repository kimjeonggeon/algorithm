package inflearn;

import java.util.Scanner;

public class Array7 {
//������� ���� ox ������ �������� ���� �� �������� �ش�. Ʋ���� �ٽ� �ʱ�ȭ�� �� ������? �ѹ��� ���� �� 1������ ����
	public int solution(int n, int[] arr) {
		
	int answer = 0, cnt = 0;
	
		for(int i=0; i<n; i++) {
			if(arr[i] ==1) {
				cnt++;
				answer += cnt;
			}
			
		}
		return answer;
	}
	public static void main(String[] args) {
	 Array7 t = new Array7();
	 Scanner kb = new Scanner(System.in);
	 int n = kb.nextInt();
	 int[] arr = new int[n];
	 for(int i=0; i<n; i++) {
		 arr[i] = kb.nextInt();
	 }
	System.out.println(t.solution(n,arr));
	}
	
}
