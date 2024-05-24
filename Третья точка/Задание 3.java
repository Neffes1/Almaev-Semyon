import java.util.Scanner;

public class SumOfPowers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int startIndex = input.nextInt();

        int sum = 0;
        int digit;
        int power = startIndex;
        while (number > 0) {
            digit = number % 10;
            sum += Math.pow(digit, power);
            number /= 10;
            power++;
        }

        boolean isPossible = sum % 64 == 0;

        System.out.println(isPossible ? "Yes" : "No");
    }
}
