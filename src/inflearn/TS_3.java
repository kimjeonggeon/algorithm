package inflearn;

import java.util.Scanner;

public class TS_3 {
//������ �ƺ��� �������� ��մϴ�. �����ƺ��� n�� ���� ���� ����� �ְ� ���ӵ� k�� ���� �ִ� ������� ������ ���϶�� �ߴ�. 
// n=10�̰� 10�� �� ���� ����� �Ʒ��� ���ٸ� �̶� k=3�̸� 12 15 11 20 25 19 13 15
	//�����̵� ������ ������� Ǭ��.
	
	public int solution(int n, int k, int[] arr) {
		int answer=0 , sum =0;
		for(int i=0; i<k; i++) {
			sum +=(arr[i]-arr[i-k]);
			answer = Math.max(answer, sum);
		}
	
		return answer;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		TS_3  T= new TS_3();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n,k,arr));
		
		
		
	}
}
