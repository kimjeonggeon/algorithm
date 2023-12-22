package inflearn;

import java.util.Scanner;

public class TS_4 {
//연속 부분 수열 N개의 수로 이루어진 수열이 주어진다 이 수열에서 합이 특정 숫자 m이 되는 경우가 몇번 있는지 구하는 프로그램 작성하세요
//lt 부터 rt 를 두고 lt 부터 rt 까지로 합을 한다. sum = lt 부터 rt까지의 합 sum이 그 값 보다 작으면 rt가 증가 결국 sum이 그 값을 맞추면
	// lt 값을 빼고 값이 맞는지 확인 그 값이 같거나 크면 lt 값 빼고 작으면 rt를 더한다.
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
