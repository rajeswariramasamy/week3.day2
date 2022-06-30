package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part We of java sessions in java week1";

		int count = 0;
		String[] s = text.split(" ");
		List<String> l = new ArrayList<>();
		List<String> l1 = new ArrayList<>();
		Collections.addAll(l, s);
		// remove duplicates using set
		Set<String> s1 = new LinkedHashSet<>(l);
		System.out.println(s1);
		//remove duplicates using for loop
		int len = l.size();

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (l.get(i).equals(l.get(j))) {
					count = count + 1;
				}
			}
			if (count < 1) {
				l1.add(l.get(i));
			}
			count = 0;
		}
		System.out.println(l1);
	}

}
