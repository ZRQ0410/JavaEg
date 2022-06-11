package collection_framework;

import java.util.List;
import java.util.ArrayList;

public class ListEg {

	static List<String> printQ = new ArrayList<>();

	static void someMethod(List<String> printQIn) {
		printQIn.add("letter.doc");
		printQIn.add(0, "chapter.doc");
		printQIn.set(0, "newChapter.doc");
		System.out.println(printQIn);
	}

	public static void main(String[] args) {
		someMethod(printQ);

		int index = printQ.indexOf("letter.doc");
		if (index != -1) {
			System.out.println("letter.doc is at index " + index);
		} else {
			System.out.println("not in the list");
		}

		// if it's in the list initially -- true
		System.out.println(printQ.remove("newChapter.doc"));
		System.out.println(printQ.remove("aaa.doc"));

		System.out.println(printQ.contains("letter.doc"));

		// forEach loop
		printQ.forEach(item -> {
			if (item.endsWith(".doc")) {
				System.out.println(item); // display this item
			}
		});
	}
}
