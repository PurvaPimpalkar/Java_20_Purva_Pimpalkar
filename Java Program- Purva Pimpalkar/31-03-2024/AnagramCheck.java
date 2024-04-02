import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 2, 1, 5, 4};
        System.out.println("Array 1:");
        printArray(arr1);
        System.out.println("\nArray 2:");
        printArray(arr2);
        if (areAnagrams(arr1, arr2)) {
            System.out.println("\nArrays are anagrams.");
        } else {
            System.out.println("\nArrays are not anagrams.");
        }
    }
    public static boolean areAnagrams(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
