package inflearn;

import java.util.Scanner;

public class Array11 {

	//1학년부터 5학년 까지 학생들이 지내오면서 가장 같은반을 많이 겹친 사람을 
	//반장으로 선출할 것이다. 
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
