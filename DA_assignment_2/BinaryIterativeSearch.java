//package edu.usfca.cs.cs245;

import java.util.Arrays;

/*
Be consistent with spaces (specifically before your curly braces and after conditionals and loops)
*/
public class BinaryIterativeSearch implements Practice2Search{
	public int search(int [] arr, int target) {
		for (int i = 0; i <= (arr.length-1)/4; i++) {
			int mid = (arr.length-1)/2;
			
			if (arr[0] < arr[arr.length-1]) {
				return -1;
			}else if (target < arr[mid]) {
				
				int [] arr2 = Arrays.copyOfRange(arr, mid+1, arr.length-1);
				arr = arr2;
				
			}else if (target > arr[mid]){
				
				int [] arr2 = Arrays.copyOfRange(arr, 0, mid-1);
				arr = arr2;
			}else if (arr[mid] == target){
				return target;
			}
		}
		return -1;
		
	}

	/*
	Always remove all TODO's from code.  It looks unprofessional to leave reminders in your code
	*/
	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return "Binary Iterative";
	}
}