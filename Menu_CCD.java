package coding;

import java.util.*;

public class Menu_CCD {

	public static void main(String[] args) {
		int n;
		char ch;
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		n = sc.nextInt();
		HashMap<Integer, String> mapc = new HashMap<Integer, String>();
		mapc.put(1, "express coffee");
		mapc.put(2, "cappuccino coffee");
		mapc.put(3, "latte coffee");
		HashMap<Integer, String> mapt = new HashMap<Integer, String>();
		mapt.put(1, "plain tea");
		mapt.put(2, "assam tea");
		mapt.put(3, "ginger tea");
		if (ch == 'c') {
			System.out.println(mapc.get(n));
		} else if (ch == 't') {
			System.out.println(mapt.get(n));
		} else
			System.out.println("invalid input");

	}

}

Input:  c
	2
Output: cappuccino coffee
