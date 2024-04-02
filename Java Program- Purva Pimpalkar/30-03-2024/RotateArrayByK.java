public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        System.out.println("Original array:");
        printArray(arr);
        rotateByK(arr, k);
        System.out.println("\nArray after rotating by " + k + " positions:");
        printArray(arr);
    }
    public static void rotateByK(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) {
            return;
        }

        int n = arr.length;
        k = k % n; 
        reverse(arr, 0, k - 1); 
        reverse(arr, k, n - 1); 
        reverse(arr, 0, n - 1); 
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
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
