package apps;

public class MagicSquareCheckerByMe {

    static final int MAGIC_NUMBER = 15;
    public static void main(String[] args) {

        int[][] arr1 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int[][] arr2 = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        int[][] arr3 = {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}};

        magicSquareCheck(arr1);
        magicSquareCheck(arr2);
        magicSquareCheck(arr3);
    }

    public static boolean magicSquareCheck(int[][] arr) {
        int hCount = 0;
        int vCount = 0;
        int dLeftCount = 0;
        int dRightCount = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                hCount += arr[i][j];
                vCount += arr[j][i];
            }
            if (hCount != MAGIC_NUMBER) {
                System.out.printf("Horizontal row %d do not sum to %d", (i + 1), MAGIC_NUMBER);
                return false;
            } else if (vCount != MAGIC_NUMBER) {
                System.out.printf("Vertical col %d do not sum to %d", (i + 1), MAGIC_NUMBER);
                return false;
            }
            hCount = 0;
            vCount = 0;

            dLeftCount += arr[i][i];
            dRightCount += arr[i][arr.length - i - 1];
        }
        if (dLeftCount != MAGIC_NUMBER) {
            System.out.printf("Diagonal left do not sum to %d", MAGIC_NUMBER);
            return false;
        } else if (dRightCount != MAGIC_NUMBER) {
            System.out.printf("Diagonal right do not sum to %d", MAGIC_NUMBER);
            return false;
        }
        System.out.println("\nMAGIC SQUARE!!!");
        return true;
    }
}