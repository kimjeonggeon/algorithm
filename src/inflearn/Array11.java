package inflearn;

import java.util.Scanner;

public class Array11 {

	//1�г���� 5�г� ���� �л����� �������鼭 ���� �������� ���� ��ģ ����� 
	//�������� ������ ���̴�. 
	public int solution(int n, int[][] arr) {
	int answer =0, max=Integer.MAX_VALUE;
		for(int i=1; i<=n; i++) {
			int cnt =0;
			for(int j=1; j<=n; j++) {
				for(int k=1; k<=5; k++) {
					
				
				if(arr[i][k]==arr[j][k]) {
					cnt++;
					}
			}
			}
			if(cnt>max) {
				max = cnt;
				answer = i;
			}
		}
			
		return answer;
	
	
	}		
	public static void main(String[] args) {
		Array11 T = new Array11();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n+1][6];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=5; j++) {
				arr[i][j]=kb.nextInt();
			}
		}
		System.out.println();
	}
}
