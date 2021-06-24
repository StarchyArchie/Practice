package CSCLessons.Searches;
// Test Search Methods
//
// Mark Hoffman
// 7/11/2014
//
// Test driver for Search Methods Class

public class TestSearchMethods {

	public static void main(String[] args) {
		
		int a[] = {2, 4, 9, 19, 32, 43, 59, 60, 78, 99};
		
		System.out.println("Test Array");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		
		SearchMethods.linearSearch(a, 43);
		SearchMethods.linearSearch(a, 80);
		SearchMethods.binarySearch(a,9);
		SearchMethods.binarySearch(a,80);
		
	}

}
