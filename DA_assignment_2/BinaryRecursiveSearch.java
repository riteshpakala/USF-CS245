//package edu.usfca.cs.cs245;
import java.util.Arrays;
/*
It can look a lot cleaner to leave some space to seperate different sections of code
*/
public class BinaryRecursiveSearch implements Practice2Search{
	/*
	This is not a correct implementation of recursive search for a few reasons.
	*/
	public int search(int [] arr, int target) {
		int mid = ((arr.length)/2)-1;
		
		/*
		You haven't found it if your pointer to the first index exceeds your last index
		Not if the elements at those indices compare.
		*/
		if (arr[0] < arr[arr.length-1]) {
			return -1;
		}else if (target < arr[mid]) {
			
			int [] arr2 = Arrays.copyOfRange(arr, mid+1, arr.length-1);
			return search(arr2, target);
			
		}else if (target > arr[mid]){
			
			/*
			Please be consistent with your spacing to make your code look a lot cleaner.
			*/
			int [] arr2 = Arrays.copyOfRange(arr, 0, mid-1);
			return search(arr2, target);
		}else if (arr[mid] == target){
			return target;
		}else {
			return target;
		}

		/*
		You should almost always return the index of the target not the target itself
		in search funcitons
		*/
		
	}

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return "Binary Recursive";
	}
}