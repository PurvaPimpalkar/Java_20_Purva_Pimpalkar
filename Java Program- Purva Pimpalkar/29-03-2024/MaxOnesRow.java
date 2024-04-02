public class MaxOnesRow {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 1}
        };

        int maxOnesRowIndex = findMaxOnesRow(matrix);
        System.out.println("Row with maximum number of 1's: " + maxOnesRowIndex);
    }

    public static int findMaxOnesRow(int[][] matrix) {
        int maxOnesRowIndex = -1;
        int maxOnesCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            int onesCount = countOnes(matrix[i]);
            if (onesCount > maxOnesCount) {
                maxOnesCount = onesCount;
                maxOnesRowIndex = i;
            }
        }

        return maxOnesRowIndex;
    }

    public static int countOnes(int[] row) {
        int count = 0;
        for (int num : row) {
            if (num == 1) {
                count++;
            }
        }
        return count;
    }
}

