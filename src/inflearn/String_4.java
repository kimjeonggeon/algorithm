package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

//단어 뒤집기 -- n개의 단어 주어지면 단어를 뒤집어 출력해라
public class String_4 {
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString(); 
			answer.add(tmp);
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
	 String_4 T = new String_4(); 
	 Scanner kb = new Scanner(System.in);
	 int n = kb.nextInt();
	 String[] str = new String[n];
		 for(int i=0; i<n; i++ ) {
			str[i]=kb.next(); 
		 }
		 for(String x: T.solution(n, str)) {
			 System.out.println(x);
		 }
			
		
	}
}
