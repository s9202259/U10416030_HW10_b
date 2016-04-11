//U10416030 陳子勤

import java.util.*;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an number as how many integers you want to sort");
		int howMany = input.nextInt();	//store the nubmer of integers
		int[] bubble = new int[howMany];
		
		for(int i = 0; i < howMany; i++) {
			System.out.println("Enter number: " + (i + 1));
			bubble[i] = input.nextInt();
		}
		
		Sort sort = new Sort(bubble);
		
		System.out.println("Bubble Sort : ");
		
		for (int n = 0; n < howMany; n++) {
			sort.printSort(n);
		}
	}
}

class Sort {
	int arrayLength;
	int[] sortArray = new int[arrayLength];
	
	Sort(int array[]) {
		arrayLength = array.length;
		sortArray = array;
		cal();
	}
	
	public void cal() {
		int hold;	//save the value of sortArray
		for (int i = 0; i < arrayLength; i++) {	//solve bubble sort
			for (int j = 1; j < (arrayLength - i); j++) {
				if (sortArray[j - 1] > sortArray[j]) {
					hold = sortArray[j];
					sortArray[j] = sortArray[j - 1];
					sortArray[j - 1] = hold;
				}
			}
		}
	}
	public void printSort(int n) {	//print out outcome
		System.out.print(sortArray[n] + ", ");
	}
}
