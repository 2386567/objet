package taitamoh.at03;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int n;
		char l;
		String m;
		Scanner clavier = new Scanner(System.in);
		n = clavier.nextInt();
		clavier.nextLine();
		System.out.println(n);
		l = clavier.next().charAt(0);
		clavier.nextLine();
		System.out.println(l);
		m = clavier.nextLine();
		
		System.out.println(m);

	}

}
