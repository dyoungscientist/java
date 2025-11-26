import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        if (detectP(n)) {
            System.out.print(n + " is a prime number");
        } else {
            System.out.print(n + " is not a prime number");
        }
    }

    static boolean detectP(int num) {
        if (num <= 1) return false;
        boolean p = true;
        int limit = (int) (Math.sqrt(num));
        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                p = false;
                break;
            }
        }
        return p;
    }
}
    

