
public class InsertionSort implements SortingAlgorithm{

	@Override
	public int[] sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = a[i];//hold item to sort
			int index = i;//position of the item above
			while(index > 0 && a[index-1] > min) { //as long position stays above starting and every item before it is greater move lower
				a[index] = a[index-1];//swap
				index = index - 1;//move index down
			}
			
			a[index] = min;
		}
		return a;
	}
}
