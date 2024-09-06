package lab1;

import java.util.Arrays;

public class Bai5 {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 30, 10, 5, 8, 23, 0, -5};

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        System.out.println("Tong: " + sum);
        System.out.println("Trung binh cong: " + average);

        System.out.print("Vi tri cac phan tu <= 0: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep tang dan: " + Arrays.toString(arr));
    }
}
