class TypingAccuracy {

    static void checkTypingAccuracy(String original, String typed) {
        int match = 0, firstMismatch = -1;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i))
                match++;
            else if (firstMismatch == -1)
                firstMismatch = i;
        }

        double accuracy = match * 100.0 / original.length();

        if (firstMismatch == -1)
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n",
                    match, original.length(), accuracy);
        else
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')%n",
                    match, original.length(), accuracy,
                    firstMismatch + 1,
                    original.charAt(firstMismatch),
                    typed.charAt(firstMismatch));
    }

    public static void main(String[] args) {
        checkTypingAccuracy("hello world", "hello worlt");
    }
}
