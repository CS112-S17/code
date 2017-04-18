import java.util.ArrayList;
import java.util.HashMap;

/**
	A class to demonstrate methods of HashMap.
**/
public class HashMapFun {

	/**
		Adds a new value to the given HashMap.
		If the key exists, the value will be added to the list.
	**/
	public static void add(String key, Integer value, HashMap<String, ArrayList<Integer>> map) {

		//if the key already exists in the map
		if(map.containsKey(key)) {
			//retrieve the value
			//add new value to the list
			//put back into map

			ArrayList<Integer> valueList = map.get(key);
			valueList.add(value);
			map.put(key, valueList);

		} else {

			//create a new list
			//add value to new list
			//put key, value into map
			ArrayList<Integer> newList = new ArrayList<Integer>();
			newList.add(value);
			map.put(key, newList);

		}


	}


	public static void main(String[] args) {

		HashMap<String, ArrayList<Integer>> phoneNums = new HashMap<String, ArrayList<Integer>>();
		add("Sami", 2024, phoneNums);
		add("Greg", 2145, phoneNums);
		add("Rosa", 5968, phoneNums);
		add("Greg", 9876, phoneNums);

		System.out.println("Map size: " + phoneNums.size());
		System.out.println("Contains key bob: " + phoneNums.containsKey("Bob"));

		//for each key in the map (order will be unpredictable!)
		//	print key and values associated with that key
		for(String key: phoneNums.keySet()) {
			System.out.println(key);
			ArrayList<Integer> values = phoneNums.get(key);	
			for(Integer i: values) {
				System.out.println("\t" + i);
			}
		}

		//for each value in map, print that value
		// for(ArrayList<Integer> value: phoneNums.values()) {
		// 	System.out.println(value);
		// }


	}

}