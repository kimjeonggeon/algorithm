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
		//�Ϻη� �񱳴��ؾ��� �� ���ڿ� rt�� ���Ҷ� �߰����ֱ� ���� ���̺��� �ϳ� ���� map�� �־��ٶ��� ���ش�.
		int L = T.length()-1;
		
		
		for(int i=0; i<L;i++)am.put(S.charAt(i), am.getOrDefault(S.charAt(i),0)+1);
			//���⼭ �������� ���� ��	
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
