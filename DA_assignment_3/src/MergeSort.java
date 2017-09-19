import java.util.Arrays;//for Arrays.copyOfRange*

/******
 * 
 * @author Ritesh Pakala
 *
 */

public class MergeSort implements SortingAlgorithm{

	@Override
	public int[] sort(int[] a) {
		 
		if (a.length == 1){//base case
			return a;//once returned all the split segments are then recursively
			//pushed into the merge function compiling them together over time, once sorted
		}
		
		
		//initialize lower half (left) and upper half (right)
		int[] left = new int[a.length/2], right = new int[a.length/2];
		
		//copy elements in a cut in half, from left and right
		left = Arrays.copyOfRange(a, 0, a.length/2);
		right = Arrays.copyOfRange(a, a.length/2, a.length);
	      
		sort(left);//sort the left, but split it down
		sort(right);//sort the right, but split it down
		
		//begin mergeSort
		merge(a, left, right);
        
        return a;
	}

	/*
	 * divide and conquer. 
	 * 
	 * while splitting the arrays into smaller arrays that are located respectively
	 * on the left or right of the original array.
	 * 
	 * sorting each array created respectively and then merging them
	 */
	public static void merge(int[] a, int[] left, int[] right){
	      int low = 0;
	      int high = 0;
	      int place = 0;
	     
	      while(low < left.length && high < right.length){
	    	  	if (left[low] < right[high]){
	    	    		a[place] = left[low];
	    	    		low++;
			}else{
				a[place] = right[high];
				high++;
			}
	    	  		place++;
	    	  }
	      
	      //if there left over values append them back to the array
	    	  for (int leftExcess: Arrays.copyOfRange(left, low, left.length)) {
	    		  a[place] = leftExcess;
	    		  place++;
	    	  }
	    	  for (int rightExcess: Arrays.copyOfRange(right, high, right.length)) {
	    		  a[place] = rightExcess;
	    		  place++;
	    	  }
	   }
	
}
