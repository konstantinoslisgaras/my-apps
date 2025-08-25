package apps;

public class AlternatingBetweenOddsAndEvensByMe {
    final static int[] arr = {1, 2, 3, 3, 5, 2, 4, 8, 3, 1, 2, 3, 3, 1, 2, 3, 4, 5, 6, 7, 8, 8, 10, 1, 4, 6, 8};

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 2, 4, 6, 1, 1, 2};
        System.out.println(maxAlternationsOddsEvens(arr));
        System.out.println(maxAlternationsOddsEvens(arr1));
    }

    // Given an array of integers, find the length of the longest sub-array
    // that alternates between odd and even numbers consecutively.
    // If the sequence breaks (two odds or two evens in a row), restart the count.

    public static int maxAlternationsOddsEvens(int[] arr) {
        int counter = 1;
        int maxConsecutive = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (((arr[i] % 2 == 0) && (arr[i + 1] % 2 == 0)) || ((arr[i] % 2 != 0) && (arr[i + 1] % 2 != 0))) {
                counter = 1;
            } else {
                counter ++;
                if (counter > maxConsecutive) maxConsecutive = counter;
            }
        }

        return maxConsecutive;
    }
}
