package string.class_problems;

import java.util.Scanner;

public class ReverseCustomerName {
    static String reverseCustomerName(String customerName) {
        return new StringBuilder(customerName).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.println("Original Name: " + customerName);
        System.out.println("Reversed Name: " + reverseCustomerName(customerName));

        scanner.close();
    }
}
