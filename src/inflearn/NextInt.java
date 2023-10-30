package inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class NextInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n= kb.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i]=kb.next();
		}
		System.out.println(Arrays.toString(str));
	}

}
