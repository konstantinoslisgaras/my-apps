package apps;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class StarsAppByMe {

    static Scanner scanner = new Scanner(System.in);
    static final int EXIT_NUMBER = 9;
    static final char SPACE = ' ';
    static final char STAR = '*';

    public static void main(String[] args) {
        int choiceInput;
        int numberInput;

        while (true) {
            printMenu();
            choiceInput = getUserChoice();

            if (choiceInput == EXIT_NUMBER) break;

            if (!isValid(choiceInput)) {
                System.out.println("Invalid Number");
                continue;
            }

            numberInput = getUserStars();

            if (!isPositive(numberInput)) {
                System.out.println("Not a Positive Number");
                continue;
            }

            switch (choiceInput) {
                case 1 -> printMethod1(numberInput);
                case 2 -> printMethod2(numberInput);
                case 3 -> printMethod3(numberInput);
                case 4 -> printMethod4(numberInput);
                case 5 -> printMethod5(numberInput);
                case 6 -> printMethod6(numberInput);
                case 7 -> printMethod7(numberInput);
                case 8 -> printMethod8(numberInput);
            }
        }
    }

    public static void printMenu() {
        System.out.println();
        System.out.println("=========|| Stars App ||========");
        System.out.println("1. Print N Stars Horizontally.");
        System.out.println("2. Print N Stars Vertically.");
        System.out.println("3. Print N Stars N.");
        System.out.println("4. Print 1 To N Stars.");
        System.out.println("5. Print N To 1 Stars.");
        System.out.println("6. Print Pyramid With N Stars.");
        System.out.println("7. Print Double Pyramid With N Stars.");
        System.out.println("8. Print Hollow Pyramid With N Stars.");
        System.out.println("9. EXIT.");
    }

    public static int getUserChoice() {
        System.out.print("Enter Your Choice: ");
        return scanner.nextInt();
    }

    public static boolean isValid(int n) {
        return n >= 1 && n <= EXIT_NUMBER;
    }

    public static int getUserStars() {
        System.out.print("Enter The Number Of Stars: ");
        return scanner.nextInt();
    }

    public static boolean isPositive(int n) {
        return n > 0;
    }

    public static void printMethod1(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    public static void printMethod2(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void printMethod3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printMethod4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printMethod5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printMethod6(int lines) {
        // Sequence: 1 - 2 - 3 - 4
        // Spaces:   3 - 2 - 1 - 0
        // Stars:    1 - 3 - 5 - 7
        for (int i = 1; i <= lines; i++) {
            for (int space = 1; space <= (lines - i); space++) {
                System.out.print(SPACE);
            }
            for (int star = 1; star <= (2 * i) - 1; star++) {
                System.out.print(STAR);
            }
            System.out.println();
        }
    }
    // Stars:    1 - 3 - 5 - 7 - 9 - 7 - 5 - 3 - 1

    public static void printMethod7(int lines) {
        // Sequence: 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9
        // Spaces:   4 - 3 - 2 - 1 - 0 - 1 - 2 - 3 - 4
        // Stars:    1 - 3 - 5 - 7 - 9 - 7 - 5 - 3 - 1

        lines = (lines % 2 != 0) ? lines : lines + 1;
        int middle = (int) Math.ceil((double) lines / 2);
        for (int i = 1; i <= lines; i++) {
            if (i < middle) {
                for (int space = middle; space > i; space--) {
                    System.out.print(SPACE);
                }
            } else {
                for (int space = 1; (i - middle) >= space; space++) {
                    System.out.print(SPACE);
                }
            }
            if (i < middle) {
                for (int star = 1; star <= (i * 2) - 1; star++) {
                    System.out.print(STAR);
                }
            } else {
                for (int star = 1; star <= (lines - i) * 2 + 1; star++) {
                    System.out.print(STAR);
                }
            }
            System.out.println();
        }
    }

    public static void printMethod8(int lines) {
        // Times  1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9
        // Spaces 4 - 3 - 2 - 1 - 0 - 1 - 2 - 3 - 4
        // Stars  1 - 2 - 1 - 1 - 1 - 1 - 1 - 2 - 1
        // Spaces 0 - 1 - 3 - 5 - 7 - 5 - 3 - 1 - 0
        // Stars  0 - 0 - 1 - 1 - 1 - 1 - 1 - 0 - 0
        lines = (lines % 2 != 0) ? lines : lines + 1;
        int middle = (int) Math.ceil((double) lines / 2);

        for (int i = 1; i <= lines; i ++) {
            for (int sp1 = 1; sp1 <= Math.abs((middle - i)); sp1++) {
                System.out.print(SPACE);
            }
            if (Math.abs(i - lines) == (lines - 2) || Math.abs(i - lines) == 1) {
                System.out.print(STAR);
                System.out.print(STAR);
            } else System.out.print(STAR);
            if (!(Math.abs(i - lines) == (lines - 1) || Math.abs(i - lines) == (lines - 2) || Math.abs(i - lines) == 1 || Math.abs(i - lines) == 0)) {
                if (i <= middle) {
                    for (int sp2 = 1; sp2 <= ((2 * i) - 3); sp2++) {
                        System.out.print(SPACE);
                    }
                } else {
                    for (int sp2 = 1; sp2 <= (-2 * i + (lines * 2 - 1)); sp2++) {
                        System.out.print(SPACE);
                    }
                }
            }
            if (!(Math.abs(i - lines) == (lines - 1) || Math.abs(i - lines) == 0)) {
                System.out.print(STAR);
            }
            System.out.println();
        }
    }
}