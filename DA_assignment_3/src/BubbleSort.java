/******
 * 
 * @author Ritesh Pakala
 *
 */

public class BubbleSort implements SortingAlgorithm{

	@Override
	public int[] sort(int[] a) {
		
		// TODO Auto-generated method stub
		for (int i = (a.length - 1); i >= 0; i--) {//start from top and work way down
            for (int j = 1; j <= i; j++) {//split job coming up 
                if (a[j - 1] > a[j]) {//compare values
                		
                		//swap
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
		
		return a;
	}

}
