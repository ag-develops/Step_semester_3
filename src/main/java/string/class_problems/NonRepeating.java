import java.util.*;

class NonRepeating {

    static char findFirstNonRepeatingChar(String s) {

        int[] freq = new int[256];

        for (char c : s.toCharArray())
            freq[c]++;

        for (char c : s.toCharArray())
            if (freq[c] == 1) return c;

        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char c = findFirstNonRepeatingChar(s);

        if (c == '\0')
            System.out.println("No Non-Repeating Character Found");
        else
            System.out.println("First Non-Repeating Character: '" + c + "'");
    }
}
