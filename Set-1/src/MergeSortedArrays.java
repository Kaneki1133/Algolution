import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args)
    {

        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        // Using The Merge Function
        int[] mergedArray = mergeArrays(array1, array2);

        // Sorting Using The Inbuilt Function
        Arrays.sort(mergedArray);
        System.out.println("Sorted Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2)
    {
        int n1 = arr1.length;
        int n2 = arr2.length;


        int[] mergedArray = new int[n1 + n2];

        // Copy elements from arr1 and arr2 into mergedArray using arraycopy
        System.arraycopy(arr1, 0, mergedArray, 0, n1);
        System.arraycopy(arr2, 0, mergedArray, n1, n2);

        return mergedArray;
    }
}
