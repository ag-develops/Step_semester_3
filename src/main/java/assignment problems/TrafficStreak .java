class TrafficStreak {

    static void findLongestStreak(String s) {

        int max = 1, count = 1;
        char maxChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1))
                count++;
            else
                count = 1;

            if (count > max) {
                max = count;
                maxChar = s.charAt(i);
            }
        }

        System.out.println("Longest Streak: '" + maxChar +
                           "' repeated " + max + " times");
    }

    public static void main(String[] args) {
        findLongestStreak("RRGGGYRR");
    }
}
