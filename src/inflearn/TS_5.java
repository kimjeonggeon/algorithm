package inflearn;

import java.util.Scanner;

public class TS_5 {
//N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수 합으러 장스 N을 표현하는 방법의 가짓수를 출력하는 프로그램 작성하세요
	//연속 부분수열의 합 /2 +1 까지 연속된 숫자의 합이면 됨 sum 이 n이 되는지 확인
	public int solution(int n) {
		int answer =0, sum =0 , lt=0;
		int m = n/2+1;
		int[] arr = new int[m];
		for(int i=0; i<m; i++) arr[i] = i+1;
		for(int rt=0; rt<m; rt++) {
			sum+= arr[rt];
			if(sum == n) answer ++;
			while(sum>=n) {
				sum -=arr[lt++];
				if(sum ==n) answer ++;
				answer ++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		TS_5 T = new TS_5();
		Scanner kb= new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
		
	}
}
