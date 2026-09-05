class VowelConsonant {

    static void countVowelsAndConsonants(String text) {
        int v = 0, c = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u')
                v++;
            else if (ch != ' ')
                c++;
        }

        System.out.println("Vowels: " + v + " | Consonants: " + c);
    }

    public static void main(String[] args) {
        countVowelsAndConsonants("Java Programming");
    }
}
