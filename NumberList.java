public class NumberList {

	//data members
	private int[] numbers;
	private int count;

	//constructor
	public NumberList() {

		this.count = 0;
		this.numbers = new int[2];

	}

	private void resize() {

		System.out.println("resizing...");
		//create an array that is larger (2x)
		int[] tmpNumbers = new int[count*2];

		//copy everything over
		for(int i = 0; i < count; i++) {
			tmpNumbers[i] = numbers[i];
		}

		//move reference to new array
		numbers = tmpNumbers;

	}

	public void addFirst(int newNumber) {

		//if the array is full, resize
		if(count == numbers.length) {
			resize();
		}

		//move everything in the list down one 
		//space to make space for the new item
		for(int i = count; i > 0;i--) {
			numbers[i] = numbers[i-1];
		}
		//add new item and increase count
		numbers[0] = newNumber;
		count++;


	}

	public void removeFirst() {

		//if list is not empty
		if(count > 0) {
			//move items up
			for(int i = 0; i < count - 1; i++) {
				numbers[i] = numbers[i+1];
			}
			//reset the last item
			numbers[count-1] = 0;
			//decrement count
			count--;		
		}

	}

	public String toString() {

		String returnVal = "{";
		for(int i = 0; i < count; i++) {
			returnVal = returnVal + numbers[i] + ",";
		}
		
		//add close }
		return returnVal;

	}

}