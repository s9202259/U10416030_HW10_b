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
	}
}

class Bubble {
	
}
