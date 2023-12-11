package inflearn;

import java.util.Scanner;

public class Array7 {
//점수계산 문제 ox 문제로 연속으로 맞을 시 가산점을 준다. 틀리면 다시 초기화다 총 점수는? 한문제 맞힐 시 1점부터 시작
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
