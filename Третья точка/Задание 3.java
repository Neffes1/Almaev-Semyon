import java.util.Scanner;

public class SumOfPowers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the input
        int number = input.nextInt();
        int startIndex = input.nextInt();

        // Calculate the sum of powers
        int sum = 0;
        int digit;
        int power = startIndex;
        while (number > 0) {
            digit = number % 10;
            sum += Math.pow(digit, power);
            number /= 10;
            power++;
        }

        // Check if the sum is a multiple of 2^6
        boolean isPossible = sum % 64 == 0;

        // Print the result
        System.out.println(isPossible ? "Yes" : "No");
    }
}
