package inflearn;

import java.util.ArrayList;
import java.util.Scanner;



// 자연수 n개가 주어지고 n개의 정수가 입력된다.
// 0번은 무조건 출력 arraylist

public class Array1 {
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		
		answer.add(arr[0]);
		for(int i=1; i<n; i++) {
			if(arr[i]>arr[i-1]) answer.add(arr[i]);
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Array1 T = new Array1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.print(x+" ");
		}
		
		
		
	}
	
	
}
