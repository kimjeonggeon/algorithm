package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class TS_2 {
//공통원소 구하기
//투포인터알고리즘 - > 배열을 먼저 오름차순 정렬 해놓기. -> 그 후 비교시에 작은 수 포인터를 ++한다. 같으면 둘다 ++
	public ArrayList<Integer> solution(int n, int m,int[] a,int[] b){
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(a);
		Arrays.sort(b);
		int p1 =0 , p2=0;
		while(p1<n && p2<m) {
			if(a[p1] ==b[p2]) {
				answer.add(a[p1++]);
				p2++;
			}
			else if(a[p1]<b[p2]) p1++;
			else p2++;
		}
			return answer;
	}
	
	public static void main(String[] args) {
		TS_2 T = new TS_2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		int[] b = new int[m];
		for(int i=0; i<n; i++) {
			b[i] = kb.nextInt();
		}
		for(int x : T.solution(n,m,a,b)) System.out.print(x+"");
		
	}
}
