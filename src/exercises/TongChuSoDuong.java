package exercises;

import java.util.Scanner;

public class TongChuSoDuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương: ");
        int n = scanner.nextInt();

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Tổng các chữ số: " + sum);
    }
}
