class StudentParser {

    static void parseStudentRecord(String csvLine) {
        String[] a = csvLine.split(",");

        if (a.length != 3)
            System.out.println("Invalid Record");
        else
            System.out.println("Name: " + a[0] +
                    " | Roll No: " + a[1] +
                    " | Dept: " + a[2]);
    }

    public static void main(String[] args) {
        parseStudentRecord("Ananya Verma,RA2211003010123,CSE");
    }
}
