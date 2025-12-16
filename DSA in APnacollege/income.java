import java.util.Scanner;

public class income {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your annual income: ");
            double income = sc.nextDouble();
            double tax = 0;
            if (income <= 250000) {
                tax = 0; 
            } else if (income <= 500000) {
                tax = 0.05 * (income - 250000); 
            } else if (income <= 1000000) {
                tax = 0.05 * 250000 + 0.2 * (income - 500000); 
            } else {
                tax = 0.05 * 250000 + 0.2 * 500000 + 0.3 * (income - 1000000); 
            }
                System.out.println("Your income tax payable is:" + tax);
        }
    }
}