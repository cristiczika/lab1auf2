package main.tasks;

public class ArrayUtils {

    public static int getMax(int[] numbers) {
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static int getMin(int[] numbers) {
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    public static int getMaxSum(int[] numbers) {
        int sum = 0;
        int min = getMin(numbers);

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum - min;
    }
}
