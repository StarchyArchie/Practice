package CSCLessons.Sorting;

/**
 * Vishal Nigam
 * 3/19/18
 * Creates arrays of varying size and applies selection sort to them and prints the number of comparisons.
 */
public class TestSortMethods {
    public static void main(String[]args) {
        int sizes[] = {2000, 4000, 6000, 8000, 10000};
        for (int i = 0; i < sizes.length; i++){
            int array[] = SortMethods.randomIntArray(sizes[i], 100.0);
            int arrayCopy[] = SortMethods.copyArray(array);
            int arrayCopy2[] = SortMethods.copyArray(array);
            int arrayCopy3[] = SortMethods.copyArray(array);
            System.out.println("");
            SortMethods.printArray(array);
            System.out.println("");
            SortMethods.bubbleSort(arrayCopy);
            int comp = SortMethods.bubbleSortComparisons(arrayCopy2);
            System.out.println("bubble");
            SortMethods.printArray(arrayCopy);
            System.out.println("bubble");
            System.out.println("Comparisons bubble: "+comp);
            comp = SortMethods.mergeSort(arrayCopy3, 0,arrayCopy3.length-1,0);
            System.out.println("Comparisons merge: "+comp);
            System.out.println("merge");
            SortMethods.printArray(arrayCopy3);
            System.out.println("merge");
            comp = SortMethods.selectionSortComparisons(array);
            System.out.println("Selection");
            SortMethods.printArray(array);
            System.out.println("Selection");
            System.out.println("Comparisons Selection: "+comp);


        }
    }
}
