import java.io.File;
import java.util.HashMap;

public class FileFinder {

	/**
		A method to recursively count the number of files and directories 
		in the path specified by directory. 
		The result will be stored in a HashMap returned from the method.
	**/
	public static HashMap<String, Integer> countFilesDirs(String directory) {

		HashMap<String, Integer> result = new HashMap<String, Integer>();
		countFilesDirs(new File(directory), result);
		return result;

	}

	//helper method
	private static void countFilesDirs(File input, HashMap<String, Integer> result) {

		if(input.isFile()) {

			//if this is NOT the first file seen
			if(result.containsKey("Files")) {
				int value = result.get("Files");
				result.put("Files", value + 1);
			} else {
				result.put("Files", 1);
			}


		} else if(input.isDirectory()) {

			//if this is NOT the first directory seen
			if(result.containsKey("Dirs")) {
				int value = result.get("Dirs");
				result.put("Dirs", value + 1);
			} else {
				result.put("Dirs", 1);
			}

			File[] children = input.listFiles();
			for(int i = 0; i < children.length; i++) {
				countFilesDirs(children[i], result);
			}

		}

	}


	public static void main(String[] args) {
		
		HashMap<String, Integer> result = countFilesDirs("/Users/srollins/teaching/cs112");

		for(String key: result.keySet()) {
			System.out.println(key + ": " + result.get(key));
		}
	}

}
