/* Test cases:
{0, 1, 2, 3, 4} output: {4, 3, 2, 1, 0}
{12, 17, 18} output: {18, 17, 12}
null output: IllegalArgumentException
{0, 104, 180, -1} output: {180, 104, 0, -1}
{-1, -2, -3, -4} output: {-1, -2, -3, -4}
{1, 1, 1, 1} output: {1, 1, 1, 1}
{} output: {}
 */

public class Lab4 {
	public static void main(String[] args) {
		
		//create test arrays
		Integer[] test1 = {0, 1, 2, 3, 4};
		Integer[] test2 = {12, 17, 18};
		Integer[] test3 = null;
		Integer[] test4 = {0, 104, 180, -1};
		Integer[] test5 = {-1, -2, -3, -4};
		Integer[] test6 = {1, 1, 1, 1};
		Integer[] test7 = {};
		Integer[] test8 = {3,2,1};
		
		Integer[] testSort = sortDescending(test8);
		for(Integer element : testSort) {
			System.out.println(element);
		}
	}
	public static Integer[] sortDescending(Integer[] anArray) {
		if(anArray == null) {
			throw new IllegalArgumentException("Input array was null");
		}
		else if(anArray.length == 0) {
			Integer[] returnArray = anArray;
			return returnArray;
		}
		else if(isSorted(anArray)) {
			Integer[] returnArray = anArray;
			return returnArray;
		}
		else {
			while(!isSorted(anArray)) {
				for(int i = 0; i < anArray.length -1; i++) {
					if(anArray[i] < anArray[i+1]) {
						Integer temp = anArray[i];
						anArray[i] = anArray[i+1];
						anArray[i+1] = temp;
					}
				}
			}
			
		}
		Integer[] returnArray = anArray;
		return returnArray;
	}
	public static boolean isSorted(Integer[] anArray) {
		for(int i = 0; i < anArray.length -1; i++) {
			if(anArray[i] < anArray[i+1]) {
				return false;
			}
		}
		return true;
	}
}
