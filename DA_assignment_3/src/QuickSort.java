/******
 * 
 * @author Ritesh Pakala
 *
 */

public class QuickSort implements SortingAlgorithm{
    @Override
    public int[] sort(int[] a) {
        // TODO Auto-generated method stub
        qs(a, 0, a.length-1);//begin sorting
        return a;
    }
    
    // This is where quick sort divides values around a pivot.
    public static int partition(int [] a, int top, int bot) {
            int i = top;  // Loop down from here.
            int j = bot;  // Loop up from here.
            
            //start at top
            int pivot = top; // One of several pivot selection strategies.
            
            while (i <= j) {
                // Find a large value (greater than pivot) in the start of the array
                while (a[i] < a[pivot])
                    i++;
                // Find a small value in the end of the array
                while (a[j] > a[pivot])
                    j--;
                
                // Swap and move relative index's up (forward) and down (back) respectively.
                if (i <= j) {
                    
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    
                    i++;
                    j--;
                }
            }
            // return pivot location and restart
            return (i);
        }
    
        public static void qs(int [] a, int top, int bot) {
            // Call partition to divide the array. Everything above pivot is smaller than everything below.
            int pivot = partition(a, top, bot);
            // Recursively call quick sort on the top and bottom sub-arrays.
            if (top < pivot-1)  // Base case 1: must have at least 1 element to sort
                qs(a, top, pivot-1);
            if (pivot < bot)    // Base case 2: same for the bottom subarray
                qs(a, pivot, bot);
            
        }

}
