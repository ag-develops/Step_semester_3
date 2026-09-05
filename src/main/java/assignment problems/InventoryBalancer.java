class InventoryBalancer {

    static void analyzeInventory(int[] a, int[] b) {

        int totalA = 0, totalB = 0;
        int max = a[0], section = 1, index = 0;

        for (int i = 0; i < a.length; i++) {
            totalA += a[i];
            totalB += b[i];

            if (a[i] > max) {
                max = a[i];
                section = 1;
                index = i;
            }

            if (b[i] > max) {
                max = b[i];
                section = 2;
                index = i;
            }
        }

        String status = totalA == totalB ? "Balanced" : "Not Balanced";

        System.out.println("Section A Total: " + totalA +
                " | Section B Total: " + totalB +
                " | Status: " + status +
                " | Highest Quantity: " + max +
                " (Section " + (section == 1 ? "A" : "B") +
                ", Item " + (index + 1) + ")");
    }

    public static void main(String[] args) {
        int[] a = {20, 15, 30};
        int[] b = {25, 10, 30};

        analyzeInventory(a, b);
    }
}
