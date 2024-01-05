package inflearn;

import java.util.Scanner;
import java.util.TreeSet;

public class HashTree_5 {
	public int solution(int n, int[] arr, int k) {
		int answer = 0;
		TreeSet<Integer> Tset = new TreeSet<>();
		for(int i=0;i<n;i++) {
			for(int j = i+1; j<n ; j++) {
				for(int l =j+1; l<n;l++) {
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt =0;
		for(int x : Tset) {
		
			cnt ++;
			if(cnt == k)return x;
		}
		
		return answer;
	}

	
	public static void main(String[] args) {
		HashTree_5 t = new HashTree_5();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<n ; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(t.solution(n, arr, k));
		
	}

}
