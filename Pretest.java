public class Pretest 
{
	
	public static void main(String[] args) 
	{

		int[] y = {5, 6, 6, 8, 1, 2, 4};

		//for each item in the list
		for(int i = 0; i < 7; i++) {
			
			//if the number is even, divide by 2
			if(y[i]%2 == 0) {
				y[i] = y[i]/2;
			}
		

		}

		for(int i = 0; i < 7; i++) {
				System.out.println(y[i]);
		}		

	}

}