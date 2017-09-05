package edu.usfca.cs.cs245;
import java.util.Arrays;
public class BinaryRecursiveSearch implements Practice2Search{
	public int search(int [] arr, int target) {
		int mid = ((arr.length)/2)-1;
		
		if (arr[0] < arr[arr.length-1]) {
			return -1;
		}else if (target < arr[mid]) {
			
			int [] arr2 = Arrays.copyOfRange(arr, mid+1, arr.length-1);
			return search(arr2, target);
			
		}else if (target > arr[mid]){
			
			int [] arr2 = Arrays.copyOfRange(arr, 0, mid-1);
			return search(arr2, target);
		}else if (arr[mid] == target){
			return target;
		}else {
			return target;
		}
		
	}

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return "Binary Recursive";
	}
}