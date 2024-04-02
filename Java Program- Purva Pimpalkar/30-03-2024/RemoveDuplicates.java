import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 1};
        System.out.println("Original array:");
        printArray(arr);
        int[] uniqueArray = removeDuplicates(arr);
        System.out.println("\nArray after removing duplicates:");
        printArray(uniqueArray);
    }
    public static int[] removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        Arrays.sort(arr);
        int uniqueCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueCount++;
            }
        }
        int[] uniqueArray = new int[uniqueCount];
        uniqueArray[0] = arr[0];
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueArray[index] = arr[i];
                index++;
            }
        }

        return uniqueArray;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
