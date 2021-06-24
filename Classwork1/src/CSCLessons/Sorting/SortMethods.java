package CSCLessons.Sorting;// Vishal Nigam
//
// Various implementations of sorting methods
// with support operations to print an array
// and to generate an array of random integers.

public class SortMethods{

	public static void selectionSort (int[] intArray){
		//Preconditions
		//	Input: unsorted integer array	
		//	Assumptions: array is full
		//Postconditions
		//	Output: none
		//	Actions: array is sorted in ascending order

		for(int last = intArray.length - 1; last > 0; last--){
			int indexOfLargest = last;
			
			// Find largest element in unsorted array
			for(int i = 0; i < last; i++){
				if (intArray[i] > intArray[indexOfLargest]){
					indexOfLargest = i;
				} // end if
			} // end for
			
			// Swap last element with largest element
			int temp = intArray[last];
			intArray[last] = intArray[indexOfLargest];
			intArray[indexOfLargest] = temp;
			
			// Print partially sorted array
			//System.out.println("Pass " + (intArray.length - last));
			//printArray(intArray);
			
		} // end for
		//printArray(intArray);
	}// end selectionSort

    public static int selectionSortComparisons (int[] intArray){
        //Preconditions
        //	Input: unsorted integer array
        //	Assumptions: array is full
        //Postconditions
        //	Output: none
        //	Actions: array is sorted in ascending order

        int comp = 0;
        for(int last = intArray.length - 1; last > 0; last--){
            int indexOfLargest = last;

            // Find largest element in unsorted array
            for(int i = 0; i < last; i++){
                comp++;
                if (intArray[i] > intArray[indexOfLargest]){
                    indexOfLargest = i;
                } // end if
            } // end for

            // Swap last element with largest element
            int temp = intArray[last];
            intArray[last] = intArray[indexOfLargest];
            intArray[indexOfLargest] = temp;

            // Print partially sorted array
            //System.out.println("Pass " + (intArray.length - last));
            //printArray(intArray);

        } // end for
        return comp;
    }// end selectionSort
	public static void bubbleSort(int[] intArray){
        int numSwaps = 1, temp;
        while(numSwaps!=0) {//numSwaps will equal zero when the sort is completed.
            for (int i = 0; i < intArray.length-1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    temp = intArray[i + 1];//holds value while it's location is reassigned.
                    intArray[i + 1] = intArray[i];//swaps values.
                    intArray[i] = temp;
                    numSwaps++;//adds to the number of swaps made.
                }
            }
            if(numSwaps==1){
                numSwaps--;
            }
            else if(numSwaps>1){
                numSwaps=1;
            }
        }
        //printArray(intArray);
    }
    public static int bubbleSortComparisons(int[] intArray){
        int comp = 0, numSwaps = 1, temp;
        while(numSwaps!=0) {//numSwaps will equal zero when the sort is completed.
            for (int i = 0; i < intArray.length - 1; i++) {
                comp++;//increments comparisons for the comparison below.
                if (intArray[i] > intArray[i + 1]) {
                    temp = intArray[i + 1];//holds value while it's location is reassigned.
                    intArray[i + 1] = intArray[i];//swaps values.
                    intArray[i] = temp;
                    numSwaps++;//adds to the number of swaps made.
                }
            }
            if(numSwaps==1){
                numSwaps--;
            }
            else if(numSwaps>1){
                numSwaps=1;
            }
        }
        return comp;
    }
    public static int mergeSort(int[] intArray, int bottom, int top, int comp){
        if(bottom < top) {
            int middle = (top + bottom) / 2;
            mergeSort(intArray, bottom, middle, comp);//sorts first half
            mergeSort(intArray, middle + 1, top, comp);//sorts second half
            comp += merge(intArray, bottom, middle, top, comp);//combines the two
        }
        return comp;
    }
    public static int merge(int[] intArray, int bot, int mid, int large, int comp){
        int temp[], left = bot, right = mid+1, cur = bot;
        temp = new int[intArray.length];
        for (int i = bot; i <= large; i++) {
            temp[i] = intArray[i];
        }
        while(left<=mid&&right<=large){
            comp++;
            if(temp[left]<=temp[right]){
                intArray[cur]=temp[left];
                left++;
            }
            else{
                intArray[cur]=temp[right];
                right++;
            }
            cur++;
        }
        int remainder = mid - left;
        for (int i = 0; i <= remainder; i++) {
            intArray[cur+i] = temp[left+ i];
        }
        return comp;
    }
	public static void printArray(int[] intArray){
		//Preconditions
		//	Input: unsorted integer array	
		//	Assumptions: array is full
		//Postconditions
		//	Output: none
		//	Actions: array is displayed on screen
		
		System.out.print("Array==> ");
		for(int i = 0; i < intArray.length; i++){
			System.out.print(intArray[i] + " ");
		} // end for
		
		System.out.println(" ");
		
	} // end printArray
	
	public static int[] randomIntArray(int n, double range){
		//Preconditions
		//	Input: size of array(n), range of integers (0 to range)
		//	Assumptions: none
		//Postconditoins
		//	Output: array of random integers 0 to floor(range) 
		//	Actions: none
		
		int[] intArray = new int[n];
		
		for(int i = 0; i < n; i++){
			intArray[i] = (int)(Math.random() * range);
		} // end for
		
		return intArray;
		
	} // end randomIntArray
	
	public static int[] copyArray(int[] intArray){
		//Preconditions
		//	Input: integer array
		//	Assumptions: array is full
		//Postconditions
		//	Output: array of random integers 0 to floor(range) 
		//	Actions: none
		
		int[] copyArray = new int[intArray.length];
		
		for(int i = 0; i < intArray.length; i++){
			copyArray[i] = intArray[i];
		} // end for
		
		return copyArray;
		
	} // end copyArray
		

} // end SortMethods