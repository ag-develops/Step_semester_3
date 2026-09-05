package string.class_problems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    static Character findFirstNonRepeatingChar(String text) {
        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (char character : text.toCharArray()) {
            frequency.put(character, frequency.getOrDefault(character, 0) + 1);
        }

        for (char character : text.toCharArray()) {
            if (frequency.get(character) == 1) return character;
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        Character result = findFirstNonRepeatingChar(text);
        System.out.println(result == null
                ? "No Non-Repeating Character Found"
                : "First Non-Repeating Character: '" + result + "'");

        scanner.close();
    }
}
