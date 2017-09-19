/******
 * 
 * @author Ritesh Pakala
 *
 */

public class SelectionSort implements SortingAlgorithm {

	@Override
	public int[] sort(int[] a) {
		// TODO Auto-generated method stub
		for (int top = 0; top < a.length - 1 ; top++) {
			int min = top;
			for (int bot = min + 1;  bot <  a.length; bot++) { 
				if (a[min] > a[bot]) {
					min = bot;
				}
			}
			
			if(min != top) {
				int temp = a[min];
				a[min] = a[top];
				a[top] = temp;
			}
		}
		
		return a;
	}

}
