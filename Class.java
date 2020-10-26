package sorting;

import java.util.*;

public class Class {

	public static void main(String[] args) {
		SortedSet<String> list = new TreeSet<String>();
		HashMap<String, String> map = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		int m = 4;
		String st;
		String s = "s";
		for (int i = 1; i <= m; i++) {
			list.add(st = sc.nextLine());
		}

		for (String str : list) {
			if (str.substring(0, 1).equals(s)) {
				if (list.contains("ty".concat(str.substring(2)))) {
					map.put(str, "ty".concat(str.substring(2)));
				} else {
					map.put(str, "absent");

				}

			} else {
				if (!list.contains("sy".concat(str.substring(2)))) {
					map.put(str, "absent");
				}
			}

		}

		for (Map.Entry<String, String> entry : map.entrySet()) {

			if (entry.getKey().startsWith("t"))
				System.out.println("[" + entry.getKey() + "]" + "[" + entry.getValue() + "]");
			else
				System.out.println("[" + entry.getValue() + "]" + "[" + entry.getKey() + "]");

		}

	}

}
