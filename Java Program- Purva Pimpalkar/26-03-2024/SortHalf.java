import java.util.Arrays;

public class SortHalfAscendingDescending {
    public static void main(String[] args) {
        int[] arr = {30,45,29,94,1,67,23,83};
        int mid = arr.length / 2;
        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, arr.length);
        reverse(arr, mid, arr.length - 1);
        System.out.println("Array after sorting first half in ascending order and second half in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
