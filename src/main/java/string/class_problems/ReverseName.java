import java.util.*;

class ReverseName {

    static String reverseCustomerName(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " + reverseCustomerName(name));
    }
}
