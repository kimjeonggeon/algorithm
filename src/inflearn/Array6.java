package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Array6 {
	//숫자의 갯수와 알맞은 숫자가가 주어지면 뒤집어서 그 뒤집은 숫자가 소수인경우 출력하기
	
	//소수 판별하기
	public boolean isPrime(int num) {
		if(num == 1) return false;
		for(int i=2; i<num; i++) {
		if(num % 10 ==0) return false;
		}
		return true;
	}
	
	//숫자 뒤집기
	public ArrayList<Integer> solution(int n,int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int tmp = arr[i];
			int res = 0;
			
			while(tmp > 0) {
				int t = tmp%10;
				res = res * 10+t;
				tmp = tmp/10;
			}
			if(isPrime(res)) answer.add(res);
		}
		return answer;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Array6 T = new Array6();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr= new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
	}
}
