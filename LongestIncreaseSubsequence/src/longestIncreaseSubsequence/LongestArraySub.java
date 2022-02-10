package longestIncreaseSubsequence;

import java.util.ArrayList;

public class LongestArraySub {

	public int lengthOfLIS(ArrayList arrayList) {
		if (arrayList.size() == 0) {
			System.out.println("Longest Increasing Subsequence is :" + 0);
			return 0;
		}

		int size = arrayList.size();

		ArrayList<Integer> newArraylist = new ArrayList<Integer>();
		for (int x = 0; x < size; x++) {
			newArraylist.add(0);
		}

		newArraylist.add(0, 1);
		int maximum = 1;

		int newsize = (newArraylist.size()) - 1;

		for (int i = 1; i < newsize; i++) {
			int newValueMax = 0;

			for (int j = 0; j < i; j++) {

				if ((int) arrayList.get(i) > (int) arrayList.get(j)) {
					newValueMax = Math.max(newValueMax, newArraylist.get(j));
				}
			}
			newArraylist.add(i, newValueMax + 1);
			maximum = Math.max(maximum, newArraylist.get(i));

		}
		System.out.println("Longest Increasing Subsequence is :" + maximum);
		return maximum;
	}

}