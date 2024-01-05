package inflearn;

import java.util.HashMap;
import java.util.Scanner;

public class HashTree_4 {

	public int solution(String S, String T) {
		int answer = 0;
		HashMap<Character,Integer> bm = new HashMap();
		HashMap<Character,Integer> am = new HashMap();
		for(char x: T.toCharArray()) {
			bm.put(x, bm.getOrDefault(x,0)+1);
		}
		//일부러 비교당해야할 긴 문자열 rt를 비교할때 추가해주기 위해 길이보다 하나 빼고 map에 넣어줄때도 빼준다.
		int L = T.length()-1;
		
		
		for(int i=0; i<L;i++)am.put(S.charAt(i), am.getOrDefault(S.charAt(i),0)+1);
			//여기서 투포인터 돌면 됨	
		int lt=0;
		for(int rt =L; rt < S.length(); rt++) {
		am.put(S.charAt(rt), am.getOrDefault(S.charAt(rt), 0)+1);
		if(am.equals(bm)) answer ++;
		am.put(S.charAt(lt), am.get(S.charAt(lt))-1);
		if(am.get(S.charAt(lt))==0) am.remove(S.charAt(lt));
		lt++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		HashTree_4 A = new HashTree_4();
		Scanner kb = new Scanner(System.in);
		String S = kb.next();
		String T = kb.next();
		System.out.print(A.solution(S,T));
	}
}
