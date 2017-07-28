import java.util.Arrays;
import java.util.Scanner;

public class QuestionTwo {
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
        System.out.println("Length of input Array?");
        int num = input.nextInt();
        int array[] = new int[num];

        System.out.println("Enter the " + num + " numbers now.");

        for (int i = 0 ; i < array.length; i++ ) {
           array[i] = input.nextInt();
        }
        
		// median
        System.out.println(getMedian(array));
		
	}
	public static double getMedian(int[] values){
		Arrays.sort(values);
		double median;
		int middle = ((values.length) / 2);
		// if even
		if(values.length % 2 == 0){
			 int medianA = values[middle];
			 int medianB = values[middle-1];
			 median = (double)(medianA + medianB) / 2;
		} else{
			// Array Start from 0, So when odd length, middle = ((values.length) / 2), is the real median index
			 median = values[middle];
		}
		return median;
	}
}
