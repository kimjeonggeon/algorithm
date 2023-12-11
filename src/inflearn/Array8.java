package inflearn;

import java.util.Scanner;

public class Array8 {
//등수를 나타내라 국어점수가 제공되고 같은점수는 같은 순위이다.
//풀이 방법 숫자 하나씩 비교 해서 순위 내보냄
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		for(int i=0; i<n; i++) {
			int cnt = 1;	
		for(int j=0; j<n; j++) {
			if(arr[j]>arr[i]) cnt ++;
		}
		answer[i] =cnt;
		}
		return answer;
	}
	
	public static void main(String[] args) {
	Array8 t = new Array8();
	Scanner kb = new Scanner(System.in);
	int n = kb.nextInt();
	int[] arr = new int[n];
	for(int i=0; i<n; i++) {
		arr[i] =kb.nextInt();
	}
	for(int x :t.solution(n,arr)) System.out.println(x+" ");
	}
}


