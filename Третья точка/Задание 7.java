import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWeightsInGym {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(56);
        numbers.add(65);
        numbers.add(74);
        numbers.add(100);
        numbers.add(99);
        numbers.add(68);
        numbers.add(86);
        numbers.add(180);
        numbers.add(90);

        Collections.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                int sum1 = getDigitSum(num1);
                int sum2 = getDigitSum(num2);

                if (sum1 == sum2) {
                    return num1 - num2;
                }
                return sum1 - sum2;
            }

            private int getDigitSum(int n) {
                int sum = 0;
                while (n > 0) {
                    sum += n % 10;
                    n /= 10;
                }
                return sum;
            }
        });

        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}
