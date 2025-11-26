import java.util.Scanner;

public class Shopp {
    private static final double PRICE_PER_KG = 120.0;

    // calculate payable for a single fruit item (weight in Kg, qty number of that fruit)
    public static double calculatePayable(double weightKg, int quantity) {
        double base = PRICE_PER_KG * weightKg * quantity;
        double discount = 0.0;
        if (weightKg >= 12.0) {
            discount = 0.10; // 10%
        } else if (weightKg >= 8.0 && weightKg <= 11.0) {
            discount = 0.05; // 5%
        }
        return base * (1.0 - discount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many different fruits will the customer buy? ");
        int n = Integer.parseInt(sc.nextLine());
        double grandTotal = 0.0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Fruit #" + i);
            System.out.print("  Weight (kg) per unit: ");
            double weight = Double.parseDouble(sc.nextLine());
            System.out.print("  Quantity (number of units): ");
            int qty = Integer.parseInt(sc.nextLine());

            double payable = calculatePayable(weight, qty);
            System.out.printf("  Payable for fruit #%d: ₦%.2f%n", i, payable);
            grandTotal += payable;
        }

        System.out.printf("Total payable for all fruits: ₦%.2f%n", grandTotal);
        sc.close();
    }
}


