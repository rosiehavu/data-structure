package data_structure;

public class FindExtreme {
	
	public static int findExtreme(int[] A) {
		
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		
		double average = (double) sum / A.length;
		
		int extremeIndex = -1;
		double maxDeviation = 0;
		
		for (int i = 0; i < A.length; i++) {
			double deviation = Math.abs(A[i] - average);
			
			if (deviation > maxDeviation) {
				maxDeviation = deviation;
				extremeIndex = i;
			}
		}
			
		return extremeIndex;
	}
	
	public static void main(String[] args) {
		int[] A1 = {9, 4, 3, -10};
		System.out.println(findExtreme(A1));
	}

}
