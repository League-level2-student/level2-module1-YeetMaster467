package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList (java.util) class
		ArrayList<String> e = new ArrayList<String>();
		// 2. Add five Strings to your list
		e.add("Shablooey");
		e.add("Peanut Butter");
		e.add("iauhfcisumd");
		e.add("AAAAAAAAA");
		e.add("HEY! Vsause, Michael here.");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < e.size(); i++) {
			System.out.println(e.get(i));
		}
		System.out.println(" ");
		// 4. Print all the Strings using a for-each loop
		for (String s : e) {
			System.out.println(s);
		}
		System.out.println(" ");
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < e.size(); i++) {
			if (i % 2 == 0) {
				System.out.println(e.get(i));
			}
		}
		System.out.println(" ");
		// 6. Print all the Strings in reverse order.
		for (int i = e.size() - 1; i >= 0; i--) {
			System.out.println(e.get(i));
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		System.out.println(" ");

		for (int i = 0; i < e.size(); i++) {
			if(e.get(i).contains("e") || e.get(i).contains("E")) {
				System.out.println(e.get(i));
			}
		}
	}
}
