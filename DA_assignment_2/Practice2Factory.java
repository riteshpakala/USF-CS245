//package edu.usfca.cs.cs245;

public class Practice2Factory {
	
	public Practice2Search getSearch(String searchtype) {
		if (searchtype.contains("linear"))
			return new LinearSearch();
		else if (searchtype.contains("binary") && searchtype.contains("recursive"))
			return new BinaryRecursiveSearch();
		else if (searchtype.contains("binary") && searchtype.contains("iterative"))
			return new BinaryIterativeSearch();
		return null;
	}

}
