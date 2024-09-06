package lab1;

import java.util.Scanner;

public class Bai4 {
        public static int findLastGreaterOrEqual(int[] arr, int x) {
            int position = -1;  // Nếu không tìm thấy, trả về -1

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= x) {
                    position = i;
                }
            }

            return position;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhap so phan tu cua mang: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            System.out.print("Nhap so nguyen x: ");
            int x = scanner.nextInt();

            int position = findLastGreaterOrEqual(arr, x);

            if (position != -1) {
                System.out.println("Vi tri cuoi cung cua phan tu lon hon hoac bang " + x + " la: " + position);
            } else {
                System.out.println("Khong co phan tu nao lon hon hoac bang " + x + " trong mang.");
            }

        }
}
