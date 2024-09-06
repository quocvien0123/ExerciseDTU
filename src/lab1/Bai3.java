package lab1;

public class Bai3 {
    public static void printPatternA() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void printPatternB() {
        for (int i = 8; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void printPatternC() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void printPatternD() {
        for (int i = 8; i >= 1; i--) {
            for (int j = 1; j <= 8 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPatternA();
        System.out.println();
        printPatternB();
        System.out.println();
        printPatternC();
        System.out.println();
        printPatternD();
    }
}
