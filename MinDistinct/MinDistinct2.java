package data_structure;

public class MinDistinct2 {
	
	public static int countMinDistinct(int[] arr) {
		
		int[] nums = new int[arr.length + 1];
		
		for (int i = 0; i < arr.length; i++) {
			nums[arr[i]]++;
		}
		
		int result = 0;
		int richPointer = 1;
		
		for (int poorPointer = 1; poorPointer <= arr.length; poorPointer++) {
			if (nums[poorPointer] < 1) {
				while (nums[richPointer] < 2) {
					richPointer += 1;
				}
				
				result += Math.abs(richPointer - poorPointer);
				nums[richPointer]--;
			}
		}
		
		return result;
	}

}
