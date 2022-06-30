package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {

		Map<Integer, Integer> m = new TreeMap<>();
		List<Integer> l = new ArrayList<>();
		Collections.addAll(l, 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1);
		int len = l.size();
		int count = 1;
		for (int i = 0; i < len; i++) {

			if (m.containsKey(l.get(i))) {
				Integer i1 = m.get(l.get(i));
				m.put(l.get(i), i1 + 1);
			} else {
				m.put(l.get(i), count);
			}

		}

		System.out.println(m);

	}

}
