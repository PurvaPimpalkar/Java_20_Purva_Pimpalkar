public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        printArray(arr);
        rotateLeft(arr);
        System.out.println("\nArray after rotating left by 1 position:");
        printArray(arr);
    }
    public static void rotateLeft(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
