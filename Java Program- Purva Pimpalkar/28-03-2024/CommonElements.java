import java.util.*;

public class CommonElements {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        System.out.println("\nCommon Elements:");
        for (int num : array1) {
            for (int num2 : array2) {
                if (num == num2) {
                    System.out.print(num + " ");
                    break;
                }
            }
        }
    }
}
