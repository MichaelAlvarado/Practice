package arrayPractice;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArrayPracticeTest {

	@Test
	void sumOfSquareTest() {
		double[] arr = {2,1,4,5};
		double[] arr1 = {62.1, 24.3, 10.5, 90.9};
		double[] arr2 = {}; 
		double[] arr3 = {0,-23.9, 41.2, 1.00, 33.33, -0};
		double[] arr4 = {0};
		double[] arr5 = {-9, -2, -4, -1};

		double answer = Math.round(ArrayPractice.sumOfSquares(arr)*100.0)/100.0;
		double answer1 = Math.round(ArrayPractice.sumOfSquares(arr1)*100.0)/100.0;
		double answer2 = Math.round(ArrayPractice.sumOfSquares(arr2)*100.0)/100.0;
		double answer3 = Math.round(ArrayPractice.sumOfSquares(arr3)*100.0)/100.0;
		double answer4 = Math.round(ArrayPractice.sumOfSquares(arr4)*100.0)/100.0;
		double answer5 = Math.round(ArrayPractice.sumOfSquares(arr5)*100.0)/100.0;

		assertTrue(answer == 46);
		assertTrue(answer1 == 12819.96);
		assertTrue("Should return 0 from empty array", answer2 == 0);
		assertTrue(answer3 == 3380.54);
		assertTrue(answer4 == 0);
		assertTrue(answer5 == 102);	
	}
	
	@Test
	void sortArrayTest() {
		double[] arr = {2,1,4,5};
		double[] arr1 = {62.1, 24.3, 10.5, 90.9};
		double[] arr2 = {}; 
		double[] arr3 = {0,-23.9, 41.2, 1.00, 33.33, -0};
		double[] arr4 = {0};
		double[] arr5 = {-9, -2, -4, -1};

		double[] answer = ArrayPractice.sortArray(arr);
		double[] answer1 = ArrayPractice.sortArray(arr1);
		double[] answer2 = ArrayPractice.sortArray(arr2);
		double[] answer3 = ArrayPractice.sortArray(arr3);
		double[] answer4 = ArrayPractice.sortArray(arr4);
		double[] answer5 = ArrayPractice.sortArray(arr5);

		double[] expected = {1,2,4,5};
		double[] expected1 = {10.5, 24.3, 62.1, 90.9};
		double[] expected2 = {};
		double[] expected3 = {-23.9, 0, 0, 1.00, 33.33, 41.2};
		double[] expected4 = {0};
		double[] expected5 = {-9,-4,-2,-1};
		
		assertTrue(Arrays.equals(answer, expected));
		assertTrue(Arrays.equals(answer1, expected1));
		assertTrue(Arrays.equals(answer2, expected2));
		assertTrue(Arrays.equals(answer3, expected3));
		assertTrue(Arrays.equals(answer4, expected4));
		assertTrue(Arrays.equals(answer5, expected5));

	}
	
	@Test
	void reverseSortArrayTest() {
		double[] arr = {2,1,4,5};
		double[] arr1 = {62.1, 24.3, 10.5, 90.9};
		double[] arr2 = {}; 
		double[] arr3 = {0,-23.9, 41.2, 1.00, 33.33, -0};
		double[] arr4 = {0};
		double[] arr5 = {-9, -2, -4, -1};
		double[] arr6 = {2,-4};
		double[] arr7 = {-2};
		double[] arr8 = {50.90};

		double[] answer = ArrayPractice.reverseSortArray(arr);
		double[] answer1 = ArrayPractice.reverseSortArray(arr1);
		double[] answer2 = ArrayPractice.reverseSortArray(arr2);
		double[] answer3 = ArrayPractice.reverseSortArray(arr3);
		double[] answer4 = ArrayPractice.reverseSortArray(arr4);
		double[] answer5 = ArrayPractice.reverseSortArray(arr5);
		double[] answer6 = ArrayPractice.reverseSortArray(arr6);
		double[] answer7 = ArrayPractice.reverseSortArray(arr7);
		double[] answer8 = ArrayPractice.reverseSortArray(arr8);

		double[] expected = {5,4,2,1};
		double[] expected1 = {90.9, 62.1, 24.3, 10.5}; 
		double[] expected2 = {};
		double[] expected3 = {41.2,33.33,1.00,0,0,-23.9};
		double[] expected4 = {0};
		double[] expected5 = {-1,-2,-4,-9};
		double[] expected6 = {2, -4};
		double[] expected7 = {-2};
		double[] expected8 = {50.90};

		assertTrue(Arrays.equals(answer, expected));
		assertTrue(Arrays.equals(answer1, expected1));
		assertTrue(Arrays.equals(answer2, expected2));
		assertTrue(Arrays.equals(answer3, expected3));
		assertTrue(Arrays.equals(answer4, expected4));
		assertTrue(Arrays.equals(answer5, expected5));
		assertTrue(Arrays.equals(answer6, expected6));
		assertTrue(Arrays.equals(answer7, expected7));
		assertTrue(Arrays.equals(answer8, expected8));
	}
	
	@Test
	void isMemberTest() {
		String[] arr = {"Leo" , "Ursa"};
		String[] arr1 = {"Juan", "Leo", "Medusa", "Pedro"};
		String[] arr3 = {};
		
		assertFalse(ArrayPractice.isMember("Juan" , arr));
		assertFalse(ArrayPractice.isMember("Ursa" , arr1));
		assertFalse(ArrayPractice.isMember("John", arr1));
		assertFalse(ArrayPractice.isMember("Pedr", arr1));
		assertFalse(ArrayPractice.isMember("Leo", arr3));
		assertFalse(ArrayPractice.isMember("", arr3));

		assertTrue(ArrayPractice.isMember("Ursa" , arr));
		assertTrue(ArrayPractice.isMember("Leo" , arr));
		assertTrue(ArrayPractice.isMember("Pedro" , arr1));
		assertTrue(ArrayPractice.isMember("Juan" , arr1));
		assertTrue(ArrayPractice.isMember("Medusa" , arr1));		
		assertTrue(ArrayPractice.isMember("Leo" , arr1));

	}

}
