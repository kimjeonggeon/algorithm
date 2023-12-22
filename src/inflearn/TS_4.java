package inflearn;

import java.util.Scanner;

public class TS_4 {
//���� �κ� ���� N���� ���� �̷���� ������ �־����� �� �������� ���� Ư�� ���� m�� �Ǵ� ��찡 ��� �ִ��� ���ϴ� ���α׷� �ۼ��ϼ���
//lt ���� rt �� �ΰ� lt ���� rt ������ ���� �Ѵ�. sum = lt ���� rt������ �� sum�� �� �� ���� ������ rt�� ���� �ᱹ sum�� �� ���� ���߸�
	// lt ���� ���� ���� �´��� Ȯ�� �� ���� ���ų� ũ�� lt �� ���� ������ rt�� ���Ѵ�.
	public int solution(int a, int b, int[] arr) {
		int lt =0, answer =0, sum=0;
		for(int rt=0; rt<b;rt++) {
		
			sum += arr[rt];
			if(sum == b ) answer ++;
			while(sum>=b) {
				sum -= arr[lt++];
				if(sum ==b) answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
	TS_4 T = new TS_4();
	Scanner kb = new Scanner(System.in); 
	int a = kb.nextInt();
	int b = kb.nextInt();
	int[] arr = new int[b];
	for(int i=0; i<b; i++) {
		arr[i] = kb.nextInt();
	}
		
	}
	
}
