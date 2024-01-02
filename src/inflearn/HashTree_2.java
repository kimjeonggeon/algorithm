package inflearn;

import java.util.HashMap;
import java.util.Scanner;

public class HashTree_2 {
	public String solution(String a, String b) {
		String answer = "YES";
		HashMap<Character,Integer> map = new HashMap();
 		for(char x : a.toCharArray()) {
 			map.put(x, map.getOrDefault(x, 0)+1);
 		}
		for(char y : b.toCharArray()) {
			if(!map.containsKey(y) || map.get(y) ==0) return "NO";
			map.put(y, map.getOrDefault(y,0)-1);
		}
		return answer;
	}
	public static void main(String[] args) {
		HashTree_2 T = new HashTree_2();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.println(T.solution(a, b));
	}
}
