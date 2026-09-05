class WordLengthProfiler {

    static void classifyWordLengths(String review) {

        int shortWord = 0, medium = 0, longWord = 0;

        String[] words = review.split(" ");

        for (String word : words) {

            int n = word.length();

            if (n <= 4)
                shortWord++;
            else if (n <= 8)
                medium++;
            else
                longWord++;
        }

        System.out.println("Short: " + shortWord +
                " | Medium: " + medium +
                " | Long: " + longWord);
    }

    public static void main(String[] args) {
        classifyWordLengths(
            "This movie was absolutely fantastic and thrilling"
        );
    }
}
