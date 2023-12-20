package inflearn;

import java.util.Scanner;

public class TS_3 {
//현수의 아빠는 제과점을 운영합니다. 현수아빠는 n일 동안 매출 기록을 주고 연속된 k일 동안 최대 매출액이 얼마인지 구하라고 했다. 
// n=10이고 10일 간 매출 기록이 아래와 같다면 이때 k=3이면 12 15 11 20 25 19 13 15
	//슬라이딩 윈도우 방식으로 푼다.
	
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
