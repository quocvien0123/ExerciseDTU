package lab1;

import java.util.Scanner;

import static java.lang.String.copyValueOf;

public class Bai7 {

        public static int countWords(String str) {
            if (str == null || str.isEmpty()) {
                return 0;
            }
            String[] words = str.trim().split("\\s+");
            return words.length;
        }

        public static int countSpecialCharacters(String str) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                    count++;
                }
            }
            return count;
        }

        public static String reverseString(String str) {
            StringBuilder reversed = new StringBuilder(str);
            return reversed.reverse().toString();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhap chuoi ky tu: ");
            String input = scanner.nextLine();
            String str = input;

            int wordCount = countWords(input);
            System.out.println("So tu trong chuoi: " + wordCount);

            int specialCharCount = countSpecialCharacters(input);
            System.out.println("So ky tu dac biet: " + specialCharCount);

            String reversedString = reverseString(input);
            System.out.println("Chuoi dao nguoc: " + reversedString);

            String reversedWordsString = "";
            String s = "";
            for (int i = 0; i < str.length(); i++) {
                s = s + str.charAt(i);
                if(str.charAt(i) == ' ' || i ==  str.length() - 1){
                    reversedWordsString = reversedWordsString + reverseString(s) +" ";
                    s = "";
                }

            }
            System.out.println("Dao nguoc cac tu trong chuoi: " + reversedWordsString);

            scanner.close();
        }
}
