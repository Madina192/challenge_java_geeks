import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

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
        // Day 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of month pls: ");
        String month = scanner.nextLine();
        if(Objects.equals(month, "December") || Objects.equals(month, "January") || Objects.equals(month, "February")) {
            System.out.println("Winter!");
        } else if (Objects.equals(month, "March") || Objects.equals(month, "April") || Objects.equals(month, "May")) {
            System.out.println("Spring!");
        } else if (Objects.equals(month, "June") || Objects.equals(month, "July") || Objects.equals(month, "August")) {
            System.out.println("Summer!");
        } else if (Objects.equals(month, "September") || Objects.equals(month, "October") || Objects.equals(month, "November")) {
            System.out.println("Autumn!");
        } else {
            System.out.println("It's not a name of month! Enter pls month! ");
        }
        switch (month) {
            case "December", "January", "February" -> System.out.println("It's winter!");
            case "March", "April", "May" -> System.out.println("It's spring!");
            case "June", "July", "August" -> System.out.println("It's summer!");
            case "September", "October", "November" -> System.out.println("It's autumn!");
            default -> System.out.println("It's not a name of month! Enter pls month! ");
        }
    }
}