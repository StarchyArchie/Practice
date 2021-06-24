package CSCLessons.Searches;

/**
 * Vishal Nigam
 *
 * Implements iterative versions of linear and binary search with tabular trace
 * and comparisons.
 */

public class SearchMethods
{
	public static void linearSearch(int a[], int value)
	{
		int comparisons = 0;
		boolean found = false;
		int i = 0;
        String r;

		System.out.println ("\nLinear search for " + value);
		System.out.println("index\ta[i]\treturn");

        while(i<a.length&&a[i]!=value){
            System.out.println(i+"\t"+a[i]+"\t"+"-");
            i++;
            comparisons++;
        }
        if(i<a.length){
            comparisons++;
            System.out.println(i+"\t"+a[i]+"\t"+i);
            found = true;
        }

		if (!found)
			System.out.println("Not found");

		System.out.println("Comparisons = " + comparisons);

	}

	public static void binarySearch(int a[], int value)
	{
		int comparisons = 0;
		boolean found = false;
		int first = 0;
		int last = (a.length - 1);
		int mid = (first+last)/2;

		System.out.println ("\nBinary search for " + value);
		System.out.println("first\tlast\tmid\ta[mid]\treturn");

        while(first<=last&&a[mid]!=value){
            if(a[mid]<value){
                System.out.println(first+"\t"+last+"\t"+mid+"\t"+a[mid]+"\t-");
                first = mid+1;
                mid = (first+last)/2;
                comparisons++;
            }
            else if(a[mid]>value) {
                System.out.println(first + "\t" + last + "\t" + mid + "\t" + a[mid] + "\t-");
                last = mid - 1;
                mid = (first+last)/2;
                comparisons++;
            }

        }
        if(a[mid]==value) {
            comparisons++;
            System.out.println(first+"\t"+last+"\t"+mid+"\t"+a[mid]+"\t"+mid);
            found = true;
        }

		if (!found)
			System.out.println("Not found");

		System.out.println("Comparisons = " + comparisons);
	}
}
