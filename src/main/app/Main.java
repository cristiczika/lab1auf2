package main.app;

import main.tasks.ArrayUtils;

public class Main {

    static void main() {
        IO.println("------- Aufgabe 2 --------");
        int[] numbers = {4, 8, 3, 10, 17};
        IO.println(ArrayUtils.getMax(numbers));
        IO.println(ArrayUtils.getMin(numbers));
        IO.println(ArrayUtils.getMaxSum(numbers));
        IO.println(ArrayUtils.getMinSum(numbers));
    }

}