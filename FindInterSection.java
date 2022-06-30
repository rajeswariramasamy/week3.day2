package week3.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindInterSection {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		Collections.addAll(l,3, 2, 11, 4, 6, 7);
		List<Integer> l1 = new ArrayList<>();
		Collections.addAll(l1,1, 2, 8, 4, 9, 7);
			Set<Integer> s = new TreeSet<>();

		for (int i = 0; i < l.size(); i++) {
			for (int j = 0; j < l1.size(); j++) {
				if (l.get(i) == l1.get(j)) {
					s.add(l.get(i));
				//	System.out.println(l.get(i));
				}
			}
		}
		System.out.println(s);

	}

}
