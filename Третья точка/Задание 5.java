import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {
        int i = 1000;
        long fibonacciNumber = fibonacci(i);
        System.out.println("f(" + i + ") = " + fibonacciNumber + " # вернет " + maxDigitFrequency(fibonacciNumber));
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0, b = 1, c = 0;
        for (int j = 2; j <= n; j++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int maxDigitFrequency(long number) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        char[] digits = String.valueOf(number).toCharArray();

        for (char digit : digits) {
            frequencyMap.put(digit, frequencyMap.getOrDefault(digit, 0) + 1);
        }

        int maxFrequency = 0;
        char maxDigit = '0';

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency || (entry.getValue() == maxFrequency && entry.getKey() > maxDigit)) {
                maxFrequency = entry.getValue();
                maxDigit = entry.getKey();
            }
        }

        return maxDigit - '0';
    }
}
