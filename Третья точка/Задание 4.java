import java.util.Arrays;

public class ChooseBestSum {

    public static void main(String[] args) {
        int[] distances = {50, 55, 57, 58, 60};
        int maxDistance = 175;
        int numCities = 3;

        int bestSum = chooseBestSum(maxDistance, numCities, distances);

        System.out.println(bestSum);
    }

    public static int chooseBestSum(int maxDistance, int numCities, int[] distances) {
        Arrays.sort(distances);

        int[][] combinations = new int[numCities][];
        for (int i = 0; i < numCities; i++) {
            combinations[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                combinations[i][j] = distances[j];
            }
        }

        int bestSum = 0;
        for (int[] combination : combinations) {
            int sum = 0;
            for (int distance : combination) {
                sum += distance;
            }
            if (sum <= maxDistance && sum > bestSum) {
                bestSum = sum;
            }
        }

        return bestSum;
    }
}
