import java.util.Scanner;

public class FindSquareDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n <= 0 || n > 100000) {
            System.out.println("Число должно быть в диапазоне от 0 до 100000");
            return;
        }

        int lowerSquare = (int) Math.floor(Math.sqrt(n));

        int upperSquare = lowerSquare + 1;

        if (upperSquare * upperSquare - lowerSquare * lowerSquare == n) {
            System.out.println(n + " = " + upperSquare * upperSquare + " - " + lowerSquare * lowerSquare);
        } else {
            System.out.println("Невозможно представить " + n + " как разность двух последовательных квадратов");
        }
    }
}
