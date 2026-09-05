class TransactionReference {

    static String normalizeReference(String raw) {
        raw = raw.trim();
        return raw.substring(0, 3).toUpperCase() + raw.substring(3);
    }

    static String validateAndFormat(String r) {

        if (r.length() != 14)
            return "Invalid: wrong length";

        for (int i = 0; i < 3; i++)
            if (!Character.isLetter(r.charAt(i)))
                return "Invalid: bank code must be 3 letters";

        for (int i = 3; i < 14; i++)
            if (!Character.isDigit(r.charAt(i)))
                return "Invalid: body must contain only digits";

        StringBuilder s = new StringBuilder();

        s.append("[")
         .append(r.substring(0, 3))
         .append("] DATE: ")
         .append(r.substring(3, 5))
         .append("/")
         .append(r.substring(5, 7))
         .append("/")
         .append(r.substring(7, 9))
         .append(" | SEQ: ")
         .append(r.substring(9));

        return s.toString();
    }

    public static void main(String[] args) {

        String r = normalizeReference(" hdf03022600042 ");

        System.out.println(validateAndFormat(r));
    }
}
