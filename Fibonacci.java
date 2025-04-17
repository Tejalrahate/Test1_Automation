import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of terms from user
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // First two terms
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(first + " ");

            // Compute next term
            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}
