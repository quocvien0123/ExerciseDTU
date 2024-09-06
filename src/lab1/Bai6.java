package lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int tongLe = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                tongLe += num;
            }
        }
        System.out.println("Tong cac so le: " + tongLe);

        System.out.print("Cac so nguyen to trong mang: ");
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        int maxSum = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
        }
        System.out.println("Hai phan tu lien tiep co tong lon nhat: " + arr[maxIndex] + " va " + arr[maxIndex + 1]);

        System.out.print("Nhap so x: ");
        int x = scanner.nextInt();
        List<Integer> uocSoList = new ArrayList<>();

        for (int num : arr) {
            if (x % num == 0) {
                uocSoList.add(num);
            }
        }

        if (!uocSoList.isEmpty()) {
            double trungBinhCong = uocSoList.stream().mapToInt(Integer::intValue).average().orElse(0);
            System.out.println("Trung binh cong cac phan tu la uoc so cua x: " + trungBinhCong);
        } else {
            System.out.println("Khong co phan tu nao la uoc so cua x.");
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
