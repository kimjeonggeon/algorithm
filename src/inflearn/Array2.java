package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Array2 {
	//�������� n���� �л� �ٷ� ������ ��  �� �� �������� �� �� �ִ� �л���
	//�����ּ���
	public int solution(int n, int arr[]) {
		int answer=1, max =arr[0];
		for(int i =1; i<n; i++) {
			if(arr[i]>max) {
				answer++;
				max = arr[i];
			}
			
		}
		
		
		return answer;
		
		
	}
	public static void main(String[] args) {
		
		Array2 T = new Array2();
		Scanner kb = new Scanner(System.in);
		int n= kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i < n ; i++) {
			arr[i] =kb.nextInt();
		}
		
		
		
	}



}//class



