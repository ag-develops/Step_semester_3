class BMI {

    static String getBmiStatus(double b) {
        if (b < 18.5) return "Underweight";
        if (b < 25) return "Normal";
        if (b < 30) return "Overweight";
        return "Obese";
    }

    static void printWellnessReport(double[] h, double[] w) {
        System.out.println("Person\tHeight\tWeight\tBMI\tStatus");

        for (int i = 0; i < h.length; i++) {
            double bmi = w[i] / (h[i] * h[i]);

            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s%n",
                i+1, h[i], w[i], bmi, getBmiStatus(bmi));
        }
    }

    public static void main(String[] args) {

        double[] heights = {1.75, 1.60, 1.80, 1.70};
        double[] weights = {70, 90, 85, 60};

        printWellnessReport(heights, weights);
    }
}
