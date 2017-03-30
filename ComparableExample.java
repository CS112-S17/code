import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

	public static void main(String[] args) {

		// Comparable c = new Comparable();

		Comparable[] items = new Comparable[5];
		items[0] = "apple";
		items[1] = "orange";
		items[2] = "orange";
		items[3] = "zebra";
		items[4] = "pineapple";

		boolean isSorted = true;

		int i = 0; 
		for( ; i < items.length-1; i++) {

			//if the items are not in sorted order
			if( items[i].compareTo(items[i+1]) > 0 ) {
				isSorted = false;
				break;
			}

		}

		if(isSorted) {
			System.out.println("List is sorted");
		} else {
			System.out.println("Out of order elements found at position: " + i);
		}


		// Comparable s1 = "banana";
		// Comparable s2 = "bananas!";

		// int result = s1.compareTo(s2);
		// System.out.println(result);




		// ArrayList<Name> nameList = new ArrayList<Name>();
		// nameList.add(new Name("Bob", "Smith"));
		// nameList.add(new Name("Sally", "Jones"));
		// nameList.add(new Name("Herb", "Zuniga"));
		// nameList.add(new Name("Doug", "Smith"));

		// Collections.sort(nameList);
		// for(Name n: nameList) {
		// 	System.out.println(n);
		// }

		// ArrayList<Integer> intList = new ArrayList<Integer>();
		// intList.add(4);
		// intList.add(5);
		// intList.add(2);
		// intList.add(3);

		// Collections.sort(intList);
		// for(int i: intList) {
		// 	System.out.println(i);
		// }

		// ArrayList<String> stringList = new ArrayList<String>();
		// stringList.add("banana");
		// stringList.add("apple");
		// stringList.add("orange");
		// stringList.add("apricot");

		// Collections.sort(stringList);

		// for(String s: stringList) {
		// 	System.out.println(s);
		// }



	}

}