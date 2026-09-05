class PhoneMask {

    static String maskPhoneNumber(String phone) {

        if (phone.length() != 10)
            return "Invalid phone number";

        for (int i = 0; i < phone.length(); i++)
            if (!Character.isDigit(phone.charAt(i)))
                return "Invalid phone number";

        StringBuilder s = new StringBuilder("XXXXXX");
        s.insert(6, "-" + phone.substring(6));

        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(maskPhoneNumber("9876543210"));
    }
}
