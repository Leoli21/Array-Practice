import java.util.Random;

public class ArrayPractice {

	public static void main(String[] args) {
		Random rand = new Random();
		int [] arr = //creates an array variable only...no array exists
		arr = new int[rand.nextInt(21) + 10]; //creates an array of length 20 and stores reference in arr
		System.out.println(arr[2]); //prints the value of the element at index 2
		arr[4] = 5; //assigns 5 to the element at index 4
		
		// rand.nextInt(range) + min;
		//for loop to fill the array with random numbers from 0-50
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = rand.nextInt(50) + 1;		
		}
		
		
		//for loop to print each element in the array. one per line
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
