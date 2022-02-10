package longestIncreaseSubsequence;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> myArray = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the size of you list:");

		int listSize = sc.nextInt();
		for (int i = 0; i < listSize; i++) {
			System.out.println("Enter value for index #" + i + " :");
			int value = sc.nextInt();
			myArray.add(value);
		}

		System.out.println("Your list of numbers is: " + myArray);
		LongestArraySub lis = new LongestArraySub();
		lis.lengthOfLIS(myArray);

	}

}
