package string.class_problems;

import java.util.Scanner;

public class PalindromeChecker {
    static boolean isPalindromeIterative(String text) {
        for (int left = 0, right = text.length() - 1; left < right; left++, right--) {
            if (text.charAt(left) != text.charAt(right)) return false;
        }
        return true;
    }

    static boolean isPalindromeRecursive(String text) {
        return checkRecursive(text, 0, text.length() - 1);
    }

    static boolean checkRecursive(String text, int left, int right) {
        if (left >= right) return true;
        return text.charAt(left) == text.charAt(right)
                && checkRecursive(text, left + 1, right - 1);
    }

    static boolean isPalindromeArrayReversal(String text) {
        char[] characters = text.toCharArray();
        for (int left = 0, right = characters.length - 1; left < right; left++, right--) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
        }
        return text.equals(new String(characters));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        System.out.println("Iterative: " + isPalindromeIterative(text));
        System.out.println("Recursive: " + isPalindromeRecursive(text));
        System.out.println("Array Reversal: " + isPalindromeArrayReversal(text));

        scanner.close();
    }
}
