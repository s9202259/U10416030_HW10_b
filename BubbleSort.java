//U10416030 陳子勤

import java.util.*;

public class BubbleSort {
	public static void main(String args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an number as how many integers you want to sort");
		int howMany = input.nextInt();
		int[] bubble = new int[howMany];
		
		for(int i = 0; i < howMany; i++) {
			System.out.println("Enter number: ");
			bubble[i] = input.nextInt();
		}
		
		Bubble sort = new Bubble(bubble);
		
		for (int n = 0; n < howMany; n++) {
			sort.printSort(n);
		}
	}
}

class Bubble {
	int arrayLength;
	int[] sortArray = new int[arrayLength];
	int h;
	
	Bubble(int array[]) {
		arrayLength = array.length;
		sortArray = array;
		cal();
	}
	
	public void cal() {
		for (int i = 0; i < arrayLength; i++) {
			for (int j = 0; j < arrayLength - i; j++) {
				if (sortArray[j] < sortArray[j + 1]) {
					h = sortArray[j + 1];
					sortArray[j + 1] = sortArray[j];
					sortArray[j] = h;
				}
			}
		}
	}
	public void printSort(int n) {
		System.out.println(sortArray[n]);
	}
}
