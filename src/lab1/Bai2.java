package lab1;

public class Bai2 {
    public static void main(String[] args) {
        int n = 500;
        double S = 0;

        for (int i = 2; i <= n; i++) {
            S += 1.0 / i;
        }

        System.out.println("Tong S = " + S);
    }
}
