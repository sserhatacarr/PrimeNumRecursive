import java.util.Scanner;

public class Main {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Exit the loop if the number is negative
        if (num < 0) {
            System.out.println("You cannot enter a negative number. Exiting the program.");
            break;
        }

        // Call the recursive method to check for primality
        boolean isPrime = isPrime(num, num - 1);

        // Print the appropriate message based on the result
        if (isPrime) {
            System.out.println(num + " is a PRIME number!");
        } else {
            System.out.println(num + " is NOT a prime number!");
        }
    }
}

    // Recursive method to check if a number is prime
    static boolean isPrime(int num, int divisor) {
        // Base case: If the divisor reaches 1, the number is prime
        if (divisor == 1) {
            return true;
        }

        // If the number is divisible, it's not prime
        if (num % divisor == 0) {
            return false;
        }

        // Recur with the next divisor
        return isPrime(num, divisor - 1);
    }

}
