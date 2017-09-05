package edu.usfca.cs.cs245;

public class LinearSearch implements Practice2Search{
	public int search(int [] arr, int target) {
		
		for (int i : arr){
			if (target == i) {
				return target;
			}
		}
		
		return target;
		
	}

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return "Linear Search";
	}
}
