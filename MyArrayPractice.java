package arrayPractice;

public class MyArrayPractice {
	/*
	 * This are my Solutions
	 */
	public static double sumOfSquares(double[] arr) {
		if(arr.length == 0) {
			return 0;
		}
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i] * arr[i];
			//sum += Math.pow(arr[i], 2); //Solution using Math Library
		}
		return sum; //Dummy return
	}

	public static double[] sortArray(double[] arr) {
		/*
		 * This method has many solutions 
		 * If you want learn more, study about sorting Algorithms
		 * This solution is know are the Insertion sort with a Time Complexity O(n^2), not optimal
		 */
		for(int i = 0; i < arr.length; i++) {
			double temp = arr[i];
			int e = i-1;
			while(e >= 0 && arr[e] > temp) {
				arr[e+1] = arr[e];
				e --;
			}
			arr[e+1] = temp;
		}
		return arr; 
	}
	
	public static double[] reverseSortArray(double[] arr) {
		arr = sortArray(arr);
		for(int i = 0; i < (arr.length/2); i++) {
			double temp = arr[i];
			arr[i] = arr[(arr.length-1)-i];
			 arr[(arr.length-1)-i] = temp;
		}
		return arr;
	}
	
	public static boolean isMember(String search, String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(search)) {
				return true;
			}
		}
		return false; 
	}
}
