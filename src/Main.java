import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Day 1
        for (int i = 100; i < 1000; i++) {
            if(i % 5 == 0 && i % 2 == 1) {
                System.out.println(i);
            }
        }
        // Day 2
        int[] numbers = new int[901];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 100;
        }
        System.out.println("numbers : " + Arrays.toString(numbers));

        int[] numbers2 = new int[numbers.length];
        int j = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            numbers2[i] = numbers[j - 1];
            j = j - 1;
        }
        System.out.println("numbers2 : " + Arrays.toString(numbers2));

        for (int num : numbers2) {
            System.out.println(num);
        }
    }
}